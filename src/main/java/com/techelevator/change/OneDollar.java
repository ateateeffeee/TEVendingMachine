package com.techelevator.change;

import java.math.BigDecimal;

public class OneDollar extends Money{

    public OneDollar(BigDecimal value){
        super(new BigDecimal(1.00));
    }
}
