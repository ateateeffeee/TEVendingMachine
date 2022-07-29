package com.techelevator.ui;

import com.techelevator.inventory.Item;

import java.util.Map;

public class UserOutput {
    public void displayMessage(String message) {
        System.out.println();
        System.out.println(message);
        System.out.println();
    }

    public void displayHomeScreen() {
        System.out.println();
        System.out.println("***************************************************");
        System.out.println("                      Home");
        System.out.println("***************************************************");
        System.out.println();
    }

    public void displayMainMenu(){
        System.out.println("What would you like to do?");
        System.out.println();

        System.out.println("D) Display Items");
        System.out.println("P) Purchase");
        System.out.println("E) Exit");

        System.out.println();
        System.out.print("Please select an option: ");


    }

    public void displayOption(String option){
        System.out.println("option = " + option);
    }

    public void displayPurchaseMenu(){
        System.out.println("What would you like to do?");
        System.out.println();

        System.out.println("M) Feed Money");
        System.out.println("S) Select Item");
        System.out.println("F) Finish Transaction");

        System.out.println();
        System.out.print("Current balance remaining: ");
    }

    public void displayVendingItems(Map<String, Item> inventoryMap){
        //INCLUDE QUANTITY AFTER BUILDING MACHINE ROW CLASS
        //PRINT NOT AVAILABLE IF QUANTITY = 0
        System.out.println("HELP!!!!!!!!");
        String[] slotLetterArray = new String[]{"A","B","C","D"};
        String[] slotNumberArray = new String[]{"1","2","3","4"};

        for (String currentLetter : slotLetterArray){
            //for each number
            for (String currentNumber : slotNumberArray) {
                System.out.print(inventoryMap.get(currentLetter + currentNumber).getSlotLocation());
                System.out.print("   ");
                System.out.print(inventoryMap.get(currentLetter + currentNumber).getName());
                System.out.print("   ");
                System.out.print(inventoryMap.get(currentLetter + currentNumber).getPrice());
                System.out.print("   ");
                //FOR PRINTING QUANTITY
                //if (.getQuantity > 1 && .getQuantity <= 6){
                //System.out.print(vendingMachineRowMap.get(currentLetter + currentNumber).getQuantity());
                //} else {
                //System.out.println("Item unavailable. Please make another selection");
            //}


            }
            //if we have time, make method to line up prices (count word.length and add that many spaces)

        }

//        System.out.print(inventoryMap.get("A1").getSlotLocation());
//        System.out.print("   ");
//        System.out.print(inventoryMap.get("A1").getName());
//        System.out.print("   ");
//        System.out.print(inventoryMap.get("A1").getPrice());
//        System.out.println(inventoryMap.values());

    }
}
