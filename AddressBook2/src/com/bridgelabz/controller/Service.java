package com.bridgelabz.controller;

public interface Service {

void addPerson(String bookname);
	
	void delete(String bookname);
	
	void printList(String bookname);
	
	void edit(String bookname);
	
	void sortByLastName(String bookname);
	
	void sortByLastZIP(String bookname);

	void printListSeperately();
}