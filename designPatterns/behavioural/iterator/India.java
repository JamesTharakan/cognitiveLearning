package designPatterns.behavioural.iterator;

import java.util.Iterator;

public class India implements Team {

	int score[]=new int[] { 7, 5, 9, 2, 3 };
	Iterator itr = new ArrayIterator(this.score);


	public Iterator getCustomIterator() {
		return itr;
	}

}
