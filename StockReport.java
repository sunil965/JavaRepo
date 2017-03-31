import java.util.*;

public class StockReport
{
 //double price1 = 0;
 public static void main(String[] args)
{
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter Number Of Companies");  
  int coNumber = sc.nextInt();
  int count = 0;
  while(count<coNumber)
    {
          System.out.println("Enter Stock Name");
	  String stockName = sc.next();
	  System.out.println("Enter Number of Share");
	  int shareQuantity = sc.nextInt();
	  System.out.println("Enter Share Price");
	  double sharePrice = sc.nextDouble();
          double price1 = shareValue(shareQuantity, sharePrice); 
          
          List l = new ArrayList();   
	  l.add(stockName);
	  l.add(shareQuantity);
	  l.add(sharePrice);
	  l.add(price1);
      
	  System.out.print("Stock Name.  Number of shares.  Share Price.  Share Total Value");
	  System.out.println();

	      Iterator itr = l.iterator();      
	      while(itr.hasNext()) {
		 Object element = itr.next();
		 System.out.print(element + "\t\t");
	      }
              System.out.println();
    count++;
   }
 }

  public static double shareValue(int shareQuantity, double sharePrice)
   {
      double stockValue = shareQuantity* sharePrice;
      return stockValue;
    }

 
}
