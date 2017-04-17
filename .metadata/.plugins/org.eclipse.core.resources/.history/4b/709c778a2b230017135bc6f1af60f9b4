import java.util.Random;
import java.util.Scanner;

public class CountCoupon
{
 public static void main(String[] args)
{
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter no of coupon");
 int n = sc.nextInt();
 int arr[] = new int[n];
 int count = 0; 
  for(int i=0; i<n; i++)
  {
    Random ran = new Random();
    int ranNum = ran.nextInt(25);
    arr[i]= ranNum;
    count++;
   for(int j=0; j<i; j++)
	{
	  if(arr[j]==ranNum)
	      {i--;}
	}
  
  }//end of for.

 for(int a:arr)
   System.out.println(a);

  System.out.println("Random number's count : "+count);
}//end of main.
}
