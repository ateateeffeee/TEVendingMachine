package com.techelevator.Reader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader {

    public void readFile(){
        String pathOfFileToRead = "C:\\Users\\Student\\workspace\\module-1-capstone-team-7\\catering.csv";

        //create file object
        File inventoryFile = new File(pathOfFileToRead);

        //Create new scanner
        try(Scanner fileReader = new Scanner(inventoryFile)){
            while(fileReader.hasNextLine()) {
                System.out.println(fileReader.nextLine());
            }

        }catch(FileNotFoundException e) {
            System.out.println(inventoryFile.getAbsoluteFile() + " not found");
        }
    }
}
