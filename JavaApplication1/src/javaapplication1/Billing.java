/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaapplication1;

import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.awt.print.PrinterException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.CallableStatement;


/**
 *
 * @author admin
 */
public class Billing extends javax.swing.JFrame {

    /**
     * Creates new form Billing
     */
    public Billing() { 
       initComponents();
        tblview();
        tblcust();
        IDgen();
        date();
    }

   Connection con;
    PreparedStatement pst;
    PreparedStatement pst2;
   ResultSet rs;
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblcustomer = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblorders = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblmenu = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        txtOrderID = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtCustID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtCustname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtCustAdd = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtcont = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtgender = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtSubtot = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtCash = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtItem = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        Quantity = new javax.swing.JSpinner();
        jLabel9 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtChange = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnBill = new javax.swing.JButton();
        btnPrint = new javax.swing.JButton();
        btnAnother = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtBill = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        tblcustomer.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tblcustomer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Customer ID", "Name", "Address", "Contact"
            }
        ));
        tblcustomer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblcustomerMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tblcustomer);

        tblorders.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tblorders.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item ID", "item", "Quantity", "price", "Amount"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblorders.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblordersMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblorders);

        tblmenu.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tblmenu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Item ID", "Item", "Price", "Category"
            }
        ));
        tblmenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblmenuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblmenu);

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Order ID");

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("ID");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Customer Name");

        txtCustname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCustnameActionPerformed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Address");

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Conatct No");

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Gender");

        txtgender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtOrderID, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCustID, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCustname, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCustAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtcont, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(txtgender, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCustID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCustname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCustAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcont, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtgender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtOrderID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(7, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Item ID");

        txtID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtIDKeyPressed(evt);
            }
        });

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Price");

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Sub-Total");

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Cash");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Item");

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Quantity");

        Quantity.setValue(1);
        Quantity.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                QuantityStateChanged(evt);
            }
        });

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Total");

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Change");

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnBill.setText("Bill");
        btnBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBillActionPerformed(evt);
            }
        });

        btnPrint.setText("Print");
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });

        btnAnother.setText("Another");
        btnAnother.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnotherActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(txtSubtot, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(txtCash, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtItem, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(Quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(105, 105, 105)
                                .addComponent(jLabel10))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtChange, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAnother, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnBill, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSubtot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCash, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdd)
                    .addComponent(btnBill))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7)
                    .addComponent(jLabel9)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Quantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtChange, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAnother)
                    .addComponent(btnPrint))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jButton1.setText("Add");

        jPanel4.setBackground(new java.awt.Color(0, 153, 153));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Date");

        date.setForeground(new java.awt.Color(255, 255, 255));

        jButton6.setText("Exit");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/Iconsmind-Outline-Billing.24.png"))); // NOI18N
        jLabel1.setText("Billing");
        jLabel1.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(930, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(409, 409, 409)
                .addComponent(jButton6)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jLabel1)
                    .addComponent(jButton6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        txtBill.setColumns(20);
        txtBill.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        txtBill.setRows(5);
        jScrollPane3.setViewportView(txtBill);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jScrollPane4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 358, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
private void IDgen(){
 {
    String sql = "SELECT TOP 1 OrderID FROM orders ORDER BY OrderID DESC";

    try (Connection con = Conn.getConnection();
         PreparedStatement pst = con.prepareStatement(sql);
         ResultSet rs = pst.executeQuery()) {

        if (rs.next()) {
            String last = rs.getString("OrderID"); // e.g., "MI1000"

            // prefix = letters, number = digits
            String prefix = last.replaceAll("[0-9]", "");
            String number = last.replaceAll("[^0-9]", "");

            int num = Integer.parseInt(number) + 1;
            String newId = prefix + num;

            txtOrderID.setText(newId);
        } else {
            txtOrderID.setText("MI1000");
        }

    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error generating OrderID: " + e.getMessage());
    }
 }
}

private void payment(){

        String sql = "INSERT INTO payment (OrderID, CustomerID, Date, Total, Cash, Balance) VALUES (?, ?, ?, ?, ?, ?)";

        try {
            Connection con=Conn.getConnection();
            PreparedStatement pst = con.prepareStatement(sql);

            // Get data from text field
            String ordID = txtOrderID.getText();
            String cID = txtCustID.getText();
            String orderDate = date.getText();
            String tot = txtTotal.getText();
            String Cash = txtCash.getText();
            String Change = txtChange.getText();
 
            // Set the values for the prepared statement
            pst.setString(1, ordID);
            pst.setString(2, cID);
            pst.setString(3, orderDate);
            pst.setString(4, tot);
            pst.setString(5, Cash);
            pst.setString(6, Change);
           
        

            // Execute the insert statement
            int rowsAffected = pst.executeUpdate();

            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(this, "Payment successfully.");
               
               tblview();
            } else {
                JOptionPane.showMessageDialog(this, "Payment Failed");
            }
            pst.close();
            con.close();
        } catch (SQLException | NumberFormatException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        }     
}

