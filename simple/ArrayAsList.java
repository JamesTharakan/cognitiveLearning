package simple;

import java.util.Arrays;

public class ArrayAsList {

	public static void main(String[] args) {

		Integer [] objectArray = new Integer[10];
	    int [] intArray = new int[100];

	    System.out.println(Arrays.asList(objectArray));
	    System.out.println(Arrays.asList(intArray));
	    System.out.println(Arrays.asList(new int[] {1,2,3,4})); 
	    System.out.println(Arrays.asList(1,2,3,4));
	}

}
