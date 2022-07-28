package com.techelevator;


import com.techelevator.Reader.FileReader;
import com.techelevator.application.VendingMachine;

public class VendingMachineCLI {

	public static void main(String[] args) {

		FileReader fileReader = new FileReader();
		fileReader.readFile();

		VendingMachine vendingMachine = new VendingMachine();
		vendingMachine.run();
	}
}
