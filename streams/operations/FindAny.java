package streams.operations;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import utils.Customer;

/**
 * The behavior of Stream findAny() operation is explicitly non-deterministic i.e,
 *  it is free to select any element in the stream.
 *  Multiple invocations on the same source may not return the same result.
 */
public class FindAny {

	public static void main(String[] args) {
		List<Customer> customers = new ArrayList<Customer>(5);

		customers.add(new Customer("SomeOne"));
		customers.add(new Customer("tharakan"));
		customers.add(new Customer("James"));
		customers.add(new Customer("thanks"));

		Optional<Customer> resultantCust = customers.stream().filter(tempCust -> "nobody".equals(tempCust.getName()))
				.findAny();
		
		System.out.println("0. resultantCust : "+resultantCust.isPresent());

		
		Customer resultantCust1 = customers.stream().filter(tempCust -> "Bames".equals(tempCust.getName()))
													.findAny()
													.orElse(null);
		System.out.println("1. resultantCust : " + resultantCust1);

		
		Customer resultantCust2 = customers.stream().filter(tempCust -> "Jam".equals(tempCust.getName()))
													.findAny()
													.orElse(new Customer()); // Return a default object , if nothing is found

		System.out.println("2. resultantCust : " + resultantCust2);

		customers.stream().filter(customer -> customer.getName().contains("an"))
				.forEach(customer -> System.out.println(customer.getName()));

	}

}
