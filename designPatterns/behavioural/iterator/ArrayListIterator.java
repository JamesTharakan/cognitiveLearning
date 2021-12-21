package designPatterns.behavioural.iterator;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * This Iterator can change its way of data storage and traversing without affect its client(Pakistan)
 * @author jtharakan
 *
 */
public class ArrayListIterator implements Iterator {
	int index = 0; // Taking the responsibility to the iterator object
	ArrayList arraylist;

	ArrayListIterator(ArrayList arraylist) {
		this.arraylist = arraylist;
	}

	public boolean hasNext() {
		if (index <= (arraylist.size() - 1))
			return true;

		return false;
	}

	public Object next() {
		return arraylist.get(index++);

	}
}