/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import javax.swing.JSplitPane;
import model.CityDir;
import model.Community;
import model.CompanyDirectory;
import model.CustomerDirectory;
import model.DeliveryBoyDirectory;
import model.Ordermgt;
import model.UserAuthenticationDirectory;

/**
 *
 * @author rosha
 */
public class LogoutPane extends javax.swing.JPanel {

    private final JSplitPane splitPane;
    private final CityDir cityDirectory;
    private final Community community;
    private final CustomerDirectory customerDirectory;
    private final CompanyDirectory companyDirectory;
    private final UserAuthenticationDirectory userauthenticationdirectory;
    private final DeliveryBoyDirectory deliveryBoyDirectory;
    private final Ordermgt orderManagement;

    /**
     * Creates new form LogoutPane
     */
    public LogoutPane(CityDir cityDirectory, Ordermgt orderManagement, Community community, CustomerDirectory customerDirectory, CompanyDirectory companyDirectory, UserAuthenticationDirectory userauthenticationdirectory, JSplitPane splitPane, DeliveryBoyDirectory deliveryBoyDirectory) {
        initComponents();
        this.cityDirectory = cityDirectory;
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

        logoutButton = new javax.swing.JButton();

        logoutButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        logoutButton.setText("LOGOUT");
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(521, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        // TODO add your handling code here:
        LoginLeftPane loginLeftPanel = new LoginLeftPane(cityDirectory, orderManagement, community, customerDirectory, companyDirectory, userauthenticationdirectory, splitPane, deliveryBoyDirectory);
        splitPane.setLeftComponent(loginLeftPanel);
        splitPane.setRightComponent(new LoginJPanel(cityDirectory, orderManagement, community, customerDirectory, companyDirectory, userauthenticationdirectory, splitPane, deliveryBoyDirectory));
    }//GEN-LAST:event_logoutButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton logoutButton;
    // End of variables declaration//GEN-END:variables
}