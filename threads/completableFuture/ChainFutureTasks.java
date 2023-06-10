package threads.completableFuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class ChainFutureTasks {

	public static void main(String[] args)  {
		
		CompletableFuture <String> cf = CompletableFuture
										.supplyAsync(() -> {return "Part A ";})
										.thenApplyAsync(result -> {return result + "Part B";});
		
		try {
			System.out.println("Final result  : "+cf.get());
		} catch (InterruptedException | ExecutionException e) {
			e.getCause();
		}
	}

}
