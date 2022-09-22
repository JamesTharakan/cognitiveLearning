package puzzles.hanckerRank.oneweek;

import java.util.ArrayList;
import java.util.List;

public class TruckTour {

	public static void main(String[] args) {

		List<Integer> one = new ArrayList<>();	one.add(1);one.add(5);
		List<Integer> two = new ArrayList<>();	two.add(10);two.add(3);
		List<Integer> three = new ArrayList<>(); three.add(3);three.add(4);
		List<List<Integer>> lists = new ArrayList<>();
		lists.add(one);lists.add(two);lists.add(three);
		System.out.println(truckTour(lists));
	}
//TODO:Greedy approach	
	public static int truckTour(List<List<Integer>> pp) {
		int start =0;
		
		while(start <= pp.size()-1) {	
			int visited=0;
			int petrol =0;
			for(int j=start; j<pp.size();j++) {
				
				if( (petrol+ pp.get(j).get(0)) >=  pp.get(j).get(1)) {
					petrol +=(pp.get(j).get(0) -  pp.get(j).get(1)) ;
					visited++;
//TODO:better way to loop back to zero index::	Next: (current+1) % N			Previous: (Current + N -1) % N
					if((j+1)==pp.size() && (visited != pp.size()))  //going to first index
						j=-1;
				}else {
					break;
				}
				if(visited == pp.size()) {
					return start;
				}
			}
			start++;
		}
		
		return start;
	
	}

}
