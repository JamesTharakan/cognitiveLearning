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
	ArrayList nameslist;

	ArrayListIterator(ArrayList names) {
		this.nameslist = names;
	}

	public boolean hasNext() {
		if (index <= (nameslist.size() - 1))
			return true;

		return false;
	}

	public Object next() {
		return nameslist.get(index++);

	}
}