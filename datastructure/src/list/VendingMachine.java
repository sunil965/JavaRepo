package list;

import java.util.Scanner;

public class VendingMachine {

	static int note1000;
	static int note500;
	int note100;
	int note50;
	int note10;
	int note2;
	int note1;
	public static void main(String[] args)
	{
		VendingMachine vending = new VendingMachine();
		System.out.println("Enter the rupees to get number of notes");
		int rupees = new Scanner(System.in).nextInt();
		
		if(rupees>1000){
			vending.count1000(rupees);
		}
		else if(rupees>500){
			vending.count500(rupees);
		}
	    int numberOfNotes = vending.note1000+vending.note500;
	    System.out.println("Minimum notes required "+numberOfNotes+"\n");
	    
	    System.out.println("No. of notes of thousand : "+ note1000);
	    System.out.println("No. of notes of thousand : "+ note500);
	    
	}
	
	
	public void count1000(int rupees){
		note1000 = rupees/1000;
		rupees = rupees%1000;
		count500(rupees);
	}
	public void count500(int money){
		note500 = money/500;
		money = money%500;
		//count100(money);
	}

}
