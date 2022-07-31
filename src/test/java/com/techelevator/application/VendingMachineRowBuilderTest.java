package com.techelevator.application;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class VendingMachineRowBuilderTest {
    private VendingMachineRowBuilder vendingMachineRowBuilder;

    @Before
    public void setup(){
        vendingMachineRowBuilder = new VendingMachineRowBuilder();

    }

    @Ignore //ask about this
    public void methodReturnsCorrectMap(){
        VendingMachineRow rowA1 = new VendingMachineRow("A1");
        VendingMachineRow rowA2 = new VendingMachineRow("A2");
        VendingMachineRow rowA3 = new VendingMachineRow("A3");
        VendingMachineRow rowA4 = new VendingMachineRow("A4");

        VendingMachineRow rowB1 = new VendingMachineRow("B1");
        VendingMachineRow rowB2 = new VendingMachineRow("B2");
        VendingMachineRow rowB3 = new VendingMachineRow("B3");
        VendingMachineRow rowB4 = new VendingMachineRow("B4");

        VendingMachineRow rowC1 = new VendingMachineRow("C1");
        VendingMachineRow rowC2 = new VendingMachineRow("C2");
        VendingMachineRow rowC3 = new VendingMachineRow("C3");
        VendingMachineRow rowC4 = new VendingMachineRow("C4");

        VendingMachineRow rowD1 = new VendingMachineRow("D1");
        VendingMachineRow rowD2 = new VendingMachineRow("D2");
        VendingMachineRow rowD3 = new VendingMachineRow("D3");
        VendingMachineRow rowD4 = new VendingMachineRow("D4");

        Map<String,VendingMachineRow> expected = new HashMap<String, VendingMachineRow>();
        expected.put("A1",rowA1);
        expected.put("A2",rowA2);
        expected.put("A3",rowA3);
        expected.put("A4",rowA4);

        expected.put("B1",rowB1);
        expected.put("B2",rowB2);
        expected.put("B3",rowB3);
        expected.put("B4",rowB4);

        expected.put("C1",rowC1);
        expected.put("C2",rowC2);
        expected.put("C3",rowC3);
        expected.put("C4",rowC4);

        expected.put("D1",rowD1);
        expected.put("D2",rowD2);
        expected.put("D3",rowD3);
        expected.put("D4",rowD4);

        //Act
        //vendingMachineRowBuilder.getMachineRows();

        //Assert
        //assertRows(expected, vendingMachineRowBuilder.getMachineRows());
        Assert.assertSame(expected,vendingMachineRowBuilder.getMachineRows());

    }

    private void assertRows(Map<String, VendingMachineRow> map1, Map<String, VendingMachineRow> map2){
        Assert.assertEquals(map1, map2);
       //Assert.assertEquals(dog.getAge(),otherDog.getAge());
        //Assert.assertEquals(dog.getBreed(),otherDog.getBreed());
    }
}
