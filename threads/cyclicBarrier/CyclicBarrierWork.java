package threads.cyclicBarrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierWork implements Runnable {

	CyclicBarrier barrier;

	public CyclicBarrierWork(CyclicBarrier barrier) {
		this.barrier = barrier;
	}

	/**
	 * In this the worker thread wait for other worker threads to reach this barrier
	 * and then all the threads will be ready to proceed
	 */
	public void run() {

		System.out.println(Thread.currentThread().getName() + " has reached the barrier, about to wait along with "
				+ barrier.getNumberWaiting() + " other parties");
		try {

			barrier.await();
		} catch (InterruptedException | BrokenBarrierException e) {
			System.out.println("Got " + e.getMessage());
		}
		System.out.println(Thread.currentThread().getName() + " has regained control");

	}

}
