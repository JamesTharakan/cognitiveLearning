package concepts.javaUpdates.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class LambdaExcersice {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
                new Person("Charles", "Dickens", 60),
                new Person("Lewis", "Carrol", 42),
                new Person("Thomas", "Carlyle", 51),
                new Person("Charlotte", "Bronte", 45),
                new Person("Matthew", "Arnold", 38)
        );
		
		
		System.out.println("Sort by lastName");
		//implementation of Comparator
		Collections.sort(people,
				(p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));
		
		people.forEach(p -> System.out.println(p));
		
		
		System.out.println("\nSort by lastName starting with C");
		people.forEach(p -> {
			if(p.getLastName().startsWith("C")) {
				System.out.println(p);
			}
		});
		
		
		System.out.println("\nImplementation for Condition Functional Interface as lambda expression");
		Condition con1 = p ->  p.getLastName().startsWith("B");
		people.forEach(p -> {
								if (con1.test(p)) 
									System.out.println(p);
							});
		
		
		System.out.println("\nImplementation for built-in Functional Interface as lambda expression");
		Predicate <Person> pre1 = p -> p.getFirstName().startsWith("T");
		
		people.forEach(p -> {
								if(pre1.test(p))
									System.out.println(p);
							});
		
		Condition1 con11 = p -> System.out.println(p);
		people.forEach(con11);
	}
}


 interface Condition{
	 boolean test(Person p);
 }
 
 interface Condition1{
	 void test(Person p);
 }
