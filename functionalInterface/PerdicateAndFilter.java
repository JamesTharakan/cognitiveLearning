package functionalInterface;

import java.util.Arrays;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class PerdicateAndFilter {

	public static void main(String[] args) {

		int evenOdd [] =IntStream.rangeClosed(1,10).toArray();
		
		IntPredicate even = x -> (x % 2 == 0);

		IntPredicate odd = x -> (x % 2 != 0);
		
		System.out.print("Even :");
		Arrays.stream(evenOdd).filter(even).forEach(num -> System.out.print(num+ " "));
		
		
		System.out.print("\nOdd :");
		Arrays.stream(evenOdd).filter(odd).forEach(num -> System.out.print(num+ " "));
	}

}
