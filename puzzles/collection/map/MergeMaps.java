package puzzles.collection.map;

import java.util.HashMap;
import java.util.Map;

public class MergeMaps {

	public static void main(String[] args) {

		int[] input = { 1, 2, 3, 2 ,2};

		Map<Integer, Integer> resultMap = new HashMap<Integer, Integer>();
		for (int j = 0; j < input.length; j++) {
			resultMap.merge(input[j], 1, Integer::sum);
		}

		System.out.println("Distinct numbers in Array :" + resultMap + " Occur of 3:" + resultMap.get(3));
//////////////////////////////////////////////////////////////////////////////////////////////////////////////		
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
		
		mapStringA.forEach((k,v) -> mapStringB.merge(k, v, String::concat));		
		
		System.out.println("Merged map :"+mapStringB);
//////////////////////////////////////////////////////////////////////////////////////////////////////////////		
		Map<String, String> A = new HashMap<String,String>();
		Map<String, String> B = new HashMap<String, String>();
		
		A.put("James","Thara");
		A.put("Rex","Iron");
//		A.put("Hello","world");			//Since Hello key not there in second map, null pointer
		
		B.put("James","kan");
		B.put("Rex","Man");
		
		A.forEach((k,v) -> B.compute(k,String::concat));		
		
		System.out.println("Merged map :"+B);
	}
}