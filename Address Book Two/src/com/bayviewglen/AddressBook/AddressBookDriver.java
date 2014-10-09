package com.bayviewglen.AddressBook;

import java.util.Scanner;

public class AddressBookDriver {

	public static void main(String[] args){

		AddressBook AddressBook = new AddressBook();


		boolean done = false;

		System.out.println("Welcome to the address book program.");
		System.out.println("Which Address Book would you like to access?");
		System.out.println("1) Trumpet Address Book");
		System.out.println("2) Flute Address Book");
		System.out.println("3) Violin Address Book");
		System.out.println("4) Choir Address Book");
		System.out.println("5) Trombone Address Book");
		System.out.println("6) Guitar Address Book");

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
					try {
						Thread.sleep(2000);
					}catch(InterruptedException ex){
						Thread.currentThread().interrupt();
					}
					System.out.println("Returning to main menu...");
					try {
						Thread.sleep(2000);
					}catch(InterruptedException ex){
						Thread.currentThread().interrupt();
					}
				}
				if (AddressBook.searchByPhoneNumber(searchedPhone) != null){
					//System.out.println(AddressBook.searchByPhoneNumber(searchedPhone));
				}
			}

			//Problem: Same problem as with searchbyphone number. It can't get the persons name or it gives a weird address.
			if (mainChoice . equals("2")){
				String searchedFirstName;
				System.out.println("Please enter the First Name of the person you wish to search for: ");
				searchedFirstName = choiceScanner.nextLine();

				if (AddressBook.searchByFirstName(searchedFirstName) == null){
					System.out.println("Sorry nobody with that first name exists...");
					try {
						Thread.sleep(2000);
					}catch(InterruptedException ex){
						Thread.currentThread().interrupt();
					}
					System.out.println("Returning to main menu...");
					try {
						Thread.sleep(2000);
					}catch(InterruptedException ex){
						Thread.currentThread().interrupt();
					}
				}
				if (AddressBook.searchByFirstName(searchedFirstName) != null){

				}
			}

			if (mainChoice . equals("3")){
				String searchedLastName;
				System.out.println("Please enter the Last Name of the person you wish to search for: ");
				searchedLastName = choiceScanner.nextLine();

				if (AddressBook.searchByLastName(searchedLastName) == null){
					System.out.println("Sorry nobody with that last name exists...");
					try {
						Thread.sleep(2000);
					}catch(InterruptedException ex){
						Thread.currentThread().interrupt();
					}
					System.out.println("Returning to main menu...");
					try {
						Thread.sleep(2000);
					}catch(InterruptedException ex){
						Thread.currentThread().interrupt();
					}
				}
				if (AddressBook.searchByLastName(searchedLastName) != null){

				}
			}

			// Prompts the user for a First Name, Last Name and Phone Number
			// It then creates a new contact and stores it in listMap
			// This new contact is then added to the AddressBook.txt (Not Yet Implemented)
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

			// If the user types 5 we run the remove contact method.
			// The user is prompted for their phone number. 
			// If they don't have it they can return to the main menu and then check through the command "Main Menu"
			if (mainChoice .equals("5")){
				String secondaryChoice5;

				System.out.println("Please enter the phone number of the person you wish to remove (If you don't know their number type \"Main Menu\" to go back to main menu then search):");
				secondaryChoice5 = choiceScanner.nextLine();

				// Returns the user to the main menu
				if (secondaryChoice5 .equals("Main Menu")){
					System.out.println("Returning to main menu...");
					try {
						Thread.sleep(2000);
					}catch(InterruptedException ex){
						Thread.currentThread().interrupt();
					}
				}
				// If we don't receive a value from searchByPhoneNumber than we know that contact doesn't exist
				// It then returns the user to the main menu.
				if (AddressBook.searchByPhoneNumber(secondaryChoice5) == null){
					System.out.println("No one with that number exists.");
					try {
						Thread.sleep(2000);
					}catch(InterruptedException ex){
						Thread.currentThread().interrupt();
					}
					System.out.println("Returning to main menu...");
					try {
						Thread.sleep(2000);
					}catch(InterruptedException ex){
						Thread.currentThread().interrupt();
					}
				}
				//If we don't receive null than we know that the contact exists
				//The program then removes the contact and notifies the user
				//The program then saves to the AddressBook (Not Implemented Yet)
				//They are then redirected to the main menu
				if (AddressBook.searchByPhoneNumber(secondaryChoice5) != null){
					AddressBook.removeContact(AddressBook.listMap.get(secondaryChoice5));
					System.out.println("Contact was successfully removed.");
					try{
						Thread.sleep(2000);
					}catch(InterruptedException ex){
						Thread.currentThread().interrupt();
					}
					System.out.println("Saving...");
					try{
						Thread.sleep(3000);
					}catch(InterruptedException ex){
						Thread.currentThread().interrupt();
					}
					System.out.println("Returning to main menu...");
					try {
						Thread.sleep(2000);
					}catch(InterruptedException ex){
						Thread.currentThread().interrupt();
					}
				}

			}
			// Displays all contacts that are currently stored in listMap (The Address Book)
			if (mainChoice .equals("6")){
				AddressBook.displayAllContacts();
				try {
					Thread.sleep(2000);
				}catch(InterruptedException ex){
					Thread.currentThread().interrupt();
				}
				System.out.println("Returning to main menu...");
				try {
					Thread.sleep(2000);
				}catch(InterruptedException ex){
					Thread.currentThread().interrupt();
				}

			}

			// Exits the Program (No saving needed since it is done after each step)
			if (mainChoice .equals("7")){
				System.out.println("Good bye!!");
				System.exit(0);
			}
		}
	}
}
