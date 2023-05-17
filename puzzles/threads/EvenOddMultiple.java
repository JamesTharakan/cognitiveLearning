package puzzles.threads;

public class EvenOddMultiple {

	public static void main(String[] args) {
		new Thread(new EvenOddMultiplePrinter(2, 0), "	Even:").start();
		new Thread(new EvenOddMultiplePrinter(2, 1), "		odd:").start();
		new Thread(new EvenOddMultiplePrinter(3, 0), "Multi:").start();
	}
}

class EvenOddMultiplePrinter implements Runnable {

	static Object lock = new Object();

	static int counter = 1;
	static int endPoint = 9;

	int divisor;
	int reminder;

	public EvenOddMultiplePrinter(int d, int r) {
		divisor = d;
		reminder = r;
	}

	public void run() {
		long start = System.currentTimeMillis();
		synchronized (lock) {
			while (counter <=endPoint  ) {

				if (counter % divisor == reminder) {

					if (counter % 3 == 0 && (divisor != 3)) {
						try {
							lock.wait();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					if(counter <=endPoint)//Double check 
						// counter++;
						System.out.println(Thread.currentThread().getName() + " " + counter++);
					
					lock.notify();
				} else {

					try {
						lock.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			} // end of outer while
		} // end of sync
		System.out.println("Total time : "+(System.currentTimeMillis()-start));
	}

}
