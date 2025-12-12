/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaapplication1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author admin
 */
public class Sales extends javax.swing.JFrame {

    /**
     * Creates new form Sales
     */
    public Sales() {
        initComponents();
       tblview();
       tblorder();
       tblDet();
       tblPayment();
       
    }
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        btnSave = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnHome = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtcustID = new javax.swing.JTextField();
        btnsearch = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtCustname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtCustAdd = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtcont = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtGender = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblorder = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblDetails = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblpayment = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        btnInventory = new javax.swing.JButton();
        btnItems = new javax.swing.JButton();
        btnSales = new javax.swing.JButton();
        btnAccounts = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/Iconsmind-Outline-Billing.24.png"))); // NOI18N
        jLabel2.setText("Sales");
        jLabel2.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(382, 382, 382)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(0, 153, 153));

        btnSave.setBackground(new java.awt.Color(204, 255, 255));
        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/Arturo-Wibawa-Akar-Save.16.png"))); // NOI18N
        btnSave.setText("Save");
        btnSave.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(204, 255, 255));
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/Icons8-Windows-8-Editing-Delete.16.png"))); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnEdit.setBackground(new java.awt.Color(204, 255, 255));
        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/Colebemis-Feather-Edit.16.png"))); // NOI18N
        btnEdit.setText("Edit");
        btnEdit.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnClear.setBackground(new java.awt.Color(204, 255, 255));
        btnClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/Aniket-Suvarna-Box-Regular-Bx-eraser.16.png"))); // NOI18N
        btnClear.setText("Clear");
        btnClear.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnHome.setBackground(new java.awt.Color(204, 255, 255));
        btnHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/Github-Octicons-Home-24.16.png"))); // NOI18N
        btnHome.setText("Home");
        btnHome.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSave, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEdit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClear, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(133, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(0, 153, 153));
        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Search Customer ID:");

        btnsearch.setText("Search");
        btnsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearchActionPerformed(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Customer Name");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Address");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Conatct No");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Gender");

        txtGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnsearch))
                    .addComponent(jLabel5)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtCustname, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                        .addComponent(txtcustID, javax.swing.GroupLayout.Alignment.LEADING)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txtcont, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCustAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(52, 52, 52)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(btnsearch)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtcustID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtcont, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCustAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCustname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Address", "Contact", "Gender"
            }
        ));
        tbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl);

        tblorder.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "OrderID", "Total", "CustID", "Date"
            }
        ));
        jScrollPane3.setViewportView(tblorder);

        tblDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "OrderID", "Product ID", "Quantity", "Subtot"
            }
        ));
        jScrollPane4.setViewportView(tblDetails);

        tblpayment.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "PayID", "OrderID", "CustID", "Date", "Total", "Cash", "Bal"
            }
        ));
        jScrollPane5.setViewportView(tblpayment);

        jPanel8.setBackground(new java.awt.Color(0, 153, 153));
        jPanel8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnInventory.setBackground(new java.awt.Color(204, 255, 255));
        btnInventory.setText("Inventory");
        btnInventory.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnInventory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInventoryjButton1ActionPerformed(evt);
            }
        });

        btnItems.setBackground(new java.awt.Color(204, 255, 255));
        btnItems.setText("Items");
        btnItems.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnItems.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnItemsjButton2ActionPerformed(evt);
            }
        });

        btnSales.setBackground(new java.awt.Color(0, 102, 102));
        btnSales.setText("Sales");
        btnSales.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalesjButton3ActionPerformed(evt);
            }
        });

        btnAccounts.setBackground(new java.awt.Color(204, 255, 255));
        btnAccounts.setText("Accounts");
        btnAccounts.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAccounts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAccountsjButton4ActionPerformed(evt);
            }
        });

        btnExit.setBackground(new java.awt.Color(204, 255, 255));
        btnExit.setText("Exit");
        btnExit.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitjButton5ActionPerformed(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/Iconsmind-Outline-Billing.24.png"))); // NOI18N

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(147, 147, 147))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnInventory, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnItems, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSales, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAccounts, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnInventory, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btnItems, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btnSales, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btnAccounts, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane4)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    public void tblview() {
        int c;
        try {
            Connection con = Conn.getConnection();
            pst = con.prepareStatement("SELECT * FROM customer");
            ResultSet res = pst.executeQuery();
            ResultSetMetaData Rss = res.getMetaData();
            c = Rss.getColumnCount();

            DefaultTableModel Df = (DefaultTableModel) tbl.getModel();
            Df.setRowCount(0);

            while (res.next()) {
                Vector v2 = new Vector();
                v2.add(res.getString("CustomerID"));
                v2.add(res.getString("Name"));
                v2.add(res.getString("Address"));
                v2.add(res.getString("Contacts"));
                v2.add(res.getString("Gender"));
                Df.addRow(v2);
            }

        } catch (SQLException ex) {
            Logger.getLogger(Sales.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

     public void retord() {
    String pcode = txtcustID.getText();
    try {
        Connection con = Conn.getConnection();
        pst = con.prepareStatement("select * from orders where CustomerID = ?");
        pst.setString(1, pcode);
        rs = pst.executeQuery();

        DefaultTableModel orderTableModel = (DefaultTableModel) tblorder.getModel();
        DefaultTableModel detailsTableModel = (DefaultTableModel) tblDetails.getModel();
        DefaultTableModel paymentTableModel = (DefaultTableModel) tblpayment.getModel(); // Assuming tblpayment is the name of your payment table in the UI

        orderTableModel.setRowCount(0); // Clear the orders table before adding new data
        detailsTableModel.setRowCount(0); // Clear the details table before adding new data
        paymentTableModel.setRowCount(0); // Clear the payment table before adding new data

        boolean found = false;

        Set<String> uniquePaymentIDs = new HashSet<>(); // To store unique payment IDs

        while (rs.next()) {
            String orderID = rs.getString("OrderID");

            // Add order information to the orders table
            Vector<Object> orderData = new Vector<>();
            orderData.add(orderID);
            orderData.add(rs.getString("Total"));
            orderData.add(rs.getString("CustomerID"));
            orderData.add(rs.getString("OrderDate"));
            orderTableModel.addRow(orderData);

            // Retrieve and display details from the orderdetails table
            PreparedStatement detailsStmt = con.prepareStatement("SELECT * FROM orderdetails WHERE OrderID = ?");
            detailsStmt.setString(1, orderID);
            ResultSet detailsRs = detailsStmt.executeQuery();

            while (detailsRs.next()) {
                Vector<Object> detailsData = new Vector<>();
                detailsData.add(detailsRs.getString("OrderID"));
                detailsData.add(detailsRs.getString("ProductID"));
                detailsData.add(detailsRs.getString("Quantity"));
                detailsData.add(detailsRs.getString("Subtotal"));
                detailsTableModel.addRow(detailsData);
            }

            found = true;

            // Retrieve and display payment data from the payment table based on CustID
            PreparedStatement paymentStmt = con.prepareStatement("SELECT * FROM payment WHERE CustomerID = ?");
            paymentStmt.setString(1, pcode);
            ResultSet paymentRs = paymentStmt.executeQuery();

            while (paymentRs.next()) {
                // Check for duplicate payment data
                String paymentID = paymentRs.getString("PaymentID");
                if (!uniquePaymentIDs.contains(paymentID)) {
                    Vector<Object> paymentData = new Vector<>();
                    paymentData.add(paymentRs.getString("PaymentID"));
                    paymentData.add(paymentRs.getString("OrderID"));
                    paymentData.add(paymentRs.getString("CustomerID"));
                    paymentData.add(paymentRs.getString("Date"));
                    paymentData.add(paymentRs.getString("Total"));
                    paymentData.add(paymentRs.getString("Cash"));
                    paymentData.add(paymentRs.getString("Balance"));
                    paymentTableModel.addRow(paymentData);

                    // Add the payment ID to the HashSet to avoid duplicates
                    uniquePaymentIDs.add(paymentID);
                }
            }
        }

        if (!found) {
            JOptionPane.showMessageDialog(this, "Customer doesn't exist");
        }

    } catch (SQLException ex) {
        Logger.getLogger(Billing.class.getName()).log(Level.SEVERE, null, ex);
    }
}
       
   public void tblDet(){
       int c;
        try {
            Connection con = Conn.getConnection();
            pst = con.prepareStatement("EXEC GetDetails");
            ResultSet res = pst.executeQuery();

            ResultSetMetaData Rss = res.getMetaData();
            c = Rss.getColumnCount();

            DefaultTableModel Df = (DefaultTableModel) tblDetails.getModel();
            Df.setRowCount(0);

            while (res.next()) {
                Vector v2 = new Vector();
                v2.add(res.getString("OrderID"));
                v2.add(res.getString("ProductID"));
                v2.add(res.getString("Quantity"));
                v2.add(res.getString("Subtotal"));
                Df.addRow(v2);
            }

        } catch (SQLException ex) {
            Logger.getLogger(Sales.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   
    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
       String sql="delete from customer where CustomerID=?";
        try{
            Connection con=Conn.getConnection(); 
    pst=con.prepareStatement(sql);
    pst.setString(1, txtcustID.getText());
   pst.execute();
    JOptionPane.showMessageDialog(null, "Customer Deleted");
    tblview();
     con.close();
                pst.close();
                 txtcustID.setText("");
                txtCustname.setText("");
                txtCustAdd.setText("");
                 txtcont.setText("");
             
               
    }catch(Exception ex){
  JOptionPane.showMessageDialog(this, "Failed to delete data.");}
    }//GEN-LAST:event_btnDeleteActionPerformed
public void tblPayment(){
       int c;
        try {
            Connection con = Conn.getConnection();
            pst = con.prepareStatement("EXEC GetAllPayment");
            ResultSet res = pst.executeQuery();

            ResultSetMetaData Rss = res.getMetaData();
            c = Rss.getColumnCount();

            DefaultTableModel Df = (DefaultTableModel) tblpayment.getModel();
            Df.setRowCount(0);

            while (res.next()) {
                Vector v2 = new Vector();
                v2.add(res.getString("PaymentID"));
                v2.add(res.getString("OrderID"));
                v2.add(res.getString("CustomerID"));
                v2.add(res.getString("Date"));
                v2.add(res.getString("Total"));
                v2.add(res.getString("Cash"));
                v2.add(res.getString("Balance"));
                Df.addRow(v2);
            }

        } catch (SQLException ex) {
            Logger.getLogger(Sales.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
       if(txtcustID.getText().isEmpty()||txtCustname.getText().isEmpty()||txtCustname.getText().isEmpty()||txtcont.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this,"No Data Inserted");
        }
        else
        {
            try {
                Connection con=Conn.getConnection();
                String Update = "update customer set CustomerID='" + txtcustID.getText() + "', Name='" + txtCustname.getText() + "', Address='" + txtCustAdd.getText() + "', Contact='" + txtcont.getText() + "',Gender='" + txtGender.getSelectedItem().toString() + "'where CustomerID='" + txtcustID.getText() + "' ";
                pst = con.prepareStatement(Update);
            pst.execute();
            JOptionPane.showMessageDialog(this, "Customer Updated");
            tblview();
              } catch (Exception e) {
                  JOptionPane.showMessageDialog(this, null);
            }
        }
    }//GEN-LAST:event_btnEditActionPerformed
 public void tblorder(){
       int c;
        try {
            Connection con = Conn.getConnection();
            pst = con.prepareStatement("EXEC GetAllOrders");
            ResultSet res = pst.executeQuery();

            ResultSetMetaData Rss = res.getMetaData();
            c = Rss.getColumnCount();

            DefaultTableModel Df = (DefaultTableModel) tblorder.getModel();
            Df.setRowCount(0);

            while (res.next()) {
                Vector v2 = new Vector();
                v2.add(res.getString("OrderID"));
                v2.add(res.getString("Total"));
                v2.add(res.getString("CustomerID"));
                v2.add(res.getString("OrderDate"));
                Df.addRow(v2);
            }

        } catch (SQLException ex) {
            Logger.getLogger(Sales.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
 private void search() throws SQLException{
String id = txtcustID.getText();
try{
 Connection con=Conn.getConnection(); 
    pst = con.prepareStatement("SELECT * FROM customer WHERE CustomerID = ?");
    pst.setString(1, id);
    rs = pst.executeQuery();
    if(rs.next()){
        txtCustname.setText(rs.getString(2));
        txtCustAdd.setText(rs.getString(3));
        txtcont.setText(rs.getString(4));
        txtGender.setSelectedItem(rs.getString(5));
    }
    else{
        JOptionPane.showMessageDialog(null, "ID doesnt exist");}
}
catch(Exception  ex)
{
  JOptionPane.showMessageDialog(null, ex);
}
}
    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
      txtcustID.setText("");
        txtCustname.setText("");
        txtCustAdd.setText("");
        txtcont.setText("");
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
      Home us = new Home();
               us.setVisible(true);
                   setVisible(false);
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearchActionPerformed
        try {
            search();
            retord();
        } catch (SQLException ex) {
            Logger.getLogger(Sales.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnsearchActionPerformed

    private void tblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMouseClicked
        DefaultTableModel Df = (DefaultTableModel)tbl.getModel();
        int selectedIndex = tbl.getSelectedRow();

        txtcustID.setText(Df.getValueAt(selectedIndex, 0).toString());
        txtCustname.setText(Df.getValueAt(selectedIndex, 1).toString());
        txtCustAdd.setText(Df.getValueAt(selectedIndex, 2).toString());
        txtcont.setText(Df.getValueAt(selectedIndex, 3).toString());
        txtGender.setSelectedItem(Df.getValueAt(selectedIndex, 4).toString());
    }//GEN-LAST:event_tblMouseClicked

    private void btnInventoryjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInventoryjButton1ActionPerformed
        Inventory Inv = new Inventory();
        Inv.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btnInventoryjButton1ActionPerformed

    private void btnItemsjButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnItemsjButton2ActionPerformed
        Items Ite = new Items();
        Ite.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btnItemsjButton2ActionPerformed

    private void btnSalesjButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalesjButton3ActionPerformed
        Sales Sal = new Sales();
        Sal.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btnSalesjButton3ActionPerformed

    private void btnAccountsjButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAccountsjButton4ActionPerformed
        Accounts Acc= new Accounts();
        Acc.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btnAccountsjButton4ActionPerformed

    private void btnExitjButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitjButton5ActionPerformed
        Login out = new Login();
        out.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btnExitjButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(Sales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sales().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAccounts;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnInventory;
    private javax.swing.JButton btnItems;
    private javax.swing.JButton btnSales;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnsearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable tbl;
    private javax.swing.JTable tblDetails;
    private javax.swing.JTable tblorder;
    private javax.swing.JTable tblpayment;
    private javax.swing.JTextField txtCustAdd;
    private javax.swing.JTextField txtCustname;
    private javax.swing.JComboBox<String> txtGender;
    private javax.swing.JTextField txtcont;
    private javax.swing.JTextField txtcustID;
    // End of variables declaration//GEN-END:variables
}
