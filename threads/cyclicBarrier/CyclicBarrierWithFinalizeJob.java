package threads.cyclicBarrier;

import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierWithFinalizeJob {

	public static void main(String[] args) {
		int noOfParties = 5;

		CyclicBarrier barrier = new CyclicBarrier(noOfParties, () -> {
			System.out.println(
					"Cyclic Barrier waited for all the threads to reach the barrier and then executing some code");
		});

	}

}
