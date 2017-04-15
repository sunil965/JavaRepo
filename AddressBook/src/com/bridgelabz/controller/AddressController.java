package com.bridgelabz.controller;

import java.io.File;
import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Scanner;

public class AddressController {
    
	Service addressBook = new AddressBook();

	public void addToBook(){
		addressBook.addPerson();
	}
	
	public void deleteFromBook(){
		addressBook.delete();
	}
	
	public void displayAddressBook( ){
		addressBook.printList();
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


}