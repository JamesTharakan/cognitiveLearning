package collection.map;

import java.util.HashMap;
import java.util.Map;

public class ComputeMaps {
	public static void main(String[] args) {
		//Compute		
				Map<String, String> A = new HashMap<String,String>();
				Map<String, String> B = new HashMap<String, String>();
				
				A.put("James","Thara");
				A.put("Rex","Iron");
//				A.put("Hello","world"); //Since Hello key not there in second map, null pointer
				
				B.put("James","kan");
				B.put("Rex","Man");
				
				A.forEach((k,v) -> B.compute(k,String::concat));		
				
				System.out.println("Merged map :compute:"+B);
	}

}
