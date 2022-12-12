/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.awt.Image;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JSplitPane;
import javax.swing.table.DefaultTableModel;
import model.Cart;
import model.CityDir;
import model.Community;
import model.Company;
import model.CompanyDirectory;
import model.Customer;
import model.CustomerDirectory;
import model.DeliveryBoyDirectory;
import model.Inventory;
import model.InventoryProduct;
import model.Orderedprod;
import model.Ordermgt;
import model.UserAuthenticationDirectory;

/**
 *
 * @author rosha
 */
public class CartPanel extends javax.swing.JPanel {

    private Customer cust;
    private Company comp;
    private JSplitPane splitPane;
    private String cityName;
    private double distance;

    private CustomerDirectory customerDirectory;
    private CompanyDirectory companyDirectory;
    private Community community;
    private UserAuthenticationDirectory userauthenticationdirectory;
    private DeliveryBoyDirectory deliveryBoyDirectory;
    private Ordermgt orderManagement;
    private String userName;
    private double dist;
    private CityDir cityDirectory;

    /**
     * Creates new form CartPanel
     */
    public CartPanel(double distance, String cityName, Customer cust, Company comp, JSplitPane splitPane, CityDir cityDirectory, String userName, Ordermgt orderManagement, Community community, CustomerDirectory customerDirectory, CompanyDirectory companyDirectory, UserAuthenticationDirectory userauthenticationdirectory, DeliveryBoyDirectory deliveryBoyDirectory) {
        initComponents();
        String imgDir = System.getProperty("user.dir")+"/src/main/java/IMAGES/";
        loginLabel.setIcon(new ImageIcon(new ImageIcon(imgDir+"yourcartwelcome.png").getImage().getScaledInstance(800, 300, Image.SCALE_DEFAULT)));
        manCartLabel.setIcon(new ImageIcon(new ImageIcon(imgDir+"manwithcart.gif").getImage().getScaledInstance(222, 200, Image.SCALE_DEFAULT)));
        roadLabel.setIcon(new ImageIcon(new ImageIcon(imgDir+"road.png").getImage().getScaledInstance(1300, 300, Image.SCALE_DEFAULT)));
        this.cust = cust;
        this.comp = comp;
        this.splitPane = splitPane;
        this.cityName = cityName;
        this.distance = distance;
        this.cityDirectory = cityDirectory;
        this.userName = userName;
        this.community = community;
        this.customerDirectory = customerDirectory;
        this.companyDirectory = companyDirectory;
        this.userauthenticationdirectory = userauthenticationdirectory;
        this.deliveryBoyDirectory = deliveryBoyDirectory;
        this.orderManagement = orderManagement;

        ArrayList<Orderedprod> ordProd = cust.getCart().getCartProd();

        displayItemList();
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
        cartTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        totalPrice = new javax.swing.JLabel();
        orderBtn = new javax.swing.JButton();
        removeBtn = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        loginLabel = new javax.swing.JLabel();
        roadLabel = new javax.swing.JLabel();
        manCartLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        cartTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "pid", "Name", "Count", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(cartTable);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Your Total:");

        totalPrice.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        totalPrice.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        orderBtn.setBackground(new java.awt.Color(71, 43, 29));
        orderBtn.setFont(new java.awt.Font("Algerian", 1, 14)); // NOI18N
        orderBtn.setForeground(new java.awt.Color(255, 255, 255));
        orderBtn.setText("ORDER");
        orderBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderBtnActionPerformed(evt);
            }
        });

        removeBtn.setBackground(new java.awt.Color(71, 43, 29));
        removeBtn.setFont(new java.awt.Font("Algerian", 1, 14)); // NOI18N
        removeBtn.setForeground(new java.awt.Color(255, 255, 255));
        removeBtn.setText("REMOVE");
        removeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeBtnActionPerformed(evt);
            }
        });

        backButton.setBackground(new java.awt.Color(71, 43, 29));
        backButton.setFont(new java.awt.Font("Algerian", 1, 14)); // NOI18N
        backButton.setForeground(new java.awt.Color(255, 255, 255));
        backButton.setText("Back ");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        loginLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(97, 97, 97)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(totalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(removeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(487, 487, 487)
                                        .addComponent(orderBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 691, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addComponent(manCartLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(loginLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 684, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(roadLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(loginLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(manCartLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(totalPrice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(removeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(orderBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(roadLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void orderBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderBtnActionPerformed
        // TODO add your handling code here:
        PaymentDetails paymentDetails = new PaymentDetails(distance, cityName, cust, comp, splitPane, cityDirectory, userName, orderManagement, community, customerDirectory, companyDirectory, userauthenticationdirectory, deliveryBoyDirectory);
        splitPane.setRightComponent(paymentDetails);
    }//GEN-LAST:event_orderBtnActionPerformed

    private void removeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeBtnActionPerformed

        Cart ordProd = cust.getCart();
        int selectedRowIndex = cartTable.getSelectedRow();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Select a Product to Remove.");
            return;
        }
        Orderedprod orderObj = ordProd.getCartProd().get(selectedRowIndex);
        ordProd.deleteCartProd(orderObj);

        displayItemList();
    }//GEN-LAST:event_removeBtnActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        ItemListPanel itemListPanel = new ItemListPanel(dist, cityName, cust, comp, cityDirectory, userName, orderManagement, community, customerDirectory, companyDirectory, userauthenticationdirectory, splitPane, deliveryBoyDirectory);
        splitPane.setRightComponent(itemListPanel);
    }//GEN-LAST:event_backButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JTable cartTable;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel loginLabel;
    private javax.swing.JLabel manCartLabel;
    private javax.swing.JButton orderBtn;
    private javax.swing.JButton removeBtn;
    private javax.swing.JLabel roadLabel;
    private javax.swing.JLabel totalPrice;
    // End of variables declaration//GEN-END:variables
private void displayItemList() {
        DefaultTableModel model = (DefaultTableModel) cartTable.getModel();
        model.setRowCount(0);
        List<Orderedprod> ordProd = cust.getCart().getCartProd();
        List<Inventory> dirModel = comp.getInventoryManagement().getInventoryMgt();

        double finalPrice = 0;
        String pName = "";
        for (int i = 0; i < ordProd.size(); i++) {
            if (ordProd.get(i) != null) {
                for (int k = 0; k < dirModel.size(); k++) {
                    ArrayList<InventoryProduct> mainM = comp.getInventoryManagement().getInventoryMgt().get(k).getInventoryProductDir().getInventoryProductDir();
                    for (int j = 0; j < mainM.size(); j++) {
                        if (ordProd.get(i).getProdid().equals(mainM.get(j).getPid())) {
                            pName = mainM.get(j).getProductName();
                        }
                    }

                }

                Object[] row = new Object[4];
                row[0] = ordProd.get(i).getProdid();

                row[1] = pName;
                row[2] = ordProd.get(i).getprodcount();
                row[3] = ordProd.get(i).getProdTotalprice();
                finalPrice = finalPrice + ordProd.get(i).getProdTotalprice();
                model.addRow(row);

            }
        }

        totalPrice.setText("$" + finalPrice);

    }

}
