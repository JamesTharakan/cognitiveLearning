package threads.completableFuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

/**
 *Line1 creates a CF object which returns a String. But no task is assigned yet.
 *We simply completed the CF object's task by calling complete() with String argument
 *which will be used as a return value of the CF task 
 */    
public class SimpleCompletableFuture {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		//Line 1
		CompletableFuture<String> completableFutureObject = new CompletableFuture<String>();
		
		completableFutureObject.complete("Future's Result");
		
		System.out.println(completableFutureObject.get());
	}
}
