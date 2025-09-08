package collection;

import java.util.HashMap;
import java.util.Iterator;

public class ConcurrentModification {

	public static void main(String[] args) {

		HashMap <Integer,Integer>map =getMap();
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
