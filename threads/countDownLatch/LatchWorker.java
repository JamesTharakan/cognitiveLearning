package threads.countDownLatch;

import java.util.concurrent.CountDownLatch;

public class LatchWorker implements Runnable {

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

		if (latch.getCount() == 4) {
			try {
				System.out.println(Thread.currentThread().getName() + " \t\t\t About to sleep");
				Thread.sleep(5 * 1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName() + " finished work");
	}

}
