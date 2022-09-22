package concepts.immutable.thread;

public class problems extends Thread{
	
	public static void main(String[] args) {
		test t = new test();
		new Thread(t,"t1").start();
		new Thread(t,"t2").start();
	}
}


class test implements Runnable{
	Integer i =0; 
//	Integer object is Immutable. It is said Immutable objects are thread safe.
//	Unless synchronized , the output is wrong sometime ..That is 'i' is changed to 2
//	So what does it mean by "Immutable Objects are thread safe"?
//	
//	Answer:No matter how many threads are there, it cannot change the actual object.
//	An new object is created every time some one tries to modify.
//	i think that is called thread safe
//	
//	mutable objects are not thread safe because multiple threads can write to that data at the same time.
	
//	Objects are immutable 
//	Critical section objects are still unsafe/unpredictable without synchronizing.
					
	public void run() {
//		 synchronized (this)  {
			while (i < 1) {
				System.out.println(Thread.currentThread().getName()+" :" + ++i);
			}
//		}
	}
}
