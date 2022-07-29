package com.techelevator.ui;

import java.util.Scanner;

/**
 * Responsibilities: This class should handle receiving ALL input from the User
 *
 * Dependencies: None
 */
public class UserInput {
    private Scanner scanner = new Scanner(System.in);

    //create instance of userOutput
    UserOutput userOutput = new UserOutput();
    //Class.forName(UserOutput);

    public String getHomeScreenOption() {

        String selectedOption = scanner.nextLine();
        String option = selectedOption.trim().toLowerCase();

        userOutput.displayOption(option);
        if (option.equalsIgnoreCase("d")) {
            return "display";
        }
        else if (option.equalsIgnoreCase("p")) {
            return "purchase";
        }
        else if (option.equalsIgnoreCase("e")) {
            return "exit";
        }
        else {
            return "";
        }

    }

    public String getPurchaseMenuOption(){
        String selectedOption = scanner.nextLine();
        String option = selectedOption.trim().toLowerCase();

        userOutput.displayOption(option);
        if (option.equalsIgnoreCase("m")) {
            return "feed money";
        }
        else if (option.equalsIgnoreCase("s")) {
            return "select item";
        }
        else if (option.equalsIgnoreCase("f")) {
            return "finish transaction";
        }
        else {
            return "";
        }
    }
}

