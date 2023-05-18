package streams.operations;

import java.util.Arrays;
import java.util.stream.IntStream;

import utils.Customer;
import utils.CustomerID;

public class Sort {

	public static void main(String[] args) {

		int[] myArray = IntStream.rangeClosed(1, 10).toArray();
		Arrays.stream(myArray).sorted().forEach(System.out::print);

		System.out.println("\n\nCustom sort using a comparator");
		Customer[] names = { new Customer("abc"), new Customer("def") };
		Arrays.stream(names).sorted(new CustomerID()).forEach(System.out::println);

	}

}
