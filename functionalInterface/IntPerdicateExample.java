package functionalInterface;

import java.util.Arrays;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class IntPerdicateExample {

	public static void main(String[] args) {
//Case 1:		
		IntPredicate isPresentInDB = x -> true; 	// A short and simple code to check if an ID is in DB
		System.out.println(isPresentInDB.test(2408));

//Case 2:		
		IntPredicate even = x -> (x % 2 == 0);
		IntPredicate odd = x -> (x % 2 != 0);
		
		int evenOdd [] =IntStream.rangeClosed(1,10).toArray();
		System.out.print("Even :");
		Arrays.stream(evenOdd).filter(even).forEach(System.out::print);
		
		System.out.print("\nOdd :");
		IntStream.rangeClosed(1,10).filter(odd).forEach(num -> System.out.print(num+ " "));
		
//Case 3:
		IntPredicate isEven = x -> x % 2 == 0; 
		IntPredicate isGreaterThanThree = x -> x > 3;
		IntPredicate combined = isEven.and(isGreaterThanThree);
		System.out.println(combined.test(4));


	}

}
