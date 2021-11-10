package threads.basic;

public class ThreadInfo {

	public static void main(String[] args) {
		System.out.println(" Number of threads: " + Thread.activeCount());

		System.out.println(" Current : " + Thread.currentThread());
		System.out.println(" Name : " + Thread.currentThread().getName());
		
		System.out.println(" Priority : " + Thread.currentThread().getPriority());
		System.out.println(" ID : " + Thread.currentThread().getId());
		
		System.out.println(" State : " + Thread.currentThread().getState());
		System.out.println(" isAlive : " + Thread.currentThread().isAlive());

	}

}
