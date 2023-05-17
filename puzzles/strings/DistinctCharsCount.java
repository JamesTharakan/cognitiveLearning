package puzzles.strings;

import java.util.Collections;
import java.util.HashMap;
import java.util.Set;
import java.util.stream.Collectors;

public class DistinctCharsCount {

	public static void main(String[] args) {

		String  input ="I am James 5kkkkk";
		
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		for(char c : input.toCharArray()) {
			map.merge(c, 1, (oldValue,newValue)-> (oldValue+newValue) );
			
			//map.merge(c, 1, Integer::sum);	//or simply use the methodRefernce; Calling the static method
		}
		System.out.println(map);
		
		
		System.out.println("Max repeat :"+Collections.max(map.values()));
		
	}
	
	private static void sameCharsStrings(String s1, String s2) {

		Set<Character> set1 = s1.chars().mapToObj(c -> (char) c).collect(Collectors.toSet());
		Set<Character> set2 = s2.chars().mapToObj(c -> (char) c).collect(Collectors.toSet());
		System.out.println(set1.equals(set2));
	}


}
