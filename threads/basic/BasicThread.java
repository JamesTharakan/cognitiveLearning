package threads.basic;

public class BasicThread {

	public static void main(String[] args) {

		Thread worker = new Thread(new JobOne(), "James");
		worker.start();

		worker = new Thread(new JobTwo());
		worker.setName("Tharakan");
		worker.start();

		System.out.println(worker.getName() +" Is Alive : " + worker.isAlive());
		
	}
}

class JobOne implements Runnable {
	public void run() {
		System.out.println(
				Thread.currentThread().getName() + "  EmpID::" + Thread.currentThread().getId() + "  Finished JobOne");
	}
}

class JobTwo implements Runnable {
	public void run() {
		System.out.println(
				Thread.currentThread().getName() + "  EmpID::" + Thread.currentThread().getId() + "  Finished JobTwo");
	}
}