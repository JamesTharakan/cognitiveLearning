package reference;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/*
 * Testing ReferenceQueue
 */
public class ReferentQueue {
	public static void main(String[] args) {
		WhatIsHappenig wih = new WhatIsHappenig();
		ReferenceQueue <WhatIsHappenig>referenceQueue = new ReferenceQueue<WhatIsHappenig>();
		
		
		
		WeakReference <WhatIsHappenig>weakRef = new WeakReference<WhatIsHappenig>(wih, referenceQueue);
		System.out.println("Initially from weakReference : "+weakRef.get());
		wih = null;
		System.gc();
		try {Thread.sleep(2000);} catch (Exception ignored) {}

		WeakReference back = (WeakReference) referenceQueue.poll();

		if (back != null) {
			if(back==weakRef)
				System.out.println("It is same but i cant use the object");
			//however i can do something else like preparing the related objects for GC or 
			//thing to do after some object is GCed 
			WhatIsHappenig wihObject = (WhatIsHappenig) back.get();
			System.out.println("After " + wihObject); // this will be always null as the object is GCed
//			wihObject.someMethod();
		} else {
			System.out.println("Did not get anything, must be GCed by now");
		}
	}

}
class Customer{}

class WhatIsHappenig {

	WhatIsHappenig() {
		System.out.println("constructor");
	}

	void someMethod() {
		System.out.println("Called someMethod");
	}

	public void finalize() {
		System.out.println("finalize");
	}

}
