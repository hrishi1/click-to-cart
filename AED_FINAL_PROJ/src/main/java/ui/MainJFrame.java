/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import model.UserAuthenticationDirectory;
import javax.swing.JFrame;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import javax.swing.JSplitPane;
import model.City;
import model.CityDir;
import model.Community;
import model.Company;
import model.CompanyDirectory;
import model.Customer;
import model.CustomerDirectory;
import model.DeliveryBoy;
import model.DeliveryBoyDirectory;
import model.Inventory;
import model.InventoryMgt;
import model.InventoryProduct;
import model.InventoryProductDir;
import model.Orderedprod;
import model.Ordermgt;
import model.Orders;
import model.Payment;
import model.UserAuthentication;
import database.Connection;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
//import java.sql.SQLException;
//import java.util.logging.Level;
//import java.util.logging.Logger;

/**
 *
 * @author hrish
 */
public class MainJFrame extends javax.swing.JFrame {

    private Community community;
    private CustomerDirectory customerDirectory;
    private UserAuthenticationDirectory userauthenticationdirectory;
    private CityDir cityDirectory;
    private CompanyDirectory companyDir;
    private InventoryMgt inventoryManagement;
    private InventoryProductDir invProdDir;
    private DeliveryBoyDirectory deliveryBoyDirectory;
    private Ordermgt orderManagement;
    private City city;
    private Company company;
    private Company company1;
    private UserAuthentication userAuthentication;
    private DeliveryBoy deliveryBoy;
    private Customer customer;

    public MainJFrame() {
        initComponents();

        setExtendedState(JFrame.MAXIMIZED_BOTH);
        Connection obj = new Connection();
        java.sql.Connection con = obj.getConnection();
        System.out.println();

        community = new Community();
        customerDirectory = new CustomerDirectory();
        userauthenticationdirectory = new UserAuthenticationDirectory();
        cityDirectory = new CityDir();
        companyDir = new CompanyDirectory();
        inventoryManagement = new InventoryMgt();
        deliveryBoyDirectory = new DeliveryBoyDirectory();
        orderManagement = new Ordermgt();

        invProdDir = new InventoryProductDir();

        InventoryProduct invProd = invProdDir.addNewInventoryProduct();
        invProd.setProductName("TV");
        invProd.setPid(UUID.randomUUID().toString());
        invProd.setPrice(500);
        invProd.setInventoryQty(24);

        Inventory inv = inventoryManagement.addNewInventory();
        inv.setInventoryCategory("Default");
        inv.setInventoryType("Critical");
        inv.setInventoryProductDir(invProdDir);

        company = companyDir.addNewCompany();
        company.setCompanyName("Costco");
        company.setCompanyType("Type 1");
        company.setInventoryManagement(inventoryManagement);

        company1 = companyDir.addNewCompany();
        company1.setCompanyName("Target1");
        company1.setCompanyType("Type 1");
        company1.setInventoryManagement(inventoryManagement);

        company1 = companyDir.addNewCompany();
        company1.setCompanyName("Target2");
        company1.setCompanyType("Type 2");
        company1.setInventoryManagement(inventoryManagement);

        //Default City
        city = cityDirectory.addNewCity();

        city.setCityName("Boston");
        city.setCityType("Urban");
        city.setPopulation(25000);
        city.setCompanyDirectory(companyDir);

        userAuthentication = userauthenticationdirectory.addNewUserAuthentication();
        userAuthentication.setUserName("abc");
        userAuthentication.setPassword("abc");
        userAuthentication.setUserType("Customer");

        String query;
        query = "INSERT INTO `logintable`(`username`, `password`, `usertype`) VALUES (?,?,?)";
        PreparedStatement pst = null;
        try {
            pst = obj.getConnection().prepareStatement(query);
            pst.setString(1, "abc");
            pst.setString(2, "abc");
            pst.setString(3, "Customer");
            //        if(cpass.equals(password)){
            pst.executeUpdate();
            System.out.println("INserted");
        } catch (SQLException ex) {
            Logger.getLogger(MainJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }

        userAuthentication = userauthenticationdirectory.addNewUserAuthentication();
        userAuthentication.setUserName("de");
        userAuthentication.setPassword("de");
        userAuthentication.setUserType("DeliveryBoy");

        userAuthentication = userauthenticationdirectory.addNewUserAuthentication();
        userAuthentication.setUserName("abc1");
        userAuthentication.setPassword("abc1");
        userAuthentication.setUserType("OrderAdmin");

        userAuthentication = userauthenticationdirectory.addNewUserAuthentication();
        userAuthentication.setUserName("ab");
        userAuthentication.setPassword("ab");
        userAuthentication.setUserType("SuperAdmin");

        userAuthentication = userauthenticationdirectory.addNewUserAuthentication();
        userAuthentication.setUserName("co");
        userAuthentication.setPassword("co");
        userAuthentication.setCityName("Boston");
        userAuthentication.setCompanyName("Costco");
        userAuthentication.setUserType("CompanyAdmin");

        userAuthentication = userauthenticationdirectory.addNewUserAuthentication();
        userAuthentication.setUserName("cu");
        userAuthentication.setPassword("cu");
        userAuthentication.setUserType("Customer");
//
//        List<Orders> ordersList = new ArrayList<>();
//        for (int i = 0; i < 2; i++) {
//
//            Orders orders = new Orders();
//            orders.setOrderId(String.valueOf(i));
//            orders.setOrderStatus("OrderPlaced");
//            Payment payment = new Payment();
//            payment.setPaymentType("Debit");
//            orders.setPaymentType(payment);
//            List<Orderedprod> orderedprodList = new ArrayList<>();
//            Orderedprod orderedprod = new Orderedprod();
//            orderedprod.setProdId("1");
//            orderedprod.setProductName("sr");
//            orderedprod.setProdTotalprice(500.78);
//            orderedprod.setProdcount(12);
//            orderedprodList.add(orderedprod);
//            orders.setOrderedProds(orderedprodList);
//            ordersList.add(orders);
//        }
//
//        orderManagement.setOrders(ordersList);
//
//        deliveryBoy = deliveryBoyDirectory.addNewDeliveryBoy();
//        deliveryBoy.setDeliveryBoyName("de");
//        deliveryBoy.setOrderList(ordersList);
//
//        customer = customerDirectory.addNewCustomer();
//        customer.setUserName("abc");
//        customer.setOrders(ordersList);
//
//        customer = customerDirectory.addNewCustomer();
//        customer.setUserName("cu");
//        customer.setOrders(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        splitPane = new javax.swing.JSplitPane();
        controlPanel = new javax.swing.JPanel();
        btnLogin = new javax.swing.JButton();
        btnCustomerRegister = new javax.swing.JButton();
        workArea = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        lblDetails = new javax.swing.JLabel();
        cityAdminTest = new javax.swing.JButton();
        invAdminTest = new javax.swing.JButton();
        supAdminTest = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1290, 750));

