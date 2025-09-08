package streams;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamExamples {
	public static void main(String[] args) throws IOException {
			
		// 4. Stream.of, sorted and findFirst 
		Stream.of("Ava", "Aneri", "Alberto")
			.sorted()
			.findFirst()
			.ifPresent(System.out::println);
			
		// 5. Stream from Array, sort, filter and print
		String[] names = {"Al", "Ankit", "Kushal", "Brent", "Sarika", "amanda", "Hans", "Shivika", "Sarah"};
		Arrays.stream(names)	// same as Stream.of(names)
			.filter(x -> x.startsWith("j"))
			.forEach(name ->System.out.println("found "+name));

	
		
		List<Integer> numbers = List.of(1, 3, 5);

		// Find the first even number and print it if present
		numbers.stream()
		       .filter(n -> n % 2 == 0)
		       .findFirst()
		       .ifPresent(n -> System.out.println("First even: " + n));
	}
	
}
