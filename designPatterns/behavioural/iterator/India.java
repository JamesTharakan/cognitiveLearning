package designPatterns.behavioural.iterator;

import java.util.Iterator;

public class India implements Team {

	String names[]=new String[] { "i7", "i5", "i9", "i2", "i3" };
	Iterator itr = new ArrayIterator(this.names);


	public Iterator getTeamMemberIterator() {
		return itr;
	}

}
