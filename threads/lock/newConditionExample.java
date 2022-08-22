package threads.lock;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class newConditionExample {

	public static void main(String[] args) {

		final Lock lock = new ReentrantLock();
		final Condition notFull = lock.newCondition();
		final Condition notEmpty = lock.newCondition();
	}
}

//	https://docs.oracle.com/javase/7/docs/api/java/util/concurrent/locks/Condition.html
class BoundedBuffer {
	final Lock lock = new ReentrantLock();
	final Condition remove = lock.newCondition();
	final Condition insert = lock.newCondition();
	
	final Condition howManyConditions = lock.newCondition();

	final Object[] items = new Object[100];
	int putptr, takeptr, count;

	public void put(Object x) throws InterruptedException {
		lock.lock();
		try {
			while (count == items.length)
				remove.await();
			
			items[putptr] = x;
			
			if (++putptr == items.length)
				putptr = 0;
			
			++count;
			insert.signal();
		} finally {
			lock.unlock();
		}
	}

	public Object take() throws InterruptedException {
		lock.lock();
		try {
			while (count == 0)
				insert.await();
			
			
			Object x = items[takeptr];
			if (++takeptr == items.length)
				takeptr = 0;
			
			--count;
			remove.signal();
			return x;
		} finally {
			lock.unlock();
		}
	}
}