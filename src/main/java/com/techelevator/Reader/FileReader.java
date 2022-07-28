package com.techelevator.Reader;

import com.techelevator.inventory.Candy;
import com.techelevator.inventory.Drink;
import com.techelevator.inventory.Gum;
import com.techelevator.inventory.Munchy;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.util.Scanner;

public class FileReader {

    public void readFile(){

        String pathOfFileToRead = "C:\\Users\\Student\\workspace\\module-1-capstone-team-7\\catering.csv";

        //create file object
        File inventoryFile = new File(pathOfFileToRead);

        //Create new scanner
        try(Scanner fileReader = new Scanner(inventoryFile)){

            while(fileReader.hasNextLine()) {

                String currentLine = fileReader.nextLine();
                String[] delimitedString = currentLine.split(",");

                String slotLocation = delimitedString[0];
                String name = delimitedString[1];
                String price = delimitedString[2];
                String itemType = delimitedString[3];

                if(itemType.equals("Candy")){
                    Candy candy = new Candy(slotLocation);
                } else if(itemType.equals("Gum")){
                    Gum gum = new Gum(slotLocation);
                } else if(itemType.equals("Drink")){
                    Drink drink = new Drink(slotLocation);
                } else if(itemType.equals("Munchy")){
                    Munchy munchy = new Munchy(slotLocation);
                }

                System.out.println(currentLine);
                System.out.println(delimitedString[1]);
            }

        }catch(FileNotFoundException e) {
            System.out.println(inventoryFile.getAbsoluteFile() + " not found");
        }
    }
}
