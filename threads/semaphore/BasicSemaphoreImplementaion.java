package threads.semaphore;

public class BasicSemaphoreImplementaion {

	public boolean isNotified = false;
	
	
	public synchronized void take(Object obj) {
		
		// Do some operation 
		 isNotified = true;			// Basically, saving the notification just in-case nobody is waiting right now
		 
		 this.notify();
	}
	
	
	public synchronized void release() throws InterruptedException {
		
		while(! isNotified){		// wait as nobody has added
			this.wait();
		}
		// Do some operation 
		 isNotified = false;
	}

}
