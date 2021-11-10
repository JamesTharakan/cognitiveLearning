package puzzles.hanckerRank.algorithms;

/*
There's a queue of n people, labeled 1 through n, and each person can bribe the person directly in front of them to swap places
and get closer to the front of the queue (in this case, index 0 of the list/array). 
Each person can only bribe a maximum of two times (and they cannot bribe someone who has already bribed them)
You are given the order of the people after all of the bribes have taken place and your job is to determine
how many bribes took place to get to that point. 
For example, if you were given [3, 2, 1] then the answer would be 3 bribes (person 3 bribed person 1, 2 and person 2 bribed person 1).
 */
public class BribedQueue {

	public static void main(String[] args) {
		int queue[] = {2, 1, 5 ,3, 4};//3//{ 1, 2, 5, 3, 7, 8, 6, 4 };
		minimumBribes(queue);

	}

	static void minimumBribes(int[] queue) {
//		int shifts = 0;
//		for (int i = 0; i < queue.length; i++) {
//			int temp = ((i + 1) - queue[i]);
//			if (temp < -2) {
//				System.out.println("Too chaotic");
//				return;
//			}
//			else {
//				for (int j = i + 1; j <= queue.length - 1; j++)			///TimesOut
//					if (queue[j] < queue[i]) { //j accepted bribe,thats why lesser value is to the right.
//						shifts++;
//					}
//			}
//		}
//		System.out.println(shifts);
		
		int ans = 0;
	    for (int i = queue.length - 1; i >= 0; i--) {
	        if (queue[i] - (i + 1) > 2) {
	        	System.out.println("Too chaotic");
	            return;
	        }
	        //Since no one can jump ahead of its original position by more than 2, if there are any then they would be found in the above IF statement
	        //so any value higher than q[i] can only be till index q[i] -2.
	        for (int j = Math.max(0, queue[i] - 2); j < i; j++)// Max is used just to avoid negative index
	            if (queue[j] > queue[i]) ans++;
	    }
	    System.out.println(ans);

	}

}
