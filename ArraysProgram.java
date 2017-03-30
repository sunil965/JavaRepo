import java.util.Scanner;
import java.io.PrintWriter;  

public class ArraysProgram
{
 public static void main(String[] args)
 {
  Scanner sc = new Scanner(System.in);
  PrintWriter pw = new PrintWriter(System.out);    

  System.out.println("Enter row size.");
  int row = sc.nextInt();

  System.out.println("Enter column size.");
  int col = sc.nextInt();

  int arrayInt[][] = new int[row][col];
  System.out.println("Enter "+col*row+" values"); 
  for(int i=0; i<row; i++)
  {
    for(int j=0; j<col; j++)
     {
      arrayInt[i][j] = sc.nextInt();
     }
  }
 for(int i=0; i<row; i++)
  {
    for(int j=0; j<col; j++)
     {      
      pw.print("\t"+arrayInt[i][j]+" ");
     }
     pw.println("\t");
  }
  pw.flush();  
  pw.close();   
 }
}
