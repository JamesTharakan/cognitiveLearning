package puzzles.hanckerRank.oneweek;

import java.util.Arrays;
import java.util.List;

public class BribedQueue {

	public static void main(String[] args) {
		Integer queue[] = {1 ,2 ,5 ,3 ,7 ,8 ,6 ,4}; // 7
//		Integer queue[] = {2, 5, 1, 3, 4};
		minimumBribes(Arrays.asList(queue));
	}
	
	 public static void minimumBribes(List<Integer> queue) {
		 int ans = 0;
		    for (int i = queue.size() - 1; i >= 0; i--) {
		        if (queue.get(i) - (i + 1) > 2) {
		        	System.out.println("Too chaotic");
		            return;
		        }
		        //Since no one can jump ahead of its original position by more than 2, if there are any then they would be found in the above IF statement
		        //so any value higher than q[i] can only be till index q[i] -2.
		        for (int j = Math.max(0, queue.get(i) - 2); j < i; j++)// Max is used just to avoid negative index
		            if (queue.get(j)> queue.get(i)) 
		            	ans++;
		    }
		    System.out.println(ans);
	 }

}
