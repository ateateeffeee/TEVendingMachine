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
        if (option.equals("d")) {
            return "display";
        }
        else if (option.equals("p")) {
            return "purchase";
        }
        else if (option.equals("e")) {
            return "exit";
        }
        else {
            return "";
        }

    }
}

