package streams.operations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class AnyMatch {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(5,10,15,20);
		
		
		System.out.println(list.stream().anyMatch(num -> num==10));		//anyMatch takes a Predicate(FI)
		System.out.println(list.stream().anyMatch(num -> num==8));

		Stream stream = list.stream();	//TypeCast is needed as each item is returned as Object
		System.out.println(stream.anyMatch(num -> ((Integer)num)==10));

		Stream<Integer> streamInt = list.stream();
		System.out.println(streamInt.anyMatch(num ->num==10));
		
		
	}

}
