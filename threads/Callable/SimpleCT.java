package threads.Callable;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class SimpleCT {

	public static void main(String[] args) {

		Callable<Integer> simpleCT =()->{return new Random().nextInt();};
		
		
		FutureTask<Integer> ft = new FutureTask<Integer>(simpleCT);
		Thread t = new Thread(ft);
		t.start();
		
		
		try {
			System.out.println(ft.get());
		
		} catch (InterruptedException |ExecutionException e ) {
			e.printStackTrace();
		}
	}

}
