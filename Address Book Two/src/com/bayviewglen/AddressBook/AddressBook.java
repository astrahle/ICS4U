package com.bayviewglen.AddressBook;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


public class AddressBook {

	Map<String, Contact> listMap = new HashMap<String, Contact>();

	// method to add a contact to the list (done)
	public void addContact(String lastName, String firstName, String phone){
		listMap.put(phone, new Contact(lastName, firstName, phone));

	}

	// done
	public Contact searchByPhoneNumber(String phone){
		if (listMap.containsKey(phone)){
			System.out.println(listMap.get(phone));
			return listMap.get(phone);
		}
		else 
			return null;
	}

	// Returns the key of the places where it found a similar object
	// Need to find way to return the key of the person searched.
	public Contact searchByFirstName(String firstName){
		if (listMap.containsValue(firstName)){  
			List <String> keys = new ArrayList<String>();
			for (String key : listMap.keySet()){
				if (listMap.get(key).equals(firstName)){
					keys.add(key);
				}
			}
			System.out.println("People with the first name " + firstName + " are...");
			System.out.println(keys);
			return listMap.get(firstName); //this is where the fix needs to be
		}
		else{
			return null;
		}

	}

	// Returns the key of the place where it found a similar object
	// Need to find way to return the key of the person searched.
	public Contact searchByLastName(String lastName){
		if (listMap.containsValue(lastName)){  
			return listMap.get(lastName); //this is where the fix needs to be
		}
		else{
			return null;
		}

	}

	// Removes the contact at the given key
	public void removeContact (Contact toRemove){
		if (listMap.containsKey(toRemove)){
			listMap.remove(toRemove);
		}
		else{
			System.out.println("Sorry we could not delete " + toRemove + " because they dont exist.");
		}

	}
	
	

	// i think this works... famous last words
	public void displayAllContacts(){
		for (String key : listMap.keySet()){
			System.out.println(key + listMap.get(key));
		}
	}
	
	public Map<String, Contact> getMap(){
		return listMap;
	}


}




