package sets;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetPractice {

	public static void main(String[] args) {
		Set<Integer> set = new TreeSet<Integer>();
		
//		set.add(null);
		set.add(12); 
		
		try{
			set.add(null);
			}
		catch(Exception e){
			e.getMessage();
			}
		finally { System.out.println("done");}
		
		set.add(1);
		set.add(3);
		set.add(2);
		set.add(5);
		set.add(10);
//		set.add(null); doesn't accept null in between
		set.add(6);
		set.add(5);
		System.out.println("******HashSet with Default******");
		System.out.println("Size : "+set.size());
		Iterator<Integer> itr = set.iterator();
		while(itr.hasNext()){
			System.out.print(itr.next()+", ");
//			itr.remove();
		}
		set.remove(12);
		System.out.println("\n******HashSet After remove()*****");
		System.out.println("Size : "+set.size());
		Iterator<Integer> itr2 = set.iterator();
		while(itr2.hasNext()){
			System.out.print(itr2.next()+", ");
		}
		System.out.println("\n\n******HashSet Methods()*****");
		System.out.println("Check Emptyness : "+set.isEmpty());
		System.out.println("Get First Element : "+((TreeSet<Integer>) set).first());
		System.out.println("Get Last Element : "+((TreeSet<Integer>) set).last());
		System.out.println("Check Any Element Is Their Or Not : "+((TreeSet<Integer>) set).contains(12));
	
		set.clear();
		System.out.println("Size After clear() : "+set.size());
	}

}
