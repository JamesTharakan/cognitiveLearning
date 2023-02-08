package threads.cyclicBarrier;

import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierExample {

	public static void main(String[] args) {

		int noOfParties = 5;

		CyclicBarrier barrier = new CyclicBarrier(noOfParties);

		for (int i = 0; i < noOfParties; i++) {

			new Thread(new CyclicBarrierWork(barrier)).start();
		}

		System.out.println("\t\t\t Main is exiting");

	}

}
