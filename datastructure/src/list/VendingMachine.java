package list;

import java.util.Scanner;

public class VendingMachine {

	int note1000;
	int note500;
	int note100;
	int note50;
	int note10;
	int note2;
	int note1;
	public static void main(String[] args) {
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
	    System.out.println("Minimum notes required "+numberOfNotes);
	}
	
	
	public void count1000(int money){
		note1000 = money/1000;
		money = money%1000;
		count500(money);
	}
	public void count500(int money){
		note500 = money/1000;
		money = money%1000;
		//count500(money);
	}

}
