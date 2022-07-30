package com.techelevator.application;

import com.techelevator.Reader.FileReader;
import com.techelevator.ui.UserInput;
import com.techelevator.ui.UserOutput;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class VendingMachine {
    UserInput userInput = new UserInput();
    UserOutput userOutput = new UserOutput();
    VendingMachineRowBuilder vendingMachineRowBuilder = new VendingMachineRowBuilder();
    private Map<String, VendingMachineRow> vendingMachineRows = vendingMachineRowBuilder.getMachineRows();
    Balance balance = new Balance();

    //boolean inMenu = true;

    public void run() {

        //inventory file
        FileReader fileReader = new FileReader();
        fileReader.readFile();

        while(true) {
            userOutput.displayHomeScreen();
            userOutput.displayMainMenu();
            String choice = userInput.getHomeScreenOption();


            System.out.println(choice);
            if(choice.equals("display")) {
                // display the items
                userOutput.displayVendingItems(fileReader.readFile(), vendingMachineRows);
            }
            else if(choice.equals("purchase")) {

                userOutput.displayPurchaseMenu(balance.getBalance());
                String purchaseMenuChoice = userInput.getPurchaseMenuOption();

                while (choice.equals("purchase")) {

//LOOP
                    if (purchaseMenuChoice.equals("feed money")) {
                        //write logic to do math
                        while (purchaseMenuChoice.equals("feed money")) {
                            userOutput.displayFeedMoneyMenu();
                            BigDecimal moneyFed = userInput.getFeedMoneyInput();
                            balance.addToBalance(moneyFed); // add money to balance
                            userOutput.displayPurchaseMenu(balance.getBalance());

                            purchaseMenuChoice = userInput.getPurchaseMenuOption();
                            System.out.println(purchaseMenuChoice);
                            //add to balance
                            //make a balance class/calculator class
                        }
                        //NEW STUFF
//                        userOutput.displayPurchaseMenu(balance.getBalance());
//                        userInput.getPurchaseMenuOption();


                    }
                    if (purchaseMenuChoice.equals("select item")) {

                        while (purchaseMenuChoice.equals("select item")) {
                            userOutput.displaySelectItemScreen(fileReader.readFile(), vendingMachineRows);
                            String selectItemOptionChoice = userInput.getSelectItemOption().toUpperCase();

                            //move invalid choice check to top
                            if (!vendingMachineRows.containsKey(selectItemOptionChoice)) {
                                //prints error message when slot location does not exist
                                System.out.println("Item does not exist. Please make another selection");
                                userOutput.displayPurchaseMenu(balance.getBalance());
                                purchaseMenuChoice = userInput.getPurchaseMenuOption();
                            } else if (vendingMachineRows.get(selectItemOptionChoice).getQuantity() > 0) {
                                balance.subtractFromBalance(fileReader.readFile().get(selectItemOptionChoice).getPrice());            //update balance
                                vendingMachineRows.get(selectItemOptionChoice).updateQuantity(); //update quantity
                                userOutput.displayItemTypeMessage(selectItemOptionChoice, fileReader.readFile());
                                //if 0 don't buy

                                userOutput.displayPurchaseMenu(balance.getBalance());
                                purchaseMenuChoice = userInput.getPurchaseMenuOption();

                            } else if (vendingMachineRows.get(selectItemOptionChoice).getQuantity() == 0) {
                                //prints error message when item quantity is 0
                                System.out.println("Item unavailable. Please make another selection");
                                userOutput.displayPurchaseMenu(balance.getBalance());
                                purchaseMenuChoice = userInput.getPurchaseMenuOption();
                            } else {
                                userOutput.displayPurchaseMenu(balance.getBalance());
                                purchaseMenuChoice = userInput.getPurchaseMenuOption();
                            }


                        }

                    //    userOutput.displaySelectItemScreen(fileReader.readFile(), vendingMachineRows);
                    //    String selectItemOptionChoice = userInput.getSelectItemOption();
                        //user selectedItemOption to target item in map
                        //System.out.println("You picked: " + pull item from map );

                        //update balance
                        //update quantity

                        //get userInput for items selected
                        //purchasedItemScreen
                     //   userOutput.displayPurchaseMenu(balance.getBalance());


                    }
                    if (purchaseMenuChoice.equals("finish transaction")) {
                        //display change due/change made with updated bal to $0

                        choice = "";
                        purchaseMenuChoice = "";
                    }

                }

            }
            if(choice.equals("exit")) {
                // goodbye
                break;
            }
        }
    }
}
