package concepts.clone;


class Test  implements Cloneable  {
	int a;
	String s = new String();	//Immutable Object
	Mutable c;			//Mutable Object

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

public class ShallowClone {
	public static void main(String args[]) {
		Test t1 = new Test();

		t1.a = 10;		t1.s = new String("one");
		Mutableclone obj = new Mutableclone();	
//		obj.mc =1;
		t1.c =  null;

//		Test t2 =null;
//		try {
//			t2 = (Test) t1.clone();
//		} catch (CloneNotSupportedException e) {
//			System.out.println("CloneNotSupportedException "+e.getMessage());
//		}

		System.out.println(t1.a + " " + t1.s + " " + t1.c.mc );
//		System.out.println(t2.a + " " + t2.s + " " + t1.c.mc);
//
//		System.out.println("After modifying second object");
//		t2.a = 100;
//		t2.s = new String("two");
//		
//		System.out.println(t1.a + " " + t1.s + " "/* + t1.c.getName() */);
//		System.out.println(t2.a + " " + t2.s + " "/* + t1.c.getName() */);
	}
}
