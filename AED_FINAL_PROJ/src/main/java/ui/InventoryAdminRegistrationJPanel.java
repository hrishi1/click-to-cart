/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import javax.swing.JOptionPane;
import javax.swing.JSplitPane;
import javax.swing.table.DefaultTableModel;
import model.City;
import model.CityDir;
import model.Community;
import model.Company;
import model.CompanyDirectory;
import model.CustomerDirectory;
import model.DeliveryBoyDirectory;
import model.UserAuthentication;
import model.UserAuthenticationDirectory;

/**
 *
 * @author 91961
 */
public class InventoryAdminRegistrationJPanel extends javax.swing.JPanel {

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
    public InventoryAdminRegistrationJPanel() {
        initComponents();
    }

    public InventoryAdminRegistrationJPanel(CityDir cityDirectory, Community community, CustomerDirectory customerDirectory, CompanyDirectory companyDirectory, UserAuthenticationDirectory userauthenticationdirectory, JSplitPane splitPane, DeliveryBoyDirectory deliveryBoyDirectory) {
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
        viewInventoryAdmin = new javax.swing.JButton();
        userNameTextField = new javax.swing.JTextField();
        passwordTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        saveCompanyAdminButton1 = new javax.swing.JButton();
        updateDeliveryAdmin = new javax.swing.JButton();
        deleteInventoryAdminButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        createLabel1.setBackground(new java.awt.Color(255, 102, 102));
        createLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        createLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        createLabel1.setText("Inventory Admin Registration");
        createLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));

        viewInventoryAdmin.setText("View");
        viewInventoryAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewInventoryAdminActionPerformed(evt);
            }
        });

        userNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNameTextFieldActionPerformed(evt);
            }
        });

        jLabel1.setText("Username");

        jLabel2.setText("Password");

        saveCompanyAdminButton1.setText("Save");
        saveCompanyAdminButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveCompanyAdminButton1ActionPerformed(evt);
            }
        });

        updateDeliveryAdmin.setText("Update");
        updateDeliveryAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateDeliveryAdminActionPerformed(evt);
            }
        });

        deleteInventoryAdminButton.setText("Delete");
        deleteInventoryAdminButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteInventoryAdminButtonActionPerformed(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(createLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1075, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(110, 110, 110)
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
                        .addComponent(saveCompanyAdminButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(viewInventoryAdmin)
                        .addGap(41, 41, 41)
                        .addComponent(updateDeliveryAdmin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(deleteInventoryAdminButton))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(116, 116, 116))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(createLabel1)
                        .addGap(39, 39, 39)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(userNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(77, 77, 77)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46)
                        .addComponent(saveCompanyAdminButton1)
                        .addGap(69, 69, 69)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewInventoryAdmin)
                    .addComponent(updateDeliveryAdmin)
                    .addComponent(deleteInventoryAdminButton))
                .addContainerGap(222, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void userNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userNameTextFieldActionPerformed

    private void saveCompanyAdminButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveCompanyAdminButton1ActionPerformed
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
                    && userauthentication.getUserType().equalsIgnoreCase("InventoryAdmin")) {
                JOptionPane.showMessageDialog(this, "Inventory Admin username already exits, please login directly");
                return;
            }
        }

        UserAuthentication userAuthentication = userauthenticationdirectory.addNewUserAuthentication();
        userAuthentication.setUserName(userNameTextField.getText());
        userAuthentication.setPassword(passwordTextField.getText());
        userAuthentication.setUserType("InventoryAdmin");

        JOptionPane.showMessageDialog(this, "Inventory Admin credentials is saved");
    }//GEN-LAST:event_saveCompanyAdminButton1ActionPerformed

    private void viewInventoryAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewInventoryAdminActionPerformed
        // TODO add your handling code here:
        populateInventoryAdmin();
    }//GEN-LAST:event_viewInventoryAdminActionPerformed

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
                    && userAuthentication.getUserType().equalsIgnoreCase("InventoryAdmin")) {
                userAuthentication.setUserName(newUserName);
            }
        }
        JOptionPane.showMessageDialog(this, "Inventory Admin Record is Updated");
    }//GEN-LAST:event_updateDeliveryAdminActionPerformed

    private void deleteInventoryAdminButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteInventoryAdminButtonActionPerformed
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

        try {
            for (UserAuthentication userAuthentication : userauthenticationdirectory.getUserAuthenticationList()) {
                if (userAuthentication.getUserName().equalsIgnoreCase(selectedUsername)
                        && userAuthentication.getUserType().equalsIgnoreCase("InventoryAdmin")) {
                    userauthenticationdirectory.deleteUserAuthentication(userAuthentication);
                    populateInventoryAdmin();
                }
            }
        } catch (Exception exception) {

        }
        JOptionPane.showMessageDialog(this, "Inventory Admin is deleted");
    }//GEN-LAST:event_deleteInventoryAdminButtonActionPerformed

    /**
     * Populate the table cities rows from the arrayList.
     */
    private void populateInventoryAdmin() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        for (UserAuthentication userAuthentication : userauthenticationdirectory.getUserAuthenticationList()) {
            if ("InventoryAdmin".equalsIgnoreCase(userAuthentication.getUserName())) {
                Object[] row = new Object[1];
                row[0] = userAuthentication.getUserName();
                model.addRow(row);
            }
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel createLabel1;
    private javax.swing.JButton deleteInventoryAdminButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField passwordTextField;
    private javax.swing.JButton saveCompanyAdminButton1;
    private javax.swing.JButton updateDeliveryAdmin;
    private javax.swing.JTextField userNameTextField;
    private javax.swing.JButton viewInventoryAdmin;
    // End of variables declaration//GEN-END:variables
}
