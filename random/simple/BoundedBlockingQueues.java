package random.simple;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Before adding in BlockingQueue 
 * check the size & Wait if full
 */
public class BoundedBlockingQueues {

	public static void main(String[] args) {

		BlockingQueue <Object>blockingQueue = new LinkedBlockingQueue<Object>(5);
		
		for (int i = 1; i <= 6; i++) {
			System.out.print("Current Size: "+blockingQueue.size());
			blockingQueue.add( new Object());
			System.out.println(", Added Object ");
		}

	}

}
