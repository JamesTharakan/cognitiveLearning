package collection.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class IterateHashMap {
	private static HashMap <Integer,Integer> createMap() {
		HashMap <Integer,Integer>map = new HashMap<Integer,Integer>();
		map.put(2,222);
		map.put(1,111);
		map.put(3,333);
		map.put(4,4);
		map.put(null, 999);
		return map;
	}
	public static void main(String[] args) {
		
		HashMap <Integer,Integer>map =createMap();
		
		Iterator itr = map.entrySet().iterator();//basically getting an iterator for Set because map is not implementing iterable
		while(itr.hasNext()){
			System.out.print(itr.next()+";");
//			itr.remove();//Removes the Object last accessed by next()
			map.remove(2);	//this throws ConcurrentModificationException, 
							//because the structure has changed without iterator's knowledge
			break; //but if i break right after remove(),then no problem because iterator is not used after that
		}
		System.out.println();
		System.out.println("Print and removed::"+map);
		
		printMap(createMap());
		
		forEach(createMap());
		
	}

	public static void printMap(Map mp) {
		
		Iterator it = mp.entrySet().iterator();
	    System.out.println("\nIndependent handling using Entry class");
	    while (it.hasNext()) {
	        Map.Entry pair = (Map.Entry)it.next();
	        System.out.print(pair.getKey() + " : " + pair.getValue());
	        it.remove(); // avoids a ConcurrentModificationException
	    }
	    System.out.println(" ");
	}
	
	public static void forEach(HashMap map){
		map=createMap();
		System.out.println("\nIndependent handling using ForEach");
		map.forEach((k,v) -> System.out.print(k+","+v+ "  "));
		
		
		ArrayList<Integer> arr = new ArrayList<Integer>(5);
		arr.add(1);arr.add(2);arr.add(3);arr.add(4);
		System.out.println("\n");
		arr.forEach(item ->System.out.print(item));
		 
	}
}
