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
			latch.await();
		} catch (InterruptedException e) {
			System.out.println("Main : InterruptedException");
			e.printStackTrace();
		}

		System.out.println("Main finished waiting for all the threads to reach a milestone and now exiting");

	}

}
