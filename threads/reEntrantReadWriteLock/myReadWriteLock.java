package threads.reEntrantReadWriteLock;

import java.util.concurrent.locks.ReentrantReadWriteLock;

public class myReadWriteLock {

	public static void main(String[] args) {
		
		Appender append = new Appender(new ReentrantReadWriteLock(true));

		Thread t1 = new Thread(append, "A");
		Thread t2 =new Thread(append, "B");
		Thread t3=new Thread(append, "C");
		
		t1.start();	t2.start();t3.start();
		
		try {
			t1.join();
			t2.join();
			t3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(append.str);
	}

}
