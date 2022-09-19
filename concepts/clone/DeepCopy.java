package concepts.clone;

class Test implements Cloneable {
	int a;
	int b;
	String s = new String();

	public Object clone() throws CloneNotSupportedException {
		ClassA temp =(ClassA)super.clone();
		
		String tempString = new String(s);
		temp.s = tempString;
		return temp;
	}
}

public class DeepCopy {
	public static void main(String args[]) throws CloneNotSupportedException {
		ClassA t1 = new ClassA();
		t1.a = 10;
		t1.b = 20;
		t1.s = new String("one");

		ClassA t2 = (ClassA) t1.clone();
		
		System.out.println(t1.a + " " + t1.b+ " " + t1.s);
		System.out.println(t2.a + " " + t2.b+ " " + t2.s);

		System.out.println("Modified second object");
		t2.a = 100;
		t2.s = new String("two");
		
		System.out.println(t1.a + " " + t1.b+ " " + t1.s);
		System.out.println(t2.a + " " + t2.b+ " " + t2.s);

		
	}
}

