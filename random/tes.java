package random;

import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.concurrent.atomic.AtomicLong;


public class tes {
	
	
		public static void main(String s[] ) {
			System.out.println("tes.main():: "+Runtime.getRuntime().availableProcessors());
		}
	
	 public void test() {
		 Hashtable  ht = new Hashtable ();
		 ht.put(null, null);
		 
		 Thread t = new Thread();
		 t.start();
		 System.out.println("tes.test()");
		 
		 
		 Collections.synchronizedMap(new HashMap());
		 
		 
		 
		 
	 }
	 
		public Foo build() {
			if (name == null)
				throw Exception();
			else
				return new Foo(name, description);
		}

}
 

class AtomicCounter {
    private AtomicLong count = new AtomicLong(0);

    public void inc() {
        boolean updated = false;
        while(!updated){
            long prevCount = count.get();
            updated = count.compareAndSet(prevCount, prevCount + 1);
        }
    }

    public long count() {
        return count.get();
    }
}
 
