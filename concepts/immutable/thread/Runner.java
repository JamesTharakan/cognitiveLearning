package concepts.immutable.thread;

import java.util.Hashtable;

public class Runner {

	public static void main(String[] args) {
		
		 Hashtable<Integer,Integer> table = new Hashtable<Integer,Integer>();
		 table.put(1, 1);

		MutableClass m = new MutableClass(1);

		for (int i = 1; i <= 10; i++) {
			new Thread(m).start();
		}

	}
}
