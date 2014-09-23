package com.bayviewglen.PracticeAssignment;

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
		
		// to get the phone number
		System.out.println("Please enter phone number: ");
		phoneNumber = scanner.nextLine();
		
		// to make one string that we will put into the array list
		//combined = firstName + " " + lastName+ " " + phoneNumber;
		
		setFirstName(firstName);
		setLastName(lastName);
		setPhoneNumber(phoneNumber);
		
	
		
	}

}
