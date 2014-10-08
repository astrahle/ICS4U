package com.bayviewglen.AddressBook;

import java.util.Scanner;

public class AddressBookDriver {

	public static void main(String[] args){
		
		AddressBook AddressBook = new AddressBook();
		
		
		boolean done = false;
		
		System.out.println("Welcome to the address book program.");
		
		while (!done){
			
			String mainChoice;
			
			Scanner choiceScanner = new Scanner(System.in);
			Scanner firstNameScanner = new Scanner(System.in);
			Scanner lastNameScanner = new Scanner(System.in);
			Scanner phoneNumberScanner = new Scanner(System.in);
			
			System.out.println(" ");
			System.out.println("------------------------------------");
			System.out.println("What would you like to do?");
			System.out.println("1) Search By Phone Number");
			System.out.println("2) Search By First Name");
			System.out.println("3) Search By Last Name");
			System.out.println("4) Add Contact");
			System.out.println("5) Remove Contact");
			System.out.println("6) Display All Contacts");
			System.out.println("7) Quit");
			mainChoice = choiceScanner.nextLine();
			
			if (mainChoice .equals("1")){
				String searchedPhone;
				System.out.print("Please enter the Phone Number of the person you want to search for:");
				searchedPhone = choiceScanner.nextLine();
				
				if (AddressBook.searchByPhoneNumber(searchedPhone) == null){
					System.out.println("Sorry nobody with that phone number exists...");
				}
				if (AddressBook.searchByPhoneNumber(searchedPhone) != null){
					//System.out.println(AddressBook.searchByPhoneNumber(searchedPhone));
				}
			}
			
			if (mainChoice . equals("2")){
				
			}
			
			if (mainChoice .equals("4")){
				String firstName;
				String lastName;
				String phoneNumber;
				
				System.out.print("Please enter their first name:");
				firstName = firstNameScanner.nextLine();
				
				System.out.print("Please enter their last name:");
				lastName = lastNameScanner.nextLine();
				
				System.out.print("Please enter their phone number:");
				phoneNumber = phoneNumberScanner.nextLine();
				
				AddressBook.addContact(lastName, firstName, phoneNumber);
			}
		}
	}
}
