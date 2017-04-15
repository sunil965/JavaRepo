package com.bridgelabz.controller;

public class AddressController {

	Service addressBook = new AddressBook();

	public void addToBook(String bookname){
		addressBook.addPerson(bookname);
	}
	
	public void deleteFromBook(String bookname){
		addressBook.delete(bookname);
	}
	
	public void displayAddressBook(String bookname){
		addressBook.printList(bookname);
	}
	
	public void editAddressBook(String bookname){
		addressBook.edit(bookname);
	}
	
	public void sortByLastNameBook(String bookname){
		addressBook.sortByLastName(bookname);
	}
	
	public void sortByZIP(String bookname){
		addressBook.sortByLastZIP(bookname);
	}
	
	public void printListSeperately() {
		addressBook.printListSeperately();
		
	}

}