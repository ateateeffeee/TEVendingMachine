package com.techelevator.application;

import com.techelevator.ui.UserInput;
import com.techelevator.ui.UserOutput;

public class VendingMachine {
    UserInput userInput = new UserInput();
    UserOutput userOutput = new UserOutput();
    //make new vending machine row objects

    public void createMachineRows(){
        String[] slotLetterArray = new String[]{"A","B","C","D"};
        String[] slotNumberArray = new String[]{"1","2","3","4"};

        for(String currentLetter : slotLetterArray){
            //for each number
            for (String currentNumber : slotNumberArray) {
                VendingMachineRow newRow = new VendingMachineRow(currentLetter + currentNumber);
                }
            }
    }


    public void run() {
        while(true) {
            userOutput.displayHomeScreen();
            String choice = userInput.getHomeScreenOption();

            System.out.println(choice);
            if(choice.equals("display")) {
                // display the items
            }
            else if(choice.equals("purchase")) {
                // make a purchase
            }
            else if(choice.equals("exit")) {
                // good bye
                break;
            }
        }
    }
}
