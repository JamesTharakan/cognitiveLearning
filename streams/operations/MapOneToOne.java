package streams.operations;

import java.util.List;
import java.util.stream.Collectors;

public class MapOneToOne {
	static int count =1;
	
	
	public static void main(String args[]) {

		List<Integer> list = List.of(5,10,15,20);

		list = list.stream().map(number -> number * 2).collect(Collectors.toList());
		list.forEach(x -> System.out.print(x+" "));
		
		System.out.println("\n");
		// or
		list.stream().map(number -> number * 2).forEach(num  -> System.out.print(num+" "));


		
		System.out.println("\n");
		List<String> people = List.of("Al", "Ankit", "Brent", "Sarika", "amanda", "Hans", "Shivika", "Sarah");
		
		people.stream()
				.map(String::toLowerCase)
				.filter(x -> x.startsWith("a"))
				.forEach(System.out::println);
		
		
		people.stream()
				.map(str -> myMethod(str))
				.forEach(System.out::println);
	}
	
	static String myMethod(String str) {
		return (count++) +" "+ str;
	}
}
