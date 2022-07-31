package com.techelevator.application;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

public class BalanceTest {
    private Balance balance;

    @Before
    public void setup(){
        balance = new Balance();
    }

    @Test
    public void addToBalanceReturnsBalancePlusMoneyFed(){
        //Arrange
        BigDecimal amountToAdd = new BigDecimal("5.00");
        //Act
        balance.addToBalance(amountToAdd);
        //Assert
        Assert.assertEquals(amountToAdd, balance.getBalance());
    }

    @Test
    public void subtractFromBalanceReturnsBalanceMinusPrice(){
        balance.addToBalance(new BigDecimal("12.00"));

        //Arrange
        BigDecimal expected = new BigDecimal("5.00");
        //Act
        balance.subtractFromBalance(new BigDecimal("7.00"));

        //Assert
        Assert.assertEquals(expected, balance.getBalance());

    }
}
