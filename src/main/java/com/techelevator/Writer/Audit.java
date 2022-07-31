package com.techelevator.Writer;

import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Audit {

    String auditFilePath = "C:\\Users\\Student\\workspace\\module-1-capstone-team-7\\audit.txt";
    File auditFile = new File(auditFilePath);
    DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");


public void createFile(){

    try(PrintWriter writer = new PrintWriter(auditFilePath)){
       writer.append("Vending Machine Audit File");
       writer.append("\n");
        writer.append("\n");
        writer.append("\n");
    }
    catch(FileNotFoundException ex){
        System.out.println("Your file was not found.");
    }
}

public void writeMoneyFedToFile(String moneyFed, String updatedBalance){
    try(PrintWriter out = new PrintWriter(new FileWriter(auditFile, true))){
        Date date = new Date();
        String outputString = dateFormat.format(date) + " PM MONEY FED:       $" + moneyFed + "    $" + updatedBalance;
        out.append(outputString);
        out.append("\n");

    } catch(IOException ex){
        System.out.println("An error has occurred. '¯\\_(ツ)_/¯ ");
    }
}

public void writePurchaseToFile(String item, String slotNumber, String oldBalance, String updatedBalance){
    try(PrintWriter out = new PrintWriter(new FileWriter(auditFile, true))){
        Date date = new Date();
        String outputString = dateFormat.format(date) + " PM " + item + "       " + slotNumber + " $" + oldBalance + "    $" + updatedBalance;
        out.append(outputString);
        out.append("\n");

    } catch(IOException ex){
        System.out.println("An error has occurred. '¯\\_(ツ)_/¯ ");
    }
}

public void writeChangeGivenToFile(String change, String newBalance){
    try(PrintWriter out = new PrintWriter(new FileWriter(auditFile, true))){
        Date date = new Date();
        String outputString = dateFormat.format(date) + " PM CHANGE GIVEN: "  + "    " +  "$" + change + "    $" + newBalance;
        out.append(outputString);
        out.append("\n");

    } catch(IOException ex){
        System.out.println("An error has occurred. '¯\\_(ツ)_/¯ ");
    }
}


}
