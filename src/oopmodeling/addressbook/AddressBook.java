
package oopmodeling.addressbook;
/*
 * This class is in charge of administration of a group of contacts.
 */

import java.util.Iterator;
import java.util.Scanner;

import datastructure.FlexibleArray;
/*
 * This class is used to manage a list of contact object
 */

public class AddressBook {
	
	//Attributes
	//This is container for the list of contact objects
	protected FlexibleArray<Contact> contacts;
	
	public AddressBook() {
		contacts = new FlexibleArray<Contact>();		
	}
	protected Scanner scanner;
	
	
	//behaves
	public void showContacts() {
		for (int i = 0; i < contacts.size(); i++) {
			System.out.println(contacts.get(i).toString());
			
		}
		
		
	}
	public void addContact(Contact contact) {
		contacts.add(contact);
	}
	public boolean removeContact(String name) {
		//1. A loop to find the position of the contact
		//Contact[] eles = contacts.getAll();
		for (int i = 0; i < contacts.size(); i++) {
			if (contacts.get(i).getName().equals(name)) {
				contacts.remove(i);
				return true;
			}
		}
		//2 remove the contact by its position in the array
		
		contacts.remove(0);
		
		return false;
	}
	
	

}
