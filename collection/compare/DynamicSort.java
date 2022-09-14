package collection.compare;

import java.util.ArrayList;
import java.util.Collections;

import utils.Customer;

public class DynamicSort {

	public static void main(String[] args) {
		Customer c1 = new Customer(21,"james");
		
		Customer c2 = new Customer(5,"aajames");
		Customer c3 = new Customer(36,"bbjames");
		Customer c4 = new Customer(4,"ccjames");
		

		ArrayList<Customer> list = new ArrayList<Customer>();
		list.add(c1);	list.add(c2);		list.add(c3);		list.add(c4);
		
		System.out.println("Before sort :"+ list);
		
		Collections.sort(list, new CustomerID());
		System.out.println("\nSort by ID :"+ list);
		
		Collections.sort(list, new CustomerName());
		System.out.println("\nSort by name :"+ list);
		
		
	}

}
