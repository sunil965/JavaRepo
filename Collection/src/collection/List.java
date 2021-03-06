package collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class List {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
/*	       LinkedList<String> list = new LinkedList<String>();
	        
	       list.add("F");
	       list.add("B");
	       list.add("D");
	       list.add("E");
	       list.add("C");
	        
	       list.addLast("Z");
	       list.addFirst("A");
	       list.add(1, "A2");
	       System.out.println("Original list        :        " + list);
	       list.remove("F");
	       list.remove(2);
	       System.out.println("list after deletion    :    " + list);
	       list.removeFirst();
	       list.removeLast();
	       System.out.println("after deleting first and last  : " + list);
	       Object val = list.get(2);
	       list.set(2, (String) val + " Changed");
	       System.out.println("List after change       :   " + list);
	       */
	       
	       
	       System.out.println("**************************************************");
	       
	       ArrayList list2 = new ArrayList();
	       list2.add("One");
	       list2.add("Two");
	       list2.add("Three");
	       list2.add("Four");
	 
	       // Returns a list iterator over the elements in this list
	       // (in proper sequence)
	       ListIterator<String> listIterator = list2.listIterator();
	 
	    
	       // Currently the cursor at the first position of the interator.
	       // (Index 0).
	       // Get the first element in the interator, the cursor forward one step.
	       String first = listIterator.next();
	       System.out.println("first:" + first);// -->"One"
	 
	       // Current cursor at index 1
	       // Get next element.
	       String second = listIterator.next();
	       System.out.println("second:" + second);// -->"Two"
	 
	       // traversing the list in the reverse direction
	       if (listIterator.hasPrevious()) {
	           // the previous element in the list
	           String value = listIterator.previous();
	           System.out.println("value:" + value);// -->"Two"
	       }
	       String value2 = listIterator.previous();
           System.out.println("value2:" + value2);// -->"One"
	 
	       System.out.println(" ----- ");
	 
	       while (listIterator.hasNext()) {
	           String value = listIterator.next();
	           System.out.println("value:" + value);
	       }
	   }
}
