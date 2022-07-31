package com.techelevator.Change;

import com.techelevator.change.Change;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

public class ChangeTest {

    private Change change;

    @Test
    public void changeReturnsCorrectDollarNum() {
        //Arrange
        change = new Change(new BigDecimal("5.00"));
        int expectedDollar = 5;



        //Act
        change.calculateChange(new BigDecimal("5.00"));
        //Assert
        Assert.assertEquals(expectedDollar, change.getNumOfOneDollars());

    }

    @Test
    public void changeReturnsCorrectQuarterNum(){
        //Arrange
        change = new Change(new BigDecimal("2.50"));
        int expectedQuarter = 2;
        //Act
        change.calculateChange(new BigDecimal("2.50"));
        //Assert
        Assert.assertEquals(expectedQuarter, change.getNumOfQuarters());
    }

    @Test
    public void changeReturnsCorrectDimeNum(){
        change = new Change(new BigDecimal("1.20"));
        int expectedDime = 2;

        change.calculateChange(new BigDecimal("1.20"));

        Assert.assertEquals(expectedDime, change.getNumOfDimes());
    }

    @Test
    public void changeReturnsCorrectNickelNum(){
        change = new Change(new BigDecimal("1.15"));
        int expectedNickle = 1;

        change.calculateChange(new BigDecimal("1.15"));

        Assert.assertEquals(expectedNickle, change.getNumOfNickels());
    }

}
