package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class streamMethods {

	public static void main(String[] args) {

		streamMethods caller = new streamMethods();
		
		
		caller.orElse();
		
//		caller.removeNUllFromList();
		
		caller.size();
	}

	
	
	private void orElse() {				//Optional Class
		List<Customer> customers = new ArrayList<Customer>(5);
		customers.add(new Customer("Something"));
		customers.add(new Customer("tharakan"));
		customers.add(new Customer("James"));
		Customer orElse = customers.stream().filter(tempCust -> "Bames".equals(tempCust.getName()))
				.findAny()
				.orElse(null);
		
		System.out.println("orElse : "+orElse);
		
		customers.stream().filter(customer -> customer.getName().contains("th"))
				.forEach(customer  -> System.out.println(customer.getName()));
		
				
		
	}

	private void size() {
		Stream s = Stream.of("Ava", "Aneri", "Alberto");
		System.out.println("UnLike Iterators, Streams cant be reused:  "+s.count());
//		System.out.println("Streams cant be reused2: "+s.count());   can be reused
		
		List list =new ArrayList(2); ; 
		Stream listStream = list.stream(); 
		System.out.println("Empty source return empty stream : "+listStream.count());
		
	}

	void removeNUllFromList() {

		List<Integer> list = new ArrayList<Integer>(4);

		List<Integer> direct = list.stream().filter(tempObj -> tempObj == null).collect(Collectors.toList());

		List<Integer> listWithoutNulls = list.stream().filter(Objects::nonNull).collect(Collectors.toList());
		System.out.println("listWithoutNulls" + listWithoutNulls);

		List<Integer> listWithNulls = list.stream().filter((Objects::isNull)).collect(Collectors.toList());
		System.out.println("listWithNulls" + listWithNulls);
		

		
	}
}

class Customer {

	private int id;
	private String name;

	public String getName() {
		return name;
	}
	Customer(String n){
		name = n;
	}
	
	public String toString() {
		return name;
	}

}