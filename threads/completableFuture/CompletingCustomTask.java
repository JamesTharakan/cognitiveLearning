package threads.completableFuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;

public class CompletingCustomTask {

	public static void main(String[] args) throws  ExecutionException, InterruptedException {

		CompletableFuture <Integer> task = CompletableFuture.supplyAsync(new CustomTask());
		
//		TimeUnit.SECONDS.sleep(1);

		if(task.isDone())
			System.out.println("Done : "+task.get());
		else {
			task.complete(Integer.valueOf(456));
			System.out.println("Got default value :"+task.get());
		}
	}
}


class CustomTask implements Supplier<Integer>{
	
	public Integer get() {
		System.out.println("Doing the task");
		return 123;
	}
}