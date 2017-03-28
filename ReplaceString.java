import java.util.Scanner;
public class ReplaceString
{
	public static void main(String[] args)
     {
	Scanner sc = new Scanner(System.in);
	String initial = "Hello <<UserName>>, How are you ?";
	System.out.println("Enter your name ");
	String name = sc.next();
	if(name.length() > 3)
	{
	 String replace = initial.replace("<<UserName>>", name);
	 System.out.println("After string replacement");
	 System.out.println(replace);	
	}
	else
	  System.out.println("String length should be garter than 3");
     }
} 

