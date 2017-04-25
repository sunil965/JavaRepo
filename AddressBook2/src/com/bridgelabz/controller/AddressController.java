package com.bridgelabz.controller;

public class AddressController {

	Service addressBook = new AddressBook();

	public void addToBook(){
		addressBook.addPerson();
	}
	
	public void deleteFromBook(){
		addressBook.delete();
	}
	
	public void displayAddressBook(){
		addressBook.searchPerson();
	}
	
	public void editAddressBook(){
		addressBook.edit();
	}
	
	public void sortByLastNameBook(){
		addressBook.sortByLastName();
	}
	
	public void sortByZIP(){
		addressBook.sortByLastZIP();
	}
	
	public void printListSeperately() {
		addressBook.printListSeperately();
	}
	
	public void getAddressBooks(){
		addressBook.getAddressBooks();
	}
}