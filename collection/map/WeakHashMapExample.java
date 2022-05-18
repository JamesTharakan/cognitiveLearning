package collection.map;

import java.util.HashMap;
import java.util.WeakHashMap;

import utils.Customer;

/**
 * General usecase of WeakHashMap
 * We are trying to save current object in weakHashMap before moving on to next object.
 * So we can come back and check on the old object if it is not yet GCed. 
 * 
 * This becomes very useful if the construction of the object is expensive(time or resource) 
 */
public class WeakHashMapExample {

	public static void main(String[] args) {
		Customer custOne= new Customer(1, "one");
		
		WeakHashMap<Customer,String> wm = new WeakHashMap<Customer,String>();
		
		wm.put(custOne, "WeakHashMap");
		System.out.println("Before :"+wm);
		
		custOne = null;
		System.gc();
		System.out.println("After :"+wm); //Entry in WeakHashMap is removed as the referent is not reachable.
		
		
		Customer custTwo= new Customer(2,"two");
		
		HashMap<Customer,String> m = new HashMap<Customer,String>();
		
		m.put(custTwo, "HashMap");
		System.out.println("Before :"+m);
		
		custTwo = null;
		System.gc();
		System.out.println("After :"+m);

		
		
	}

}
