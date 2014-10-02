package com.bayviewglen.PracticeAssignment;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

public class AddressBookDriver {

	public static void main(String[] args) throws IOException {
		boolean done = false;
		
		Contacts contact = new Contacts();
		
		while (!done){
			
			Scanner scanner = new Scanner(System.in);
			
			int choice = 0;
			
			System.out.println("Welcome to the Address Book Program");
			System.out.println("-----------------------------------");
			System.out.println("What would you like to do? (Enter numerical value)");
			System.out.println("1) Add Contact");
			System.out.println("2) Delete Contact");
			System.out.println("3) Show Contact");
			System.out.println("4) Display All Contacts");
			System.out.println("5) Exit");
			choice = scanner.nextInt();
			
			if (choice == 1){
				String tempFirst = null;
				
				System.out.println(" ");
				System.out.println("Please enter their first name: ");
				tempFirst = scanner.nextLine();
				
				contact.setFirstName(tempFirst);  
			}
			
			if (choice == 2){
				String nameOrPhone;
				
				System.out.println(" ");
				System.out.println("Please enter their name or phone number");
				nameOrPhone = scanner.nextLine();
				
				//AddressBook.removeContact(); 
			}
			
			if (choice == 3){
				String contactToDispaly;
				
				System.out.println(" ");
				System.out.println("Who would you like to display?");
				
				//for (int x = 0; x < list.size(); x++){
				//	if (list.get(x).equals(contact)){
				//		showContact(x);
				//	}
				
				}
			
			if (choice == 4){
			//	for (int x = 0; x < list.size; x++){
			//		displayContact(x);
			//		System.out.println(" ");
			//	}
				
			}
			
			if (choice == 5){
				FileWriter writer = new FileWriter("AddressBooks/Address Book One.txt");
				//for (int x = 0; x < list.size(); x++){
					
				}
			}
			
			
			
			
			
			
			
			
			
			
			}
		}
	//}

