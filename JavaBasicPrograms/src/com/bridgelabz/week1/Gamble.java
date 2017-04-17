package com.bridgelabz.week1;

public class Gamble
{
  public static void main(String[] args)
 {
  
  int stack = 5;
  int goal = 10;
  int experiment = 30;
  double win = 0;
  double lost = 0;
  int count =0;

  System.out.println("Number Of Times "+experiment);

    for(int i=1; i<=experiment; i++)
     {
       double random = Math.random();
       if(random > 0.5)
        {
	 System.out.println("WON !!");
          stack++;
          win++;
          System.out.println("Stack is : "+stack);
	  count++;
          if(stack == goal){ break;}	 
	}
       else
        {
	 System.out.println("Loosed !!");
          stack--;
          lost++;
          System.out.println("Stack is : "+stack);
	  count++;
          if(stack == 0){ break;}
	}
     }

  System.out.println("total win : "+win);
  System.out.println("Winning Percentage : "+((win/count)*100)+"%");

  System.out.println("total lost : "+lost);
  System.out.println("Loose Percentage : "+((lost/count)*100)+"%");
  System.out.println("total count : "+count);
 } 
}
