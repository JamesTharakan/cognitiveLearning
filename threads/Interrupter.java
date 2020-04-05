package threads;

public class Interrupter implements Runnable{
	String name ;
	public Interrupter(String string) {
		name =string;
	}

	public static void main(String[] args) {
		
		Thread t1 = new Thread(new Interrupter("T1"));
		Thread t2 = new Thread(new Interrupter("\t\tT2"));
		
		t1.start();
		t1.interrupt();
		
		t2.start();
		
		try {
			t1.join();		//Asking main to wait for t1 and t2 for its completion
			t2.join();
		} catch (InterruptedException e) {
			System.out.println("NeverMind");
		}
		
		System.out.println(t1.isInterrupted()+" : "+t2.isInterrupted()); 
		//false because,the thread was sleeping and not alive. i.e isInterrupted will only be true if the thread is running
		System.out.println("run() cannot throw exception ");
		

	}

	public void run() {
		System.out.println(this + " : I am running");
		try {
			System.out.println(this +" : I am about to sleep ");
			Thread.sleep(5000);
			System.out.println(this +" : I am back");
		} catch (InterruptedException e) {
			System.out.println(this +" : Somebody Interrupted me !!!!!");
		}
	}
	
	public String toString(){
		return name;
	}

}
