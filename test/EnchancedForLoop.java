package test;

import java.util.stream.IntStream;
import java.util.stream.Stream;

import utils.Customer;

/**
 * We cannot track the index if these used. 
 * In case of primitives this becomes a drawback as we cannot modify the current item in the original array. 
 * They can only iterate forward in single steps. No reverse order. No jumping.
 */
public class EnchancedForLoop {

	public static void main(String[] args) {
		
		modifyPrimitiveWithForEach();
		System.out.println();
		modifyObjectWithForEach();
		
	}

	private static void modifyPrimitiveWithForEach() {
		int myArray[] = IntStream.rangeClosed(1,5).toArray();
		
		for(int i : myArray) 
			System.out.print(i+" ");
		
		for(int i : myArray) 
			i=i+1;

		for(int i : myArray) 
			System.out.print(i+" ");
	}

	private static void modifyObjectWithForEach() {
		Customer []cust = {new Customer("Test")};
		
		for(Customer c :cust) {
			c.setName("Changed");
		}
		System.out.println(cust[0]);
		
	}
}
