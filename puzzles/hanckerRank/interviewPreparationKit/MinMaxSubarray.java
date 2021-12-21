package puzzles.hanckerRank.interviewPreparationKit;

import java.util.ArrayList;
import java.util.List;

public class MinMaxSubarray {

	public static void miniMaxSum(List<Integer> arr) {
		long sum = 0;
		long max = Long.MIN_VALUE;
		long min = Long.MAX_VALUE;

		for (long i : arr) {
			sum += i;

			if (i > max)
				max = i;
			if (i < min)
				min = i;

		}

		System.out.print(sum - max);
		System.out.print(" ");
		System.out.print(sum - min);
	}

	public static void main(String[] args) {
		int[] array = new int[] { 256741038, 623958417, 467905213, 714532089, 938071625 };
		List<Integer> arr = new ArrayList<Integer>();

		for (int i : array)
			arr.add(i);

		miniMaxSum(arr);
	}
}
