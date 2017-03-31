import java.io.*;
import java.util.*;

public class StringBserach{
 public static void main(String[] args) throws IOException {
    //File file = new File("/home/bridgeit/Desktop/sample.txt");
    //FileInputStream fis = new FileInputStream(file);
    //String fileInput = fis;
    //System.out.println(fileInput);
   String content = new Scanner(new File("/home/bridgeit/Desktop/sample.txt")).useDelimiter("\\Z").next();
   System.out.println(content);
   String[] strArray = content.split(" ");
   for(String s:strArray)
   {System.out.println(s); }
System.out.println("............................");
   Arrays.sort(strArray);
   for(String s:strArray)
   {System.out.println(s); }
 }
}
