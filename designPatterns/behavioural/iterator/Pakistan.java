package designPatterns.behavioural.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Pakistan implements ScoreBoard {

	int input[] = { 1, 2, 3, 4, 5, 6 };
	Iterator itr;

	public Pakistan(int[] input) {
		super();

		ArrayList score = new ArrayList(2);
		{
			for(int i: input)
				score.add(input[i]);
		}

		itr = new ArrayListIterator(score);
	}

	public void printScore() {
		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
		System.out.println();
	}
}