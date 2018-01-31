package concepts.immutable.thread;

public final class ImmutableClass implements Runnable{

	private int k; 
	
	ImmutableClass(int k) {
		this.k = k;
	}
	public void run() {
		try {
			if (k == 1) {

				k=2;
				Thread.sleep(100);
				System.out.println("Changed the value to 2 "+k);
				
			} else {
				k = 1;
				Thread.sleep(100);
				System.out.println("Changed the value to 1 "+k);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
