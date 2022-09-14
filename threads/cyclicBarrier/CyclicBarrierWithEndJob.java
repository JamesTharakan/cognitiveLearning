package threads.cyclicBarrier;

import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierWithEndJob {

	public static void main(String[] args) {
		int noOfParties = 50;

		CyclicBarrier barrier = new CyclicBarrier(noOfParties, ()->{System.out.println("Cyclic Barrier doing the EndJob");} )   ;

	}

}
