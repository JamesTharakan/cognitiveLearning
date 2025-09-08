package collection.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class IterateHashMap {

	public static void main(String[] args) {
		
		iterateUsingEntrySet(getMap());
		
		usingForEach(getMap());
		
	}
	/**
	 * 1. Get the entrySet
	 * 2. Get the iterator of entry set
	 * 3. Do getNext if present
	 * 4. which returns a Entry pair 
	 */
	public static void iterateUsingEntrySet(Map mp) {
		
		Iterator it = mp.entrySet().iterator();
	    System.out.println("\nIndependent handling using Entry class");
	    while (it.hasNext()) {
	        Entry pair = (Entry)it.next();
	        System.out.print(pair.getKey() + " : " + pair.getValue());
	        it.remove(); // avoids a ConcurrentModificationException
	    }
	    System.out.println(" ");
	}
	
	public static void usingForEach(HashMap map){
		map=getMap();
		System.out.println("\nIndependent handling using ForEach");
		map.forEach((k,v) -> System.out.print(k+","+v+ "  "));
		
		
		// forEach in ArrayList
		ArrayList<Integer> arr = new ArrayList<Integer>(5);
		arr.add(1);arr.add(2);arr.add(3);arr.add(4);
		System.out.println("\n");
		arr.forEach(item ->System.out.print(item));
		 
	}
	
	private static HashMap <Integer,Integer> getMap() {
		HashMap <Integer,Integer>map = new HashMap<Integer,Integer>();
		map.put(2,222);
		map.put(1,111);
		map.put(3,333);
		map.put(4,4);
		map.put(null, 999);
		return map;
	}
}
