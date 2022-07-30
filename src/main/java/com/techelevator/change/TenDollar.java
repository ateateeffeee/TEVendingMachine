package com.techelevator.change;

import java.math.BigDecimal;

public class TenDollar extends Money{

    public TenDollar(BigDecimal value){
        super(new BigDecimal(10.00));
    }
}
