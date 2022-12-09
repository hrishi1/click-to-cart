/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import javax.swing.JOptionPane;
import javax.swing.JSplitPane;
import model.Cart;
import model.Community;
import model.CompanyDirectory;
import model.Customer;
import model.CustomerDirectory;
import model.DeliveryBoyDirectory;
import model.Ordermgt;
import model.UserAuthentication;
import model.UserAuthenticationDirectory;

/**
 *
 * @author Abhishek
 */
public class CustomerRegistrationJPanel extends javax.swing.JPanel {

    private JSplitPane splitPane;
    private CustomerDirectory customerDirectory;
    private CompanyDirectory companyDirectory;
    private Community community;
    private UserAuthenticationDirectory userauthenticationdirectory;
    private DeliveryBoyDirectory deliveryBoyDirectory;
    private Ordermgt orderManagement;

    /**
     * Creates new form MainCustomerJPanel
     */
    public CustomerRegistrationJPanel() {
        initComponents();
    }

    public CustomerRegistrationJPanel(Ordermgt orderManagement,Community community, CustomerDirectory customerDirectory, CompanyDirectory companyDirectory, UserAuthenticationDirectory userauthenticationdirectory, JSplitPane splitPane, DeliveryBoyDirectory deliveryBoyDirectory) {
        initComponents();
        this.community = community;
        this.splitPane = splitPane;
        this.customerDirectory = customerDirectory;
        this.companyDirectory = companyDirectory;
        this.userauthenticationdirectory = userauthenticationdirectory;
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

        nameTextField = new javax.swing.JTextField();
        save = new javax.swing.JButton();
        nearestLandMarkTextField = new javax.swing.JTextField();
        addressTextField = new javax.swing.JTextField();
        usernameTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        createLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        passwordTextField = new javax.swing.JTextField();

        nameTextField.setText("Name");
        nameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTextFieldActionPerformed(evt);
            }
        });

        save.setText("Save");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        nearestLandMarkTextField.setText("Nearest LandMark");

        addressTextField.setText("Address");

        usernameTextField.setText("Username");

        jLabel1.setText("Name");

        jLabel2.setText("Nearest LandMark");

        jLabel3.setText("Address");

        jLabel4.setText("Username");

        createLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        createLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        createLabel1.setText("Create Customer");
        createLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));

        jLabel5.setText("Password");

        passwordTextField.setText("Password");
        passwordTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordTextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(157, 157, 157)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(557, 557, 557)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(usernameTextField, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(passwordTextField, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nearestLandMarkTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                    .addComponent(addressTextField)
                    .addComponent(nameTextField, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(59, 59, 59))
            .addGroup(layout.createSequentialGroup()
                .addComponent(createLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(521, 521, 521)
                .addComponent(save)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(createLabel1)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nearestLandMarkTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(save)
                .addGap(184, 184, 184))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        // TODO add your handling code here:

        if (nameTextField.getText().length() == 0) {
            JOptionPane.showMessageDialog(this, "Mandatory name field is empty");
            return;
        }

        if (!nameTextField.getText().matches("[a-zA-Z]+")) {
            JOptionPane.showMessageDialog(this, "Name field should only have alphabets");
            return;
        }

        if (nearestLandMarkTextField.getText().length() == 0) {
            JOptionPane.showMessageDialog(this, "Mandatory name field is empty");
            return;
        }

        if (addressTextField.getText().length() == 0) {
            JOptionPane.showMessageDialog(this, "Mandatory name field is empty");
            return;
        }

        for (int i = 0; i < userauthenticationdirectory.getUserAuthenticationList().size(); i++) {
            UserAuthentication userauthentication = userauthenticationdirectory.getUserAuthenticationList().get(i);

            if (userauthentication.getUserName().equalsIgnoreCase(usernameTextField.getText())
                    && userauthentication.getUserType().equalsIgnoreCase("Customer")) {
                JOptionPane.showMessageDialog(this, "Customer username already exits, please login directly");
                return;
            }
        }

        Customer customer = customerDirectory.addNewCustomer();
        customer.setUserName(usernameTextField.getText());
        customer.setCustomerClosestLandmark(nearestLandMarkTextField.getText());
        customer.setCustomerAddress(addressTextField.getText());
        customer.setCustomerName(nameTextField.getText());
        Cart cart = new Cart();
        customer.setCart(cart);
        community.setCustomerDirectory(customerDirectory);
        UserAuthentication userauthentication = userauthenticationdirectory.addNewUserAuthentication();
        userauthentication.setUserName(usernameTextField.getText());
        userauthentication.setPassword(passwordTextField.getText());
        userauthentication.setUserType("Customer");

        setDefault();
        JOptionPane.showMessageDialog(this, "Customer has been created");
    }//GEN-LAST:event_saveActionPerformed

    private void setDefault() {
        usernameTextField.setText("");
        passwordTextField.setText("");
        nameTextField.setText("");
        nearestLandMarkTextField.setText("");
        addressTextField.setText("");
    }

    private void nameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTextFieldActionPerformed

    private void passwordTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordTextFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressTextField;
    private javax.swing.JLabel createLabel1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JTextField nearestLandMarkTextField;
    private javax.swing.JTextField passwordTextField;
    private javax.swing.JButton save;
    private javax.swing.JTextField usernameTextField;
    // End of variables declaration//GEN-END:variables
}
