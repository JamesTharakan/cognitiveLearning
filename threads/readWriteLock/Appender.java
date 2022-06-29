package threads.readWriteLock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Appender implements Runnable{
	ReentrantReadWriteLock rwlock ;
	Lock readLock ;
	Lock writeLock;
	
	String str="A";
	
	Appender (ReentrantReadWriteLock lock){
		this.rwlock = lock;
		 readLock = rwlock.readLock();
		 writeLock = rwlock.writeLock();
	}
	
	
	public void run() {
		 for (int i = 0; i < 10; i++) {
			 readLock.lock();
				if(!Thread.currentThread().getName().equals(Character.toString(str.charAt(str.length()-1))
						)
				) {
					System.out.println(Thread.currentThread().getName()+" : Waiting for write lock");
					readLock.unlock();
					writeLock.lock();
					str += Thread.currentThread().getName();
					writeLock.unlock();
					System.out.println(Thread.currentThread().getName()+" : finished writing");
					
				}else {
					readLock.unlock();
					try {
						Thread.currentThread().sleep(500);//sleep 
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			
		}
	 }

}