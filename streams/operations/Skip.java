package streams.operations;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import utils.Customer;

public class Skip {

	public static void main(String[] args) {
		int [] myArray = IntStream.rangeClosed(1,10).toArray();
		Arrays.stream(myArray).skip(5).forEach(num ->System.out.print(num+" "));

		
		int [] output = Arrays.stream(myArray).skip(5).toArray();
//		primitive streams, such as IntStream, do not have a collect() method like regular Stream<T> does.
//		int [] output = Arrays.stream(myArray).skip(5).collect(); 
		
		
		Customer [] CustArray = new Customer[3];
		CustArray[0] =new Customer();	CustArray[1] =new Customer();CustArray[2] =new Customer();
		
		Arrays.stream(CustArray).skip(1)
								.collect(Collectors.toList())
								.forEach(cust -> System.out.println("\n"+cust));
	}

}
