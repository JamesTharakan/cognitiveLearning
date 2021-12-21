package designPatterns.behavioural.iterator;

import java.util.Iterator;

public class India implements ScoreBoard {

	int score[];
	Iterator itr;

	public India(int[] score) {
		super();
		this.score = score;
		itr = new ArrayIterator(this.score);
	}

	public void printScore() {

		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
		System.out.println();
	}
}
