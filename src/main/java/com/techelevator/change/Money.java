package com.techelevator.change;

import java.math.BigDecimal;

public abstract class Money {

    private BigDecimal value;

    //constructor
    public Money(BigDecimal value){
        this.value = value;
    }

    public BigDecimal getValue() {
        return value;
    }
}
