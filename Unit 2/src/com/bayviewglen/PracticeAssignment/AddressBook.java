package com.bayviewglen.PracticeAssignment;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook extends Contacts {

	private ArrayList<Contacts> list;
	Scanner scanner = new Scanner(System.in);

	// void is a place holder until i set the return.
	public void addContact(){
		String firstName;
		String lastName;
		String phoneNumber;
		String combined;
		
		// to get the first name
		System.out.println("Please enter first name: ");
		firstName = scanner.nextLine();
		
		// to get the last name
		System.out.println("Please enter last name: ");
		lastName = scanner.nextLine();
		
		// to get the phone numbAer
		System.out.println("Please enter phone number: ");
		phoneNumber = scanner.nextLine();
		
		// to make one string that we will put into the array list
		//combined = firstName + " " + lastName+ " " + phoneNumber;
		
		setFirstName(firstName);
		setLastName(lastName);
		setPhoneNumber(phoneNumber);
		
		
		
		// REMOVE!!! It is just used for quick testing
		//System.out.println(getFirstName());
		//System.out.println(getLastName());
		//System.out.println(getPhoneNumber());
		
	}
	
	public static void editFile() throws Exception{
		Scanner fileScanner = new Scanner (new File("Address Books/Address Book One.txt"));
		PrintWriter writer = new PrintWriter ("Address Books/Address Book One.txt", "UTF-8");
		writer.println(getFirstName() + " " + getLastName() + " " + getPhoneNumber());
	}

}
