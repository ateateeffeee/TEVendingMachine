package com.techelevator.change;

import java.math.BigDecimal;

public class Nickel extends Money{

    public Nickel(BigDecimal value){
        super(new BigDecimal(0.05));
    }
}
