package com.contactlist;

public class ContactList {
  private Contact head;
  
  // Adding the contacts :-----------------
  public void addContact(String name, String phone) {
	  Contact newContact = new Contact(name, phone);
	  if(head == null) {
		  head = newContact;
	  }else {
		  Contact temp = head;
		  while (temp.next != null) {
			  temp = temp.next;
		  }
		  temp.next = newContact;
	  }
	  System.out.println("Contact added: "  +name+",  "+ phone);
  }
  
  // Remove contact by name :-----------------
  
  public void removeContact(String name) {
	  if(head == null) {
		  System.out.println("Contact list is empty. ");
		  return;
	  }
	  if(head.name.equals(name)) {
		  head = head.next;
		  System.out.println("Contact removed: "+name);
		  return;
	  }
	  Contact temp = head;
	  while(temp.next != null && !temp.next.name.equals(name)) {
		  temp = temp.next;
	  }
	  if(temp.next == null) {
	  System.out.println("Contact not found. ");
  }else {
	  temp.next = temp.next.next;
	  System.out.println("Contact removed: "+name);
  }
  
}
  
  //  Search contact by name :--------------------------------------
  
  public void searchContact(String name) {
	  Contact temp = head;
	  while(temp != null) {
		  if(temp.name.equals(name)) {
			  System.out.println("Contact found: "+ temp.name +", "+temp.phone);
			  return;
		  }
		  temp = temp.next;
	  }
	  System.out.println("Contact  not found.");
  }
  
  // Display all contacts :----------------------------
  
  public void displayContacts() {
	  if(head == null) {
		  System.out.println("No contacts available.");
		  return;
	  }
	  Contact temp = head;
	  System.out.println("Contact list:");
	  while(temp != null) {
		  System.out.println(temp.name+", "+temp.phone);
		  temp = temp.next;
	  }
    } 
  }