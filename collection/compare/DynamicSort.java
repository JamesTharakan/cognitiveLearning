package collection.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

import utils.Customer;

public class DynamicSort {

	public static void main(String[] args) {

		ArrayList<Customer> list = new ArrayList<Customer>();
		list.add(new Customer(21, "james"));
		list.add(new Customer(5, "aa"));
		list.add(new Customer(36, "bb"));
		list.add(new Customer(4, "cc"));

		System.out.println("Before sort :" + list);

		Collections.sort(list, new CustomerID());
		System.out.println("\nSort by ID :" + list);

		Collections.sort(list, new CustomerName());
		System.out.println("\nSort by name :" + list);

		PriorityQueue<Customer> myQueue = new PriorityQueue<Customer>(new CustomerName());
		myQueue.add(new Customer(1, "asdfg"));

	}

}

class CustomerID implements Comparator<Customer> {

	public int compare(Customer one, Customer two) {
		return one.getId() - two.getId();
	}

}

class CustomerName implements Comparator<Customer> {

	public int compare(Customer one, Customer two) {
		return one.getName().compareTo(two.getName());
	}

}
