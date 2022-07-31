package com.techelevator.change;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Change {

    //variables
    private BigDecimal totalValue;
    private int numOfQuarters;
    private int numOfDimes;
    private int numOfNickels;
    private int numOfOneDollars;

    //constructor

    public Change(BigDecimal totalValue){
        this.totalValue = totalValue;
    }

    //methods
    public void calculateChange(BigDecimal changeDue) {
        //some type of loop to loop through
        while (changeDue.compareTo(new BigDecimal(0.00)) > 0) {
            if (changeDue.compareTo(new BigDecimal(1.00)) >= 0) {
                numOfOneDollars++;
               changeDue = changeDue.subtract(new BigDecimal("1.00").setScale(2, RoundingMode.HALF_UP));
            } else if (changeDue.compareTo(new BigDecimal("0.25")) >= 0){
                numOfQuarters++;
                changeDue = changeDue.subtract(new BigDecimal("0.25").setScale(2, RoundingMode.HALF_UP));
            } else if (changeDue.compareTo(new BigDecimal("0.10")) >= 0){
                numOfDimes++;
                changeDue = changeDue.subtract(new BigDecimal("0.10").setScale(2, RoundingMode.HALF_UP));
            } else if (changeDue.compareTo(new BigDecimal("0.05")) == 0){
                numOfNickels++;
                changeDue = changeDue.subtract(new BigDecimal("0.05").setScale(2, RoundingMode.HALF_UP));
            }
        }
    }

        public void calculateNumOfQuarters (BigDecimal changeInQuarters){
            numOfQuarters = changeInQuarters.divide(new BigDecimal(0.25), RoundingMode.UNNECESSARY).intValue();
        }

        public void calculateNumOfDimes (BigDecimal changeInDimes){
            numOfQuarters = changeInDimes.divide(new BigDecimal(0.10), RoundingMode.UNNECESSARY).intValue();
        }

        public void calculateNumOfNickels (BigDecimal changeInNickels){
            numOfQuarters = changeInNickels.divide(new BigDecimal(0.05), RoundingMode.UNNECESSARY).intValue();
        }

        public void calculateNumOfOneDollars (BigDecimal changeInOneDollars){
            numOfQuarters = changeInOneDollars.divide(new BigDecimal(1.00), RoundingMode.UNNECESSARY).intValue();
        }


        //getters

        public BigDecimal getTotalValue () {
            return totalValue;
        }

        public int getNumOfQuarters () {
            return numOfQuarters;
        }

        public int getNumOfDimes () {
            return numOfDimes;
        }

        public int getNumOfNickels () {
            return numOfNickels;
        }

        public int getNumOfOneDollars () {
            return numOfOneDollars;
        }
}

