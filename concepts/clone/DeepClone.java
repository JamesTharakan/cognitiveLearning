package concepts.clone;

/**
 * 
If this Object implementing the Cloneable interface, it will create a new Object with following rules: 
1.	it will create an exact copy of all its primitive .
2.	it will copy the reference of all its immutable instance variable objects.
3.	For other objects of the instance, 
	a.	it will copy the reference if they don’t implement cloneable.
	b.	If it implements cloneable , recursive
 */
class DeepcloneTest implements Cloneable{
	int a ;
	String s;
	ClonableMutable c;
	
	public Object clone() throws CloneNotSupportedException{
		DeepcloneTest temp = (DeepcloneTest)super.clone();
		temp.c= (ClonableMutable)temp.c.clone();
		return temp;
	}
}

public class DeepClone {

	public static void main(String[] args) {
		DeepcloneTest test1 = new DeepcloneTest();
		
		test1.a =1;
		test1.s = new String("One");
		test1.c = new ClonableMutable(); test1.c.primitiveVal=1;
		
		
		DeepcloneTest test2 = null;
		
		try {
			test2= (DeepcloneTest)test1.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Object : "+test1.hashCode()+":"+test2.hashCode());
		System.out.println("String : "+test1.s.hashCode() +" :" + test2.s.hashCode());
		System.out.println("ClonableMutable :"+test1.c.hashCode() +" :" + test2.c.hashCode());
		
		System.out.println("test1 :"+ test1.a + ", " + test1.s + ", " + test1.c.primitiveVal );
		System.out.println("test2 :"+ test2.a + ", " + test2.s + ", " + test2.c.primitiveVal );
		
		test2.a =2;
		test2.s = new String("two");
		test2.c.primitiveVal=2;
		System.out.println("Update cloned instance");
		
		System.out.println("test1 :"+ test1.a + ", " + test1.s + ", " + test1.c.primitiveVal );
		System.out.println("test2 :"+ test2.a + ", " + test2.s + ", " + test2.c.primitiveVal );
		
		

	}

}
