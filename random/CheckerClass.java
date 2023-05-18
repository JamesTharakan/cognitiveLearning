
package random;

import java.util.Arrays;

import utils.JUtil;
 
public class CheckerClass {

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


//	  Use this sort API. Very useful !! 
	 static void checkArrayClass() {
		
		int check[]=  {7,8,9,10,1,2,3,4,5,6};
		
		Arrays.sort(check);
		JUtil.printIntArray("Sorted", check);
		
		//if not found, it will return the position where it should be inserted
		System.out.println("position of 10 : "+ Arrays.binarySearch(check, 10));
		System.out.println("position of 55 : "+ Arrays.binarySearch(check, 55));
	}


}