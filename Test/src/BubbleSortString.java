import java.util.Scanner;


public class BubbleSortString {
  public static void main(String[] args)
  {
	  BubbleSortString bsstr = new BubbleSortString();
	  Scanner sc = new Scanner(System.in);
		
		System.out.println("No of string ?");
		int number = sc.nextInt();
		
		String[] arr = new String[number];
		System.out.println("Enter Strings ");
		for(int k=0; k<arr.length; k++)
		{
			arr[k]=sc.next();
		}
		int n = arr.length;
		
		System.out.println("Array before  sorting...");
		for(String a:arr){
			System.out.print(a+" ");
		}
		bsstr.sort(arr);
		System.out.println("\n Array after sorting...");
		for(String a:arr){
			System.out.print(a+" ");
		}
  }
  
  
  public void sort(String arr[])
	{
	  for(int i=0;i<arr.length;i++)
			{
				
				for(int j=i+1;j<arr.length-1;j++)
					{
					if(arr[i].compareTo(arr[j])>0)
					{
						String temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
					}
			}
			for(int i=0;i<arr.length;i++)
			{
				System.out.println(arr[i]);
			}
	}
}
