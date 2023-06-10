package threads.completableFuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class VoidRunnable {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		CompletableFuture<Void> future = CompletableFuture.runAsync(() -> {
		    try {
		        TimeUnit.SECONDS.sleep(1);
		    } catch (InterruptedException e) {
		        throw new IllegalStateException(e);
		    }
		    System.out.println("Task is running as a Deamon :"+Thread.currentThread().isDaemon());
		});
	
		future.get();	//perform get() or make main to sleep/wait . So that the Deamon thread will get time to run 
//		TimeUnit.SECONDS.sleep(10);
	}

}
