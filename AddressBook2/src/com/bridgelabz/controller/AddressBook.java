package com.bridgelabz.controller;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.bridgelabz.model.Person;

public class AddressBook implements Service {

	Person person;
	Scanner scan = new Scanner(System.in);
	String bookname = "";
	List<Person> list = new LinkedList<Person>();
	@SuppressWarnings("rawtypes")
	Map<String, List> hashObj = new HashMap<String, List>();

	
	// TO ADD A PERSON DETAIL.	
	
	@SuppressWarnings("unchecked")
	public void addPerson() {
		person = new Person();
		System.out.println("\nEnter Address Book Name\n");
	    bookname = scan.next();
		
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
		// list.add(person);
		if (hashObj.get(bookname) == null) {
			hashObj.put(bookname, new LinkedList<Person>());
			hashObj.get(bookname).add(person);
			serialize();
		}
		else
			hashObj.get(bookname).add(person);
		    serialize();
	}

	
	// TO DELETE A PERSON DETAIL.
	
	@SuppressWarnings("unchecked")
	public void delete() {
		System.out.println("\nEnter Address Book Name\n");
	    bookname = scan.next();
	    deSerialize();					// TO GET hashObj FROM FILE.
		list = hashObj.get(bookname);
		System.out.println("Enter Mobile No. of Person to be Deleted.");
		String phone = scan.next();
		for (int i = 0; i < list.size(); i++) {
			if (phone.equals(list.get(i).getPhone())) {
				list.remove(hashObj.get(bookname).get(i));
				serialize();
				System.out.println(".....DELETED......");
				return;
			} else
				System.out.println("This person is not found");
		}

	}

	
	// TO SEARCH A PARTICULAR PERSON DETAIL.
	@SuppressWarnings("unchecked")
	@Override
	public void searchPerson() {
		
		System.out.println("\nEnter Address Book Name\n");
	    bookname = scan.next();
		list = hashObj.get(bookname);
		System.out.println("Enter Mobile No. of Person to be Searched.");
		String phone = scan.next();
		System.out.println("\nFirstname \tLastname \tAddress \tCity \t\tState \t\tZIP \t\tPhone \n");
		for (int i = 0; i < list.size(); i++) {
			if (phone.equals(list.get(i).getPhone())) {
				System.out.println(hashObj.get(bookname).get(i));
				return;
			} else
				System.out.println("This person is not found");
		}

/*		  // To Display Every Details Of HASHMAP
			for (Entry<String, List> entry : hashObj.entrySet()) {
			String key = entry.getKey();
			List<Person> value = entry.getValue();
			System.out.println("Details of : "+key);
			System.out.println("\nFirstname \tLastname \tAddress \tCity \t\tState \t\tZIP \t\tPhone \n");
			if(search.equals(entry)){
				System.out.println(value);
			}
			for (Person aString : value) {
					System.out.println(aString);
			}
		}*/
	}

	
	// TO DISPLAY A PARTICULAR ADDRESSS BOOK DETAIL.
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void printListSeperately() {

		System.out.println("Select Address Book");
		String addressBookName = scan.next();
		deSerialize();
		
		List<Person> displaying = hashObj.get(addressBookName);
		System.out
		.println("Firstname \tLastname \tAddress \tCity \t\tState \t\tZIP \t\tPhone \n");
		for(int i=0; i<displaying.size();i++){
			System.out.println(displaying.get(i));
		}
		
		// THIS BELOW CODE WAS USED WITHOUT DESERIALIZATION
		
		/*for (Entry<String, List> entry : hashObj.entrySet()) {
			String key = entry.getKey();
			if (addressBookName.equals(key)) {
				List<Person> value = entry.getValue();
				System.out.println(key);
				System.out
						.println("Firstname \tLastname \tAddress \tCity \t\tState \t\tZIP \t\tPhone \n");
				for (Person aString : value) {
					System.out.println(aString);
				}
			}
		}*/
	}

	
	// TO MODIFY A PARTICULAR PERSON DETAIL.
	@SuppressWarnings("unchecked")
	@Override
	public void edit() {
		System.out.println("\nEnter Address Book Name\n");
	    bookname = scan.next();
		list = hashObj.get(bookname);
		System.out.println("Enter Mobile No. of Person to be Edited.");
		String phone = scan.next();
		for (int i = 0; i < list.size(); i++) {
			if (phone.equals(list.get(i).getPhone())) {
				String firstname = list.get(i).getFirstName();
				String lastname = list.get(i).getLastName();
				System.out.println("\n" + firstname.toUpperCase() + " "
						+ lastname.toUpperCase() + " Details\n");
				System.out.println("Address : " + list.get(i).getAddress()
						+ " City :" + list.get(i).getCity() + " State:"
						+ list.get(i).getState() + " ZIP:"
						+ list.get(i).getZip() + " Phone:"
						+ list.get(i).getPhone());
				char ch;
				do {
					System.out.println("Select The Field to Edit.");
					System.out.println("1. Address");
					System.out.println("2. City");
					System.out.println("3. State");
					System.out.println("4. ZIP");
					System.out.println("5. Phone");
					int choice = scan.nextInt();
					switch (choice) {
					case 1:
						System.out.println("Enter New Address");
						String newAddress = scan.next();
						list.get(i).setAddress(newAddress);
						System.out.println("Address Updated");
						serialize();
						break;
					case 2:
						System.out.println("Enter New City");
						String newCity = scan.next();
						list.get(i).setCity(newCity);
						System.out.println("City Updated");
						serialize();
						break;
					case 3:
						System.out.println("Enter New State");
						String newState = scan.next();
						list.get(i).setState(newState);
						System.out.println("State Updated");
						serialize();
						break;
					case 4:
						System.out.println("Enter New ZIP");
						String newZIP = scan.next();
						list.get(i).setZip(newZIP);
						System.out.println("ZIP Updated");
						serialize();
						break;
					case 5:
						System.out.println("Enter New Phone Number");
						String newPhone = scan.next();
						list.get(i).setPhone(newPhone);
						System.out.println("Phone Number Updated");
						serialize();
						break;
					default:
						System.out.println("Wrong Entry \n ");
						break;

					}
					System.out
							.println("\nDo you want to edit more (Type y or n) \n");
					ch = scan.next().charAt(0);
				} while (ch == 'Y' || ch == 'y');
			} else
				System.out.println("Given Phone Number Does Not Exist.");
		}

	}

	
	// TO SORT ADDRESSBOOK BY LAST NAME.
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public void sortByLastName() {
		System.out.println("\nEnter Address Book Name\n");
	    bookname = scan.next();
		list = hashObj.get(bookname);
		ArrayList arrayList = new ArrayList();
		for (int i = 0; i < list.size(); i++) {
			arrayList.add(list.get(i).getLastName());
		}
		Collections.sort(arrayList);
		for (int i = 0; i < list.size(); i++) {
			for (int j = 0; j < list.size(); j++) {
				if (arrayList.get(i).equals(list.get(j).getLastName())) {
					System.out.println(list.get(j));
				}
			}
		}
	}

	
	// TO SORT ADDRESSBOOK BY ZIP.
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public void sortByLastZIP() {
		System.out.println("\nEnter Address Book Name\n");
	    bookname = scan.next();
		list = hashObj.get(bookname);
		LinkedList listtwo = new LinkedList();
		for (int i = 0; i < list.size(); i++) {
			listtwo.add(list.get(i).getZip());
		}
		Collections.sort(listtwo);
		for (int i = 0; i < list.size(); i++) {
			for (int j = 0; j < listtwo.size(); j++) {
				if (listtwo.get(i).equals(list.get(j).getZip())) {
					System.out.println(list.get(j));
				}
			}
		}

	}
	public void serialize(){
		try {
			FileOutputStream fileWriter = new FileOutputStream("/home/bridgeit/JavaRepo/s.ser");
			ObjectOutputStream objectStreamWriter = new ObjectOutputStream(fileWriter);
			objectStreamWriter.writeObject(hashObj);
			objectStreamWriter.flush();
			objectStreamWriter.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void deSerialize(){
		try {
			FileInputStream fileReader = new FileInputStream("/home/bridgeit/JavaRepo/s.ser");
			ObjectInputStream objectStreamReader = new ObjectInputStream(fileReader);
			hashObj = (Map<String, List>) objectStreamReader.readObject();
			objectStreamReader.close();
			fileReader.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	@Override
	public void getAddressBooks() {
		deSerialize();
		for (Map.Entry<String, List> entry : hashObj.entrySet()) {
			String key = entry.getKey();
			/*if (addressBookName.equals(key)) {
				List<Person> value = entry.getValue();*/
				System.out.println(key);
				/*System.out
						.println("Firstname \tLastname \tAddress \tCity \t\tState \t\tZIP \t\tPhone \n");
				for (Person aString : value) {
					System.out.println(aString);
				}
			}*/
		}
	}

}