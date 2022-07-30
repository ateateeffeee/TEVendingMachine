package com.techelevator.change;

import java.math.BigDecimal;

public class FiveDollar extends Money {

    public FiveDollar(BigDecimal value){
        super(new BigDecimal(5.00));
    }
}
