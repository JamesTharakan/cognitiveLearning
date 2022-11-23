package threads.lock;

import java.util.concurrent.locks.ReentrantLock;

public class myReEntrantLock {

	public static void main(String[] args) {
		
		ReentrantLock reLock = new ReentrantLock();
		
		countWorkers w1 = new countWorkers(3,reLock);
		countWorkers w2 = new countWorkers(2,reLock);
		
		
		new Thread(w2, "Thread-2").start();
		new Thread(w1, "Thread-1").start();

	}

}
