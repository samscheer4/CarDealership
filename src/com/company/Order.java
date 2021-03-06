package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Order {
    //Class Level Variables - Protect the data
    private int orderId;
    private int itemQuantity;
    private int orderPrice;
    private int orderTotal = (itemQuantity * orderPrice);
    private Customer cust;
    private ArrayList<Vehicle> vehicleName;

    //Constructor Method
    public Order(int _orderId){
        this.orderId = _orderId;
    }

    //Setters and Getters
    public int getorderId() { return orderId; }
    public void setorderId(int _orderId) {this.orderId = _orderId;}

    public int getItemQuantity() {return itemQuantity; }
    public void setItemQuantity(int _itemQuantity) {this.itemQuantity = _itemQuantity; }

    public int getOrderPrice() {return orderPrice; }
    public void setOrderPrice(int _orderPrice) {this.orderPrice = _orderPrice; }

    public int getOrderTotal() {return orderTotal; }
    public void setorderTotal(int _orderTotal) {this.orderTotal = _orderTotal; }

    public void printOrder(ArrayList<Order> oList, ArrayList<Vehicle> vehicleName) {
        for (Vehicle vehicle: vehicleName){
            System.out.println(vehicle.getvehicleName());
            System.out.println(" " + vehicle.getvehicleName());
            System.out.println(" " + vehicle.getvehiclePrice());
            System.out.println(" " + vehicle.getvehiclePrice());

        }


        switch (orderPrice)
        {
            case 1:
                orderPrice = 8000;
                break;
            case 2:
                orderPrice = 10000;
                break;
            case 3:
                orderPrice = 12000;
                break;
            case 4:
                orderPrice = 9000;
                break;

        }
    }


}