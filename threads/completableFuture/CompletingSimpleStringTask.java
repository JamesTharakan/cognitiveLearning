package threads.completableFuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.function.Supplier;

public class CompletingSimpleStringTask {

	public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {

		CompletableFuture<String> compFuture  = CompletableFuture.supplyAsync(new LongTask());
		
		TimeUnit.SECONDS.sleep(1);// this gives the time for the task to finish 
		
		System.out.println("Is Done :"+compFuture.isDone());
		
		if(compFuture.isDone())
			System.out.println("Done :"+compFuture.get());
		else
		{
			compFuture.complete("This is cool");
			System.out.println("Default String :"+compFuture.get());
		}
	}

}

class LongTask implements Supplier<String> {
	
	public String get() {
		System.out.println("Doing the task");
		return "Resultant string";
	}
}
