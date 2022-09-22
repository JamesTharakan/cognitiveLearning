package threads.lock;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

//	https://docs.oracle.com/javase/7/docs/api/java/util/concurrent/locks/Condition.html
public class newConditionExample {
	final Lock lock = new ReentrantLock();
	final Condition removalDone = lock.newCondition();
	final Condition insersionDone = lock.newCondition();
	
	final Object[] items = new Object[100];
	int putptr, takeptr, count;

	public void put(Object x) throws InterruptedException {
		lock.lock();
		try {
			while (count == items.length)
				removalDone.await();
			
			items[putptr] = x;
			if (++putptr == items.length)
				putptr = 0;
			++count;
			
			insersionDone.signal();
		} finally {
			lock.unlock();
		}
	}

	public Object take() throws InterruptedException {
		lock.lock();
		try {
			while (count == 0)
				insersionDone.await();
			
			
			Object x = items[takeptr];
			if (++takeptr == items.length)
				takeptr = 0;
			--count;
			
			removalDone.signal();
			return x;
		} finally {
			lock.unlock();
		}
	}
}