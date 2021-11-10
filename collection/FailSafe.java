package collection;

import java.util.Iterator;

import java.util.concurrent.CopyOnWriteArrayList;


/**
 * First of all, there is no term as fail-safe given in many places as Java SE specifications does not use this term.
 *  I am using this term to demonstrate the difference between Fail Fast and Non-Fail Fast Iterator. 
 *
 *
 * Any add/remove on these kind of collections is done on the main list and will not alter the temporary collection used 
 * by the iterator.
 */
public class FailSafe {
	public static void main(String[] args) {
		CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<Integer>(new Integer[] { 1, 3, 5, 8 });
		Iterator itr = list.iterator();
		while (itr.hasNext()) {
			Integer no = (Integer) itr.next();
			System.out.print(no +":"+ list.size()+" , ");
			if (no == 3)
				// This will not be printed by the iterator as it is working on a separate copy of the list
				list.add(14);
		}
		
		System.out.println("\n"+list);
		
		//will print in the next iterator
		Iterator itr2 = list.iterator();
		while (itr2.hasNext()) {
			Integer no = (Integer) itr2.next();
			System.out.print(no +",");
		}
	}

}
