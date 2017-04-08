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
		
		for(int i=0; i<expression.length();i++)
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
