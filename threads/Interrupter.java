package threads;

public class Interrupter implements Runnable{
	String name ;
	public Interrupter(String string) {
		name =string;
	}

	public static void main(String[] args) {
		
		Thread t1 = new Thread(new Interrupter("I1"));
		Thread t2 = new Thread(new Interrupter("\t\tI2"));
		
		t1.start();
		t1.interrupt();
		
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			System.out.println("NeverMind");
		}
		
		System.out.println(t1.isInterrupted()+" : "+t2.isInterrupted()); //false because,the thread was sleeping 
																		//	and not alive
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
