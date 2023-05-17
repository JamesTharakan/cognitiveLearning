package puzzles.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class IntersectionofTwoStringLists {

	public static void main(String[] args) {
		List<String> stringlist = Arrays.asList("red", "blue", "blue", "green", "red");
		List<String> otherStringList = Arrays.asList("red", "green", "green", "yellow");

		Set<String> result = stringlist.stream().distinct().filter(otherStringList::contains).collect(Collectors.toSet());
		
		result.stream().forEach(colour -> System.out.print(colour + " "));

		System.out.println("Distinct number in 2 lista");
		List<Integer> Integerlist = Arrays.asList(1, 2, 3, 4, 5);
		List<Integer> IntegerOtherList = Arrays.asList(3, 4, 5, 6, 7);

		Set<Integer> IntegerResult = Integerlist.stream().distinct().filter(IntegerOtherList::contains).collect(Collectors.toSet());
//		System.out.println(IntegerResult);
		
		Integerlist.stream().distinct().filter(IntegerOtherList::contains)
		.forEach(num  -> System.out.print(num+", "));
		
		
		//We can simply put both list content into a set. But it would need extra space

		
	}

}

