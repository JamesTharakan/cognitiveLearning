package threads.Callable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class SimpleCTWithException {

	public static void main(String[] args) {

		Callable<Integer> simpleCT =new CTE();
		FutureTask<Integer> ft = new FutureTask<Integer>(simpleCT);
		Thread t = new Thread(ft);
		t.start();
		
		try {
			System.out.println(ft.get());
		} catch (InterruptedException  e ) {
			System.out.println("In InterruptedException because :"+e.getMessage());
		} catch (ExecutionException e ) {
			System.out.println("In ExecutionException because :"+e.getMessage());
			System.out.println("Wat is the Cause : "+ e.getCause());
		} 
		System.out.println("Done");
	}
}

	class CTE implements Callable<Integer>{

		public Integer call() throws Exception {
			boolean x = true;
			if(x)
				throw new Exception();
			return null;
		}
	}