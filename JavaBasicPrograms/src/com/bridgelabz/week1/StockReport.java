package com.bridgelabz.week1;

import java.util.*;

public class StockReport
{
 //double price1 = 0;
 public static void main(String[] args)
{
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter Number Of Companies");  
  int coNumber = sc.nextInt();
  int count = 0,count2=0;
  double sumAll = 0;
  List l = new ArrayList(); 

  while(count<coNumber)
    {
      System.out.println("Enter Stock Name");
	  String stockName = sc.next();
	  System.out.println("Enter Number of Share");
	  int shareQuantity = sc.nextInt();
	  System.out.println("Enter Share Price");
	  double sharePrice = sc.nextDouble();
          double price1 = shareValue(shareQuantity, sharePrice); 
          sumAll += price1;
            
	  l.add(stockName);
	  l.add(shareQuantity);
	  l.add(sharePrice);
	  l.add(price1);      
          count++;
   }

          System.out.print("Stock Name.  Number of shares.  Share Price.  Share Total Value");
	  System.out.println();

          //for(int i=0; i<l.size(); i++){
	     //System.out.print(l.get(i).toString());
          //}

	  Iterator itr = l.iterator();      
	  while(itr.hasNext())
              {
	 	 Object element = itr.next();
                 count2++;
		 if(count2==5)
		 System.out.println();
	 	 System.out.print(element +"\t\t");		
	      }

         System.out.println();
         System.out.println("Total Price of all shares is : "+sumAll);
  }

  public static double shareValue(int shareQuantity, double sharePrice)
   {
      double stockValue = shareQuantity* sharePrice;
      return stockValue;
    }

 
}
