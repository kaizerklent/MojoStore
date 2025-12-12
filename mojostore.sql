-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Oct 12, 2024 at 08:34 AM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `mojostore`
--

DELIMITER $$
--
-- Procedures
--
CREATE DEFINER=`root`@`localhost` PROCEDURE `getAllCustomers` ()   BEGIN
    SELECT * FROM customer;
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `GetAllOrders` ()   BEGIN
    SELECT * FROM orders;
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `GetAllPayment` ()   BEGIN
    SELECT * FROM payment;
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `GetAllProducts` ()   BEGIN
    SELECT * FROM product;
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `GetDetails` ()   BEGIN
    SELECT * FROM orderdetails;
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `GetInventory` ()   BEGIN
    SELECT * FROM inventory;
END$$

DELIMITER ;

-- --------------------------------------------------------

--
-- Table structure for table `accounts`
--

CREATE TABLE `accounts` (
  `ID` int(11) NOT NULL,
  `Firstname` varchar(255) NOT NULL,
  `Lastname` varchar(255) NOT NULL,
  `Password` varchar(255) NOT NULL,
  `Access` varchar(50) NOT NULL,
  `Username` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `accounts`
--

INSERT INTO `accounts` (`ID`, `Firstname`, `Lastname`, `Password`, `Access`, `Username`) VALUES
(1, 'John', 'Doe', 'admin', 'Admin', 'admin'),
(2, 'Jane', 'Smith', 'user', 'User', 'user'),
(3, 'Michael', 'Brown', 'password789', 'Admin', 'michaelbrown'),
(4, 'Emily', 'Jones', 'password101', 'User', 'emilyjones');

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

CREATE TABLE `customer` (
  `CustomerID` int(11) NOT NULL,
  `Name` varchar(255) NOT NULL,
  `Address` varchar(255) NOT NULL,
  `Contacts` varchar(50) NOT NULL,
  `Gender` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `customer`
--

INSERT INTO `customer` (`CustomerID`, `Name`, `Address`, `Contacts`, `Gender`) VALUES
(1, 'Customer 1', '123 Main St', '1234567890', 'Male'),
(2, 'Customer 2', '456 Maple St', '0987654321', 'Female'),
(3, 'Customer 3', '789 Oak St', '1231231234', 'Male'),
(4, 'Customer 4', '321 Pine St', '4321432143', 'Female'),
(5, 'Customer 5', '654 Cedar St', '5555555555', 'Male'),
(6, 'Customer 6', '987 Birch St', '7777777777', 'Female'),
(7, 'Customer 7', '123 Elm St', '9999999999', 'Male'),
(8, 'Customer 8', '456 Spruce St', '8888888888', 'Female'),
(9, 'Customer 9', '789 Fir St', '6666666666', 'Male'),
(10, 'Customer 10', '321 Poplar St', '4444444444', 'Female'),
(11, 'Customer 11', '654 Aspen St', '3333333333', 'Male'),
(12, 'Customer 12', '987 Sycamore St', '2222222222', 'Female'),
(13, 'Customer 13', '123 Walnut St', '1111111111', 'Male'),
(14, 'Customer 14', '456 Beech St', '1010101010', 'Female'),
(15, 'Customer 15', '789 Hickory St', '9090909090', 'Male'),
(16, 'Customer 16', '321 Redwood St', '8080808080', 'Female'),
(17, 'Customer 17', '654 Palm St', '7070707070', 'Male'),
(18, 'Customer 18', '987 Bamboo St', '6060606060', 'Female'),
(19, 'Customer 19', '123 Cypress St', '5050505050', 'Male');

-- --------------------------------------------------------

--
-- Table structure for table `inventory`
--

CREATE TABLE `inventory` (
  `StockID` varchar(11) NOT NULL,
  `ProductID` varchar(255) DEFAULT NULL,
  `Quantity` int(11) NOT NULL,
  `Batch` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `inventory`
--

INSERT INTO `inventory` (`StockID`, `ProductID`, `Quantity`, `Batch`) VALUES
('IN1000', 'P001', 100, '2024/10/11'),
('IN1001', 'P002', 100, '2024/10/11'),
('IN1002', 'P003', 94, '2024/10/11'),
('IN1003', 'P004', 88, '2024/10/11'),
('IN1004', 'P005', 94, '2024/10/11'),
('IN1005', 'P006', 94, '2024/10/11'),
('IN1006', 'P007', 95, '2024/10/11'),
('IN1007', 'P008', 94, '2024/10/11'),
('IN1008', 'P009', 100, '2024/10/11'),
('IN1009', 'P010', 100, '2024/10/11'),
('IN1010', 'P011', 100, '2024/10/11'),
('IN1011', 'P012', 100, '2024/10/11'),
('IN1012', 'P013', 100, '2024/10/11'),
('IN1013', 'P014', 95, '2024/10/11'),
('IN1014', 'P020', 100, '2024/10/12'),
('IN1015', 'P015', 100, '2024/10/12');

-- --------------------------------------------------------

--
-- Table structure for table `orderdetails`
--

CREATE TABLE `orderdetails` (
  `OrderID` varchar(11) NOT NULL,
  `ProductID` varchar(255) NOT NULL,
  `Quantity` int(11) NOT NULL,
  `Subtotal` decimal(10,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `orderdetails`
--

INSERT INTO `orderdetails` (`OrderID`, `ProductID`, `Quantity`, `Subtotal`) VALUES
('MI1000', 'P004', 2, 50.00),
('MI1000', 'P005', 3, 60.00),
('MI1001', 'P003', 3, 36.00),
('MI1001', 'P004', 3, 75.00),
('MI1001', 'P007', 5, 50.00),
('MI1001', 'P008', 6, 210.00),
('MI1003', 'P014', 5, 125.00),
('MI1004', 'P004', 3, 75.00),
('MI1004', 'P006', 6, 180.00);

-- --------------------------------------------------------

--
-- Table structure for table `orders`
--

CREATE TABLE `orders` (
  `OrderID` varchar(11) NOT NULL,
  `Total` decimal(10,2) NOT NULL,
  `CustomerID` int(11) DEFAULT NULL,
  `OrderDate` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `orders`
--

INSERT INTO `orders` (`OrderID`, `Total`, `CustomerID`, `OrderDate`) VALUES
('MI1000', 170.00, 4, '2024-10-11'),
('MI1001', 371.00, 4, '2024-10-11'),
('MI1002', 136.00, 2, '2024-10-12'),
('MI1003', 125.00, 2, '2024-10-12'),
('MI1004', 255.00, 3, '2024-10-12');

-- --------------------------------------------------------

--
-- Table structure for table `payment`
--

CREATE TABLE `payment` (
  `PaymentID` int(11) NOT NULL,
  `OrderID` varchar(11) DEFAULT NULL,
  `CustomerID` int(11) DEFAULT NULL,
  `Date` date NOT NULL,
  `Total` decimal(10,2) NOT NULL,
  `Cash` decimal(10,2) NOT NULL,
  `Balance` decimal(10,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `payment`
--

INSERT INTO `payment` (`PaymentID`, `OrderID`, `CustomerID`, `Date`, `Total`, `Cash`, `Balance`) VALUES
(1, 'MI1000', 4, '2024-10-11', 170.00, 200.00, 30.00),
(2, 'MI1001', 4, '2024-10-11', 371.00, 500.00, 129.00),
(3, 'MI1003', 2, '2024-10-12', 125.00, 150.00, 25.00),
(4, 'MI1004', 3, '2024-10-12', 255.00, 260.00, 5.00);

-- --------------------------------------------------------

--
-- Table structure for table `product`
--

CREATE TABLE `product` (
  `ProductID` varchar(255) NOT NULL,
  `ProductName` varchar(255) NOT NULL,
  `Price` int(11) NOT NULL,
  `Category` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `product`
--

INSERT INTO `product` (`ProductID`, `ProductName`, `Price`, `Category`) VALUES
('P001', 'Apple', 10, 'Food'),
('P002', 'Orange', 15, 'Food'),
('P003', 'Banana', 12, 'Food'),
('P004', 'Bread', 25, 'Food'),
('P005', 'Milk', 20, 'Beverage'),
('P006', 'Juice', 30, 'Beverage'),
('P007', 'Soda', 10, 'Beverage'),
('P008', 'Eggs', 35, 'Food'),
('P009', 'Cheese', 40, 'Food'),
('P010', 'Butter', 28, 'Food'),
('P011', 'Detergent', 50, 'Household'),
('P012', 'Dish Soap', 30, 'Household'),
('P013', 'Shampoo', 45, 'Household'),
('P014', 'Toothpaste', 25, 'Household'),
('P015', 'Rice', 100, 'Food'),
('P016', 'Pasta', 20, 'Food'),
('P017', 'Chicken', 55, 'Food'),
('P018', 'Fish', 60, 'Food'),
('P019', 'Beef', 80, 'Food'),
('P020', 'Cereal', 35, 'Food'),
('P021', 'Water', 10, 'Beverage'),
('P022', 'Tea', 25, 'Beverage'),
('P023', 'Coffee', 50, 'Beverage'),
('P024', 'Yogurt', 15, 'Beverage'),
('P025', 'Ice Cream', 40, 'Food'),
('P026', 'Chips', 0, 'Food'),
('P027', 'Cookies', 0, 'Food'),
('P028', 'Soup', 0, 'Food'),
('P029', 'Juice Box', 0, 'Beverage'),
('P030', 'Mop', 0, 'Household');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `accounts`
--
ALTER TABLE `accounts`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `customer`
--
ALTER TABLE `customer`
  ADD PRIMARY KEY (`CustomerID`);

--
-- Indexes for table `inventory`
--
ALTER TABLE `inventory`
  ADD PRIMARY KEY (`StockID`),
  ADD KEY `ProductID` (`ProductID`);

--
-- Indexes for table `orderdetails`
--
ALTER TABLE `orderdetails`
  ADD UNIQUE KEY `OrderID` (`OrderID`,`ProductID`),
  ADD KEY `ProductID` (`ProductID`),
  ADD KEY `OrderID_2` (`OrderID`),
  ADD KEY `OrderID_3` (`OrderID`,`ProductID`) USING BTREE;

--
-- Indexes for table `orders`
--
ALTER TABLE `orders`
  ADD PRIMARY KEY (`OrderID`),
  ADD KEY `CustomerID` (`CustomerID`);

--
-- Indexes for table `payment`
--
ALTER TABLE `payment`
  ADD PRIMARY KEY (`PaymentID`),
  ADD KEY `OrderID` (`OrderID`),
  ADD KEY `CustomerID` (`CustomerID`);

--
-- Indexes for table `product`
--
ALTER TABLE `product`
  ADD PRIMARY KEY (`ProductID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `accounts`
--
ALTER TABLE `accounts`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `customer`
--
ALTER TABLE `customer`
  MODIFY `CustomerID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;

--
-- AUTO_INCREMENT for table `payment`
--
ALTER TABLE `payment`
  MODIFY `PaymentID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `inventory`
--
ALTER TABLE `inventory`
  ADD CONSTRAINT `inventory_ibfk_1` FOREIGN KEY (`ProductID`) REFERENCES `product` (`ProductID`);

--
-- Constraints for table `orderdetails`
--
ALTER TABLE `orderdetails`
  ADD CONSTRAINT `orderdetails_ibfk_1` FOREIGN KEY (`OrderID`) REFERENCES `orders` (`OrderID`),
  ADD CONSTRAINT `orderdetails_ibfk_2` FOREIGN KEY (`ProductID`) REFERENCES `product` (`ProductID`);

--
-- Constraints for table `orders`
--
ALTER TABLE `orders`
  ADD CONSTRAINT `orders_ibfk_1` FOREIGN KEY (`CustomerID`) REFERENCES `customer` (`CustomerID`);

--
-- Constraints for table `payment`
--
ALTER TABLE `payment`
  ADD CONSTRAINT `payment_ibfk_1` FOREIGN KEY (`OrderID`) REFERENCES `orders` (`OrderID`),
  ADD CONSTRAINT `payment_ibfk_2` FOREIGN KEY (`CustomerID`) REFERENCES `customer` (`CustomerID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
