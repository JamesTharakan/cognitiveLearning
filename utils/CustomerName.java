package utils;

import java.util.Comparator;

public class CustomerName implements Comparator<Customer> {

	public int compare(Customer one, Customer two) {
		return one.getName().compareTo(two.getName());
	}

}