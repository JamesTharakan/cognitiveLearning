 

package puzzles.threads;

public class SequenceSimpleIF {

	public static void main(String[] args) {
		System.out.println("Sequence printer 1");
		new Thread(new SequencePrinter1(1), "T1:").start();
		new Thread(new SequencePrinter1(2), "T2:").start();
		new Thread(new SequencePrinter1(0), "T3:").start();
	}
}

class SequencePrinter1 implements Runnable {

	static int counter = 1;
	static Object lock = new Object();

	public void run() {

		while (counter < 15 - 1) {

			synchronized (lock) {

				if(counter % 3 == reminder) {
					System.out.println(Thread.currentThread().getName() + " " + counter++);
					lock.notifyAll();
				}else {
					try {
						lock.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}

			}
		}
	}

	int reminder;

	public SequencePrinter1(int i) {
		reminder = i;
	}
}

