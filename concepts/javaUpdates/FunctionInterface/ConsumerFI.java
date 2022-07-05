package concepts.javaUpdates.FunctionInterface;

import java.util.Arrays;
import java.util.List;

import utils.Person;

public class ConsumerFI {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
                new Person("Charles", "Dickens", 60),
                new Person("Matthew", "Arnold", 38)
        );
		
//		the statement(s) in forEach is the example of implementation of the
//		functional Interface Consumer which takes an argument and does not return anything.

//		THIS Consumer FI IS IMPLEMENTED USING LAMBDA
		people.forEach(p -> {
								System.out.println(p);
							}
					  );
		//or
		
		people.forEach(p -> System.out.println(p)  );

	}

}
