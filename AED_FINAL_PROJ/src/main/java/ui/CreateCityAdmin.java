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
import model.CompanyDirectory;
import model.CustomerDirectory;
import model.DeliveryBoyDirectory;
import model.Ordermgt;
import model.UserAuthentication;
import model.UserAuthenticationDirectory;
import utility.PasswordEncryption;

/**
 *
 * @author rosha
 */
public class CreateCityAdmin extends javax.swing.JPanel {

    private final CityDir cityDirectory;
    private final Community community;
    private final JSplitPane splitPane;
    private final CustomerDirectory customerDirectory;
    private final CompanyDirectory companyDirectory;
    private final UserAuthenticationDirectory userauthenticationdirectory;
    private final DeliveryBoyDirectory deliveryBoyDirectory;
    private final Ordermgt orderManagement;
    private final JSplitPane jSplitPane1;

    /**
     * Creates new form CreateCityAdmin
     */
    public CreateCityAdmin(CityDir cityDirectory, Ordermgt orderManagement, Community community, CustomerDirectory customerDirectory, CompanyDirectory companyDirectory, UserAuthenticationDirectory userauthenticationdirectory, JSplitPane splitPane, DeliveryBoyDirectory deliveryBoyDirectory, JSplitPane jSplitPane1) {
        initComponents();
       
        this.cityDirectory = cityDirectory;
        this.community = community;
        this.splitPane = splitPane;
        this.customerDirectory = customerDirectory;
        this.companyDirectory = companyDirectory;
        this.userauthenticationdirectory = userauthenticationdirectory;
        this.deliveryBoyDirectory = deliveryBoyDirectory;
        this.orderManagement = orderManagement;
        this.jSplitPane1 = jSplitPane1;
        populateCitiesTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        cityTable = new javax.swing.JTable();
        cityAdminUserName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cityAdminPwd = new javax.swing.JPasswordField();
        createBtn = new javax.swing.JButton();

        cityTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "City"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(cityTable);

        jLabel1.setText("USERNAME");

        jLabel2.setText("PASSWORD");

        createBtn.setText("CREATE");
        createBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(254, 254, 254)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cityAdminUserName)
                            .addComponent(cityAdminPwd, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(340, 340, 340)
                        .addComponent(createBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(164, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cityAdminUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cityAdminPwd, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(createBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void createBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createBtnActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = cityTable.getSelectedRow();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Select a city to Create City Admin!");
            return;
        }
        String username = cityAdminUserName.getText();
        String password = cityAdminPwd.getText();
        password = PasswordEncryption.encryptThisString(password);
        UserAuthentication obj = userauthenticationdirectory.addNewUserAuthentication();
        obj.setUserName(username);
        obj.setPassword(password);
        obj.setUserType("CityAdmin");
        obj.setCityName(cityTable.getValueAt(selectedRowIndex, 0).toString());
        JOptionPane.showMessageDialog(this, "City Admin Created!");
            
    }//GEN-LAST:event_createBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField cityAdminPwd;
    private javax.swing.JTextField cityAdminUserName;
    private javax.swing.JTable cityTable;
    private javax.swing.JButton createBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
private void populateCitiesTable() {

        DefaultTableModel model = (DefaultTableModel) cityTable.getModel();
        model.setRowCount(0);
        int i = 0;
        if (cityDirectory.getCityDir() != null) {
            for (City c : cityDirectory.getCityDir()) {
                i++;
                Object[] row = new Object[1];
                
                row[0] = c.getCityName();

                model.addRow(row);
            }
        }
    }
}