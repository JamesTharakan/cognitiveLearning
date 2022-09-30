package streams.operations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream_mapMethod {
	public static void main(String args[]) {

		List<Integer> list = Arrays.asList(5,10,15,20);

//		list = list.stream().map(number -> number * 2).collect(Collectors.toList());
//		list.forEach(x -> System.out.print(x+" "));
		
		list.stream().map(number -> number * 2).forEach(num  -> System.out.print(num+" "));

	}
}
