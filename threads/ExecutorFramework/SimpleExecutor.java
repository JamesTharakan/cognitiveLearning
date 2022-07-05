package threads.ExecutorFramework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;


public class SimpleExecutor {
	public static void main(String [] args) {
		Runnable task =() ->System.out.println("Started the task");
		
		ExecutorService es = Executors.newFixedThreadPool(2);
		es.execute(task); 
		es.shutdown();		//Only after the task is completed, the service will shutdown

		System.out.println("Is Executor terminated : "+es.isTerminated());

		//This will throw RejectedExecutionException as we are assigning task after shutting down the executor
		try {
			es.submit(()->System.out.println("Will it take up this task ?  "));
		} catch(RejectedExecutionException re){
			System.out.println(re.getMessage());
		}
		
		System.out.println("Completed");
	}

}
