package com.techelevator.ui;

import com.techelevator.application.VendingMachineRow;
import com.techelevator.application.VendingMachineRowBuilder;
import com.techelevator.inventory.Item;

import java.util.HashMap;
import java.util.Map;



public class UserOutput {

    //VendingMachineRowBuilder vendingMachineRowBuilder = new VendingMachineRowBuilder();
    //private Map<String, VendingMachineRow> vendingMachineRows = vendingMachineRowBuilder.getMachineRows();


//    public Map<String, VendingMachineRow> something (VendingMachineRowBuilder vendingMachineRowBuilder){
//        vendingMachineRows = vendingMachineRowBuilder.getMachineRows();
//
//        return vendingMachineRows;
//    }
//    something();



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
        System.out.println();
        System.out.print("Please select an option: ");
    }

    public void displaySelectItemScreen(Map<String, Item> inventoryMap, Map<String, VendingMachineRow> vendingMachineRows){
        displayVendingItems(inventoryMap, vendingMachineRows);
        System.out.println("Please enter the slot location: ");

    }

    public void displayItemTypeMessage(String userInput,Map<String, Item> inventoryMap){
        //if statements for each item type

        String itemName = inventoryMap.get(userInput).getName();
        String itemType = inventoryMap.get(userInput).getItemType();
        String itemPrice = inventoryMap.get(userInput).getPrice().toString();
        String itemTypeMessage = inventoryMap.get(userInput).getItemTypeMessage();


//        if (itemType.equals("candy")) {
//            itemTypeMessage;
//
//        } else if (itemType.equals("munchy")){
//            itemTypeMessage = "Munchy, Munchy, so Good!";
//        } else if (itemType.equals("drink")){
//            itemTypeMessage = "Drinky, Drinky, Slurp Slurp!";
//        } else if (itemType.equals("gum")){
//            itemTypeMessage = "Chewy, Chewy, Lots O Bubbles!";
//        } else {
//            itemTypeMessage = "";
//        }
        System.out.println("You purchased: " + itemName + " for $" + itemPrice);
        System.out.println(itemTypeMessage);

        //print money remaining


    }

    public void displayVendingItems(Map<String, Item> inventoryMap, Map<String, VendingMachineRow> vendingMachineRows){
        //CURRENTLY TESTING IN CLI FILE. NOT WHERE IT WILL STAY. MOVE IMPORTS TO USERINPUT
        //INCLUDE QUANTITY AFTER BUILDING MACHINE ROW CLASS
        //PRINT NOT AVAILABLE IF QUANTITY = 0
        //System.out.println("HELP!!!!!!!!");
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
                if (vendingMachineRows.get(currentLetter + currentNumber).getQuantity() > 0 && vendingMachineRows.get(currentLetter + currentNumber).getQuantity() <= 6){
                System.out.print(vendingMachineRows.get(currentLetter + currentNumber).getQuantity());
                System.out.println();
                } else {
                System.out.println("Item unavailable. Please make another selection");
            }


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
