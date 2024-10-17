package functionalInterface;

import java.util.function.Predicate;

public class PredicateExample {

	public static void main(String[] args) {
//Case 1:
		Predicate <String> tester = s -> s.equals("pass");
		
		System.out.println(tester.test("yes"));
		
		
//Case 3:
		Predicate <Integer> isEven = x -> (x % 2) == 0; 
		Predicate <Integer> isGreaterThanThree = x -> (x > 3);
		Predicate <Integer> combined = isEven.and(isGreaterThanThree);
		System.out.println(combined.test(4));		
		
		
		
	}

}
