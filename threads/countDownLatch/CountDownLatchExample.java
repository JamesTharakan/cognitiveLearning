package threads.countDownLatch;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchExample {

	public static void main(String[] args) {
		int noOfThreadsToWait = 5;

		CountDownLatch latch = new CountDownLatch(noOfThreadsToWait);

		for (int i = 0; i < noOfThreadsToWait; i++) {

			new Thread(new LatchWorker(latch)).start();
		}

		try {
			System.out.println("Main about to wait");
			latch.await();
		} catch (InterruptedException e) {
			System.out.println("Main : InterruptedException");
			e.printStackTrace();
		}

		System.out.println("Main finished waiting for all the threads to reach a milestone and now exiting");
	}

}

class LatchWorker implements Runnable {

	CountDownLatch latch;

	LatchWorker(CountDownLatch latch) {
		this.latch = latch;
	}

	/**
	 * This does not cause the current thread to wait. Its only purpose is to inform
	 * the latch that it has reached a milestone. Its the main/caller of await that
	 * is waiting for the latch to count down, so that it can continue further.
	 */
	public void run() {
		System.out.println(Thread.currentThread().getName() + " Checked milestone");
		latch.countDown();

		System.out.println(Thread.currentThread().getName() + " finished work :: latched counts :"+latch.getCount());
	}

}
