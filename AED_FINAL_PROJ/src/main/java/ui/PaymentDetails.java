/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.awt.Image;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import javax.swing.ButtonGroup;
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
import model.Orders;
import model.Payment;
import model.UserAuthenticationDirectory;
import special.Smtp;
import database.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rosha
 */
public class PaymentDetails extends javax.swing.JPanel {

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
     * Creates new form PaymentDetails
     */
    public PaymentDetails(double distance, String cityName, Customer cust, Company comp, JSplitPane splitPane, CityDir cityDirectory, String userName, Ordermgt orderManagement, Community community, CustomerDirectory customerDirectory, CompanyDirectory companyDirectory, UserAuthenticationDirectory userauthenticationdirectory, DeliveryBoyDirectory deliveryBoyDirectory) {
        initComponents();
        String imgDir = System.getProperty("user.dir")+"/src/main/java/IMAGES/";
        loginLabel.setIcon(new ImageIcon(new ImageIcon(imgDir+"paymentswelcome.png").getImage().getScaledInstance(800, 300, Image.SCALE_DEFAULT)));
        cardgifLabel.setIcon(new ImageIcon(new ImageIcon(imgDir+"cardgif.gif").getImage().getScaledInstance(195, 140, Image.SCALE_DEFAULT)));
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

        double finalPrice = 0;
        for (int i = 0; i < ordProd.size(); i++) {
            finalPrice = finalPrice + ordProd.get(i).getProdTotalprice();
        }
        finalPriceLabel.setText("$" + finalPrice);
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(debitRadioBtn);
        buttonGroup.add(creditRadioBtn);
        displayCardList();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        debitRadioBtn = new javax.swing.JRadioButton();
        creditRadioBtn = new javax.swing.JRadioButton();
        cardName = new javax.swing.JTextField();
        cardMonth = new javax.swing.JTextField();
        cardYear = new javax.swing.JTextField();
        cardNumber = new javax.swing.JTextField();
        cardCvv = new javax.swing.JTextField();
        addNewCard = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        finalPriceLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        paymentTable = new javax.swing.JTable();
        deleteCard = new javax.swing.JButton();
        proceedBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        addressField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        loginLabel = new javax.swing.JLabel();
        cardgifLabel = new javax.swing.JLabel();
        roadLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        debitRadioBtn.setText("Debit");
        debitRadioBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                debitRadioBtnActionPerformed(evt);
            }
        });

        creditRadioBtn.setText("Credit");

        cardNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cardNumberActionPerformed(evt);
            }
        });

        cardCvv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cardCvvActionPerformed(evt);
            }
        });

        addNewCard.setBackground(new java.awt.Color(71, 43, 29));
        addNewCard.setFont(new java.awt.Font("Algerian", 1, 14)); // NOI18N
        addNewCard.setForeground(new java.awt.Color(255, 255, 255));
        addNewCard.setText("ADD NEW CARD");
        addNewCard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNewCardActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel2.setText("Your Order Total:");
        jLabel2.setToolTipText("");

        finalPriceLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        paymentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Sr. No.", "Type", "Card Holder", "Ending With"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(paymentTable);

        deleteCard.setBackground(new java.awt.Color(71, 43, 29));
        deleteCard.setFont(new java.awt.Font("Algerian", 1, 14)); // NOI18N
        deleteCard.setForeground(new java.awt.Color(255, 255, 255));
        deleteCard.setText("DELETE");
        deleteCard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteCardActionPerformed(evt);
            }
        });

        proceedBtn.setBackground(new java.awt.Color(71, 43, 29));
        proceedBtn.setFont(new java.awt.Font("Algerian", 1, 14)); // NOI18N
        proceedBtn.setForeground(new java.awt.Color(255, 255, 255));
        proceedBtn.setText("PROCEED");
        proceedBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proceedBtnActionPerformed(evt);
            }
        });

        jLabel4.setText("Month");

        jLabel5.setText("Year");

        jLabel6.setText("CVV");

        jLabel7.setText("Card Number");

        jLabel8.setText("Card Holder's Name");

        backButton.setBackground(new java.awt.Color(71, 43, 29));
        backButton.setFont(new java.awt.Font("Algerian", 1, 14)); // NOI18N
        backButton.setForeground(new java.awt.Color(255, 255, 255));
        backButton.setText("Back ");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Address");

        loginLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(addressField)
                                .addGap(18, 18, 18)
                                .addComponent(proceedBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(cardgifLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(addNewCard, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cardName)
                                .addComponent(cardNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(debitRadioBtn)
                                    .addGap(18, 18, 18)
                                    .addComponent(creditRadioBtn)))
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cardMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cardYear, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cardCvv, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(loginLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 811, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(finalPriceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(deleteCard, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(379, 379, 379))))
                .addContainerGap(47, Short.MAX_VALUE))
            .addComponent(roadLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(loginLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(finalPriceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(debitRadioBtn)
                    .addComponent(creditRadioBtn))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cardName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cardNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(10, 10, 10))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(cardgifLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cardMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cardYear, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cardCvv, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addressField)
                        .addComponent(addNewCard, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(proceedBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(deleteCard, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(roadLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void debitRadioBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_debitRadioBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_debitRadioBtnActionPerformed

    private void cardNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cardNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cardNumberActionPerformed

    private void cardCvvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cardCvvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cardCvvActionPerformed

    private void proceedBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proceedBtnActionPerformed
        // TODO add your handling code here:

        ArrayList<Inventory> dirModel = comp.getInventoryManagement().getInventoryMgt();

        int selectedRowIndex = paymentTable.getSelectedRow();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Select a Card to Proceed!");
            return;
        }

        String address = addressField.getText();

        if (address.equals("")) {
            JOptionPane.showMessageDialog(this, "Fill your Valid Address!");
            return;
        }

        ArrayList<Payment> payDir = cust.getPaymentDirectory().getPaymentDir();

        ArrayList<Orderedprod> ordProd = cust.getCart().getCartProd();
        Ordermgt ordmgt = new Ordermgt();
        Orders ord = ordmgt.addNewOrder();
        ord.setCustomerId(cust.getUserName());
        String orderID = UUID.randomUUID().toString();
        ord.setOrderId(UUID.randomUUID().toString());
        double finalPrice = 0;
        for (int i = 0; i < ordProd.size(); i++) {
            for (int k = 0; k < dirModel.size(); k++) {
                ArrayList<InventoryProduct> mainM = comp.getInventoryManagement().getInventoryMgt().get(k).getInventoryProductDir().getInventoryProductDir();
                for (int j = 0; j < mainM.size(); j++) {
                    if (ordProd.get(i).getProdid().equals(mainM.get(j).getPid())) {
                        if (ordProd.get(i).getprodcount() <= mainM.get(j).getInventoryQty()) {

                            Orderedprod newProd = ord.addNewOrderedProds();

                            newProd.setProdId(ordProd.get(i).getProdid());
                            newProd.setProductName(ordProd.get(i).getProductName());
                            newProd.setProdcount(ordProd.get(i).getprodcount());
                            newProd.setProdTotalprice(ordProd.get(i).getProdTotalprice());
                            finalPrice = finalPrice + ordProd.get(i).getProdTotalprice();
                            ord.setFinalPrice(finalPrice);
                            ord.setAddress(address);
                            ord.setOrderStatus("OrderPlaced");
                            ord.setPaymentType(payDir.get(selectedRowIndex));
                            
                            
                            Connection obj = new Connection();
                            java.sql.Connection con = obj.getConnection();

                            String query = "INSERT INTO `order`(`orderID`, `customerID`, `finalPrice`, address, orderStatus, ) VALUES (?,?,?,?,?)";
                            PreparedStatement pst = null;
                            try {
                                pst = obj.getConnection().prepareStatement(query);
                                pst.setString(1, orderID);
                                pst.setString(2, cust.getUserName());
                                pst.setDouble(3, finalPrice);
                                pst.setString(4, address);
                                pst.setString(5, "OrderPlaced");

                                pst.executeUpdate();
                                System.out.println("Inserted order.");
                                con.close();
                            } catch (SQLException ex) {
                                Logger.getLogger(MainJFrame.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            
                            
                            
                            
                            mainM.get(j).setInventoryQty(mainM.get(j).getInventoryQty() - ordProd.get(i).getprodcount());
                            cust.setCart(new Cart());
                        } else {
                            JOptionPane.showMessageDialog(this, "Not Enough Quantity left In Inventory!");
                            return;
                        }
                    }
                }
            }
        }
        if (cust.getOrders() == null) {
            List<Orders> ordList = new ArrayList<>();
            ordList.add(ord);
            cust.setOrders(ordList);    
        } else {
            List<Orders> ordList = cust.getOrders();
            ordList.add(ord);
            cust.setOrders(ordList);
        }
        String Subject = "Order Confirmation!";
        String data = "<B>Thank you for Choosing InstaCart!</B> \nYour total bill is $" + finalPrice;
        try {
            Smtp smtp = new Smtp(cust.getEmailAddress(), Subject, data);
            OrderCnfPanel orderCnfPanel = new OrderCnfPanel(distance, cityName, cust, comp, splitPane, cityDirectory, userName, orderManagement, community, customerDirectory, companyDirectory, userauthenticationdirectory, deliveryBoyDirectory);
            splitPane.setRightComponent(orderCnfPanel);
        } catch (Exception exception) {
            JOptionPane.showMessageDialog(null, exception);
        }

//redirect OrderCnf Panel
    }//GEN-LAST:event_proceedBtnActionPerformed

    private void deleteCardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteCardActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = paymentTable.getSelectedRow();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Select a Card to Delete!");
            return;
        }

        Payment payment = cust.getPaymentDirectory().getPaymentDir().get(selectedRowIndex);
        cust.getPaymentDirectory().deletePayment(payment);
        displayCardList();
        JOptionPane.showMessageDialog(this, "Card Deleted Successfully!");
    }//GEN-LAST:event_deleteCardActionPerformed

    private void addNewCardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNewCardActionPerformed
        // TODO add your handling code here:
        String radioVal = "";
        if (debitRadioBtn.isSelected() == true) {
            radioVal = "Debit";
        } else if (creditRadioBtn.isSelected() == true) {
            radioVal = "Credit";
        } else {
            JOptionPane.showMessageDialog(this, "Please select a Card type.");
        }
        String cardHolderName = cardName.getText();
        String cardNumberVal = cardNumber.getText();
        String month = cardMonth.getText();
        String year = cardYear.getText();
        String cvv = cardCvv.getText();
        if (radioVal.equals("") || cardHolderName.equals("") || cardNumberVal.equals("") || month.equals("") || year.equals("") || cvv.equals("")) {
            JOptionPane.showMessageDialog(this, "Please Fill all Fields");
            return;
        } else {
            try {
                Long.parseLong(cardNumberVal);
            } catch (Exception exception) {
                JOptionPane.showMessageDialog(this, "Please input a number field for card number");
                return;
            }
            
            long cardNumberval = Long.parseLong(cardNumberVal);
            if(cardNumberval<=4){
               JOptionPane.showMessageDialog(this, "Please input a valid Card Number"); 
               return;
            }
            int Month = Integer.parseInt(month);
            int Year = Integer.parseInt(year);
            int Cvv = Integer.parseInt(cvv);

            Payment payment = cust.getPaymentDirectory().addNewPayment();
            payment.setPaymentType(radioVal);
            payment.setCardHolderName(cardHolderName);
            payment.setCardNumber(cardNumberval);
            payment.setCardExpiryMonth(Month);
            payment.setCardExpiryYear(Year);
            payment.setCardCVV(Cvv);
            displayCardList();
            JOptionPane.showMessageDialog(this, "Card Added Successfully!");
        }
    }//GEN-LAST:event_addNewCardActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        CartPanel cartPanel = new CartPanel(distance, cityName, cust, comp, splitPane, cityDirectory, userName, orderManagement, community, customerDirectory, companyDirectory, userauthenticationdirectory, deliveryBoyDirectory);
        splitPane.setRightComponent(cartPanel);
    }//GEN-LAST:event_backButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addNewCard;
    private javax.swing.JTextField addressField;
    private javax.swing.JButton backButton;
    private javax.swing.JTextField cardCvv;
    private javax.swing.JTextField cardMonth;
    private javax.swing.JTextField cardName;
    private javax.swing.JTextField cardNumber;
    private javax.swing.JTextField cardYear;
    private javax.swing.JLabel cardgifLabel;
    private javax.swing.JRadioButton creditRadioBtn;
    private javax.swing.JRadioButton debitRadioBtn;
    private javax.swing.JButton deleteCard;
    private javax.swing.JLabel finalPriceLabel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel loginLabel;
    private javax.swing.JTable paymentTable;
    private javax.swing.JButton proceedBtn;
    private javax.swing.JLabel roadLabel;
    // End of variables declaration//GEN-END:variables
private void displayCardList() {
        DefaultTableModel model = (DefaultTableModel) paymentTable.getModel();
        model.setRowCount(0);

        ArrayList<Payment> paymentDir = cust.getPaymentDirectory().getPaymentDir();
        double finalPrice = 0;
        String pName = "";
        for (int i = 0; i < paymentDir.size(); i++) {
            if (paymentDir.get(i) != null) {

                Object[] row = new Object[4];
                row[0] = i;

                row[1] = paymentDir.get(i).getPaymentType();
                row[2] = paymentDir.get(i).getCardHolderName();
                row[3] = "xxxxxxxxxxx" + String.valueOf(paymentDir.get(i).getCardNumber())
                        .substring(String.valueOf(paymentDir.get(i).getCardNumber()).length() - 4);

                model.addRow(row);

            }
        }

    }
}
