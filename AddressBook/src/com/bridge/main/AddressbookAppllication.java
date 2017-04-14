package com.bridge.main;

import java.util.Scanner;

import com.bridgelabz.controller.AddressController;

public class AddressbookAppllication 
	{
		public static void main(String[] args) {
			AddressController book = new AddressController();
			Scanner scan = new Scanner(System.in);
			
			char ch;
			do
			{   System.out.println("-----Address Book-----");
				System.out.println("\nWhich Operations you want ?\n");
			    System.out.println("1. Add a person");
			    System.out.println("2. Delete a person");
			    System.out.println("3. Display a Address Book.");
			    int choice = scan.nextInt();
			    
			    switch (choice)
			    {
			    case 1 :  book.addToBook();
					  		break;
					  		
			    case 2 :  book.deleteFromBook();
					  		break;
					  		
			    case 3 :  book.displayAddressbook();
			    		    break;

			    default : 
			        System.out.println("Wrong Entry \n ");
			        break;   
			    }
			    System.out.println("\nDo you want to continue (Type y or n) \n");
			    ch = scan.next().charAt(0);                        
			 } while(ch == 'Y'|| ch == 'y'); 
	}

}
