package com.techelevator.application;

import java.util.HashMap;
import java.util.Map;

public class VendingMachineRowBuilder {
    Map<String, VendingMachineRow> machineRowMap = new HashMap<>();
    //make new vending machine row objects

    public Map<String, VendingMachineRow> getMachineRows(){
        String[] slotLetterArray = new String[]{"A","B","C","D"};
        String[] slotNumberArray = new String[]{"1","2","3","4"};

        for(String currentLetter : slotLetterArray){
            //for each number
            for (String currentNumber : slotNumberArray) {
                VendingMachineRow newRow = new VendingMachineRow(currentLetter + currentNumber);
                machineRowMap.put(currentLetter + currentNumber, newRow);
            }
        } return machineRowMap;
    }

    public Map<String, VendingMachineRow> getMachineRowMap() {
        return machineRowMap;
    }
}
