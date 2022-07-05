package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class IntersectionofTwoStringLists {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("red", "blue", "blue", "green", "red");
		List<String> otherList = Arrays.asList("red", "green", "green", "yellow");

		Set<String> result = list.stream().distinct().filter(otherList::contains).collect(Collectors.toSet());

		System.out.println(result);

		List<Integer> Integerlist = Arrays.asList(1, 2, 3, 4, 5);
		List<Integer> IntegerOtherList = Arrays.asList(3, 4, 5, 6, 7);

		Set<Integer> IntegerResult = Integerlist.stream().distinct().filter(IntegerOtherList::contains)
														.collect(Collectors.toSet());
//		System.out.println(IntegerResult);
		
		Integerlist.stream().distinct().filter(IntegerOtherList::contains)
		.forEach(num  -> System.out.print(num+", "));
		
		
		// I know. We can simply put both list content into a set 
		
	}

}
