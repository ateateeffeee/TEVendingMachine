package com.techelevator.application;

import java.math.BigDecimal;

public class Balance {

    //variables
    private BigDecimal balance = new BigDecimal(0.00);

    //constructor
    public Balance(){
        this.balance = balance;
    }

    //methods

    //addToBalance
    public void addToBalance(BigDecimal moneyFed){

        //if this doesn't work, update variable instead
        balance = balance.add(moneyFed);

        //return balance.add(moneyFed);
    }

    //subtractFromBalance
    public void subtractFromBalance(BigDecimal price){
        balance = balance.subtract(price);
    }

    public BigDecimal getBalance() {
        return balance;
    }
}
