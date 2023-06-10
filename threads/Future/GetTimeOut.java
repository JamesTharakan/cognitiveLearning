package threads.Future;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/**
 * Future task is taking more time than what the main is expecting
 * So the we get TimeoutException and no result 
 * this is one useCase when CompletableFuture should be used which can complete the task with some default value.
 */
public class GetTimeOut {

	public static void main(String[] args) {


		Callable<Integer> ct = ()->{
			System.out.println("About to sleep : "+ Thread.currentThread().isDaemon());
			TimeUnit.SECONDS.sleep(5);
			System.out.println("Finished sleeping ");
			return 123;
		};
		
		FutureTask<Integer> ft = new FutureTask<Integer>(ct);
		new Thread(ft).start();
		
		try {
			System.out.println("Waiting for result. "+ " isCancelled :"+ft.isCancelled()+ " isDone :"+ft.isDone());
			System.out.println(ft.get(2,TimeUnit.SECONDS));
			
		} catch (InterruptedException | ExecutionException | TimeoutException e) {
			e.printStackTrace();
			System.out.println("Cause : "+e.getCause());
		}
		
	
	
	}

}
