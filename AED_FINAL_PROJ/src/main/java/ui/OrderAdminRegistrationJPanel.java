/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import model.UserAuthenticationDirectory;
import javax.swing.JOptionPane;
import javax.swing.JSplitPane;
import javax.swing.table.DefaultTableModel;
import model.CityDir;
import model.Community;
import model.CompanyDirectory;
import model.CustomerDirectory;
import model.DeliveryBoyDirectory;
import model.Ordermgt;
import model.UserAuthentication;

/**
 *
 * @author 91961
 */
public class OrderAdminRegistrationJPanel extends javax.swing.JPanel {

    private CityDir cityDirectory;
    private JSplitPane splitPane;
    private CustomerDirectory customerDirectory;
    private CompanyDirectory companyDirectory;
    private Community community;
    private UserAuthenticationDirectory userauthenticationdirectory;
    private DeliveryBoyDirectory deliveryBoyDirectory;
    private String cityName;
    private String companyName;
    private Ordermgt orderManagement;
    private JSplitPane jSplitPane1;
    private String role;

    /**
     * Creates new form CompanyAdminRegistrationJPanel
     */
    public OrderAdminRegistrationJPanel() {
        initComponents();
    }

    OrderAdminRegistrationJPanel(String cityName, String companyName, CityDir cityDirectory, Community community, CustomerDirectory customerDirectory, CompanyDirectory companyDirectory, UserAuthenticationDirectory userauthenticationdirectory, JSplitPane splitPane, DeliveryBoyDirectory deliveryBoyDirectory, JSplitPane jSplitPane1, String role, Ordermgt orderManagement) {
        initComponents();
        this.cityDirectory = cityDirectory;
        this.community = community;
        this.splitPane = splitPane;
        this.customerDirectory = customerDirectory;
        this.companyDirectory = companyDirectory;
        this.userauthenticationdirectory = userauthenticationdirectory;
        this.deliveryBoyDirectory = deliveryBoyDirectory;
        this.cityName = cityName;
        this.companyName = companyName;
        this.jSplitPane1 = jSplitPane1;
        this.role = role;
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
        userNameTextField = new javax.swing.JTextField();
        passwordTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        saveCompanyAdminButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        viewOrderAdmin = new javax.swing.JButton();
        updateOrderAdmin = new javax.swing.JButton();
        deleteOrderAdminButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();

        createLabel1.setBackground(new java.awt.Color(255, 102, 102));
        createLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        createLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        createLabel1.setText("Order Admin Registration");
        createLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));

        userNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNameTextFieldActionPerformed(evt);
            }
        });

        jLabel1.setText("Username");

        jLabel2.setText("Password");

        saveCompanyAdminButton.setText("Save");
        saveCompanyAdminButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveCompanyAdminButtonActionPerformed(evt);
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

        viewOrderAdmin.setText("View");
        viewOrderAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewOrderAdminActionPerformed(evt);
            }
        });

        updateOrderAdmin.setText("Update");
        updateOrderAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateOrderAdminActionPerformed(evt);
            }
        });

        deleteOrderAdminButton.setText("Delete");
        deleteOrderAdminButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteOrderAdminButtonActionPerformed(evt);
            }
        });

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(createLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(userNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(saveCompanyAdminButton, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 211, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(viewOrderAdmin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(updateOrderAdmin)
                        .addGap(62, 62, 62)
                        .addComponent(deleteOrderAdminButton, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(261, 261, 261))
            .addGroup(layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(createLabel1)
                .addGap(44, 44, 44)
                .addComponent(backButton)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(viewOrderAdmin)
                            .addComponent(updateOrderAdmin)
                            .addComponent(deleteOrderAdminButton)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(userNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addComponent(saveCompanyAdminButton)))
                .addContainerGap(185, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void userNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userNameTextFieldActionPerformed

    private void saveCompanyAdminButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveCompanyAdminButtonActionPerformed
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
            if ("OrderAdmin".equalsIgnoreCase(userauthentication.getUserType())
                    && companyName.equalsIgnoreCase(userauthentication.getCompanyName())
                    && userauthentication.getUserName().equalsIgnoreCase(userNameTextField.getText())) {
                JOptionPane.showMessageDialog(this, "Order Admin username already exits in the same company, please login directly");
                return;
            }
        }

        UserAuthentication userAuthentication = userauthenticationdirectory.addNewUserAuthentication();
        userAuthentication.setUserName(userNameTextField.getText());
        userAuthentication.setPassword(passwordTextField.getText());
        userAuthentication.setCityName(cityName);
        userAuthentication.setCompanyName(companyName);
        userAuthentication.setUserType("OrderAdmin");

        JOptionPane.showMessageDialog(this, "Order Admin credentials is saved");
    }//GEN-LAST:event_saveCompanyAdminButtonActionPerformed

    /**
     * Populate the table cities rows from the arrayList.
     */
    private void populateOrderAdmin() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        for (UserAuthentication userAuthentication : userauthenticationdirectory.getUserAuthenticationList()) {
            if ("OrderAdmin".equalsIgnoreCase(userAuthentication.getUserType())
                    && cityName.equalsIgnoreCase(userAuthentication.getCityName())
                    && companyName.equalsIgnoreCase(userAuthentication.getCompanyName())) {
                Object[] row = new Object[1];
                row[0] = userAuthentication.getUserName();
                model.addRow(row);
            }
        }
    }

    private void viewOrderAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewOrderAdminActionPerformed
        // TODO add your handling code here:
        populateOrderAdmin();
    }//GEN-LAST:event_viewOrderAdminActionPerformed

    private void updateOrderAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateOrderAdminActionPerformed
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
                    && userAuthentication.getUserType().equalsIgnoreCase("OrderAdmin")
                    && cityName.equalsIgnoreCase(userAuthentication.getCityName())
                    && companyName.equalsIgnoreCase(userAuthentication.getCompanyName())) {
                userAuthentication.setUserName(newUserName);
            }
        }
        JOptionPane.showMessageDialog(this, "Order Admin Record is Updated");
    }//GEN-LAST:event_updateOrderAdminActionPerformed

    private void deleteOrderAdminButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteOrderAdminButtonActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = jTable1.getSelectedRow();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to delete");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int rowToModel = 0;
        rowToModel = jTable1.convertRowIndexToModel(selectedRowIndex);

        String selectedUsername = model.getValueAt(selectedRowIndex, 0).toString();
        model.removeRow(rowToModel);
        try {
            for (UserAuthentication userAuthentication : userauthenticationdirectory.getUserAuthenticationList()) {
                if (userAuthentication.getUserName().equalsIgnoreCase(selectedUsername)
                        && userAuthentication.getUserType().equalsIgnoreCase("OrderAdmin")
                        && cityName.equalsIgnoreCase(userAuthentication.getCityName())
                        && companyName.equalsIgnoreCase(userAuthentication.getCompanyName())) {
                    userauthenticationdirectory.deleteUserAuthentication(userAuthentication);
                    populateOrderAdmin();
                }
            }
        } catch (Exception exception) {

        }
        JOptionPane.showMessageDialog(this, "Order Admin is deleted");
    }//GEN-LAST:event_deleteOrderAdminButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        MainCompanyAdminJPanel superMainCompanyAdminJPanel = new MainCompanyAdminJPanel(cityName, companyName, cityDirectory, community, customerDirectory, companyDirectory, userauthenticationdirectory, splitPane, deliveryBoyDirectory, jSplitPane1, role, orderManagement);
        MainCompanyAdminJPanel loginJPanelMainCompanyAdminJPanel = new MainCompanyAdminJPanel(cityName, companyName, cityDirectory, community, customerDirectory, companyDirectory, userauthenticationdirectory, splitPane, deliveryBoyDirectory, jSplitPane1, role, orderManagement);
        if (role == null) {
            splitPane.setRightComponent(loginJPanelMainCompanyAdminJPanel);
        } else {
            jSplitPane1.setRightComponent(superMainCompanyAdminJPanel);
        }
    }//GEN-LAST:event_backButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JLabel createLabel1;
    private javax.swing.JButton deleteOrderAdminButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField passwordTextField;
    private javax.swing.JButton saveCompanyAdminButton;
    private javax.swing.JButton updateOrderAdmin;
    private javax.swing.JTextField userNameTextField;
    private javax.swing.JButton viewOrderAdmin;
    // End of variables declaration//GEN-END:variables
}
