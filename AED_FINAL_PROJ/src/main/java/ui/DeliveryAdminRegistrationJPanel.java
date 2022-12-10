/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import javax.swing.JOptionPane;
import javax.swing.JSplitPane;
import javax.swing.table.DefaultTableModel;
import model.CityDir;
import model.Community;
import model.CompanyDirectory;
import model.CustomerDirectory;
import model.DeliveryBoyDirectory;
import model.UserAuthentication;
import model.UserAuthenticationDirectory;

/**
 *
 * @author Abhishek
 */
public class DeliveryAdminRegistrationJPanel extends javax.swing.JPanel {

    private CityDir cityDirectory;
    private JSplitPane splitPane;
    private CustomerDirectory customerDirectory;
    private CompanyDirectory companyDirectory;
    private Community community;
    private UserAuthenticationDirectory userauthenticationdirectory;
    private DeliveryBoyDirectory deliveryBoyDirectory;

    /**
     * Creates new form CompanyAdminRegistrationJPanel
     */
    public DeliveryAdminRegistrationJPanel() {
        initComponents();
    }

    public DeliveryAdminRegistrationJPanel(CityDir cityDirectory, Community community, CustomerDirectory customerDirectory, CompanyDirectory companyDirectory, UserAuthenticationDirectory userauthenticationdirectory, JSplitPane splitPane, DeliveryBoyDirectory deliveryBoyDirectory) {
        initComponents();
        this.cityDirectory = cityDirectory;
        this.community = community;
        this.splitPane = splitPane;
        this.customerDirectory = customerDirectory;
        this.companyDirectory = companyDirectory;
        this.userauthenticationdirectory = userauthenticationdirectory;
        this.deliveryBoyDirectory = deliveryBoyDirectory;
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
        saveCompanyAdminButton = new javax.swing.JButton();
        deleteOrderAdminButton = new javax.swing.JButton();
        userNameTextField1 = new javax.swing.JTextField();
        updateOrderAdmin = new javax.swing.JButton();
        viewDeliveryAdmin = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        deleteDeliveryAdminButton = new javax.swing.JButton();
        updateDeliveryAdmin = new javax.swing.JButton();
        saveDeliveryAdminButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        passwordTextField = new javax.swing.JTextField();
        userNameTextField = new javax.swing.JTextField();

        createLabel1.setBackground(new java.awt.Color(255, 102, 102));
        createLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        createLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        createLabel1.setText("Delivery Admin Registration");
        createLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));

        saveCompanyAdminButton.setText("Save");

        deleteOrderAdminButton.setText("Delete");

        updateOrderAdmin.setText("Update");

        viewDeliveryAdmin.setText("View");
        viewDeliveryAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewDeliveryAdminActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Username"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        deleteDeliveryAdminButton.setText("Delete");
        deleteDeliveryAdminButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteDeliveryAdminButtonActionPerformed(evt);
            }
        });

        updateDeliveryAdmin.setText("Update");
        updateDeliveryAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateDeliveryAdminActionPerformed(evt);
            }
        });

        saveDeliveryAdminButton1.setText("Save");
        saveDeliveryAdminButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveDeliveryAdminButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Password");

        jLabel1.setText("Username");

        userNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNameTextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(createLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1039, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(userNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(saveDeliveryAdminButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(viewDeliveryAdmin)
                        .addGap(37, 37, 37)
                        .addComponent(updateDeliveryAdmin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(deleteDeliveryAdminButton))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(103, 103, 103))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(createLabel1)
                        .addGap(36, 36, 36)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(userNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(77, 77, 77)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46)
                        .addComponent(saveDeliveryAdminButton1)
                        .addGap(55, 55, 55)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewDeliveryAdmin)
                    .addComponent(updateDeliveryAdmin)
                    .addComponent(deleteDeliveryAdminButton))
                .addContainerGap(48, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void saveDeliveryAdminButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveDeliveryAdminButton1ActionPerformed
        // TODO add your handling code here:
        if (userNameTextField.getText().length() == 0) {
            JOptionPane.showMessageDialog(this, "Mandatory User name field is empty");
            return;
        }

        if (passwordTextField.getText().length() == 0) {
            JOptionPane.showMessageDialog(this, "Mandatory Password field is empty");
            return;
        }

        for (int i = 0; i < userauthenticationdirectory.getUserAuthenticationList().size(); i++) {
            UserAuthentication userauthentication = userauthenticationdirectory.getUserAuthenticationList().get(i);
            if (userauthentication.getUserName().equalsIgnoreCase(userNameTextField.getText())
                    && userauthentication.getUserType().equalsIgnoreCase("DeliveryAdmin")) {
                JOptionPane.showMessageDialog(this, "Delivery Admin username already exits, please login directly");
                return;
            }
        }

        UserAuthentication userAuthentication = userauthenticationdirectory.addNewUserAuthentication();
        userAuthentication.setUserName(userNameTextField.getText());
        userAuthentication.setPassword(passwordTextField.getText());
        userAuthentication.setUserType("DeliveryAdmin");

        JOptionPane.showMessageDialog(this, "Delivery Admin credentials is saved");
    }//GEN-LAST:event_saveDeliveryAdminButton1ActionPerformed

    /**
     * Populate the table cities rows from the arrayList.
     */
    private void populateDeliveryAdmin() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        for (UserAuthentication userAuthentication : userauthenticationdirectory.getUserAuthenticationList()) {
            if ("DeliveryAdmin".equalsIgnoreCase(userAuthentication.getUserName())) {
                Object[] row = new Object[1];
                row[0] = userAuthentication.getUserName();
                model.addRow(row);
            }
        }
    }

    private void userNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userNameTextFieldActionPerformed

    private void viewDeliveryAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewDeliveryAdminActionPerformed
        // TODO add your handling code here:
        populateDeliveryAdmin();
    }//GEN-LAST:event_viewDeliveryAdminActionPerformed

    private void updateDeliveryAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateDeliveryAdminActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = jTable1.getSelectedRow();

        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to update");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        String selectUsername = (String) model.getValueAt(selectedRowIndex, 0);

        String newUserName = JOptionPane.showInputDialog(null, "Enter the new User name", selectUsername);

        model.setValueAt(newUserName, selectedRowIndex, 0);

        for (UserAuthentication userAuthentication : userauthenticationdirectory.getUserAuthenticationList()) {
            if (userAuthentication.getUserName().equalsIgnoreCase(selectUsername)
                    && userAuthentication.getUserType().equalsIgnoreCase("DeliveryAdmin")) {
                userAuthentication.setUserName(newUserName);
            }
        }
        JOptionPane.showMessageDialog(this, "Delivery Admin Record is Updated");
    }//GEN-LAST:event_updateDeliveryAdminActionPerformed

    private void deleteDeliveryAdminButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteDeliveryAdminButtonActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = jTable1.getSelectedRow();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to delete");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int rowToModel = 0;
        rowToModel = jTable1.convertRowIndexToModel(selectedRowIndex);
        model.removeRow(rowToModel);

        String selectedUsername = model.getValueAt(selectedRowIndex, 0).toString();

        for (UserAuthentication userAuthentication : userauthenticationdirectory.getUserAuthenticationList()) {
            if (userAuthentication.getUserName().equalsIgnoreCase(selectedUsername)
                    && userAuthentication.getUserType().equalsIgnoreCase("DeliveryAdmin")) {
                userauthenticationdirectory.deleteUserAuthentication(selectedRowIndex);
            }
        }
        JOptionPane.showMessageDialog(this, "Delivery Admin is deleted");
    }//GEN-LAST:event_deleteDeliveryAdminButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel createLabel1;
    private javax.swing.JButton deleteDeliveryAdminButton;
    private javax.swing.JButton deleteOrderAdminButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField passwordTextField;
    private javax.swing.JButton saveCompanyAdminButton;
    private javax.swing.JButton saveDeliveryAdminButton1;
    private javax.swing.JButton updateDeliveryAdmin;
    private javax.swing.JButton updateOrderAdmin;
    private javax.swing.JTextField userNameTextField;
    private javax.swing.JTextField userNameTextField1;
    private javax.swing.JButton viewDeliveryAdmin;
    // End of variables declaration//GEN-END:variables
}
