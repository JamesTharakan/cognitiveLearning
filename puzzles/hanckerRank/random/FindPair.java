package puzzles.hanckerRank.random;

import java.util.HashSet;

public class FindPair {

	public static void main(String[] args) {

		int colours[] = { 10, 20, 30, 40, 20 };
		int pairs = 0;

		HashSet bucket = new HashSet();

		for (int i = 0; i < colours.length; i++) {
			if (bucket.contains(colours[i])) {
				pairs++;
				bucket.remove(colours[i]);
			} else {
				bucket.add(colours[i]);
			}

		}
		System.out.println("FindPair.main():: " + pairs);

	}

}
