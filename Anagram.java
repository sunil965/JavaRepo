import java.util.*;

public class Anagram
{
 public static void main(String[] args)
 {
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter first string");
  String str1 = sc.next();

  System.out.println("Enter second string");
  String str2 = sc.next();
  boolean flag = true;

  if(str1.length() != str2.length())
    { flag = false;}
  else
  {
   char[] stringChar1 = str1.toLowerCase().toCharArray();
   char[] stringChar2 = str2.toLowerCase().toCharArray();
     Arrays.sort(stringChar1);
     Arrays.sort(stringChar2);
     flag = (Arrays.equals(stringChar1, stringChar2));
  
  }  

  if(flag)
    System.out.println("Anagram !!");   
   else
    System.out.println("Not a Anagram"); 
 
 }
}
