package random.simple;


/**
 * Only static instance variable will have default values
 */
public class DefaultValuesFor {
	int instanceVariable;
	static int staticInstanceVariable;
	
	public static void main(String[] args) {
		
		System.out.println(" staticInstanceVariable"+ staticInstanceVariable);
//  	 System.out.println("instanceVariable : "+ instanceVariable );  instance object is not yet created

		 new DefaultValuesFor().check();
	}
	
	
	public void check() {
		System.out.println("instanceVariable : "+ instanceVariable );
		
		
		 int ii ;
		 boolean bb;
//		 System.out.println("CheckerClass.main()"+ bb +" "+ ii);
		
	}

}
