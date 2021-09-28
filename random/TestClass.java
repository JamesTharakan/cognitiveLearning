package random;

import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;


class TestSuper{
	TestSuper(){
		System.out.println("TestSuper.TestClass.enclosing_method()");
	}
	TestSuper(int TestSupera){
		
	}
}
public class TestClass  extends TestSuper implements TestInterface{

	public static void main(String s[]) {
//		System.out.println("tes.main():: " + Runtime.getRuntime().availableProcessors());
		TestClass t = new TestClass(1);
//		t.defaultMethod();
//		t.defaultMethod(123);
		
		
	}

	public void test() {
		Hashtable ht = new Hashtable();
		ht.put(null, null);

		Thread t = new Thread();
		t.start();
		System.out.println("tes.test()");

		Collections.synchronizedMap(new HashMap());
	}

	public void abstractmethodOne() {
		// TODO Auto-generated method stub
		
	}

	public void abstractmethodTwo() {
		// TODO Auto-generated method stub
		
	}
	
	TestClass(){
		System.out.println("TestClass.TestClass()");
	}
	
	TestClass(int a ){
		super(a);
		System.out.println("TestClass.TestClass():: a");
	}

}
