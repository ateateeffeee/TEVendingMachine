package com.techelevator.change;

import java.math.BigDecimal;

public class Dime extends Money{

    public Dime(BigDecimal value){
        super(new BigDecimal(0.10));
    }
}
