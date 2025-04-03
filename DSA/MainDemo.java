package com.contactlist;

import java.util.Scanner;

public class MainDemo {

	public static void main(String[] args) {
		ContactList contactList = new ContactList();
		Scanner scanner = new Scanner(System.in);
		int choice;
		
		do {
			System.out.println("\n--- Contact List Menu ---");
			System.out.println("1. Add Contact");
			System.out.println("2. Remove Contact");
			System.out.println("3. Search Contact");
			System.out.println("4. Display Contact");
			System.out.println("5. Exit");
			System.out.println("Enter your choice: ");
			
			choice = scanner.nextInt();
			scanner.nextLine();

			switch (choice) {
			
			case 1:
				System.out.print("Enter Name: ");
				String name = scanner.nextLine();
				System.out.print("Enter Phone: ");
                String phone = scanner.nextLine();
                contactList.addContact(name, phone);
                break;
                
			case 2:
                System.out.print("Enter Name to remove: ");
                String removeName = scanner.nextLine();
                contactList.removeContact(removeName);
                break;
            
			case 3:
                System.out.print("Enter Name to search: ");
                String searchName = scanner.nextLine();
                contactList.searchContact(searchName);
                break;
            
			case 4:
                contactList.displayContacts();
                break;
            
			case 5:
                System.out.println("Exiting program.");
                break;
            
			default:
                System.out.println("Invalid choice! Please enter again.");
        }
    } while (choice != 5);
    
    scanner.close();
   }
}