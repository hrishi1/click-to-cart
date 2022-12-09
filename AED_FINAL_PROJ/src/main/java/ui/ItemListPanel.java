/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.*;
/**
 *
 * @author rosha
 */
public class ItemListPanel extends javax.swing.JPanel {

    /**
     * Creates new form ItemListPanel
     */
    public ItemListPanel() {
        initComponents();
        filterComboBox.removeAllItems();
         Company comp = new Company(); // need to be changed
        ArrayList<Inventory> dirModel = comp.getInventoryManagement().getInventoryMgt();
           
        for(int i = 0; i<dirModel.size();i++){
            filterComboBox.addItem(dirModel.get(i).getInventoryCategory());
                   
        }  
        
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
        itemListTable = new javax.swing.JTable();
        quantityTxt = new javax.swing.JTextField();
        viewDetails = new javax.swing.JButton();
        pNameLabel = new javax.swing.JLabel();
        addToCart = new javax.swing.JButton();
        itemSeacrhBox = new javax.swing.JTextField();
        searchBtn = new javax.swing.JButton();
        filterComboBox = new javax.swing.JComboBox<>();
        prodIdLbl = new javax.swing.JLabel();

        itemListTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Pid", "Name", "Price", "Available"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(itemListTable);

        viewDetails.setText("View");
        viewDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewDetailsActionPerformed(evt);
            }
        });

        pNameLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        pNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        pNameLabel.setText("Product Name");

        addToCart.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        addToCart.setText("ADD TO CART");
        addToCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addToCartActionPerformed(evt);
            }
        });

        searchBtn.setText("Search");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        filterComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        prodIdLbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        prodIdLbl.setText("Product ID");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(122, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(addToCart)
                        .addGap(396, 396, 396))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(viewDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(407, 407, 407))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(filterComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(itemSeacrhBox, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(searchBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(prodIdLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(pNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(86, 86, 86)
                                    .addComponent(quantityTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 695, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(122, 122, 122))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(itemSeacrhBox, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(searchBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(filterComboBox))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(viewDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(quantityTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(prodIdLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(addToCart, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void viewDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewDetailsActionPerformed
        // TODO add your handling code here:
                int selectedRowIndex = itemListTable.getSelectedRow();
        if (selectedRowIndex<0) {
            JOptionPane.showMessageDialog(this, "Select a row to delete.");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) itemListTable.getModel();
        prodIdLbl.setText((model.getValueAt(selectedRowIndex, 0)).toString());
        pNameLabel.setText((model.getValueAt(selectedRowIndex, 1)).toString());
        quantityTxt.setText("0");
        
        
    }//GEN-LAST:event_viewDetailsActionPerformed

    private void addToCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addToCartActionPerformed
        // TODO add your handling code here:
        int quantity = Integer.parseInt(quantityTxt.getText());
        Company comp = new Company();
        int prodQuantity = comp.getInventoryManagement().getInventoryMgt().get(0).getInventoryProductDir().getInventoryProductDir().get(itemListTable.getSelectedRow()).getInventoryQty();
        if(quantity<=prodQuantity){
            DefaultTableModel model = (DefaultTableModel) itemListTable.getModel();
            int selectedRowIndex = itemListTable.getSelectedRow();
            Customer cust = new Customer();
            Orderedprod ordProd = cust.getCart().addNewCartProd();
            ordProd.setProdId((model.getValueAt(selectedRowIndex, 0)).toString());
            int price = quantity*Integer.parseInt((model.getValueAt(selectedRowIndex, 2)).toString());
            ordProd.setProdTotalprice(price);
            ordProd.setProdcount(quantity);
        }else{
            JOptionPane.showMessageDialog(this, "Quantity cannot be more than available quantiy");
        }
    }//GEN-LAST:event_addToCartActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) itemListTable.getModel();
        TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(model);
        itemListTable.setRowSorter(trs);
        trs.setRowFilter(RowFilter.regexFilter(itemSeacrhBox.getText()));
    }//GEN-LAST:event_searchBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addToCart;
    private javax.swing.JComboBox<String> filterComboBox;
    private javax.swing.JTable itemListTable;
    private javax.swing.JTextField itemSeacrhBox;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel pNameLabel;
    private javax.swing.JLabel prodIdLbl;
    private javax.swing.JTextField quantityTxt;
    private javax.swing.JButton searchBtn;
    private javax.swing.JButton viewDetails;
    // End of variables declaration//GEN-END:variables
    private void displayItemList() {
        DefaultTableModel model = (DefaultTableModel) itemListTable.getModel();
        model.setRowCount(0);
        Company comp = new Company(); //need to be changed
        
        ArrayList<Inventory> dirModel = comp.getInventoryManagement().getInventoryMgt();
        
        
        int j = 0;   
        for(int i = 0; i<dirModel.size();i++){
            if(dirModel.get(i).getInventoryCategory().equals(filterComboBox.getSelectedItem().toString())){
                j = i;
                break;
            }
                   
        }  
        ArrayList<InventoryProduct> mainM = comp.getInventoryManagement().getInventoryMgt().get(j).getInventoryProductDir().getInventoryProductDir();
        for (int i =0;i<mainM.size();i++){
          if(mainM.get(i) != null){
              
            Object[] row = new Object[4];
            row[0] = mainM.get(i).getPid();

            row[1] = mainM.get(i).getProductName();
            row[2] = mainM.get(i).getPrice();
            row[3] = mainM.get(i).getInventoryQty();
            


            model.addRow(row);
           
            
          }
        }
        

    }

}
