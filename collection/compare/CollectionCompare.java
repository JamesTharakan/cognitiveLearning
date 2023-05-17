package collection.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
 There is no point in implementing the Comparator in the target class itself. 
because it will restrict in only one type of comparison
*/

public class CollectionCompare implements Comparable<CollectionCompare> , Comparator<CollectionCompare>  {
	String s;
	Integer i;
	public CollectionCompare(String string, int j) {
		s=string;
		i=j;
	}
	
	public String toString(){
		return s+":"+i;
	}
	
//	 Because we are trying to sort custom objects,
//	 We should define how it should be compared
	public int compareTo(CollectionCompare obj2){
		return this.s.compareTo(obj2.s);
	}
	
	public int compare(CollectionCompare obj1, CollectionCompare obj2){
		return obj1.i.compareTo(obj2.i);
	}
	
	public static void main(String[] args) {
		
//		Create a list 
		ArrayList<CollectionCompare> list = getlist();
		
		Collections.sort(list);// This will use the Comparable,default method used for comparing
		System.out.println("Sorted using Comparable : "+list); 
		
		Collections.sort(list, new CollectionCompare("",2));//i just need to pass a dummy object of the Comparator
		System.out.println("Number sort : "+list);
		
	}
	
	
	public static ArrayList<CollectionCompare> getlist(){
		
		ArrayList<CollectionCompare> list = new ArrayList<CollectionCompare>();
		list.add(new CollectionCompare("Apple", 2));
		list.add(new CollectionCompare("Banana",3));
		list.add(new CollectionCompare("Cherry",1));
		
		return list;
	}
	
}
