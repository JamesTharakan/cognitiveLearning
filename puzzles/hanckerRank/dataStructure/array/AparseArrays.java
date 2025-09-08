package puzzles.hanckerRank.dataStructure.array;
//https://www.hackerrank.com/challenges/sparse-arrays/problem
//Find number of occurrences
import java.util.HashMap;
//Status : Completed.
public class AparseArrays {

	public static void main(String[] args) {
		String []baseStrings= {"aba","baba","aba","xzxb"};
		String []queries = {"aba","xzxb","ab"};
		//210
		matchingStrings( baseStrings,  queries);
	}
	
	static int[] matchingStrings(String[] baseStrings, String[] queries) {
		HashMap<String, Integer> counter = new HashMap<String,Integer>();
		int []result = new int[queries.length];
		
		for (int i = 0; i < baseStrings.length; i++) {
			if(counter.containsKey(baseStrings[i])){
				counter.put(baseStrings[i], counter.get(baseStrings[i])+1);
			}else{
				counter.put(baseStrings[i], 1);
			}
		}
		System.out.println("AparseArrays.matchingStrings()::"+counter);
		for (int i = 0; i < queries.length; i++) {
			if(null!= counter.get(queries[i]))
				result[i]=counter.get(queries[i]);
			System.out.println("AparseArrays.matchingStrings()::"+result[i]);
		}

    	return result ;
    }

}

