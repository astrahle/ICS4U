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

	// Searches for contact
	// Thought it worked until i realized it wouldn't return a proper key. Need to mimic searchByFirstName
	public Contact searchByPhoneNumber(String phone){
		for (String key : listMap.keySet()){
			if (listMap.get(key).getPhoneNumber().equals(phone)){
				listMap.get(key).showContact();
				return listMap.get(phone);
			}
		}
		return null;
	}

	// Returns the contacts information if searched by first name
	// Will return Null if no contact exists
	// Problem: Never finds the right person *Resolved* Forgot to add .getFirstName()
	public Contact searchByFirstName(String firstName){
		for (String key : listMap.keySet()){
			if (listMap.get(key).getFirstName().equals(firstName)){
				listMap.get(key).showContact();
				return listMap.get(key);
			}
		}
		return null;
	}



	// Returns the contacts information if searched by last name
	// Will return Null if no contact exists
	// Problem: Same as with searchByFirstName() *Resolved* Forgot to add .getLastName()
	public Contact searchByLastName(String lastName){
		for (String key : listMap.keySet()){
			if (listMap.get(key).getLastName().equals(lastName)){
				listMap.get(key).showContact();
				return listMap.get(key);
			}
		}
		return null;


	}

	// Removes the contact at the given key
	// Problem: It can't find the key *Resolved* Have to use for each loop to find a key that matches toRemove
	public void removeContact (Contact toRemove){
		String removeKey = null;
		for  (String key : listMap.keySet()){  //.keySet() is literally the most useful thing ever

			if (listMap.containsKey(toRemove.getPhoneNumber())){
				removeKey = key;
			}
		}
		listMap.remove(removeKey);
		System.out.println("The contact was succesfully removed!");
	}





	// i think this works... famous last words
	// Update: Yes it really does work... I checked... Multiple Times...
	public void displayAllContacts(){
		for (String key : listMap.keySet()){
			System.out.println(key + " " + listMap.get(key).getFirstName() + " " + listMap.get(key).getLastName());
		}
	}

	public Map<String, Contact> getMap(){
		return listMap;
	}
	
	public boolean validKey(String toCheck){
		for (String key : listMap.keySet()){
			if (listMap.containsKey(toCheck)){
				return true;
			}
		}
		return false;
	}


}




