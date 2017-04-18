package map;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class HashMapProgram {

	public static void main(String[] args) {
		
		Map<Integer, String> mapHttpErrors = new HashMap<>();
		 
		mapHttpErrors.put(200, "OK");
		mapHttpErrors.put(400, "Bad Request");
		mapHttpErrors.put(304, "Not Modified");
//		mapHttpErrors.put(null, "");		//	KEY AND VALUE CAN NOT BE NULL
		mapHttpErrors.put(303, "See Other");
		mapHttpErrors.put(404, "Not Found");
//		mapHttpErrors.put(null, "");
		mapHttpErrors.put(301, "Moved Permanently");
		mapHttpErrors.put(500, "Internal Server Error");
		 
		System.out.println("HashMap Example        "+mapHttpErrors);
		System.out.println("\nGet Value by Key : "+ mapHttpErrors.get(404));
		System.out.println("ContainKey method of : "+mapHttpErrors.containsKey(200));
		System.out.println("ContainValue method of : "+mapHttpErrors.containsValue("Not Found"));
		System.out.println("Removed value by Key : " + mapHttpErrors.remove(500)+"\n");
		
		Set<Integer> setCode = mapHttpErrors.keySet();
		Iterator<Integer> itr = setCode.iterator();
		System.out.println("Iteration of Map Through ITERATOR.");
		while(itr.hasNext()){
			int code = itr.next();
			String values = mapHttpErrors.get(code);
			System.out.println(code+" --> "+values);
		}
		
		System.out.println("\n******************HASHMAP ENDS********************\n");
		Map<String, String> mapContacts = new LinkedHashMap<>();
		 
		mapContacts.put("0169238175", "Tom");
		mapContacts.put("0904891321", "Peter");
		mapContacts.put("0169238175", "Tom");
		mapContacts.put("", "");				// KEY AND VALUE CAN NOT BE NULL
		mapContacts.put("0945678912", "Mary");
		mapContacts.put("0981127421", "John");
		 
		System.out.println("LinkedHashMap Example  "+mapContacts);
		
				//values(): returns a collection of values contained in the map. 
		Collection<String> person = mapContacts.values();
		System.out.println("\nUse of value() to get Set ofValues without Key\n");
		for(String man : person){
			System.out.println(man);
		}
		
		System.out.println("\n******************LINKEDHASHMAP ENDS********************\n");
		Map<String, String> mapLang = new TreeMap<>();
		 
		mapLang.put(".c", "C");
		mapLang.put(".java", "Java");
		mapLang.put(".pl", "Perl");
		mapLang.put(".c", "C");
		mapLang.put("", "");					// KEY AND VALUE CAN NOT BE NULL.
		mapLang.put(".cs", "C#");
		mapLang.put(".php", "PHP");
		mapLang.put(".cpp", "C++");
		mapLang.put(".xml", "XML");
		 
		System.out.println("TreeMap Example        "+mapLang);
		System.out.println("\nTraversing TreeMap Using entrySet()..\n");
		System.out.println("Key\t\tValues");
		
		Set<Map.Entry<String, String>> entries = mapLang.entrySet();
		for (Map.Entry<String, String> entry : entries) {
		    String code = entry.getKey();
		    String technology = entry.getValue();
		    System.out.println(code + "\t=>\t" + technology);
		}
		System.out.println("\n******************TREEMAP ENDS********************\n");

	}

}
