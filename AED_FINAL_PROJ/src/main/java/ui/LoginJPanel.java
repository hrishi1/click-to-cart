/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import javax.swing.JSplitPane;
import javax.swing.JOptionPane;
import model.Community;
import model.CompanyDirectory;
import model.CustomerDirectory;
import model.DeliveryBoyDirectory;
import model.Ordermgt;
import model.UserAuthentication;
import model.UserAuthenticationDirectory;

/**
 *
 * @author 91961
 */
public class LoginJPanel extends javax.swing.JPanel {

    private JSplitPane splitPane;
    private Community community;
    private CustomerDirectory customerDirectory;
    private CompanyDirectory companyDirectory;
    private UserAuthenticationDirectory userauthenticationdirectory;
    private DeliveryBoyDirectory deliveryBoyDirectory;
    private Ordermgt orderManagement;

    /**
     * Creates new form LoginJPanel
     */
    public LoginJPanel() {
        initComponents();
    }

    public LoginJPanel(Ordermgt orderManagement, Community community, CustomerDirectory customerDirectory, CompanyDirectory companyDirectory, UserAuthenticationDirectory userauthenticationdirectory, JSplitPane splitPane, DeliveryBoyDirectory deliveryBoyDirectory) {
        initComponents();
        this.community = community;
        this.customerDirectory = customerDirectory;
        this.companyDirectory = companyDirectory;
        this.userauthenticationdirectory = userauthenticationdirectory;
        this.splitPane = splitPane;
        this.deliveryBoyDirectory = deliveryBoyDirectory;
        this.orderManagement = orderManagement;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        createLabel1 = new javax.swing.JLabel();
        usernameJLabel1 = new javax.swing.JLabel();
        passwordLabel2 = new javax.swing.JLabel();
        usernameTextField1 = new javax.swing.JTextField();
        passwordTextField2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        companyAdminRadioButton1 = new javax.swing.JRadioButton();
        deliveryBoyRadioButton4 = new javax.swing.JRadioButton();
        customerRadioButton5 = new javax.swing.JRadioButton();
        loginButton1 = new javax.swing.JButton();

        createLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        createLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        createLabel1.setText("Login");
        createLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));

        usernameJLabel1.setText("Username");

        passwordLabel2.setText("Password");

        usernameTextField1.setText("Username");

        passwordTextField2.setText("Password");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Admin Login");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Person");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        companyAdminRadioButton1.setText("Company Admin");
        companyAdminRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                companyAdminRadioButton1ActionPerformed(evt);
            }
        });

        deliveryBoyRadioButton4.setText("DeliveryBoy");

        customerRadioButton5.setText("Customer");
        customerRadioButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerRadioButton5ActionPerformed(evt);
            }
        });

        loginButton1.setText("Login");
        loginButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(createLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 779, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(usernameJLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(passwordLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(245, 245, 245)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(passwordTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(usernameTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(156, 156, 156))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(loginButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(304, 304, 304))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(companyAdminRadioButton1)
                                                .addComponent(jLabel1))
                                            .addGap(206, 206, 206)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(deliveryBoyRadioButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(customerRadioButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(357, 357, 357)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(142, 142, 142)))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(createLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernameJLabel1)
                    .addComponent(usernameTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordLabel2)
                    .addComponent(passwordTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(companyAdminRadioButton1)
                    .addComponent(customerRadioButton5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(deliveryBoyRadioButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(loginButton1)
                .addGap(28, 28, 28))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void companyAdminRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_companyAdminRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_companyAdminRadioButton1ActionPerformed

    private void loginButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButton1ActionPerformed
        // TODO add your handling code here:

        if (usernameTextField1.getText().length() == 0) {
            JOptionPane.showMessageDialog(this, "UserName is empty");
            return;
        }

        if (passwordTextField2.getText().length() == 0) {
            JOptionPane.showMessageDialog(this, "Password text field is empty");
            return;
        }

        String usertype;
        if (companyAdminRadioButton1.isSelected() == true) {
            usertype = "CompanyAdmin";
        } else if (customerRadioButton5.isSelected() == true) {
            usertype = "Customer";
        } else if (deliveryBoyRadioButton4.isSelected() == true) {
            usertype = "DeliveryBoy";
        } else {
            JOptionPane.showMessageDialog(this, "Select one of the radio buttons");
            return;
        }

        boolean flag = false;
        for (UserAuthentication userAuthentication : userauthenticationdirectory.getUserAuthenticationList()) {
            if (userAuthentication.getUserType().equalsIgnoreCase(usertype)
                    && userAuthentication.getUserName().equalsIgnoreCase(usernameTextField1.getText())
                    && userAuthentication.getPassword().equalsIgnoreCase(passwordTextField2.getText())) {
                flag = true;
            }
        }

        if (flag && usertype.equalsIgnoreCase("Customer")) {
            JOptionPane.showMessageDialog(this, "Login is successfully done for customer");
            MainCustomerJPanel mainCustomerJPanel = new MainCustomerJPanel(usernameTextField1.getText(),orderManagement, community, customerDirectory, companyDirectory, userauthenticationdirectory, splitPane, deliveryBoyDirectory);
            splitPane.setRightComponent(mainCustomerJPanel);
        } else if (flag && usertype.equalsIgnoreCase("DeliveryBoy")) {
            JOptionPane.showMessageDialog(this, "Login is successfully done for Delivery Boy");
            MainDeliveryBoyJPanel mainDeliveryBoyJPanel = new MainDeliveryBoyJPanel(community, customerDirectory, companyDirectory, userauthenticationdirectory, splitPane, deliveryBoyDirectory);
            splitPane.setRightComponent(mainDeliveryBoyJPanel);
        }
    }//GEN-LAST:event_loginButton1ActionPerformed

    private void customerRadioButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerRadioButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_customerRadioButton5ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton companyAdminRadioButton1;
    private javax.swing.JLabel createLabel1;
    private javax.swing.JRadioButton customerRadioButton5;
    private javax.swing.JRadioButton deliveryBoyRadioButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton loginButton1;
    private javax.swing.JLabel passwordLabel2;
    private javax.swing.JTextField passwordTextField2;
    private javax.swing.JLabel usernameJLabel1;
    private javax.swing.JTextField usernameTextField1;
    // End of variables declaration//GEN-END:variables
}
