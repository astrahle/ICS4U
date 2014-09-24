package com.bayviewglen.PracticeAssignment;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
	
		private static ArrayList<Contacts> list;
		

		// method to add a contact to the list
		public static void addContact(Contacts toAdd){
			list.add(toAdd);
		}

		public void searchByName(String name){
			for (Contacts c: list){
				if(c.getFirstName().equals(name) || c.getLastName().equals(name))
					c.showContact();
			}
			System.out.println("Sorry no one with the name: " + name + " exists.");
		}
		
		public void searchByNumber(String phoneNum){
			for (Contacts c:list){
				if(c.getFirstName().equals(phoneNum)){
					c.showContact();
				}
			}
			System.out.println("Sorry no one wih the phone number: " + phoneNum + "exists.");
		}
		
		public static void removeContact (Contacts toRemove){
			for (int x = 0; x < list.size(); x++){
				if (list.get(x).equals(toRemove)){
					list.remove(x);
					break;
				}
			}
			System.out.println("Sorry we could not delete that contact since they don't exist.");
		}
		
		public void displayAllContacts(){
			for (int x = 0; x < list.size(); x++){
				System.out.println((x+1)+ ",");
				list.get(x).showContact();
				System.out.println("--------------------------------");
			}
		}
		
		
		}


