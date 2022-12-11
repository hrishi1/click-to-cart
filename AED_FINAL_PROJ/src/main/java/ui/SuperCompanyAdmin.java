/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.util.ArrayList;
import model.UserAuthenticationDirectory;
import java.util.List;
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
import model.Ordermgt;
import org.apache.commons.collections4.CollectionUtils;

/**
 *
 * @author rosha
 */
public class SuperCompanyAdmin extends javax.swing.JPanel {

    private final CityDir cityDirectory;
    private final Community community;
    private final JSplitPane splitPane;
    private final CustomerDirectory customerDirectory;
    private final CompanyDirectory companyDirectory;
    private final UserAuthenticationDirectory userauthenticationdirectory;
    private final DeliveryBoyDirectory deliveryBoyDirectory;
    private final Ordermgt orderManagement;
    private int cityTableIndex;
    private final JSplitPane jSplitPane1;
    private final String role;

    /**
     * Creates new form SuperCompanyAdmin
     */
    public SuperCompanyAdmin(CityDir cityDirectory, Ordermgt orderManagement, Community community, CustomerDirectory customerDirectory, CompanyDirectory companyDirectory, UserAuthenticationDirectory userauthenticationdirectory, JSplitPane splitPane, DeliveryBoyDirectory deliveryBoyDirectory, JSplitPane jSplitPane1, String role) {
        initComponents();
        this.role = role;
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
        jScrollPane2 = new javax.swing.JScrollPane();
        companyTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        viewCompanyBtn = new javax.swing.JButton();
        loginCompanyBtn = new javax.swing.JButton();

        cityTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Sr. No.", "City"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(cityTable);

        companyTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Sr. No.", "Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(companyTable);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("CITY");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("COMPANY");

        viewCompanyBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        viewCompanyBtn.setText("VIEW");
        viewCompanyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewCompanyBtnActionPerformed(evt);
            }
        });

        loginCompanyBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        loginCompanyBtn.setText("LOGIN");
        loginCompanyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginCompanyBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(loginCompanyBtn)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(viewCompanyBtn)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewCompanyBtn)
                    .addComponent(loginCompanyBtn))
                .addGap(99, 99, 99))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void viewCompanyBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewCompanyBtnActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = cityTable.getSelectedRow();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Select a city to view companies!");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) cityTable.getModel();
        this.cityTableIndex = selectedRowIndex;
        CompanyDirectory compDir = cityDirectory.getCityDir().get(selectedRowIndex).getCompanyDirectory();
        populateCompanyTable(compDir);

    }//GEN-LAST:event_viewCompanyBtnActionPerformed

    private void loginCompanyBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginCompanyBtnActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = companyTable.getSelectedRow();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Select a city to view companies!");
            return;
        }

        //Selected City Table
        int selectedRowIndexCity = cityTable.getSelectedRow();
        if (selectedRowIndexCity < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to select city");
            return;
        }
        DefaultTableModel modelCity = (DefaultTableModel) cityTable.getModel();
        String selectedCityName = modelCity.getValueAt(selectedRowIndexCity, 0).toString();

        //Selected Company Table
        int selectedRowIndexCompany = companyTable.getSelectedRow();
        if (selectedRowIndexCompany < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to select company");
            return;
        }
        DefaultTableModel modelCompanyName = (DefaultTableModel) companyTable.getModel();
        String selectedCompanyName = modelCompanyName.getValueAt(selectedRowIndexCompany, 0).toString();

        DefaultTableModel model = (DefaultTableModel) cityTable.getModel();
        if (role.equals("CompanyAdmin")) {
            Company compDir = cityDirectory.getCityDir().get(cityTableIndex).getCompanyDirectory().getCompanyDirectoryList().get(selectedRowIndex);

            MainCompanyAdminJPanel mainCompanyAdminJPanel = new MainCompanyAdminJPanel(selectedCityName, selectedCompanyName, cityDirectory, community, customerDirectory, companyDirectory, userauthenticationdirectory, splitPane, deliveryBoyDirectory);
            jSplitPane1.setRightComponent(mainCompanyAdminJPanel);
        }
        if (role.equals("DeliveryAdmin")) {
            Company compDir = cityDirectory.getCityDir().get(cityTableIndex).getCompanyDirectory().getCompanyDirectoryList().get(selectedRowIndex);
            CompanyDirectory companyDir = cityDirectory.getCityDir().get(cityTableIndex).getCompanyDirectory();
            String cityName = cityDirectory.getCityDir().get(cityTableIndex).getCityName();
            String companyName = cityDirectory.getCityDir().get(cityTableIndex).getCompanyDirectory().getCompanyDirectoryList().get(selectedRowIndex).getCompanyName();
            DeliveryAdminMainPanel compAdminPanel = new DeliveryAdminMainPanel(cityDirectory, cityName, companyName, compDir, community, customerDirectory, companyDir, userauthenticationdirectory, splitPane, deliveryBoyDirectory);
            jSplitPane1.setRightComponent(compAdminPanel);
        }
        if (role.equals("InventoryAdmin")) {

            Company compDir = cityDirectory.getCityDir().get(cityTableIndex).getCompanyDirectory().getCompanyDirectoryList().get(selectedRowIndex);
            CompanyDirectory companyDir = cityDirectory.getCityDir().get(cityTableIndex).getCompanyDirectory();

            String cityName = cityDirectory.getCityDir().get(cityTableIndex).getCityName();
            String companyName = cityDirectory.getCityDir().get(cityTableIndex).getCompanyDirectory().getCompanyDirectoryList().get(selectedRowIndex).getCompanyName();
            InventoryAdminPanel compInventoryPanel = new InventoryAdminPanel(cityName, companyName, cityDirectory, splitPane);
            jSplitPane1.setRightComponent(compInventoryPanel);
        }
        if (role.equals("OrderAdmin")) {

            Company compDir = cityDirectory.getCityDir().get(cityTableIndex).getCompanyDirectory().getCompanyDirectoryList().get(selectedRowIndex);
            CompanyDirectory companyDir = cityDirectory.getCityDir().get(cityTableIndex).getCompanyDirectory();
//            Ordermgt ordMgt = cityDirectory.getCityDir().get(cityTableIndex).getCompanyDirectory().getCompanyDirectoryList().get(selectedRowIndex).getOrderMgt();
            String cityName = cityDirectory.getCityDir().get(cityTableIndex).getCityName();
            String companyName = cityDirectory.getCityDir().get(cityTableIndex).getCompanyDirectory().getCompanyDirectoryList().get(selectedRowIndex).getCompanyName();
            MainOrderAdminJPanel compInventoryPanel = new MainOrderAdminJPanel(orderManagement, cityDirectory, community, customerDirectory, companyDir, userauthenticationdirectory, splitPane, deliveryBoyDirectory);
            jSplitPane1.setRightComponent(compInventoryPanel);
        }
    }//GEN-LAST:event_loginCompanyBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable cityTable;
    private javax.swing.JTable companyTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton loginCompanyBtn;
    private javax.swing.JButton viewCompanyBtn;
    // End of variables declaration//GEN-END:variables
    private void populateCitiesTable() {

        DefaultTableModel model = (DefaultTableModel) cityTable.getModel();
        model.setRowCount(0);
        int i = 0;
        if (cityDirectory.getCityDir() != null) {
            for (City c : cityDirectory.getCityDir()) {
                i++;
                Object[] row = new Object[11];
                row[0] = i;
                row[1] = c.getCityName();

                model.addRow(row);
            }
        }
    }

    private void populateCompanyTable(CompanyDirectory compDir) {

        if (compDir == null || CollectionUtils.isEmpty(compDir.getCompanyDirectoryList())) {
            List<Company> companyList = new ArrayList<>();
            populateCompany1(companyList);
        } else {
            populateCompany1(compDir.getCompanyDirectoryList());
        }
    }

    private void populateCompany1(List<Company> companyList) {
        int i = 0;
        DefaultTableModel model = (DefaultTableModel) companyTable.getModel();
        model.setRowCount(0);
        for (Company c : companyList) {
            i++;
            Object[] row = new Object[11];
            row[0] = i;
            row[1] = c.getCompanyName();
            model.addRow(row);
        }
    }
}
