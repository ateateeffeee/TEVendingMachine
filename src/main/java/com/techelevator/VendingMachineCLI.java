package com.techelevator;


import com.techelevator.Reader.FileReader;
import com.techelevator.application.VendingMachine;
import com.techelevator.ui.UserOutput;

public class VendingMachineCLI {

	public static void main(String[] args) {

		FileReader fileReader = new FileReader(); //TESTING
		fileReader.readFile(); //TESTING

		UserOutput userOutput = new UserOutput(); //TESTING
		userOutput.displayVendingItems(fileReader.readFile());  //TESTING

		VendingMachine vendingMachine = new VendingMachine();
		vendingMachine.run();
	}
}
