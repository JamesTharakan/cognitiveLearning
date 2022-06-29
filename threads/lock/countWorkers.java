package threads.lock;

import java.util.concurrent.locks.ReentrantLock;

public class countWorkers implements Runnable {
	
	static long SLEEPTIME = 1000;
	ReentrantLock reLock ;
	
	int secs;
	
	countWorkers(int sec ,ReentrantLock lock){
		secs = sec;
		reLock = lock;
	}
	
	public void run() {
		
		/*
		while(reLock.isLocked()) {
			sleeping();
		}
		reLock.lock();
		System.out.println(Thread.currentThread().getName() +" acquired the lock");
		
		doCounting();
		
		System.out.println(Thread.currentThread().getName() +" is released the lock");
		reLock.unlock();
		*/
		
		reLock.lock();
		System.out.println(Thread.currentThread().getName() +" acquired the lock");
		
		doCounting();
		
		System.out.println(Thread.currentThread().getName() +" is released the lock");
		reLock.unlock();
		
		/* nothing to do if there is no lock.
		
		if(reLock.isLocked()) {
			System.out.println(Thread.currentThread().getName() + "did not get lock");
		}else {
			reLock.lock();
			System.out.println(Thread.currentThread().getName() +" acquired the lock");
			
			doCounting();
			
			System.out.println(Thread.currentThread().getName() +" is released the lock");
			reLock.unlock();
		}
		*/
		
		
		
		
	}

	private void doCounting() {
		collectBeforeCounting();
		try {
			System.out.println(Thread.currentThread().getName() +" is COUNTING for "+ secs+ " seconds"+ " Hold Count :"+reLock.getHoldCount());
			Thread.sleep(SLEEPTIME * secs);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

	private void collectBeforeCounting() {
		reLock.lock();
		try {
			System.out.println(Thread.currentThread().getName() +" is COLLECTING for "+ secs+ " seconds"+ " Hold Count :"+reLock.getHoldCount());
			Thread.sleep(SLEEPTIME * secs);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		reLock.unlock();
		
	}

	private void sleeping() {
		try {
			System.out.println(Thread.currentThread().getName() +" is going to sleep for "+secs+ " seconds");
			Thread.sleep(SLEEPTIME * secs);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}
