package hanckerRank.dataStructure.array;
//https://www.hackerrank.com/challenges/sparse-arrays/problem
//Find number of occurrences
import java.util.HashMap;
//Status : Completed.
public class AparseArrays {

	public static void main(String[] args) {
		String []strings= {"aba","baba","aba","xzxb"};
		String []queries = {"aba","xzxb","ab"};
		//210
		matchingStrings( strings,  queries);
	}
	
	static int[] matchingStrings(String[] strings, String[] queries) {
		HashMap<String, Integer> map = new HashMap<String,Integer>();
		int []result = new int[queries.length];
		
		for (int i = 0; i < strings.length; i++) {
			if(map.containsKey(strings[i])){
				map.put(strings[i], map.get(strings[i])+1);
			}else{
				map.put(strings[i], 1);
			}
		}
		System.out.println("AparseArrays.matchingStrings()::"+map);
		for (int i = 0; i < queries.length; i++) {
			if(null!= map.get(queries[i]))
				result[i]=map.get(queries[i]);
			System.out.println("AparseArrays.matchingStrings()::"+result[i]);
		}

    	return result ;
    }

}

