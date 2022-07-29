package com.techelevator.application;

public class VendingMachineRow {
    //variables
    private int quantity = 6;
    private String rowName = "";

    //constructor
    public VendingMachineRow(String rowName){
        this.quantity = quantity;
        this.rowName = rowName;
    }


    //methods
    public int updateQuantity(){


        return quantity -= 1;
    }

    public int getQuantity() {
        return quantity;
    }
}
