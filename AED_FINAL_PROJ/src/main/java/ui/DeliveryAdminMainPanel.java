/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import model.UserAuthenticationDirectory;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.JSplitPane;
import model.CityDir;
import model.Community;
import model.Company;
import model.CompanyDirectory;
import model.CustomerDirectory;
import model.DeliveryBoy;
import model.DeliveryBoyDirectory;
import model.UserAuthentication;

/**
 *
 * @author hrish
 */
public class DeliveryAdminMainPanel extends javax.swing.JPanel {

    /**
     * Creates new form DeliveryAdminMainPanel
     */
    
    private JSplitPane splitPane;
    private CustomerDirectory customerDirectory;
    private CompanyDirectory companyDirectory;
    private Community community;
    private UserAuthenticationDirectory userauthenticationdirectory;
    private DeliveryBoyDirectory deliveryBoyDirectory;
    private String qualif;
    private Company company;
    private CityDir cityDir;
    private String cityName;
    private String companyName;
    
    public DeliveryAdminMainPanel() {
        initComponents();
    }
    
    
    
    public DeliveryAdminMainPanel(CityDir cityDir, String cityName, String companyName, Company company, Community community, CustomerDirectory customerDirectory, CompanyDirectory companyDirectory, UserAuthenticationDirectory userauthenticationdirectory, JSplitPane splitPane, DeliveryBoyDirectory deliveryBoyDirectory) {
        initComponents();
        
        ButtonGroup buttonGroup = new ButtonGroup();
        
        buttonGroup.add(radioHighSchool);
        buttonGroup.add(radioUniversity);
        
        this.community = community;
        this.splitPane = splitPane;
        this.customerDirectory = customerDirectory;
        this.companyDirectory = companyDirectory;
        this.userauthenticationdirectory = userauthenticationdirectory;
        this.deliveryBoyDirectory = deliveryBoyDirectory;
        this.company = company;
        this.cityDir = cityDir;
    }
    
     private void setDefault() {
        txtName.setText("");
        txtEmergency.setText("");
        txtExperience.setText("");
        radioHighSchool.setEnabled(false);
        radioUniversity.setEnabled(false);
        txtUsername.setText("");
        txtPassword.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        radioUniversity = new javax.swing.JRadioButton();
        txtExperience = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtEmergency = new javax.swing.JTextField();
        txtUsername = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnModifyD = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnAssign = new javax.swing.JButton();
        radioHighSchool = new javax.swing.JRadioButton();

        jLabel4.setText("Years of Experience:");

        radioUniversity.setText("University");

        txtExperience.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtExperienceActionPerformed(evt);
            }
        });

        jLabel6.setText("Emergency Contact:");

        jLabel5.setText("Delivery Boy Name:");

        txtEmergency.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmergencyActionPerformed(evt);
            }
        });

        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });

        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });

        btnSave.setText("Create Delivery Boy");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        jLabel1.setText("Username:");

        jLabel2.setText("Password:");

        btnModifyD.setText("Modify Delivery Boys");
        btnModifyD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyDActionPerformed(evt);
            }
        });

        jLabel3.setText("Qualification:");

        btnAssign.setText("Assign Orders");
        btnAssign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignActionPerformed(evt);
            }
        });

        radioHighSchool.setText("High School");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(183, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(62, 62, 62)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtExperience, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(radioHighSchool)
                                        .addGap(18, 18, 18)
                                        .addComponent(radioUniversity))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGap(62, 62, 62)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEmergency, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(126, 126, 126))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnAssign)
                        .addGap(18, 18, 18)
                        .addComponent(btnModifyD)))
                .addGap(159, 159, 159))
            .addGroup(layout.createSequentialGroup()
                .addGap(255, 255, 255)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(radioHighSchool)
                    .addComponent(radioUniversity))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtExperience, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtEmergency, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(30, 30, 30)
                .addComponent(btnSave)
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnModifyD)
                    .addComponent(btnAssign))
                .addGap(84, 84, 84))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtExperienceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtExperienceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtExperienceActionPerformed

    private void txtEmergencyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmergencyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmergencyActionPerformed

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        
        if (txtName.getText().length() == 0) {
            JOptionPane.showMessageDialog(this, "Mandatory name field is empty");
            return;
        }

        if (!txtName.getText().matches("[a-zA-Z]+")) {
            JOptionPane.showMessageDialog(this, "Name field should only have alphabets");
            return;
        }

        if (txtEmergency.getText().length() == 0) {
            JOptionPane.showMessageDialog(this, "Mandatory emergency contact number field is empty");
            return;
        }

        if (txtExperience.getText().length() == 0) {
            JOptionPane.showMessageDialog(this, "Mandatory emergency contact name field is empty");
            return;
        }


        for (int i = 0; i < userauthenticationdirectory.getUserAuthenticationList().size(); i++) {
            UserAuthentication userauthentication = userauthenticationdirectory.getUserAuthenticationList().get(i);

            if (userauthentication.getUserName().equalsIgnoreCase(txtUsername.getText())
                    && userauthentication.getUserType().equalsIgnoreCase("DeliveryBoy")) {
                JOptionPane.showMessageDialog(this, "Delivery Boy username already exits, please login directly");
                return;
            }
        }
        
        //Radio buttons

        if(radioHighSchool.isSelected() == true) {
            qualif = "High School";
        }
        else if(radioUniversity.isSelected() == true){
            qualif = "University";
        }
        else {
            JOptionPane.showMessageDialog(this, "Please select a city type.");
        }

        DeliveryBoy deliveryBoy = deliveryBoyDirectory.addNewDeliveryBoy();
        deliveryBoy.setDeliveryBoyName(txtName.getText());
        deliveryBoy.setEmergencyContactNumber(Integer.parseInt(txtEmergency.getText()));
        deliveryBoy.setQualificaton(qualif);
        deliveryBoy.setYearOfDeliveryExperience(Integer.parseInt(txtExperience.getText()));
        deliveryBoy.setAvailability(true); // Setting availability to true by default

        community.setDeliveryBoyDirectory(deliveryBoyDirectory);

        UserAuthentication userauthentication = userauthenticationdirectory.addNewUserAuthentication();
        userauthentication.setUserName(txtUsername.getText());
        userauthentication.setPassword(txtPassword.getText());
        userauthentication.setUserType("DeliveryBoy");

        setDefault();
        JOptionPane.showMessageDialog(this, "Delivery Boy has been created");
        
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnModifyDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyDActionPerformed
        // TODO add your handling code here:

        DeliveryAdminModifyPanel m = new DeliveryAdminModifyPanel(community,deliveryBoyDirectory);
        splitPane.setRightComponent(m);
    }//GEN-LAST:event_btnModifyDActionPerformed

    private void btnAssignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignActionPerformed
        // TODO add your handling code here:
        DeliveryAdminAssignPanel m = new DeliveryAdminAssignPanel(cityDir,  cityName,  companyName,  company,  community,  customerDirectory,  companyDirectory,  userauthenticationdirectory,  splitPane, deliveryBoyDirectory);
        splitPane.setRightComponent(m);
    }//GEN-LAST:event_btnAssignActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssign;
    private javax.swing.JButton btnModifyD;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JRadioButton radioHighSchool;
    private javax.swing.JRadioButton radioUniversity;
    private javax.swing.JTextField txtEmergency;
    private javax.swing.JTextField txtExperience;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
