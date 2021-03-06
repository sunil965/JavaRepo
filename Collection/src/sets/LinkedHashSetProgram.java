package sets;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetProgram {

	public static void main(String[] args) {
		Set<Integer> set = new LinkedHashSet<Integer>(); 
//		set.add(null); It permit null Value only one time.
		set.add(1);
		set.add(3);
		set.add(2);
		set.add(5);
		set.add(10);
		set.add(null);
		set.add(6);
		set.add(5);
		set.add(25);
		set.add(15);
		set.add(null);
		System.out.println("******HashSet with Default******");
		System.out.println("Size : "+set.size());
		Iterator<Integer> itr = set.iterator();
		while(itr.hasNext()){
			System.out.print(itr.next()+", ");
		}
	}

}
