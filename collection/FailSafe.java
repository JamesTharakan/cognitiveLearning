package collection;

import java.util.Iterator;

import java.util.concurrent.CopyOnWriteArrayList;

/**
 * First of all, there is no term as fail-safe given in many places as Java SE
 * specifications does not use this term. I am using this term to demonstrate
 * the difference between Fail Fast and Non-Fail Fast Iterator.
 *
 *
 * Any add/remove on these kind of collections is done on the main list and will
 * not alter the temporary collection used by the iterator.
 */
public class FailSafe {
	public static void main(String[] args) {
		CopyOnWriteArrayList<Integer> copyOnWrite = new CopyOnWriteArrayList<Integer>(new Integer[] { 1, 2,3,4, 5 });
		
		System.out.println("\t1:"+copyOnWrite.hashCode());

		Iterator itr = copyOnWrite.iterator();// we get an immutable snapshot of the current list.
		while (itr.hasNext()) {
			Integer no = (Integer) itr.next();
			System.out.print(no + ":" + copyOnWrite.size() + " , ");
			if (no == 3)// This will not be printed by the iterator as it is working on a separate copy of the list
				copyOnWrite.add(14);
			System.out.println("\t2:"+copyOnWrite.hashCode());
		}
		
		System.out.println("\t3:"+copyOnWrite.hashCode());

		// will print in the next iterator
		Iterator itr2 = copyOnWrite.iterator();
		while (itr2.hasNext()) {
			Integer no = (Integer) itr2.next();
			System.out.print(no + ",");
		}
		
		copyOnWrite.add(111);			//Every add and remove operation creates a new copy and appends the new element
		System.out.println("\n\t4:"+copyOnWrite.hashCode());
		
		copyOnWrite.add(222);
		System.out.println("\t5:"+copyOnWrite.hashCode());
		
	}

}
