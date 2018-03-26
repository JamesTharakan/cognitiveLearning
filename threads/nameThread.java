package threads;

public class nameThread extends Thread {

	public nameThread() {
	super("customName"); // Store the thread name
		start();
	}

	public String toString() {
		return getName();
	}

	public void run() {
		System.out.println(this+":"+currentThread().getPriority());
	}

	public static void main(String[] args) {
		new nameThread();
		new nameThread().setPriority(MAX_PRIORITY);;
		new nameThread().setPriority(MIN_PRIORITY);;
	}

}
