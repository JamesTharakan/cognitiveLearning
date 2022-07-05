package threads.Callable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class MyCallable {
	public static void main(String[] args) {

		Callable<Integer> ct = ()->{
			System.out.println("About to sleep");
			Thread.sleep(3000);
			System.out.println("Finished sleeping ");
			return 123;
		};
		
		FutureTask<Integer> ft = new FutureTask<Integer>(ct);
		
		new Thread(ft).start();
		
		try {
			System.out.println("Waiting for result. "+ " isCancelled :"+ft.isCancelled()+ " isDone :"+ft.isDone());
			System.out.println(ft.get(1,TimeUnit.SECONDS));
			
		} catch (InterruptedException | ExecutionException | TimeoutException e) {
			e.printStackTrace();
		}
		
	
	}
	

}