package threads.syncProblems;

/**
 * 
 * Thread A: Retrieve c. <br>
 * Thread B: Retrieve c. <br>
 * Thread A: Increment retrieved value; result is 1. <br>
 * Thread B: Decrement retrieved value; result is -1. <br>
 * Thread A: Store result in c; c is now 1. <br>
 * Thread B: Store result in c; c is now -1 <br>
 * Thread A's result is lost, overwritten by Thread B.<br>
 * If the end vale is 1 or -1 then the interference has happened.Run multiple
 * times
 * Losing one thread work because of other thread
 * @author jtharaka
 *
 */
public class Interference {

	public static void main(String[] args) {
		Counter count = new Counter();

		System.out.println(" Begin Count :" + count.value());

		Thread t1 = new Thread(new Incrementer(count));
		Thread t2 = new Thread(new Decrementer(count));

		t1.start();
		t2.start();

		System.out.println(" End Count :" + count.value());

		System.out.println("Read the class doc");

	}

}

class Decrementer implements Runnable {
	Counter c;

	public Decrementer(Counter count) {
		c = count;
	}

	public void run() {
		c.decrement();

	}
}

class Incrementer implements Runnable {
	Counter c;

	public Incrementer(Counter count) {
		c = count;
	}

	public void run() {
		c.increment();

	}
}

class Counter {
	private int c = 0;

	public void increment() {
		c++;
	}

	public void decrement() {
		c--;
	}

	public int value() {
		return c;
	}

}