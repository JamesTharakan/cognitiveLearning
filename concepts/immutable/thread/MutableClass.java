package concepts.immutable.thread;

import java.util.Hashtable;

public class MutableClass implements Runnable {
	int k;
	Hashtable table; 

	MutableClass(int k) {
		this.k = k;
	}
	
	MutableClass(Hashtable table) {
		this.table = (Hashtable)table.clone();
	}
 
	public void run() {
		try {
			if (k == 1) {
				k=2;
				Thread.sleep(100);
				System.out.println("Changed the value to 2 "+k);
				
			} else {
				k = 1;
				Thread.sleep(100);
				System.out.println("Changed the value to 1 "+k);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	
	
	
}
