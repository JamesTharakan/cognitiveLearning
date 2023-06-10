package threads.completableFuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class AsyncAndSync {

	public static void main(String[] args)  {
		
		
		Executor exe = Executors.newFixedThreadPool(3);
		
		CompletableFuture <String> cf = CompletableFuture.supplyAsync(()->"one")
										.thenApply(result -> result + "Two")
										.thenApplyAsync(result -> result + "Three")
										.thenApplyAsync(result -> result + "Four",exe);
		
		try {
			System.out.println("Final result  : "+cf.get());
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
