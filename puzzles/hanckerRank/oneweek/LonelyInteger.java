package puzzles.hanckerRank.oneweek;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

public class LonelyInteger {
	public static void main(String[] args) {

		List<Integer> Numbers = new ArrayList<Integer>();
		Numbers.add(5);		Numbers.add(6);		Numbers.add(5);		Numbers.add(6);		Numbers.add(4);
		System.out.println("Solution.main()"+lonelyinteger(Numbers));

	}

	private static int lonelyinteger(List<Integer> numbers) {

		HashMap<Integer, Integer> uni = new HashMap<Integer, Integer>();

		for (Integer num : numbers) {
			if (uni.containsKey(num)) {
				uni.put(num, uni.get(num) + 1);
			} else {
				uni.put(num, 1);
			}
		}
		Iterator it = uni.entrySet().iterator();
		while (it.hasNext()) {
			Entry pair = (Entry) it.next();
			if (((Integer) pair.getValue()) == 1)
				return (int) pair.getKey();

		}
		return 0;
	}
	
	public static int lonelyinteger_withoutSpace(List<Integer> a) {
        int result = 0 ;
        Collections.sort(a);
        for(int i=0; i<a.size(); i=i+2){
            if(i == a.size()-1) {
                result = a.get(i);
                break;
            }
            if(a.get(i) != a.get(i+1)) {
                result = a.get(i);
                break;
            }
        }
        return result;

    }
	//
    public static void compareTriplets(List<Integer> a, List<Integer> b) {
        
        int alice =0; 
        int bob=0;
        
        for(Integer a1 :a){
            for(Integer b1 :b){
                if(a1 > b1)
                    alice++;
                else if(b1>a1)
                    bob++;    
            }
        }
        System.out.println(alice+ " "+bob);

    }

	//
	
	
}
