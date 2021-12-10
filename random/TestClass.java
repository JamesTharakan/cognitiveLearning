package random;

import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;



class TestSuper {
	int soft;
	TestSuper() {
	}

	TestSuper(int TestSupera) {
		System.out.println("TestSuper.TestSuper() :: One parameter");
	}
}

public class TestClass extends TestSuper implements TestInterface {

	static int num = 1;

	public static void main(String s[]) {
		System.out.println("How are <b>you</b>?");
	}

	public void test() {
		Hashtable ht = new Hashtable();
		ht.put(null, null);
		Collections.synchronizedMap(new HashMap());

		Thread t = new Thread();
		t.start();

		System.out.println("tes.test()");

	}

	public void abstractmethodOne() {
		// TODO Auto-generated method stub

	}

	public void abstractmethodTwo() {
		// TODO Auto-generated method stub

	}

	TestClass() {
		System.out.println("Total Memory : " + num + " ::" + Runtime.getRuntime().totalMemory() + " : "
				+ Runtime.getRuntime().freeMemory());
		new Integer(num++);
//		new TestClass();
	}

	TestClass(int a) {
		super(a);
		System.out.println("TestClass.TestClass():: a");
	}

}
