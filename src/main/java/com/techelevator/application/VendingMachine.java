package com.techelevator.application;

import com.techelevator.Reader.FileReader;
import com.techelevator.ui.UserInput;
import com.techelevator.ui.UserOutput;

import java.util.HashMap;
import java.util.Map;

public class VendingMachine {
    UserInput userInput = new UserInput();
    UserOutput userOutput = new UserOutput();
    //boolean inMenu = true;

    public void run() {

        FileReader fileReader = new FileReader();
        fileReader.readFile();

        while(true) {
            userOutput.displayHomeScreen();
            userOutput.displayMainMenu();
            String choice = userInput.getHomeScreenOption();


            System.out.println(choice);
            if(choice.equals("display")) {
                // display the items
                userOutput.displayVendingItems(fileReader.readFile());
            }
            else if(choice.equals("purchase")) {
                // make a purchase
                userOutput.displayPurchaseMenu();
                //GET USER INPUT FOR PURCHASE MENU
            }
            else if(choice.equals("exit")) {
                // goodbye
                break;
            }
        }
    }
}
