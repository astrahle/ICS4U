package com.bayviewglen.AddressBook;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


	public class AddressBook {

		static Map<String, Contact> listMap = new HashMap<String, Contact>();

		// method to add a contact to the list (done)
		public void addContact(String firstName, String lastName, String phone){
			listMap.put(firstName, new Contact(firstName, lastName, phone));
			
		}

		// done
		public Contact searchByName(String name){
			if (listMap.containsKey(name)){
				return listMap.get(name);
			}
			else 
				return null;
		}
				

		public void searchByNumber(String phoneNum){
			for (Contact c:list){
				if(c.getFirstName().equals(phoneNum)){
					c.showContact();
				}
			}
			System.out.println("Sorry no one wih the phone number: " + phoneNum + "exists.");
		}

		public static void removeContact (Contact toRemove){
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




