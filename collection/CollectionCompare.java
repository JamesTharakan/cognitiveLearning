package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
 There is no point in implementing the Comparator in the target class it self. 
because it will restrict  in only one type of comparison
*/

public class CollectionCompare implements Comparable<CollectionCompare> , Comparator<CollectionCompare>  {
	String s1;
	Integer i;
	public CollectionCompare(String string, int j) {
		s1=string;
		i=j;
	}
	
	public int compareTo(CollectionCompare obj2){
		return this.s1.compareTo(obj2.s1);
	}
	
	public int compare(CollectionCompare obj1, CollectionCompare obj2){
		return obj1.i.compareTo(obj2.i);
	}
	
	public static void main(String[] args) {
		CollectionCompare r1 = new CollectionCompare("a", 20);
		CollectionCompare r2 = new CollectionCompare("r",11);
		CollectionCompare r3 = new CollectionCompare("c",1);
		
		
		ArrayList<CollectionCompare> list = new ArrayList<CollectionCompare>();
		list.add(r1);
		list.add(r2);
		list.add(r3);
		
		Collections.sort(list);
		System.out.println(" String sort : "+list);
		
		Collections.sort(list, new CollectionCompare("",2));
		System.out.println(" number sort : "+list);

	}
	
	public String toString(){
		return s1+":"+i;
	}
}
