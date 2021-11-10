package puzzles.hanckerRank.random;

public class BribedQueue {

	public static void main(String[] args) {
		int queue[] = { 1, 2, 5, 3, 7, 8, 6, 4 };
		int noOfPosition = 0;
		
		for (int i = 0; i < queue.length; i++) {
			int moves=0;
			moves = queue[i] - (i + 1);
			System.out.println(moves);
			if (moves > 2) {
				System.out.println(" too many ");
				break;
			} else if (moves > 0) {
				noOfPosition += moves;
			}
		}
		System.out.println("final ::"+noOfPosition);
		
	}

}
