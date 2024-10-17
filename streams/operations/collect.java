package streams.operations;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Collect {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>(4);

		List<Integer> direct = list.stream().filter(tempObj -> tempObj == null).collect(Collectors.toList());

		List<Integer> listWithoutNulls = list.stream().filter(Objects::nonNull).collect(Collectors.toList());
		System.out.println("listWithoutNulls" + listWithoutNulls);

		List<Integer> listWithNulls = list.stream().filter((Objects::isNull)).collect(Collectors.toList());
		System.out.println("listWithNulls" + listWithNulls);
		
	}
}
