/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import javax.swing.JFrame;
import model.Community;
import model.CompanyDirectory;
import model.CustomerDirectory;
import model.UserAuthentication;
import model.UserAuthenticationDirectory;

/**
 *
 * @author hrish
 */
public class MainJFrame extends javax.swing.JFrame {
    
    private CustomerDirectory customerDirectory;
    private CompanyDirectory companyDirectory;
    private UserAuthenticationDirectory userauthenticationdirectory;
    private Community community;

    /**
     * Creates new form MainJFrame
     */
    public MainJFrame() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);    
        customerDirectory = new CustomerDirectory();
        companyDirectory = new CompanyDirectory();
        userauthenticationdirectory = new UserAuthenticationDirectory();
        community = new Community();
        //System admin creds
        UserAuthentication userauthentication = userauthenticationdirectory.addNewUserAuthentication();
        userauthentication.setUserName("admin");
        userauthentication.setPassword("admin123");
        userauthentication.setUserType("SystemAdmin");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        controlPanel = new javax.swing.JPanel();
        btnLogin = new javax.swing.JButton();
        btnCustomerRegister = new javax.swing.JButton();
        workArea = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        lblDetails = new javax.swing.JLabel();
        lblDetails2 = new javax.swing.JLabel();

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
                .addContainerGap(45, Short.MAX_VALUE))
        );
        controlPanelLayout.setVerticalGroup(
            controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelLayout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(btnLogin)
                .addGap(136, 136, 136)
                .addComponent(btnCustomerRegister)
                .addContainerGap(390, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(controlPanel);

        workArea.setBackground(new java.awt.Color(255, 255, 255));
        workArea.setMinimumSize(new java.awt.Dimension(200, 200));
        workArea.setPreferredSize(new java.awt.Dimension(1200, 700));

        lblTitle.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblTitle.setText("AED Final Project");

        lblDetails.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblDetails.setText("Hrishikesh S. Pawar");

        lblDetails2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblDetails2.setText("NU ID: 002707307");

        javax.swing.GroupLayout workAreaLayout = new javax.swing.GroupLayout(workArea);
        workArea.setLayout(workAreaLayout);
        workAreaLayout.setHorizontalGroup(
            workAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(workAreaLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(workAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDetails)
                    .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDetails2))
                .addContainerGap(626, Short.MAX_VALUE))
        );
        workAreaLayout.setVerticalGroup(
            workAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(workAreaLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDetails)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDetails2)
                .addContainerGap(505, Short.MAX_VALUE))
        );

        jSplitPane1.setRightComponent(workArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1213, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 672, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
         LoginJPanel loginpanel = new LoginJPanel(community,customerDirectory,companyDirectory, userauthenticationdirectory, jSplitPane1);
         jSplitPane1.setRightComponent(loginpanel);
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnCustomerRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCustomerRegisterActionPerformed
        // TODO add your handling code here:
        CustomerRegistrationJPanel mainCustomerJPanel = new CustomerRegistrationJPanel(community,customerDirectory,companyDirectory, userauthenticationdirectory, jSplitPane1);
        jSplitPane1.setRightComponent(mainCustomerJPanel);
    }//GEN-LAST:event_btnCustomerRegisterActionPerformed

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
    private javax.swing.JPanel controlPanel;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JLabel lblDetails;
    private javax.swing.JLabel lblDetails2;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel workArea;
    // End of variables declaration//GEN-END:variables
}