private void updateQty() {
    
    String proID;
    int qty;
    try {
        Connection con = Conn.getConnection();
        String sql = "UPDATE inventory SET Quantity = Quantity - ? WHERE ProductID = ?";
        pst2 = con.prepareStatement(sql);

        for (int i = 0; i < tblorders.getRowCount(); i++) {
            proID = (String) tblorders.getValueAt(i, 0);
             qty = Integer.parseInt((String) tblorders.getValueAt(i, 2));

            pst2.setInt(1, qty);
            pst2.setString(2, proID);
            pst2.executeUpdate();
        }
        
        JOptionPane.showMessageDialog(this, "Quantity Updated");
        con.close();
    } catch (SQLException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
    }
}

public void tblcust(){
         int c;
        try {
            Connection con = Conn.getConnection();

            CallableStatement cs = con.prepareCall("{call GetAllCustomers}");
            ResultSet res = cs.executeQuery();

            ResultSetMetaData Rss = res.getMetaData();
            c = Rss.getColumnCount();

            DefaultTableModel Df = (DefaultTableModel) tblcustomer.getModel();
            Df.setRowCount(0);

            while(res.next()) {
                Vector<Object> v2 = new Vector<>();
                v2.add(res.getString("CustomerID"));
                v2.add(res.getString("Name"));
                v2.add(res.getString("Address"));
                v2.add(res.getString("Contacts"));
                Df.addRow(v2);
            }

        } catch (SQLException ex) {
            Logger.getLogger(Items.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   private void date(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDateTime now = LocalDateTime.now();
        date.setText(dtf.format(now));
   }
public void tblview(){
       int c;
        try {
            Connection con = Conn.getConnection();

            CallableStatement cs = con.prepareCall("{call GetAllProducts}");
            ResultSet res = cs.executeQuery();

            ResultSetMetaData Rss = res.getMetaData();
            c = Rss.getColumnCount();

            DefaultTableModel Df = (DefaultTableModel) tblmenu.getModel();
            Df.setRowCount(0);

            while(res.next()) {
                Vector<String> v2 = new Vector<>();
                v2.add(res.getString("ProductID"));
                v2.add(res.getString("ProductName"));
                v2.add(res.getString("Price"));
                v2.add(res.getString("Category"));
                Df.addRow(v2);
            }

        } catch (SQLException ex) {
            Logger.getLogger(Items.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   public void bill(){
String total = txtTotal.getText();
String pay = txtCash.getText();
String bal = txtChange.getText();
String cust = txtCustname.getText();
String Add = txtCustAdd.getText();

DefaultTableModel model = (DefaultTableModel) tblorders.getModel();
        
        model = (DefaultTableModel) tblorders.getModel();
        
         txtBill.setText(txtBill.getText() + "******************************************************\n");
         txtBill.setText(txtBill.getText() + "*                       Mojo Store                   *\n");
         txtBill.setText(txtBill.getText() + "******************************************************\n");
         txtBill.setText(txtBill.getText() + "* FB page: Mojo Store       Contact #: 098768766     *\n");
         txtBill.setText(txtBill.getText() + "******************************************************\n");
         txtBill.setText(txtBill.getText() + "\t" + "\t" + "Cutomer:" + cust + "\n");
         txtBill.setText(txtBill.getText() + "\t" + "\t" + "Address:" + Add + "\n");
         
         txtBill.setText(txtBill.getText() + "Item" + "\t" + "       Price" + "\t" + "Sub-Total" + "\n");
          
          
         for(int i = 0; i < model.getRowCount(); i++)
          {
              
              String pname = (String)model.getValueAt(i, 1);
              String price = (String)model.getValueAt(i, 3);
              String amount = (String)model.getValueAt(i, 4); 
              
           txtBill.setText(txtBill.getText() + pname  + "\t" + price + "\t" + amount  + "\n"  );
    
          }
          
          txtBill.setText(txtBill.getText() + "\n");     
          
          txtBill.setText(txtBill.getText() + "\t" + "\t" + "Total :" + total + "\n");
          txtBill.setText(txtBill.getText() + "\t" + "\t" + "Pay :" + pay + "\n");
          txtBill.setText(txtBill.getText() + "\t" + "\t" + "Balance :" + bal + "\n");
          txtBill.setText(txtBill.getText() + "\n");
          txtBill.setText(txtBill.getText() + "*****************************************************\n");
          txtBill.setText(txtBill.getText() + "           THANK YOU COME AGIN                 \n"      );
   }
    private void tblcustomerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblcustomerMouseClicked
        DefaultTableModel Df = (DefaultTableModel)tblcustomer.getModel();
        int selectedIndex = tblcustomer.getSelectedRow();
        txtCustID.setText(Df.getValueAt(selectedIndex, 0).toString());
        txtCustname.setText(Df.getValueAt(selectedIndex, 1).toString());
        txtCustAdd.setText(Df.getValueAt(selectedIndex, 2).toString());
        txtcont.setText(Df.getValueAt(selectedIndex, 3).toString());
    }//GEN-LAST:event_tblcustomerMouseClicked

    private void txtCustnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCustnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCustnameActionPerformed

    private void tblordersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblordersMouseClicked
      DefaultTableModel Df = (DefaultTableModel) tblorders.getModel();
    int selectedIndex = tblorders.getSelectedRow();

    txtID.setText(Df.getValueAt(selectedIndex, 0).toString());
    txtItem.setText(Df.getValueAt(selectedIndex, 1).toString());
    Quantity.setValue(Df.getValueAt(selectedIndex, 5).toString());
    txtPrice.setText(Df.getValueAt(selectedIndex, 3).toString());
    txtSubtot.setText(Df.getValueAt(selectedIndex, 4).toString());
    }//GEN-LAST:event_tblordersMouseClicked

    private void tblmenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblmenuMouseClicked
        DefaultTableModel Df = (DefaultTableModel)tblmenu.getModel();
        int selectedIndex = tblmenu.getSelectedRow();

        txtID.setText(Df.getValueAt(selectedIndex, 0).toString());
        txtItem.setText(Df.getValueAt(selectedIndex, 1).toString());
        txtPrice.setText(Df.getValueAt(selectedIndex, 2).toString());
        btnAdd.setEnabled(true);
    }//GEN-LAST:event_tblmenuMouseClicked

    private void txtIDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIDKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String pcode = txtID.getText().trim();

            if (pcode.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please enter an Item ID.");
                return;
            }

            String sql = "SELECT ProductName, Price FROM product WHERE ProductID = ?";

            try (Connection con = Conn.getConnection();
                 PreparedStatement pst = con.prepareStatement(sql)) {

                pst.setString(1, pcode);
                try (ResultSet rs = pst.executeQuery()) {

                    if (!rs.next()) {
                        JOptionPane.showMessageDialog(this, "Item doesn't exist");
                        txtItem.setText("");
                        txtPrice.setText("");
                    } else {
                        txtItem.setText(rs.getString("ProductName").trim());
                        txtPrice.setText(rs.getString("Price").trim());
                    }
                }

            } catch (SQLException ex) {
                Logger.getLogger(Billing.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(this, "Error loading item: " + ex.getMessage());
            }
        }
    }//GEN-LAST:event_txtIDKeyPressed

    private void QuantityStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_QuantityStateChanged
         // Guard: price must exist
    if (txtPrice.getText().trim().isEmpty()) {
        txtSubtot.setText("");
        return;
    }

    try {
        int qty = Integer.parseInt(Quantity.getValue().toString());
        int price = Integer.parseInt(txtPrice.getText().trim());
        int subtot = qty * price;
        txtSubtot.setText(String.valueOf(subtot));
    } catch (NumberFormatException e) {
        txtSubtot.setText("");
    }
    }//GEN-LAST:event_QuantityStateChanged

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        
        // ✅ AUTO SUBTOTAL FIX
        if (!txtPrice.getText().trim().isEmpty()
                && txtSubtot.getText().trim().isEmpty()) {
            int qty = Integer.parseInt(Quantity.getValue().toString());
            int price = Integer.parseInt(txtPrice.getText());
            txtSubtot.setText(String.valueOf(qty * price));
        }

         // 🔒 REQUIRED FIELD VALIDATION
        if (txtID.getText().trim().isEmpty()
                || txtItem.getText().trim().isEmpty()
                || txtPrice.getText().trim().isEmpty()
                || txtSubtot.getText().trim().isEmpty()) {

            JOptionPane.showMessageDialog(this,
                    "Please select an item first.",
                    "Missing Data",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }

        String proID = txtID.getText().trim();
        int qty;

        try {
            qty = Integer.parseInt(Quantity.getValue().toString());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid quantity.");
            return;
        }

        String sql = "SELECT Quantity FROM inventory WHERE ProductId = ?";

        try (Connection con = Conn.getConnection();
             PreparedStatement pst = con.prepareStatement(sql)) {

            pst.setString(1, proID);

            try (ResultSet rs = pst.executeQuery()) {

                if (!rs.next()) {
                    JOptionPane.showMessageDialog(this, "Item not found in inventory.");
                    return;
                }

                int currentqty = rs.getInt("Quantity");

                if (qty > currentqty) {
                    JOptionPane.showMessageDialog(this, "Quantity not enough");
                    return;
                }

                // ✅ ADD TO TABLE
                DefaultTableModel model = (DefaultTableModel) tblorders.getModel();
                model.addRow(new Object[]{
                        txtID.getText(),
                        txtItem.getText(),
                        qty,
                        txtPrice.getText(),
                        txtSubtot.getText()
                });

                // ✅ SAFE TOTAL CALCULATION
                int sum = 0;
                for (int i = 0; i < tblorders.getRowCount(); i++) {
                    Object amountObj = tblorders.getValueAt(i, 4);
                    if (amountObj != null && !amountObj.toString().trim().isEmpty()) {
                        sum += Integer.parseInt(amountObj.toString());
                    }
                }
                txtTotal.setText(String.valueOf(sum));

                // 🔄 RESET INPUTS
                txtID.setText("");
                txtItem.setText("");
                txtPrice.setText("");
                txtSubtot.setText("");
                Quantity.setValue(1);
                txtID.requestFocus();
            }

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Database error: " + e.getMessage());
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBillActionPerformed
         if (txtCash.getText().trim().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Enter cash amount");
        return;
    }

    double cash = Double.parseDouble(txtCash.getText());
    double total = Double.parseDouble(txtTotal.getText());

    if (cash < total) {
        JOptionPane.showMessageDialog(this, "Insufficient cash");
        return;
    }

    Change();
    bill();
    saveOrderUsingStoredProcedures(); // ✅ OPTION 5
    saveReceipt(); 
    }//GEN-LAST:event_btnBillActionPerformed
 public void Change()
    {
        int total = Integer.parseInt(txtTotal.getText());
        int pay = Integer.parseInt(txtCash.getText());        
        int bal = pay - total;        
        txtChange.setText(String.valueOf(bal));
    }
 public void ordertodatabase(){

        String sql = "INSERT INTO payment (OrderID, CustomerID, Date, Total, Cash, Balance) VALUES (?, ?, ?, ?, ?, ?)";

    try {
        Connection con = Conn.getConnection();   // <-- SQL SERVER CONNECTION
        PreparedStatement pst = con.prepareStatement(sql);

        String ordID = txtOrderID.getText();
        String total = txtTotal.getText();
        String cID = txtCustID.getText();
        String orderDate = date.getText();
        String Cash = txtCash.getText();
        String Change = txtChange.getText();

        pst.setString(1, ordID);
        pst.setString(2, cID);
        pst.setString(3, orderDate);
        pst.setString(4, total);
        pst.setString(5, Cash);
        pst.setString(6, Change);

        int rowsAffected = pst.executeUpdate();

        if (rowsAffected > 0) {
            JOptionPane.showMessageDialog(this, "Order placed successfully.");
            tblview();  // refresh menu table
        } else {
            JOptionPane.showMessageDialog(this, "Order failed.");
        }

        pst.close();
        con.close();

    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
    }                            
}
 
 public void orderdetails(){
    Connection con = null;
    try {
        con = Conn.getConnection(); 

        String OrderID = txtOrderID.getText();

        for (int row = 0; row < tblorders.getRowCount(); row++) {
            String itemID = (String) tblorders.getValueAt(row, 0);
            int qty = Integer.parseInt(tblorders.getValueAt(row, 2).toString());
            int subtotal = Integer.parseInt(tblorders.getValueAt(row, 4).toString());

            String insertQuery = "INSERT INTO orderdetails (OrderID, ProductID, quantity, subtotal) VALUES (?, ?, ?, ?)";

            PreparedStatement preparedStatement = con.prepareStatement(insertQuery);
            preparedStatement.setString(1, OrderID);
            preparedStatement.setString(2, itemID);
            preparedStatement.setInt(3, qty);
            preparedStatement.setInt(4, subtotal);

            preparedStatement.executeUpdate();
            preparedStatement.close();
        }

        JOptionPane.showMessageDialog(this, "OrderDetails inserted successfully.");
    } catch (Exception ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error occurred: " + ex.getMessage());
    } finally {
        try {
            if (con != null) {
                con.close();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}

    private void btnAnotherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnotherActionPerformed
        Billing deli = new Billing();
               deli.setVisible(true);
                   setVisible(false);
    }//GEN-LAST:event_btnAnotherActionPerformed

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
        try {
            txtBill.print();
        }
      catch (PrinterException ex) {
            Logger.getLogger(Billing.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnPrintActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
          Login us = new Login();
        us.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton6ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Billing().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner Quantity;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnAnother;
    private javax.swing.JButton btnBill;
    private javax.swing.JButton btnPrint;
    private javax.swing.JLabel date;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable tblcustomer;
    private javax.swing.JTable tblmenu;
    private javax.swing.JTable tblorders;
    private javax.swing.JTextArea txtBill;
    private javax.swing.JTextField txtCash;
    private javax.swing.JTextField txtChange;
    private javax.swing.JTextField txtCustAdd;
    private javax.swing.JTextField txtCustID;
    private javax.swing.JTextField txtCustname;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtItem;
    private javax.swing.JTextField txtOrderID;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtSubtot;
    private javax.swing.JTextField txtTotal;
    private javax.swing.JTextField txtcont;
    private javax.swing.JComboBox<String> txtgender;
    // End of variables declaration//GEN-END:variables

    private void processOrderTransaction() {

    Connection con = null;

    try {
        con = Conn.getConnection();
        con.setAutoCommit(false); // 🔒 START TRANSACTION

        String orderID = txtOrderID.getText();
        int customerID = Integer.parseInt(txtCustID.getText());
        String orderDate = date.getText();
        double total = Double.parseDouble(txtTotal.getText());
        double cash = Double.parseDouble(txtCash.getText());
        double balance = Double.parseDouble(txtChange.getText());

        // 1️⃣ INSERT INTO ORDERS
        String orderSQL = "INSERT INTO orders (OrderID, Total, CustomerID, OrderDate) VALUES (?, ?, ?, ?)";
        try (PreparedStatement pst = con.prepareStatement(orderSQL)) {
            pst.setString(1, orderID);
            pst.setDouble(2, total);
            pst.setInt(3, customerID);
            pst.setString(4, orderDate);
            pst.executeUpdate();
        }

        // 2️⃣ INSERT ORDER DETAILS + UPDATE INVENTORY
        String detailSQL = "INSERT INTO orderdetails (OrderID, ProductID, Quantity, Subtotal) VALUES (?, ?, ?, ?)";
        String inventorySQL = "UPDATE inventory SET Quantity = Quantity - ? WHERE ProductID = ?";

        for (int i = 0; i < tblorders.getRowCount(); i++) {

            String productID = tblorders.getValueAt(i, 0).toString();
            int qty = Integer.parseInt(tblorders.getValueAt(i, 2).toString());
            double subtotal = Double.parseDouble(tblorders.getValueAt(i, 4).toString());

            try (PreparedStatement pstDetail = con.prepareStatement(detailSQL);
                 PreparedStatement pstInv = con.prepareStatement(inventorySQL)) {

                pstDetail.setString(1, orderID);
                pstDetail.setString(2, productID);
                pstDetail.setInt(3, qty);
                pstDetail.setDouble(4, subtotal);
                pstDetail.executeUpdate();

                pstInv.setInt(1, qty);
                pstInv.setString(2, productID);
                pstInv.executeUpdate();
            }
        }

        // 3️⃣ INSERT PAYMENT
        String paymentSQL =
                "INSERT INTO payment (OrderID, CustomerID, Date, Total, Cash, Balance) VALUES (?, ?, ?, ?, ?, ?)";

        try (PreparedStatement pstPay = con.prepareStatement(paymentSQL)) {
            pstPay.setString(1, orderID);
            pstPay.setInt(2, customerID);
            pstPay.setString(3, orderDate);
            pstPay.setDouble(4, total);
            pstPay.setDouble(5, cash);
            pstPay.setDouble(6, balance);
            pstPay.executeUpdate();
        }

        con.commit(); // ✅ SUCCESS
        JOptionPane.showMessageDialog(this, "Order completed successfully!");

    } catch (Exception e) {
        try {
            if (con != null) con.rollback(); // ❌ FAIL = ROLLBACK
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        JOptionPane.showMessageDialog(this,
                "Transaction failed. No data was saved.\n" + e.getMessage(),
                "ERROR",
                JOptionPane.ERROR_MESSAGE);

    } finally {
        try {
            if (con != null) con.setAutoCommit(true);
            if (con != null) con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}

    private void saveOrderUsingStoredProcedures() {

        try (Connection con = Conn.getConnection()) {

            // 1️⃣ CALL PlaceOrder
            CallableStatement csOrder = con.prepareCall("{call PlaceOrder(?, ?, ?, ?, ?, ?)}");

            csOrder.setString(1, txtOrderID.getText());
            csOrder.setInt(2, Integer.parseInt(txtCustID.getText()));
            csOrder.setString(3, date.getText());
            csOrder.setDouble(4, Double.parseDouble(txtTotal.getText()));
            csOrder.setDouble(5, Double.parseDouble(txtCash.getText()));
            csOrder.setDouble(6, Double.parseDouble(txtChange.getText()));

            csOrder.execute();

            // 2️⃣ CALL AddOrderItem FOR EACH ITEM
            for (int i = 0; i < tblorders.getRowCount(); i++) {

                CallableStatement csItem =
                        con.prepareCall("{call AddOrderItem(?, ?, ?, ?)}");

                csItem.setString(1, txtOrderID.getText());
                csItem.setString(2, tblorders.getValueAt(i, 0).toString());
                csItem.setInt(3, Integer.parseInt(tblorders.getValueAt(i, 2).toString()));
                csItem.setDouble(4, Double.parseDouble(tblorders.getValueAt(i, 4).toString()));

                csItem.execute();
                csItem.close();
            }

            JOptionPane.showMessageDialog(this, "Order completed successfully!");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,
                    "Order failed:\n" + e.getMessage(),
                    "ERROR",
                    JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void saveReceipt() {

    String sql = "INSERT INTO receipt (OrderID, ReceiptText) VALUES (?, ?)";

    try (Connection con = Conn.getConnection();
         PreparedStatement pst = con.prepareStatement(sql)) {

        pst.setString(1, txtOrderID.getText());
        pst.setString(2, txtBill.getText());
        pst.executeUpdate();

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this,
                "Failed to save receipt:\n" + e.getMessage());
    }
}

}
