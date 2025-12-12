USE MojoStore;
GO

------------------------------------------------------------
-- TABLES
------------------------------------------------------------

CREATE TABLE dbo.accounts (
    ID INT IDENTITY(1,1) PRIMARY KEY,
    Firstname NVARCHAR(255) NOT NULL,
    Lastname NVARCHAR(255) NOT NULL,
    [Password] NVARCHAR(255) NOT NULL,
    Access NVARCHAR(50) NOT NULL,
    Username NVARCHAR(255) NOT NULL
);
GO

CREATE TABLE dbo.customer (
    CustomerID INT IDENTITY(1,1) PRIMARY KEY,
    Name NVARCHAR(255) NOT NULL,
    Address NVARCHAR(255) NOT NULL,
    Contacts NVARCHAR(50) NOT NULL,
    Gender NVARCHAR(10) NOT NULL
);
GO

CREATE TABLE dbo.product (
    ProductID NVARCHAR(255) PRIMARY KEY,
    ProductName NVARCHAR(255) NOT NULL,
    Price INT NOT NULL,
    Category NVARCHAR(255) NOT NULL
);
GO

CREATE TABLE dbo.inventory (
    StockID NVARCHAR(11) PRIMARY KEY,
    ProductID NVARCHAR(255) NOT NULL,
    Quantity INT NOT NULL,
    Batch DATE,
    CONSTRAINT FK_Inventory_Product
        FOREIGN KEY (ProductID) REFERENCES dbo.product(ProductID)
);
GO

CREATE TABLE dbo.orders (
    OrderID NVARCHAR(11) PRIMARY KEY,
    CustomerID INT NOT NULL,
    OrderDate DATE NOT NULL,
    Total DECIMAL(10,2) NOT NULL,
    CONSTRAINT FK_Orders_Customer
        FOREIGN KEY (CustomerID) REFERENCES dbo.customer(CustomerID)
);
GO

CREATE TABLE dbo.orderdetails (
    OrderID NVARCHAR(11) NOT NULL,
    ProductID NVARCHAR(255) NOT NULL,
    Quantity INT NOT NULL,
    Subtotal DECIMAL(10,2) NOT NULL,
    CONSTRAINT PK_OrderDetails PRIMARY KEY (OrderID, ProductID),
    CONSTRAINT FK_OD_Orders FOREIGN KEY (OrderID) REFERENCES dbo.orders(OrderID),
    CONSTRAINT FK_OD_Product FOREIGN KEY (ProductID) REFERENCES dbo.product(ProductID)
);
GO

CREATE TABLE dbo.payment (
    PaymentID INT IDENTITY(1,1) PRIMARY KEY,
    OrderID NVARCHAR(11) NOT NULL,
    CustomerID INT NOT NULL,
    [Date] DATE NOT NULL,
    Total DECIMAL(10,2) NOT NULL,
    Cash DECIMAL(10,2) NOT NULL,
    Balance DECIMAL(10,2) NOT NULL,
    FOREIGN KEY (OrderID) REFERENCES dbo.orders(OrderID),
    FOREIGN KEY (CustomerID) REFERENCES dbo.customer(CustomerID)
);
GO

CREATE TABLE dbo.receipt (
    ReceiptID INT IDENTITY(1,1) PRIMARY KEY,
    OrderID NVARCHAR(11) NOT NULL,
    ReceiptText NVARCHAR(MAX),
    PrintedDate DATETIME DEFAULT GETDATE(),
    CONSTRAINT FK_Receipt_Orders
        FOREIGN KEY (OrderID) REFERENCES dbo.orders(OrderID)
);
GO

------------------------------------------------------------
-- FUNCTIONS
------------------------------------------------------------

CREATE OR ALTER FUNCTION dbo.fn_GetProductPrice (@ProductID NVARCHAR(255))
RETURNS INT
AS
BEGIN
    DECLARE @Price INT;
    SELECT @Price = Price FROM dbo.product WHERE ProductID = @ProductID;
    RETURN ISNULL(@Price, 0);
END;
GO

