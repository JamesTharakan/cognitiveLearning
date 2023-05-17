package puzzles.threads;

public class EvenOdd {

	public static void main(String[] args) {
		System.out.println("EvenOdd");
		new Thread(new EvenOddPrinter(1), "odd:").start();
		new Thread(new EvenOddPrinter(0), "Even:").start();
	}
}

class EvenOddPrinter implements Runnable {

	static int counter = 1;
	static Object lock = new Object();

	public void run() {
		while (counter < 15 ) {

			synchronized (lock) {

				while (counter % 2 != reminder) {

					try {
						lock.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println(Thread.currentThread().getName() + " " + counter++);
				lock.notifyAll();

			}
		}
	}

	int reminder;

	public EvenOddPrinter(int i) {
		reminder = i;
	}
}
