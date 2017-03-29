import java.util.Scanner;

public class PowerofTwo
{
 public static void main(String[] args)
{
 Scanner sc = new Scanner(System.in);
 int k = 0;
 int i=0;
 int value = 1;
 System.out.println("Insert power of 2 " );
 int nth = sc.nextInt();

 if((nth >= 0) && (nth < 31))
   {
	while(i<=nth)
	{
	  System.out.println("2 ^ "+k+" = "+value);
	  value= value*2;
	  k++;
          i++;
	}
   }
 else
   {  System.out.println("nth value is invalid !!");}
}

}
