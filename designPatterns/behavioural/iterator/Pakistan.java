package designPatterns.behavioural.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Pakistan implements Team {

	int input[] = { 1, 2, 3, 4, 5, 6 };
	Iterator itr;

	public Pakistan() {
		ArrayList score = new ArrayList(2);
		for (int i : input)
			score.add(input[i-1]);

		itr = new ArrayListIterator(score);
	}

	

	public Iterator getCustomIterator() {
		// TODO Auto-generated method stub
		return itr;
	}
}