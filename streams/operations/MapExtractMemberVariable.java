package streams.operations;

import java.util.List;

import utils.Person;

public class MapExtractMemberVariable {

	public static void main(String[] args) {

		List<Person> people = List.of(
			    new Person("Alice", 30,10),
			    new Person("Bob", 25,20),
			    new Person("Charlie", 35,30)
			);

		
		people.stream().map(person -> person.sal).forEach(System.out::println);
		
		people.stream().map(person -> person.sal).reduce(2,Integer::sum);
		people.stream().map(person -> person.sal).reduce(2,(a,b)->a+b);
		
		people.stream().mapToInt(person -> person.age).average().getAsDouble();

	}
	

}
    