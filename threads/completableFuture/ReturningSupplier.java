package threads.completableFuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;

public class ReturningSupplier {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		CompletableFuture<String> compFuture = CompletableFuture.supplyAsync(new MySupplier());

// Blocking if the task is not completed
		System.out.println(compFuture.get());

	}

}

//Better do this using Lambda
//the default ForkJoin Pool creates Daemon threads
class MySupplier implements Supplier<String> {
	public String get() {
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			throw new IllegalStateException(e);
		}
		return "Completed Supplier. " + " Is this Daemon : " + Thread.currentThread().isDaemon();
	}
}
