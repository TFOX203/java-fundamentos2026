package oopmodeling.addressbook;

import java.util.Scanner;
/**
 * 
 *
 *@author Alexander Pulpon
 *28 nov 2025
 */

/*
 *The class used to interact with the users
 * 
 */

public class ContactApp {
	
	final static AddressBook addressBook = new AddressBook();
	final static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		byte option = 4;
		
		while(true) {
			showMenu();
			
			option = scanner.nextByte();
			System.out.println(option);
			
			
		
			
			if (option == 1) {
				addContact();
				
			}
			
			else if (option == 2) {
				showContact();
			}
			
			else if  (option == 3) {
				removeContact();
			} 
			else if(option == 4) {
				System.out.println("Exit from the App");
				break;
			}
			
		}
			
			
		}
		
		
		
	

	private static void removeContact() {
		System.out.println("/=== REMOVE CONTACT FROM YOUR ADDRES BOOK ===/");
		// 1 The user introduce the name of the contact that he wants to eliminate
		scanner.nextLine();
		System.out.println("=== PLEASE ENTER THE NAME ===");
		String name = scanner.nextLine();
		System.out.println(name);
		addressBook.removeContact(name);
		
		
		
	}

	private static void showContact() {
		addressBook.showContacts();
		
		
	}

	private static void addContact() {
		System.out.println("/=== ADD CONTACT TO YOUR ADDRES BOOK ===/");
		// 1 The user introduce the number,name and other information about the contact
		scanner.nextLine();
		System.out.println("=== PLEASE ENTER THE NAME ===");
		String name = scanner.nextLine();
		System.out.println(name);
		
		System.out.println("=== PLEASE ENTER THE PHONENUMBER ===");
		String phoneNumber = scanner.nextLine();
		System.out.println(phoneNumber);
		
		System.out.println("=== PLEASE ENTER THE EMAIL ===");
		String email = scanner.nextLine();
		System.out.println(email);
		// 2 Create an object of "Contact" encapsulating all the data passed in the firt step
		
		Contact contact = new Contact(name, phoneNumber, email);
		
		// 3 Add the new object to the contact list array
		addressBook.addContact(contact);
		System.out.println("The contact has been added successfuly");
	}

	private static void showMenu() {
		System.out.println("\n/====== MENU ======/");
		System.out.println("1 /ADD CONTACT/");
		System.out.println("2 /SHOW CONTACT");
		System.out.println("3 /REMOVE CONTACT/");
		System.out.println("4 /EXIT/");
		
	}

}


