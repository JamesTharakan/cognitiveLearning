package collection.map;

import java.util.HashMap;
import java.util.Map;

// resultMap.merge(key,value,remappingFunction)
public class MergeMaps {

	public static void main(String[] args) {
		
		String namesss = "tharakan james harvey james";
		String [] names = namesss.split("\\s");
		
		

		Map<String, Integer> resultMapNames = new HashMap<String, Integer>();
		for (int j = 0; j < names.length; j++) {
			String str =names[j];
			resultMapNames.merge(str, 1, (value1,value2)->value1+value2);
		}
		
		System.out.println("Distinct names in Array :" + resultMapNames );

		int[] input = { 1, 2, 3, 2 ,2};

		Map<Integer, Integer> resultMap = new HashMap<Integer, Integer>();
		for (int j = 0; j < input.length; j++) {
			resultMap.merge(input[j], 1, Integer::sum);
		}

		System.out.println("Distinct numbers in Array :" + resultMap + " Occur of 3:" + resultMap.get(3));
			
		
//		If the input is a map, then we can user forEach 		
		Map<Integer, Integer> mapA = new HashMap<Integer, Integer>();
		Map<Integer, Integer> mapB = new HashMap<Integer, Integer>();
		
		mapA.put(1,2); mapA.put(9,99);
		
		mapB.put(9,4);
		
		mapA.forEach((k,v) -> mapB.merge(k, v, Integer::sum));
		
		System.out.println("Merged map"+mapB);
		/*
		 * The input and the order of Integer.sum is :
		 * 1. value of key in the resultant map
		 * 2. value of key being searched in the source map
		 * 				PostFix.
		 * Meaning, the second parameter is calling the concat or sum method
		 */
		
		Map<String, String> mapStringA = new HashMap<String,String>();
		Map<String, String> mapStringB = new HashMap<String, String>();
		
		mapStringA.put("James","Thara");
		mapStringA.put("Rex","Iron");
		mapStringA.put("Hello","world");
		
		mapStringB.put("James","kan");
		mapStringB.put("Rex","Man");
		
		mapStringA.forEach((k,v) -> mapStringB.merge(k, v, String::concat));//note the order in String.concat: v2+v1		
		
		System.out.println("Merged map :merge:"+mapStringB);

	}
}