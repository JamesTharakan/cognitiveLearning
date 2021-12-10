package puzzles.algorithms.slidingWindow;

import java.util.ArrayList;
import java.util.List;

public class FirstNegativeInSubArray {

	public static void main(String[] args) {
		int input[] = { 12, -1, -7, 8, -15, 30, 16, 28 };
		int n = 3; //SubArray size

		int currentWindowSize = 0;
		List<Integer> list = new ArrayList<Integer>(3);
		int j = 0;

		for (int i = 0; i < input.length; i++) {
			if (input[i] < 0) {
				list.add(input[i]);			//maintaining a list of Neg numbers
			}

			currentWindowSize++;

			if (currentWindowSize == n) {
				if (list.size() > 0) {
					System.out.println(list.get(0));
				}
				list.remove(new Integer(input[j]));	//remove from the front(if present. +/-) as it is no more part of window
				j++;
				currentWindowSize--; 
			}
		}
	}

}
