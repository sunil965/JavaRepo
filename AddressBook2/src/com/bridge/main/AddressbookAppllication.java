package com.bridge.main;

import java.util.Scanner;

import com.bridgelabz.controller.AddressController;

public class AddressbookAppllication {
	public static void main(String[] args) {
		AddressController controller = new AddressController();
		Scanner scan = new Scanner(System.in);

		System.out.println("-----Address Book-----");

		char ch;
		do {
			System.out.println("\nEnter Address Book Name\n");
			String bookname = scan.next();
			System.out.println("\nWhich Operations you want ?\n");
			System.out.println("1. Add a person");
			System.out.println("2. Delete a person");
			System.out.println("3. Display a Address Book.");
			System.out.println("4. Edit in Address Book.");
			System.out.println("5. Sort Address Book by last name.");
			System.out.println("6. Sort Address Book by ZIP.");
			System.out.println("7. Display Address Book Seperately.");
			// System.out.println("Enter Address Book Name");

			int choice = scan.nextInt();
			switch (choice) {
			case 1:
				controller.addToBook(bookname);
				break;
			case 2:
				controller.deleteFromBook(bookname);
				break;
			case 3:
				controller.displayAddressBook(bookname);
				break;
			case 4:
				controller.editAddressBook(bookname);
				break;
			case 5:
				controller.sortByLastNameBook(bookname);
				break;
			case 6:
				controller.sortByZIP(bookname);
				break;
			case 7:
				controller.printListSeperately();
				break;

			default:
				System.out.println("Wrong Entry \n ");
				break;
			}
			System.out.println("\nDo you want to continue (Type y or n) \n");
			ch = scan.next().charAt(0);
		} while (ch == 'Y' || ch == 'y');
	}

}