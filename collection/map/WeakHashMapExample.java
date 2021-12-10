package collection.map;

import java.util.HashMap;
import java.util.WeakHashMap;

import utils.Customer;

public class WeakHashMapExample {

	public static void main(String[] args) {
		Customer custOne= new Customer(1, "one");
		
		WeakHashMap<Customer,String> wm = new WeakHashMap<Customer,String>();
		
		wm.put(custOne, "myValue");
		System.out.println("Before :"+wm);
		
		custOne = null;
		System.gc();
		System.out.println("After :"+wm); //Entry in WeakHashMap is removed as the referent is not reachable.
		
		
		Customer custTwo= new Customer(2,"two");
		
		HashMap<Customer,String> m = new HashMap<Customer,String>();
		
		m.put(custTwo, "myValue");
		System.out.println("Before :"+m);
		
		custOne = null;
		System.gc();
		System.out.println("After :"+m);

		
		
	}

}
