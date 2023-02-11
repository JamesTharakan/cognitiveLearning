package threads;

/**
 * Threads can be interrupted
 * A thread can poll to check if it is interrupted and can act upon that or ignore it 
 *	or
 * it can never check it and continue its task.
 * 
 * But if a thread is in wait() , join() , sleeping, InterruptedException is throw
 *
 */
public class Interrupter implements Runnable{

	public static void main(String[] args) {
		
		Thread t1 = new Thread(new Interrupter());
		
		t1.start();
		
		try {//Making main thread to wait until t1 starts
			Thread.currentThread().sleep(2000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		
		
		t1.interrupt();	// Main thread is setting the interrupt flag of t1 thread.
						// t1 should poll to check if it is interrupted by anyone or not. 
						//  It can check it and act upon that or ignore it 
						// or
						// it can never check it and continue its task.
		
		try {//Asking main to wait for t1 for its completion
			t1.join();	
			System.out.println("Thread Returned");
		} catch (InterruptedException e) {		System.out.println("main got interrupted");		}
		
		System.out.println("Even after the thread finishes we can check its interrupt status: "+t1.isInterrupted()); 
	}

	public void run() {
		System.out.println("Running");
		//Thread.sleep(5000);
		//While sleeping interrupt can't be checked 
		//i.e isInterrupted will only be true if the thread is running
		int i=0;
		for(i=0; !Thread.currentThread().isInterrupted(); i++);
		
		
		System.out.println(Thread.currentThread().isInterrupted()+ " "+i);	
	}
	
}
