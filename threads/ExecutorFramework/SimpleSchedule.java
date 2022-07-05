package threads.ExecutorFramework;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class SimpleSchedule {

	public static void main(String[] args) {

		ScheduledExecutorService es = Executors.newScheduledThreadPool(2);
		
		es.schedule(() -> System.out.println("Fixed Rate Scheduled"), 3 , TimeUnit.SECONDS);
		
		es.execute(() -> System.out.println("I can take regular taks too"));
		es.execute(() -> System.out.println("I am the 3rd task in a 2 threads pool"));
		
		es.shutdown();
		System.out.println("Main is done");
		
	}

}
