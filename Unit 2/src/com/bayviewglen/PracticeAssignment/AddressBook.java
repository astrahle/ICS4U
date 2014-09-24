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
	
	
		private static ArrayList<Contacts> list = new ArrayList<Contacts>();
		static Scanner scanner = new Scanner(System.in);
		static boolean done = true;

		
			
		public static void main() throws Exception{

			
	
			int choice;

			System.out.println("Welcome to the Address Book editing software.");
			System.out.println("What would you like to do? (Enter Number)");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("1) Add Contact");
			System.out.println("2) Remove Contact");
			System.out.println("3) Search For Contact");
			System.out.println("4) Display All Contacts");
			System.out.println("5) Exit");
			choice = scanner.nextInt();

			if (choice == 1){
				Contacts contact = new Contacts();
				addContact(contact);
			}

			if (choice ==2){
				int indexForRemove;

				System.out.println("Who would you like to remove?");
				//Contacts c = scanner.next();  *Can't get this to work.*

				//indexForRemove = searchContact(c);
			}

			if (choice == 3){
				String toSearch;
				System.out.println("Who would you like to search for?");
				toSearch = scanner.nextLine();

				for (int x=0; x<list.size(); x++){
					if (toSearch.equals(list.get(x))){
						System.out.println(list.get(x));
					}
					else 
						System.out.println("The desired person does not exist");
				}
			}
			
			if (choice == 4){
				System.out.println("-----------------------");
				for (int x=0; x<list.size(); x++){
					System.out.println("|" + list.get(x));
					System.out.println("-----------------------");
				}
			}
			
			if (choice == 5){
				System.exit(0);
			}

		}

		// void is a place holder until i set the return.
		public static void addContact(Contacts c) throws Exception{
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

			list.add(c);

			editFile();




			// REMOVE!!! It is just used for quick testing
			//System.out.println(getFirstName());
			//System.out.println(getLastName());
			//System.out.println(getPhoneNumber());

		}

		public static void editFile() throws Exception{
			FileWriter writer = new FileWriter("Address Books/Address Book One.txt");

			final int INFORMATION = 3; //amount of info (First Name, Last Name, Phone)
			for(int x = 0; x <= INFORMATION; x++){
				writer.write(list.toString());
			}
		}

		public void removeContact(Contacts c){
			list.remove(c);
		}

		public static int searchContact(Contacts c){
			for (int x = 0; x < list.size(); x++){
				if(list.get(x).equals(c)){
					return x;
				}
			}
			return -1;
		}
		}


