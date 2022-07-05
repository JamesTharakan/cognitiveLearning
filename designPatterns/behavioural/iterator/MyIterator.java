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

	public static void main(String[] args) {

		printTeam(new India());

		printTeam(new Pakistan());
		
	}

	private static void printTeam(Team team) {
		
		Iterator itr = team.getTeamMemberIterator();
		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
		System.out.println();
		
	}

}
