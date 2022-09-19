package concepts.clone;


class DcloneTest implements Cloneable{
	int a ;
	String s;
	ClonableMutable c;
	
	public Object clone() throws CloneNotSupportedException{
		DcloneTest temp = (DcloneTest)super.clone();
		temp.c= (ClonableMutable)temp.c.clone();
		return temp;
	}
}

public class Dclone {

	public static void main(String[] args) {
		DcloneTest test1 = new DcloneTest();
		
		test1.a =1;
		test1.s = new String("One");
		test1.c = new ClonableMutable(); test1.c.primitiveVal=1;
		
		
		DcloneTest test2 = null;
		
		try {
			test2= (DcloneTest)test1.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(test1.hashCode()+"\n"+test2.hashCode());
		System.out.println(test1.s.hashCode() +" \n" + test2.s.hashCode());
		System.out.println(test1.c.hashCode() +" \n" + test2.c.hashCode());
		
		System.out.println("test1 :"+ test1.a + " " + test1.s + " " + test1.c.primitiveVal );
		System.out.println("test2 :"+ test2.a + " " + test2.s + " " + test2.c.primitiveVal );
		
		test2.a =2;
		test2.s = new String("two");
		test2.c.primitiveVal=2;
		
		System.out.println("test1 :"+ test1.a + " " + test1.s + " " + test1.c.primitiveVal );
		System.out.println("test2 :"+ test2.a + " " + test2.s + " " + test2.c.primitiveVal );
		
		

	}

}
