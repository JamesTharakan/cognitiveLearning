package collection.compare;

import java.util.Comparator;

import utils.Customer;

public class CustomerID implements Comparator<Customer>{
	
	public int compare(Customer one, Customer two) {
		return one.getId() - two.getId();
	}

}
