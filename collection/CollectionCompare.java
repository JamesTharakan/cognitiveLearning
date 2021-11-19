package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
 There is no point in implementing the Comparator in the target class itself. 
because it will restrict in only one type of comparison
*/

public class CollectionCompare implements Comparable<CollectionCompare> , Comparator<CollectionCompare>  {
	String s1;
	Integer i;
	public CollectionCompare(String string, int j) {
		s1=string;
		i=j;
	}
	
	/**
	 * Beacuse i am trying to sort custom objects , i should define how it should be compared
	 */
	public int compareTo(CollectionCompare obj2){
		System.out.println("Comparable");
		return this.s1.compareTo(obj2.s1);
	}
	
	public int compare(CollectionCompare obj1, CollectionCompare obj2){
		System.out.println("Comparator");
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
		System.out.println("Listed Created");
		Collections.sort(list);// This will use the Comparable.
		System.out.println(" String sort : "+list); 
		
		Collections.sort(list, new CollectionCompare("",2));//i just need to pass a dummy object of the Comparator
		System.out.println(" number sort : "+list);
		
		Collections.sort(list, (s1,s2)->s1.compareTo(s2) );
	}
	
	public String toString(){
		return s1+":"+i;
	}
}
