package com.techelevator;


import com.techelevator.Reader.FileReader;
import com.techelevator.application.VendingMachine;
import com.techelevator.ui.UserOutput;

public class VendingMachineCLI {

	public static void main(String[] args) {

		FileReader fileReader = new FileReader(); //TESTING
		fileReader.readFile(); //TESTING

		UserOutput userOutput = new UserOutput(); //TESTING
		//make sure user can't purchase item if item quantity is 0
		//userOutput.displayVendingItems(fileReader.readFile());  //TESTING
		//userOutput.displaySelectItemScreen(fileReader.readFile()); //TESTING

		VendingMachine vendingMachine = new VendingMachine();
		vendingMachine.run();
	}
}
