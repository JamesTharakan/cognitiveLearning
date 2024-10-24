package streams.operations;

import java.util.List;

public class MapToInt {

	public static void main(String[] args) {
		
		List <Integer> myList = List.of(1,2,3,4,5);
		
		myList.stream().mapToInt(x -> x+1).forEach(System.out::println);
	}

}
