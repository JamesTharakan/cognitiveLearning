package threads.completableFuture;

import java.util.concurrent.Callable;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class SimpleCompletableFuture {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		
		
		Callable callable = () ->{
								System.out.println("About to sleep");
								Thread.sleep(3000);
								System.out.println("Finished sleeping ");
								return 1;
								};
		FutureTask future = new FutureTask(callable);
								
					
		CompletableFuture<Integer> completableFuture = new CompletableFuture<Integer>();
		
		completableFuture.complete( Integer.valueOf(100));
		
		if(completableFuture.isDone()) {
			System.out.println("Result : "+ completableFuture.getNow( Integer.valueOf(100)));
			
		}else {
			System.out.println("Not finished");
		}
		
	}
	
	void test() {
		CompletableFuture<String> cf = CompletableFuture.completedFuture("message");
		 
		 System.out.println(cf.isDone());
		 System.out.println(cf.getNow(null));
	}

}
