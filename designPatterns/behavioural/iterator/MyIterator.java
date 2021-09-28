package designPatterns.behavioural.iterator;

import java.util.ArrayList;
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
	static ScoreBoard sr = null;

	public static void main(String[] args) {
		sr = new India();
		sr.printScore();

		sr = new Pakistan();
		sr.printScore();
	}

}

interface ScoreBoard {
	void printScore();
}

class Pakistan implements ScoreBoard {

	int input[] = { 1, 2, 3, 4, 5, 6 };

	ArrayList score = new ArrayList(2);
	{
		for (int i = 0; i < input.length; i++) {
			score.add(input[i]);
		}
	}

	public void printScore() {
		System.out.print(score);
		System.out.println();

	}
}
	class India implements ScoreBoard {

		int score[] = { 23, 56, 34 };

		public void printScore() {
			IndiaIterator it = new IndiaIterator(score);
			while (it.hasNext()) {
				System.out.print(it.next() + " ");
			}
			System.out.println();
		}

	}

	// Basically this a Iterator class for array
	class IndiaIterator implements Iterator {
		int index = 0;	//Taking the responsibility to the iterator object
		int arrayInt[];

		IndiaIterator(int score[]) {
			arrayInt = score;
		}

		public boolean hasNext() {
			if (index <= (arrayInt.length - 1))
				return true;

			return false;
		}

		public Object next() {
			return arrayInt[index++];

		}
	}

