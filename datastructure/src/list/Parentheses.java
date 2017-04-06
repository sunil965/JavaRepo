package list;

import java.util.Scanner;
import java.util.Stack;


public class Parentheses {
	 
	public static void main(String[] args)
	{
		Stack stk = new Stack();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter expression.");
		String expression = scan.next();
		int size = expression.length();
		
//		System.out.println("You entered : "+expression);
		
		for(int i=0; i<size;i++)
		{
			char ch = expression.charAt(i);
			if(ch == '(')
				stk.push(expression);
			else if(ch == ')')
				stk.pop();
		}
		if(stk.isEmpty())
			System.out.println("Expression is balanced");
		else
			System.out.println("Not balanced");
	}
	
	
	

}
