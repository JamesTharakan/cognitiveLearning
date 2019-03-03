package threads.basic;

public class nameThread extends Thread {

	public nameThread(String name ) {
		super(name);
	}


	public void run() {
		System.out.println(" This :"+this+
				"\n Current :"+Thread.currentThread()+
				"\n Name :"+Thread.currentThread().getName()+
				"\n Priority :"+currentThread().getPriority()+
				"\n ID :"+this.getId()+
				"\n State :"+this.getState()+
				"\n isAlive :"+this.isAlive());
	}

	public static void main(String[] args) {
		System.out.println("Name of main Thread :"+Thread.currentThread());
		new nameThread("Head").start();
//		new nameThread("Mid").setPriority(MAX_PRIORITY);;
//		new nameThread("Tail").setPriority(MIN_PRIORITY);;
	}

}
