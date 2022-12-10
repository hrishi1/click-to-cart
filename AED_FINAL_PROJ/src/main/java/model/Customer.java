/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 * Model class to get the customer information.
 *
 * @author Abhishek
 */
public class Customer {

    private String customerName;
    private String customerClosestLandmark;
    private String customerAddress;
    private String userName;
    private Cart cart;
    private PaymentDir paymentDir;
    public Customer() {
    }

    public Customer(String customerName, String customerAddress, String customerClosestLandmark, String userName,Cart cart,PaymentDir paymentDir) {
        this.customerName = customerName;
        this.customerClosestLandmark = customerClosestLandmark;
        this.customerAddress = customerAddress;
        this.userName = userName;
        this.cart = cart;
        this.paymentDir = paymentDir;
         
    }

    public PaymentDir getPaymentDir() {
        return paymentDir;
    }

    public void setPaymentDir(PaymentDir paymentDir) {
        this.paymentDir = paymentDir;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerClosestLandmark() {
        return customerClosestLandmark;
    }

    public void setCustomerClosestLandmark(String customerClosestLandmark) {
        this.customerClosestLandmark = customerClosestLandmark;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
