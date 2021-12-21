package designPatterns.behavioural.iterator;

import java.util.Iterator;

/**
 * This Iterator can change its way of data storage and traversing without affect its client(India)
 * @author jtharakan
 *
 */
public class ArrayIterator implements Iterator {
	int index = 0; // Taking the responsibility to the iterator object
	int arrayInt[];

	ArrayIterator(int score[]) {
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