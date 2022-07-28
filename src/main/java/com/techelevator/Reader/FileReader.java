package com.techelevator.Reader;

import com.techelevator.inventory.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FileReader {

    public Map<String, Item> readFile() {

        Map<String, Item> inventoryMap = new HashMap<String, Item>();

        String pathOfFileToRead = "C:\\Users\\Student\\workspace\\module-1-capstone-team-7\\catering.csv";

        //create file object
        File inventoryFile = new File(pathOfFileToRead);

        //Create new scanner
        try (Scanner fileReader = new Scanner(inventoryFile)) {


            while (fileReader.hasNextLine()) {

                String currentLine = fileReader.nextLine();
                String[] delimitedString = currentLine.split(",");

                String slotLocation = delimitedString[0];
                String name = delimitedString[1];
                String price = delimitedString[2];
                String itemType = delimitedString[3];

                if (itemType.equals("Candy")) {
                    Candy candy = new Candy(slotLocation);
                    candy.setName(name);
                    candy.setPrice(new BigDecimal(price));

                    //send to map
                    inventoryMap.put(candy.getSlotLocation(), candy);

                } else if (itemType.equals("Gum")) {
                    Gum gum = new Gum(slotLocation);
                    gum.setName(name);
                    gum.setPrice(new BigDecimal(price));

                    //send to map
                    System.out.println(gum.getSlotLocation());
                    inventoryMap.put(gum.getSlotLocation(), gum);

                } else if (itemType.equals("Drink")) {
                    Drink drink = new Drink(slotLocation);
                    drink.setName(name);
                    drink.setPrice(new BigDecimal(price));

                    //send to map
                    inventoryMap.put(drink.getSlotLocation(), drink);

                } else if (itemType.equals("Munchy")) {
                    Munchy munchy = new Munchy(slotLocation);
                    munchy.setName(name);
                    munchy.setPrice(new BigDecimal(price));

                    //send to map
                    inventoryMap.put(munchy.getSlotLocation(), munchy);

                }

                //System.out.println(currentLine);
                //System.out.println(delimitedString[1]);

                //create items

                //RETURN MAP

            }

            //LEFT OFF HERE LEFT OFF HERE
            //System.out.println(inventoryMap.);
            for (Map.Entry<String, Item> entry : inventoryMap.entrySet()) {
                System.out.println(entry.getKey() + ":" + entry.getValue().toString());
            }


        } catch (FileNotFoundException e) {
            System.out.println(inventoryFile.getAbsoluteFile() + " not found");
        }
        return inventoryMap;
    }
}
