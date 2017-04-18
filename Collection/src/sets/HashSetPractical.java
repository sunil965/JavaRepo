package sets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetPractical {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<Integer>(); 
		set.add(null); // It permit null Value only one time.
		set.add(1);
		set.add(3);
		set.add(2);
		set.add(5);
		set.add(10);
		set.add(null);
		set.add(6);
		set.add(5);
		System.out.println("******HashSet with Default******");
		System.out.println("Size : "+set.size());
		Iterator<Integer> itr = set.iterator();
		while(itr.hasNext()){
			System.out.print(itr.next()+", ");
		}
		System.out.println("\n\n");
		System.out.println("******HashSet with Initial Capacity******");
		Set<String> set2 = new HashSet<>(4);
		set2.add("sunil");
		set2.add("kumar");
		set2.add("aarav");
		set2.add(null);
		set2.add("prince");
		set2.add("manoj");
		set2.add("pawne");
		set2.add(null);
		System.out.println("Size : "+set2.size());
		Iterator<String> itr2 = set2.iterator();
		while(itr2.hasNext()){
			System.out.print(itr2.next()+", ");
		}
	}

}
