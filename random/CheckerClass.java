package random;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import utils.JUtil;

public class CheckerClass {

	public static void main(String[] args) {
		logarithm();
		
	/*
		NoPloymorphismInGenerics(new ArrayList<String>());  //Should pass Object !!
		
		nonGenericCollection();
		
		floatDivision();
		
		checkArrayClass();
	*/		

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
		
		
		System.out.println("position of 10 : "+ Arrays.binarySearch(check, 10));
		System.out.println("position of 44 : "+ Arrays.binarySearch(check, 55));


		
	}

}
