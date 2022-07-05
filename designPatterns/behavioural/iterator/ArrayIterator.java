package designPatterns.behavioural.iterator;

import java.util.Iterator;

/**
 * This Iterator can change its way of data storage and traversing without affect its client(India)
 * @author jtharakan
 *
 */
public class ArrayIterator implements Iterator {
	int index = 0; // Taking the responsibility to the iterator object
	String namesArr[];

	ArrayIterator(String names[]) {
		namesArr = names;
	}

	public boolean hasNext() {
		if (index <= (namesArr.length - 1))
			return true;

		return false;
	}

	public Object next() {
		return namesArr[index++];

	}
}