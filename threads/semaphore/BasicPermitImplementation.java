package threads.semaphore;

import java.util.concurrent.Semaphore;

public class BasicPermitImplementation {

	public static void main(String[] args) {

		Semaphore s = new Semaphore(2);

		new Thread(new takeThread(s)).start();
		new Thread(new takeThread(s)).start();
		new Thread(new takeThread(s)).start();
	}

}

class takeThread implements Runnable {
	Semaphore s = null;

	takeThread(Semaphore s) {
		this.s = s;
	}

	public void run() {

		try {

			System.out.println("About to acquire one from : " + s.availablePermits());
			s.acquire();
			
			System.out.println("Acquired");
			Thread.currentThread().sleep(3000);
			
			s.release();
			System.out.println("takeThread.run(): released");

		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
}
