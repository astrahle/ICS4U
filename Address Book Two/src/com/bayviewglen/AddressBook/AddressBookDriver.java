package com.bayviewglen.AddressBook;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AddressBookDriver {

	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException{

		AddressBook AddressBook = new AddressBook();

		boolean done = false;
		boolean validAddressBook = false;
		boolean goingToMain = false;

		String addressBookChoice;
		String addressBookChosen = null;

		Scanner fileChoiceScanner = new Scanner (System.in);

		System.out.println("Welcome to the address book program.");
		System.out.println("Which Address Book would you like to access? (Please enter the number)");
		System.out.println("1) Trumpet Address Book");
		System.out.println("2) Flute Address Book");
		System.out.println("3) Violin Address Book");
		System.out.println("4) Choir Address Book");
		System.out.println("5) Trombone Address Book");
		System.out.println("6) Guitar Address Book");

		addressBookChoice = fileChoiceScanner.nextLine();


		while(!validAddressBook){
			try{
				if (addressBookChoice .equals("1") || addressBookChoice .equals("2") || addressBookChoice .equals("3") || addressBookChoice .equals("4") || addressBookChoice .equals("5") || addressBookChoice .equals("6") ){
					validAddressBook = true;
				}else
					throw new Exception();

			}catch(Exception e){
				System.out.println("Sorry that is not a valid address book.");
				validAddressBook = false;
				addressBookChoice = fileChoiceScanner.nextLine();
			}
		}

		if (addressBookChoice .equals("1")){
			addressBookChosen = "traddressbook.txt";
			Scanner fileScanner = new Scanner("inputs/traddressbook.txt");
			System.out.println("Trumpet Address Book Selected.");
		}

		if (addressBookChoice .equals("2")){
			addressBookChosen = "fladdressbook.txt";
			Scanner fileScanner = new Scanner("inputs/fladdressbook.txt");
			System.out.println("Flute Address Book Selected.");
		}

		if (addressBookChoice .equals("3")){
			addressBookChosen = "viaddressbook.txt";
			Scanner fileScanner = new Scanner("inputs/viaddressbook.txt");
			System.out.println("Violin Address Book Selected.");
		}

		if (addressBookChoice .equals("4")){
			addressBookChosen = "chaddressbook.txt";
			Scanner fileScanner = new Scanner("inputs/chaddressbook.txt");
			System.out.println("Choir Address Book Selected.");
		}

		if (addressBookChoice .equals("5")){
			addressBookChosen = "troaddressbook.txt";
			Scanner fileScanner = new Scanner("inputs/troaddressbook.txt");
			System.out.println("Trombone Address Book Selected.");
		}

		if (addressBookChoice .equals("6")){
			addressBookChosen = "guaddressbook.txt";
			Scanner fileScanner = new Scanner("inputs/guaddressbook.txt");
			System.out.println("Guitar Address Book Selected.");
		}

		loadBooks(AddressBook, addressBookChosen);


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

			// Searching by phone number *Works*
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

				}
			}

			// Searching by First Name *Done*
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

			// Searches for a contact through the last name *Done*
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

			// Prompts the user for a First Name, Last Name and Phone Number *Done*
			// It then creates a new contact and stores it in listMap
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

			// Used to remove a certain contact *Done*
			// The user is prompted for their phone number and the contact with that number is removed 
			// If they don't have it they can return to the main menu and then check through the command "Main Menu"
			if (mainChoice .equals("5")){
				String secondaryChoice5;

				System.out.println("Please enter the phone number of the person you wish to remove (If you don't know their number type \"Main Menu\" to go back to main menu then search):");
				secondaryChoice5 = choiceScanner.nextLine();

				// Returns the user to the main menu
				if (secondaryChoice5 .equals("Main Menu")){
					goingToMain = true;
					System.out.println("Returning to main menu...");
					try {
						Thread.sleep(2000);
					}catch(InterruptedException ex){
						Thread.currentThread().interrupt();
					}

				}
				//Checks if we entered a valid contact *done*
				//The program then removes the contact and notifies the user
				//They are then redirected to the main menu
				boolean validContact = false;
				while (!validContact){
					try{
						if (AddressBook.validKey(secondaryChoice5)){
							validContact = true;
						}
						else
							throw new Exception();
					}
					catch(Exception ex){
						System.out.println("Sorry not a valid contact. Try again!");
						secondaryChoice5 = choiceScanner.nextLine();
					}
				}

				if (goingToMain != true){
					AddressBook.removeContact(AddressBook.searchByPhoneNumber(secondaryChoice5));
					System.out.println("Contact was successfully removed.");
					try{
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

			}
			// Displays all contacts that are currently stored in listMap (The Address Book) *Done*
			if (mainChoice .equals("6")){
				if (AddressBook.listMap.size() == 0){
					System.out.println("No contacts are saved in the file");
				}
				else{
					AddressBook.displayAllContacts();
				}
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

			// Exits the Program 
			if (mainChoice .equals("7")){
				System.out.println("Good bye!!");
				try{
					save(AddressBook, addressBookChosen);
				}catch (FileNotFoundException e){
					e.printStackTrace();
				}

				System.exit(0);
			}
		}

	}

	// Used to save all contacts to the given file.
	private static void save(AddressBook AddressBook, String addressBookChosen) throws FileNotFoundException{
		PrintWriter writer2 = new PrintWriter(addressBookChosen);
		for (String key : AddressBook.getMap().keySet()){
			writer2.println(AddressBook.getMap().get(key).getFirstName());
			writer2.println(AddressBook.getMap().get(key).getLastName());
			writer2.println(AddressBook.getMap().get(key).getPhoneNumber());
		}
	}

	// Not used yet cause im still trying to get the program to save
	private static String loadBooks(AddressBook AddressBook, String addressBookChosen){
		Scanner fileScanner = new Scanner(addressBookChosen);

		while(fileScanner.hasNext()){
			try{
				fileScanner.nextLine();
				String firstName = fileScanner.nextLine();
				String lastName = fileScanner.nextLine();
				String phoneNumber = fileScanner.nextLine();
				AddressBook.addContact(lastName, firstName, phoneNumber);
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		return addressBookChosen;



	}
}
