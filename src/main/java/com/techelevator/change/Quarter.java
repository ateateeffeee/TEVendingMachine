package com.techelevator.change;

import java.math.BigDecimal;

public class Quarter extends Money{

    public Quarter(BigDecimal value){
        super(new BigDecimal(0.25));
    }
}
