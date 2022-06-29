package threads.lock;

import java.util.concurrent.locks.ReentrantLock;

public class myReEntrantLock {

	public static void main(String[] args) {
		
		ReentrantLock reLock = new ReentrantLock();
		
		new Thread(new countWorkers(2,reLock), "Thread-2").start();
		new Thread(new countWorkers(3,reLock), "Thread-1").start();

	}

}
