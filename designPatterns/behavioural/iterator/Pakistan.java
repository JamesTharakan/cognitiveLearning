package designPatterns.behavioural.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Pakistan implements Team {

	String input[] = { "p1", "p2", "p3", "p4", "p5", "p6" };
	Iterator itr;

	public Pakistan() {
		ArrayList names = new ArrayList(2);
		for (String s : input)
			names.add(s);

		itr = new ArrayListIterator(names);
	}

	

	public Iterator getTeamMemberIterator() {
		return itr;
	}
}