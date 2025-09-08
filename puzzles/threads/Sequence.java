package puzzles.threads;

public class Sequence {

	public static void main(String[] args) {
		System.out.println("Sequence");
		new Thread(new SequencePrinter(1), "T1:").start();
		new Thread(new SequencePrinter(2), "T2:").start();
		new Thread(new SequencePrinter(0), "T3:").start();
	}
}

class SequencePrinter implements Runnable {

	static int counter = 1;
	static Object lock = new Object();

	public void run() {

		while (counter < 6 - 1) {

			synchronized (lock) {

				while (counter % 3 != reminder) {

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

	public SequencePrinter(int i) {
		reminder = i;
	}
}
