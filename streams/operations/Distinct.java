package streams.operations;

import java.util.Arrays;
import java.util.List;

import utils.Customer;

public class Distinct {

	public static void main(String[] args) {

		List <Integer> myList = List.of(2,3,1,2,8);
		myList.stream().distinct().forEach(System.out::println);
		
		Customer [] CustArray = new Customer[3];
		CustArray[0] =new Customer(1,"One");
		CustArray[1] =new Customer(2,"Two");
		CustArray[2] =new Customer(1,"One");
		
		Arrays.stream(CustArray).distinct()
								.forEach(cust -> System.out.println("\n"+cust));
	
	}

}


//	Arrays.asList(1,2,3,4);
//	List.of(2,3,1,2,8);