package collection.map;

import java.util.HashMap;

/**
Using Lambda expression as the remapping function.

We can also use the putAll() method to merge two hashmaps.
However, if a key is present in both hashmaps, the old value is replaced by the new value.

Unlike the merge(), the putAll() method does not provide the remapping function.
Hence, we cannot decide what value to store for duplicate keys.
 */
public class MergeMapsLambda {

	public static void main(String[] args) {
		
//		mergeNewPairIntoMap();
		mergeTwoMaps();
	}
	
	public static void mergeNewPairIntoMap(){
		HashMap<String, String> countries = new HashMap<String,String>();
		
		countries.put("Washington", "America");
	    countries.put("Madrid", "Spain");
	    
	    countries.merge("Washington","Part2",(oldValue,newValue)-> (oldValue+newValue) );
	    
	    System.out.println(countries);
	}
	
	public static void mergeTwoMaps() {
		HashMap<String, Integer> map1 = new HashMap<>();

	    map1.put("A", 20);
	    map1.put("B", 30);

	    HashMap<String, Integer> map2 = new HashMap<>();

	    //insert entries to the HashMap
	    map2.put("C", 10);
	    map2.put("B", 30);
	    
//	  using forEach: take each K,V from map2
//	  pass it to map1 for adding/merging
//	  	If K is not present put this K,V into map
//	  	If K is already present in map1, then run the mapping function
//	  the mapping function(lambda in this case) takes both the values and performs some action
//	  and stores the result as final value
	    
	    map2.forEach((key,value)->map1.merge(key, value, (v1, v2) ->(v1+v2)));
	    
	    System.out.println("map1 : "+map1);
	}
}
