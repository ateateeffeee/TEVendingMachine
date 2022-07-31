package com.techelevator.application;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class VendingMachineRowTest {
    private VendingMachineRow vendingMachineRow;

    @Before
     public void setup(){
        vendingMachineRow = new VendingMachineRow("A1");
    }

    @Test
    public void vendingMachineRowReturnsNewRowWithQuantityOf6(){
        //Arrange
        VendingMachineRow expected = new VendingMachineRow("B1");
        //Act
        int actual = vendingMachineRow.getQuantity();

        Assert.assertEquals(expected.getQuantity(), actual);
    }

    @Test
    public void updateQuantitySubtractsOneFromQuantity(){
        //Arrange
        int expected = 5;
        //Act
        VendingMachineRow actual = new VendingMachineRow("A1");
        actual.updateQuantity();
        //Assert
        Assert.assertEquals(expected,actual.getQuantity());

    }
}
