package streams.operations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapOperation {
	static int count =1;
	
	
	public static void main(String args[]) {

		List<Integer> list = Arrays.asList(5,10,15,20);

		list = list.stream().map(number -> number * 2).collect(Collectors.toList());
		list.forEach(x -> System.out.print(x+" "));
		
		// or
		list.stream().map(number -> number * 2).forEach(num  -> System.out.print(num+" "));


		
		
		
		List<String> people = Arrays.asList("Al", "Ankit", "Brent", "Sarika", "amanda", "Hans", "Shivika", "Sarah");
		people
			.stream()
			.map(str -> app(str))
			.forEach(System.out::println);
	}
	
	static String app(String str) {
		return (count++) +" "+ str;
	}
}
