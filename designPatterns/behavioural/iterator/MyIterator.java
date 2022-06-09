package designPatterns.behavioural.iterator;

import java.util.Iterator;

/**
 * Using the Iterator pattern, the client class(MyIterator.java) will never know
 * the internal data structure used to store the data(Score).
 * 
 * The Iterator Pattern provides a way to access the elements of an aggregate
 * object sequentially without exposing its underlying representation.
 * 
 * The Iterator Pattern takes the responsibility of traversing elements and
 * gives that responsibility to the iterator object, not the aggregate object.
 * 
 * @author jtharaka
 *
 */
public class MyIterator {
	static Team team = null;
	static Iterator itr;

	public static void main(String[] args) {

		team = new India();
		itr = team.getCustomIterator();

		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
		System.out.println();
		
		
		

		team = new Pakistan();
		itr = team.getCustomIterator();
		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
		System.out.println();
	}

}
