package com.bridgelabz.controller;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.bridgelabz.model.Person;

public class AddressBook implements Service{
	Person person;
	Scanner scan = new Scanner(System.in);
	
	List<Person> list = new LinkedList<Person>();
	Map<String, List> hashObj = new HashMap<String, List>();
	
	public  void addPerson() {
		person = new Person();
		System.out.println("Enter First Name");
    	String fname = scan.next();
		person.setFirstName(fname);
		System.out.println("Enter Last Name");
		String lname = scan.next();
		person.setLastName(lname);
		System.out.println("Enter Address");
		String address = scan.next();
		person.setAddress(address);
		System.out.println("Enter City");
		String city = scan.next();
		person.setCity(city);
		System.out.println("Enter State");
		String state = scan.next();
		person.setState(state);
		System.out.println("Enter ZIP");
		String zip = scan.next();
		person.setZip(zip);
		System.out.println("Enter Phone No");
		String phone = scan.next();
		person.setPhone(phone);
		
		list.add(person);
		hashObj.put("friends", list);
	}

	public void delete() {
		System.out.println("Select the Address Book");
		String key = scan.next();
		if(hashObj.containsKey(key))
		{
			System.out.println("Enter the Person Firstname.");
			String firstname = scan.next();
			for(int i=0; i<list.size(); i++)
			{
				if(list.contains(person.getFirstName()==firstname)){
					list.remove(person);
				}
				else{
					System.out.println("No Person with "+firstname+" Name");
				}
			}
		}
	}

	@Override
	public void printList() {
		System.out.println(list);
	}

}
