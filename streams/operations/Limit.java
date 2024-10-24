package streams.operations;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import utils.Customer;

public class Limit {

	public static void main(String[] args) {
		
		int [] myArray = IntStream.rangeClosed(1,10).toArray();
		Arrays.stream(myArray).limit(3).forEach(System.out::println);
		
		Customer [] CustArray = new Customer[3];
		CustArray[0] =new Customer();
		CustArray[1] =new Customer();
		CustArray[2] =new Customer();
		
		Arrays.stream(CustArray).limit(2)
								.collect(Collectors.toList())
								.forEach(cust -> System.out.println("\n"+cust));
	}

}
