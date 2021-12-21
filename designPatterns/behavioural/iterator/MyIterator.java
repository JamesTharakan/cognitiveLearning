package designPatterns.behavioural.iterator;

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
	static ScoreBoard sr = null;

	public static void main(String[] args) {
		
		sr = new India(new int[] { 7, 5, 9, 2, 3 });
		sr.printScore();

		sr = new Pakistan(new int[] { 1, 2, 3, 4, 5, 6 });
		sr.printScore();
	}

}
