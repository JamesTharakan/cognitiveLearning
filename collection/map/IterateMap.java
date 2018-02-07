package collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class IterateMap {
	private static HashMap <Integer,Integer> createMap() {
		HashMap <Integer,Integer>map = new HashMap<Integer,Integer>();
		map.put(222,222);
		map.put(1,1);
		map.put(3,3);
		map.put(3,100);
		map.put(null, 999);
//		System.out.println("Created  a new HashMap ::"+map);
		return map;
	}
	public static void main(String[] args) {
		HashMap <Integer,Integer>map =createMap();
		
		Iterator itr = map.entrySet().iterator();
		while(itr.hasNext()){
			itr.next();
			itr.remove();//Removes the Object last accessed by next()
//			map.remove(222);	//this throws ConcurrentModificationException
		}
		System.out.println("After remve ::"+map);
		
		printMap(createMap());
		
		forEach(createMap());
		
	}

	public static void printMap(Map mp) {
	    Iterator it = mp.entrySet().iterator();
	    while (it.hasNext()) {
	        Map.Entry pair = (Map.Entry)it.next();
	        System.out.print(pair.getKey() + " = " + pair.getValue());
	        it.remove(); // avoids a ConcurrentModificationException
	    }
	    System.out.println(" ");
	}
	
	public static void forEach(HashMap map){
		map=createMap();
		System.out.println("ForEach :When i want to handle key value independently");
		map.forEach((k,v) -> System.out.println(k+","+v));
		 
	}
}