CREATE OR ALTER FUNCTION dbo.fn_GetOrderTotal (@OrderID NVARCHAR(11))
RETURNS DECIMAL(10,2)
AS
BEGIN
    DECLARE @Total DECIMAL(10,2);
    SELECT @Total = SUM(Subtotal)
    FROM dbo.orderdetails
    WHERE OrderID = @OrderID;
    RETURN ISNULL(@Total, 0);
END;
GO

------------------------------------------------------------
-- TRIGGERS
------------------------------------------------------------

CREATE OR ALTER TRIGGER dbo.trg_PreventNegativeInventory
ON dbo.inventory
AFTER UPDATE
AS
BEGIN
    IF EXISTS (SELECT 1 FROM inserted WHERE Quantity < 0)
    BEGIN
        ROLLBACK;
        THROW 51000, 'Inventory cannot go negative', 1;
    END
END;
GO

CREATE OR ALTER TRIGGER dbo.trg_PreventDuplicateProduct
ON dbo.product
INSTEAD OF INSERT
AS
BEGIN
    IF EXISTS (
        SELECT 1
        FROM inserted i
        JOIN dbo.product p ON p.ProductID = i.ProductID
    )
    BEGIN
        THROW 51001, 'Product ID already exists', 1;
    END

    INSERT INTO dbo.product
    SELECT * FROM inserted;
END;
GO

------------------------------------------------------------
-- STORED PROCEDURES (GETTERS)
------------------------------------------------------------

CREATE OR ALTER PROCEDURE dbo.GetAllProducts
AS SELECT * FROM dbo.product;
GO

CREATE OR ALTER PROCEDURE dbo.GetInventory
AS SELECT * FROM dbo.inventory ORDER BY StockID;
GO

CREATE OR ALTER PROCEDURE dbo.GetAllCustomers
AS SELECT CustomerID, Name, Address, Contacts FROM dbo.customer;
GO

CREATE OR ALTER PROCEDURE dbo.GetAllOrders
AS SELECT * FROM dbo.orders;
GO

CREATE OR ALTER PROCEDURE dbo.GetAllPayment
AS SELECT * FROM dbo.payment;
GO

------------------------------------------------------------
-- STORED PROCEDURE: PLACE ORDER
------------------------------------------------------------

CREATE OR ALTER PROCEDURE dbo.PlaceOrder
    @OrderID NVARCHAR(20),
    @CustomerID INT,
    @OrderDate DATE,
    @Total DECIMAL(10,2),
    @Cash DECIMAL(10,2),
    @Balance DECIMAL(10,2)
AS
BEGIN
    BEGIN TRY
        BEGIN TRAN;

        INSERT INTO dbo.orders
        VALUES (@OrderID, @CustomerID, @OrderDate, @Total);

        INSERT INTO dbo.payment
        VALUES (@OrderID, @CustomerID, @OrderDate, @Total, @Cash, @Balance);

        COMMIT;
    END TRY
    BEGIN CATCH
        ROLLBACK;
        THROW;
    END CATCH
END;
GO

------------------------------------------------------------
-- STORED PROCEDURE: ADD ORDER ITEM
------------------------------------------------------------

CREATE OR ALTER PROCEDURE dbo.AddOrderItem
    @OrderID NVARCHAR(20),
    @ProductID NVARCHAR(255),
    @Quantity INT,
    @Subtotal DECIMAL(10,2)
AS
BEGIN
    DECLARE @Stock INT;

    BEGIN TRY
        BEGIN TRAN;

        SELECT @Stock = Quantity
        FROM dbo.inventory
        WHERE ProductID = @ProductID;

        IF @Stock IS NULL
            THROW 50001, 'Product not found in inventory', 1;

        IF @Stock < @Quantity
            THROW 50002, 'Not enough stock', 1;

        INSERT INTO dbo.orderdetails
        VALUES (@OrderID, @ProductID, @Quantity, @Subtotal);

        UPDATE dbo.inventory
        SET Quantity = Quantity - @Quantity
        WHERE ProductID = @ProductID;

        COMMIT;
    END TRY
    BEGIN CATCH
        ROLLBACK;
        THROW;
    END CATCH
END;
GO
