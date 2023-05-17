package streams.operations;

import java.util.Arrays;
import java.util.List;

public class AnyMatch {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(5,10,15,20);
		
		System.out.println(list.stream().anyMatch(num -> num==10));		//anyMatch takes a Predicate(FI)
		System.out.println(list.stream().anyMatch(num -> num==8));
	}

}
