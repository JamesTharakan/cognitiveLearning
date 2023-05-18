package utils;

import java.util.Comparator;

public class CustomerID implements Comparator<Customer> {

	public int compare(Customer one, Customer two) {
		return one.getId() - two.getId();
	}

}
