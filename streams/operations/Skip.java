package streams.operations;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import utils.Customer;

public class Skip {

	public static void main(String[] args) {
		
		basicSkips();
		
		
		int [] myArray = IntStream.rangeClosed(1,10).toArray();
		
		System.out.print("intStream: ");
			Arrays.stream(myArray).skip(5).forEach(num ->System.out.print(num+" "));
		
		System.out.print("\nMore Skips: ");
			Arrays.stream(myArray).skip(20).forEach(num ->System.out.print(num+" "));
		
		System.out.print("\nNegative Skips: ");
			Arrays.stream(myArray).skip(-1).forEach(num ->System.out.print(num+" "));
		

		
	}

	private static void basicSkips() {
		
		int [] myArray = IntStream.rangeClosed(1,10).toArray();
	
		
		Arrays.stream(myArray).skip(5).forEach(num ->System.out.print(num+" "));

		
		int [] output = Arrays.stream(myArray).skip(5).toArray();
		
//		int [] output = Arrays.stream(myArray).skip(5).collect(); //Why can't i use collector
		
		
		Customer [] CustArray = new Customer[2];
		CustArray[0] =new Customer();
		CustArray[1] =new Customer();
		Arrays.stream(CustArray).skip(1).collect(Collectors.toList());
		
		System.out.println("\nbasicSkips Done");
		
	}

}
