package threads.basic;

public class BasicWait extends Thread {

	public static void main(String[] args) throws InterruptedException {
		BasicWait bw = new BasicWait();
		bw.start();
		
		//bw.interrupt();
	
		Thread.currentThread().sleep(5000);  	//Sleeping, so that the thread starts
		synchronized (bw) {
			bw.notify();
			System.out.println("Notified");
		}

	}

	public void run() {

		synchronized (this) {
			try {
				System.out.println("About to wait");
				this.wait();
				
			} catch (InterruptedException e) {
				System.out.println("BasicWait.run() Interrupted");
			}
		}
	System.out.println("BasicWait.run() Finished waiting");	
	}

}
