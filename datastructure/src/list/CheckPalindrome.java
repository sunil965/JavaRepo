package list;

import java.util.*;
import java.util.Scanner;

public class CheckPalindrome {

public static void main(String[] args) {
		
		Deque list = new LinkedList();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter any string.");
		String userInput = scan.next();
		
		for(int i=userInput.length(); i>=0; i--)
		{			
			list.add(userInput.charAt(i));
			
		}
		 System.out.println(list);
		 System.out.println("");
		
		String reversrString = "";
		for(int j=-1; j<=list.size(); j++){
			reversrString += list.poll();
			
		}System.out.println(reversrString);
	}
}