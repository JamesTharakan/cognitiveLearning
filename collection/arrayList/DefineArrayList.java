package collection.arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DefineArrayList {

	public static void main(String[] args) {
		
		List<String> one = new ArrayList<>(10);

		
		List<String> two = new ArrayList<>(List.of("Alice","Bob","Charlie"));
		

		List<String> three = new ArrayList<>(Arrays.asList("Alice","Bob","Charlie"));
		
		List<String> four = new ArrayList<>();
		four.add("Alice");	four.add("Bob"); four.add("Charlie");
		
		

	}

}
