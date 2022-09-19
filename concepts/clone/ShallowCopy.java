package concepts.clone;


class ShallowCloneTest  implements Cloneable  {
	int a;
	String s = new String();	//Immutable Object
	Mutable m;	//Mutable Object, when cloning this, only a reference is copied

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

public class ShallowCopy {
	public static void main(String args[]) throws CloneNotSupportedException  {
		ShallowCloneTest test1 = new ShallowCloneTest();

		test1.a = 1;

		test1.s = new String("one");
		test1.m= new Mutable(); test1.m.mutableprimitiveVal =1;

		ShallowCloneTest test2  = (ShallowCloneTest)test1.clone();
		System.out.println(test1.hashCode()+"\n"+test2.hashCode());
		System.out.println(test1.s.hashCode() +" \n" + test2.s.hashCode() );
		System.out.println(test1.m.hashCode() +" \n" + test2.m.hashCode() );
		

		System.out.println("test1 :"+ test1.a + " " + test1.s + " " + test1.m );
		System.out.println("test2 :"+ test2.a + " " + test2.s + " " + test2.m );

		System.out.println( test1.m +"\n"+ test2.m );
		
		test2.a = 2;
		test2.s = new String("two");
		test2.m.mutableprimitiveVal =2;//changes actual Object m because both are referring to same immutable object
		
		System.out.println("test1 :"+ test1.a + " " + test1.s + " " + test1.m );
		System.out.println("test2 :"+ test2.a + " " + test2.s + " " + test2.m );

	}
}
/*
o/p:
	test1 :1 one 1
	test2 :1 one 1
	test1 :1 one 2
	test2 :2 two 2
*/	
