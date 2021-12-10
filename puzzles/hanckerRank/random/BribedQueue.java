package puzzles.hanckerRank.random;

import java.util.Arrays;
import java.util.List;

public class BribedQueue {

	public static void main(String[] args) {
		Integer queue[] = {1 ,2 ,5 ,3 ,7 ,8 ,6 ,4};//7
		minimumBribes(Arrays.asList(queue));
	}
	
	 public static void minimumBribes(List<Integer> q) {
		 int forword = 0;
		 int backward = 0;
			
			for (int i = 0; i < q.size(); i++) {
				int moves=0;
				moves = q.get(i) - (i + 1);
				System.out.println((i+1)+" "+q.get(i)+ " "+moves);
				if (moves > 2) {
					System.out.println("Too chaotic");
					return;
				} 
				if(moves < 0) {
					backward = backward+Math.abs(moves);
				}else if(moves > 0)
					forword = forword+moves;
					
//				System.out.println("forword :"+forword);
//				System.out.println("backward  :"+backward);
			}
			System.out.println(Math.abs(backward-forword));
			

	 }

}