        controlPanel.setBackground(new java.awt.Color(255, 255, 255));
        controlPanel.setMinimumSize(new java.awt.Dimension(200, 200));
        controlPanel.setPreferredSize(new java.awt.Dimension(1018, 700));

        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        btnCustomerRegister.setText("Customer Register");
        btnCustomerRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCustomerRegisterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout controlPanelLayout = new javax.swing.GroupLayout(controlPanel);
        controlPanel.setLayout(controlPanelLayout);
        controlPanelLayout.setHorizontalGroup(
            controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCustomerRegister, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(9, Short.MAX_VALUE))
        );
        controlPanelLayout.setVerticalGroup(
            controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelLayout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(btnLogin)
                .addGap(61, 61, 61)
                .addComponent(btnCustomerRegister)
                .addContainerGap(449, Short.MAX_VALUE))
        );

        splitPane.setLeftComponent(controlPanel);

        workArea.setBackground(new java.awt.Color(255, 255, 255));
        workArea.setMinimumSize(new java.awt.Dimension(200, 200));
        workArea.setPreferredSize(new java.awt.Dimension(1200, 700));

        lblTitle.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblTitle.setText("AED Final Project");

        lblDetails.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblDetails.setText("Hrishikesh S. Pawar, Abhishek Nair and Roshan Dadlani");

        cityAdminTest.setText("City Admin Test");
        cityAdminTest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cityAdminTestActionPerformed(evt);
            }
        });

        invAdminTest.setText("Inv Admin Test");
        invAdminTest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                invAdminTestActionPerformed(evt);
            }
        });

        supAdminTest.setText("Super Admin Test");
        supAdminTest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supAdminTestActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout workAreaLayout = new javax.swing.GroupLayout(workArea);
        workArea.setLayout(workAreaLayout);
        workAreaLayout.setHorizontalGroup(
            workAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(workAreaLayout.createSequentialGroup()
                .addGroup(workAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(workAreaLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(workAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDetails)
                            .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(workAreaLayout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addGroup(workAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(supAdminTest, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(invAdminTest, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cityAdminTest, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(518, Short.MAX_VALUE))
        );
        workAreaLayout.setVerticalGroup(
            workAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(workAreaLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDetails)
                .addGap(154, 154, 154)
                .addComponent(cityAdminTest)
                .addGap(18, 18, 18)
                .addComponent(invAdminTest)
                .addGap(18, 18, 18)
                .addComponent(supAdminTest)
                .addContainerGap(279, Short.MAX_VALUE))
        );

        splitPane.setRightComponent(workArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1213, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 672, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
        LoginJPanel loginJPanel = new LoginJPanel(cityDirectory, orderManagement, community, customerDirectory, companyDir, userauthenticationdirectory, splitPane, deliveryBoyDirectory);
        splitPane.setRightComponent(loginJPanel);

    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnCustomerRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCustomerRegisterActionPerformed
        // TODO add your handling code here:
        CustomerRegistrationJPanel customerRegistrationJPanel = new CustomerRegistrationJPanel(orderManagement, community, customerDirectory, companyDir, userauthenticationdirectory, splitPane, deliveryBoyDirectory);
        splitPane.setRightComponent(customerRegistrationJPanel);
    }//GEN-LAST:event_btnCustomerRegisterActionPerformed

    private void cityAdminTestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cityAdminTestActionPerformed
        // TODO add your handling code here:
//        CityAdminPanel c = new CityAdminPanel(cityDirectory, splitPane);
//        splitPane.setRightComponent(c);
//
//        OrderCnfPanel m = new OrderCnfPanel(new Customer(), company, splitPane);
//        splitPane.setRightComponent(m);

//        DeliveryAdminMainPanel c = new DeliveryAdminMainPanel(cityDirectory, "Boston", "Costco", company, community, customerDirectory, city.getCompanyDirectory(), userauthenticationdirectory, splitPane, deliveryBoyDirectory);
//        splitPane.setRightComponent(c);
    }//GEN-LAST:event_cityAdminTestActionPerformed

    private void invAdminTestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_invAdminTestActionPerformed
        // TODO add your handling code here:

        String cityName = new String("Boston");
        String companyName = new String("Costco");

        InventoryAdminPanel i = new InventoryAdminPanel(cityName, companyName, cityDirectory, splitPane);
        splitPane.setRightComponent(i);

    }//GEN-LAST:event_invAdminTestActionPerformed

    private void deliveryBoyRegistrationJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deliveryBoyRegistrationJButtonActionPerformed
        // TODO add your handling code here:
        String cityName = new String("Boston");
        String companyName = new String("Costco");

        DeliveryAdminMainPanel deliveryBoyRegistrationJPanel = new DeliveryAdminMainPanel(cityDirectory, cityName, companyName, company, community, customerDirectory, companyDir, userauthenticationdirectory, splitPane, deliveryBoyDirectory);
        splitPane.setRightComponent(deliveryBoyRegistrationJPanel);
    }//GEN-LAST:event_deliveryBoyRegistrationJButtonActionPerformed

    private void supAdminTestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supAdminTestActionPerformed
        // TODO add your handling code here:
        System.out.println(orderManagement.getOrders().size());
        SuperAdminPanel supAdmin = new SuperAdminPanel(cityDirectory, orderManagement, community, customerDirectory, companyDir, userauthenticationdirectory, splitPane, deliveryBoyDirectory);
        splitPane.setRightComponent(supAdmin);
    }//GEN-LAST:event_supAdminTestActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

//        try {
//
//            Class.forName("com.mysql.jdbc.Driver");
//            Connection con = DriverManager.getConnection(
//                    "jdbc:mysql://localhost:3306/aed_project", "root", "root");
//            //here sonoo is database name, root is username and password  
//            Statement stmt = con.createStatement();
//            ResultSet rs = stmt.executeQuery("select * from Inventory_Product");
//            while (rs.next()) {
//                System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
//            }
//            con.close();
//        } catch (Exception e) {
//            System.out.println(e);
//        }

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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCustomerRegister;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton cityAdminTest;
    private javax.swing.JPanel controlPanel;
    private javax.swing.JButton invAdminTest;
    private javax.swing.JLabel lblDetails;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JSplitPane splitPane;
    private javax.swing.JButton supAdminTest;
    private javax.swing.JPanel workArea;
    // End of variables declaration//GEN-END:variables
}
