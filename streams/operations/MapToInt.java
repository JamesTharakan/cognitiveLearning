package streams.operations;

import java.util.List;
import utils.Person;

public class MapToInt {

	public static void main(String[] args) {
		
		List <Integer> myList = List.of(1,2,3,4,5);
		myList.stream().mapToInt(x -> x).forEach(System.out::println);
		
		
		List<Person> people = List.of(
			    new Person("Alice", 30,10),
			    new Person("Bob", 25,20),
			    new Person("Charlie", 35,30)
			);
		int totalAge = people.stream()
			    .mapToInt(Person::getAge)
			    .sum();
		
		int averageSal = people.stream()
			    .mapToInt(person -> person.sal)
			    .max().getAsInt();

	}

}    