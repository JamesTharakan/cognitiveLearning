
package random;

import java.io.FileNotFoundException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.LinkedBlockingQueue;

import utils.JUtil;
 
public class CheckerClass {

	final static int interest=0;;
	final int NonStaticInterest=0;;
	void test(){
		int x = interest;
		int y = NonStaticInterest;

	}
	static void  Statictest(){
		int x = interest;
//		int y = NonStaticInterest;
	}


	public static void main(String[] args) {
		new CheckerClass().test();
		
		

//		noDefaultValuesForLocalVariables();

//		maploading();
		
//		floatDivision();
//	 
//		logarithm();
//		
//		methodsOfClass();
//		
//		NoPloymorphismInGenerics(new ArrayList<String>());  //Should pass Object !!
//		
//		nonGenericCollection();
//		
//		floatDivision();

//		checkArrayClass();
		
//		builtInImmutable();
		
		
//		checkedException(); //Compiler checks if these exception are handled(catch or throw) by the program
		
//		uncheckedException();
		
//		boundedBlockingQueues();
		
		
//		cha();
//		nuller();
		
		arrayAsList();
		
//		print2DArray();
	}	
	

	private static void print2DArray() {
		int[][] arr = new int[][]{{1,2},{4,5},{7,8}};
		
		for (int row = 0; row < arr.length; row++) {

			for (int col = 0; col < arr[row].length; col++) {
				System.out.print(arr[row][col]+" ");
			}
			System.out.println();
		}
}
	private static void arrayAsList() {
		Integer [] objectArray = new Integer[10];
	    System.out.println(Arrays.asList(objectArray));

	    int [] intArray = new int[100];
	    System.out.println(Arrays.asList(intArray));
	    System.out.println(Arrays.asList(new int[] {1,2,3,4})); 
	    
	    System.out.println(Arrays.asList(1,2,3,4));
	    
	    List listOne =Arrays.asList(1,2,3,4);
	    System.out.println("Class name :" +listOne.getClass().getName());
	    
	    List listTwo =Arrays.asList(intArray);
	    System.out.println("Class name :" +listTwo.getClass().getName());
		
	}
	private static void nuller() {
		List<Object> objs = new ArrayList<Object>(10);
		
		System.out.println("CheckerClass.nuller()"+ objs.isEmpty());

		for (int i = 0; i < objs.size(); i++) {
			System.out.println("CheckerClass.nuller()");
		}
		System.out.println("CheckerClass.nuller():: out ");
		
		
	}
	
	private static void cha() {
		char captialA = 65;
		char captialZ = 90;
		
		char smallA = 97;
		char smallZ = 122;
		
		
		System.out.println(captialA);
		System.out.println(captialZ);
		
		
		System.out.println(smallA);
		System.out.println(smallZ);
		
	}

	
	private static void boundedBlockingQueues() {
		ArrayList<Object> al = new ArrayList<Object>(5);
		System.out.println("Inital size of arraylist created with a defined size :"+al.size());
		
		BlockingQueue <Object>blockingQueue = new LinkedBlockingQueue<Object>(5);
		
		for (int i = 1; i <= 6; i++) {
			System.out.println("Size: "+blockingQueue.size());
			blockingQueue.add( new Object());
		}
		
		
		
	}
	
	// Only instance level variables will have default values
	private static void noDefaultValuesForLocalVariables() {
		 int ii ; boolean bb;
//		System.out.println("CheckerClass.main()"+ bb +" "+ ii);
		
	}
	private static void checkedException()/* throws FileNotFoundException */ {
		try{
			throw new FileNotFoundException();
		}catch(FileNotFoundException ex) {
			System.out.println("We have to catch or declare as it throws a checked exception");
		}
		
		
		
	}
	private static void uncheckedException() {
		System.out.println("We dont catch or declare, as it throws a UNchecked exception ");
		 throw new NullPointerException();
//		 throw new ArithmeticException();  //unreachable code
	}
	private static void builtInImmutable() {
		 String S = new String("one");
			System.out.println("1:"+ S.hashCode());
			S= S+"two";
			System.out.println("2:"+ S.hashCode());
			
			Integer test = Integer.valueOf(1);
			System.out.println("1:"+ test.hashCode());
			test++;
			System.out.println("2:"+ test.hashCode());
		
	}
	private static void maploading() {
		 HashMap<String, Integer> map = new HashMap<String,Integer>();
		 
		 map.put("aba", 1);
		 System.out.println(map.containsKey("aba"));
		 System.out.println(map.get("aba"));
		 
		 System.out.println(map.get("xyz"));
		 map.put("xyz", null);
		 
		 System.out.println("Its just that Value is NULL:: "+map.get("xyz")); //So use Contains Key
		
		 map.put("aba", 2);
		 System.out.println(map);
		
	}
	static void methodsOfClass() {
		 try {
	            Class c = Class.forName("java.util.Stack");
	            Method m[] = c.getDeclaredMethods();
	            for (int i = 0; i < m.length; i++)
	            System.out.println(m[i].toString());
	         }
	         catch (Throwable e) {
	            System.err.println(e);
	         }
		
	}

	/**
	 *  In logarithm graph time curve decelerates as n increases
	 */
	private static void logarithm() {
		 int n =100;
		 int log =0;
		 
		 System.out.println("CheckerClass.logarithm()");
		for (float i = 1; i < n; i++) {
			for (float j = 1; j <= i; j = j * 2) {
				log++;
			}
			int percent =(int) ((log/i)*100);
			System.out.println("i :"+(i+0)+" Log: "+ log + "--> executes the statement "+percent+" %");
			log=0;
		}
	}

	/**
	 * This no Ploymorphism is to make sure only one Type of data exists in the list.
	 * Just to avoid a third party from adding a different type of data
	 */
	  static void NoPloymorphismInGenerics(List <Object>List) {
		// List <Object>myList = new ArrayList<String>();   //this line also gives compiler error
		
		//But the below is possible
		List <Object>myList = new ArrayList<Object>();   
		myList.add("abc"); 
		
	}
	/**
	 * Is this useful to retrieve specific kind of Object from non-generic collection ?
	 */
	  static void nonGenericCollection() {
		List myList = new ArrayList();

		myList.add(5);
		myList.add("abc");
		
		Iterator it = myList.iterator();
		
		while(it.hasNext()){
			Object temp = it.next();
			if( temp instanceof String){
				System.out.println("" +temp);
			}else {
				System.out.println(temp.getClass());
			}
		}
		
	}
	
	/**
	 * Just add the decimal point to get the complete fraction
	 */
	private static void floatDivision() {
		System.out.println(23/100);
		System.out.println(23%100);
		
		System.out.println();
		System.out.println(23 / 100.0);
		System.out.println(23 % 100.00);
		
		System.out.println();
		System.out.println(33 / 100.000);
	}

	/**
	 * 
	 * Use this sort API. Very useful !!
	 */
	 static void checkArrayClass() {
		
		int check[]=  {7,8,9,10,1,2,3,4,5,6};
		
		JUtil.printIntArray("Unsorted", check);
		System.out.println("");
		Arrays.sort(check);
		JUtil.printIntArray("Sorted", check);
		
		//if not found, it will return the position where it should be inserted
		System.out.println("position of 10 : "+ Arrays.binarySearch(check, 10));
		System.out.println("position of 55 : "+ Arrays.binarySearch(check, 55));
	}


}



