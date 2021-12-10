package reference;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/*
 * Testing ReferenceQueue
 */
public class ReferentQueue {
	public static void main(String[] args) {
		WhatIsHappenig wih = new WhatIsHappenig();
		ReferenceQueue referenceQueue = new ReferenceQueue();
		WeakReference softRef = new WeakReference(wih, referenceQueue);

		wih = null;
		System.gc();
		try {Thread.sleep(2000);} catch (Exception ignored) {}

		WeakReference back = (WeakReference) referenceQueue.poll();

		if (back != null) {
			if(back==softRef)
				System.out.println("It is same but i cant use the object");
			//however i can do something else, like, thing to do after some object is GCed 
			
			WhatIsHappenig wihObject = (WhatIsHappenig) back.get();
			System.out.println("After " + wihObject);
			
//			wihObject.someMethod();
		} else {
			System.out.println("Did not get anything");
		}
	}

}

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
