
package concepts.simple;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

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

		maploading();
		
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
			}
		}
		
	}
	
	/**
	 * Just add the decimal point to get the complete fraction
	 */
	private static void floatDivision() {
		System.out.println(23/100);
		System.out.println(23%100);
		
		System.out.println(23 / 100.0);
		System.out.println(23 % 100.0);
		
		System.out.println(33 / 100.00);
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
		System.out.println("position of 44 : "+ Arrays.binarySearch(check, 55));
	}
}