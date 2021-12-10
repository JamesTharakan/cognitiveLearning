package puzzles.algorithms.slidingWindow;

public class MaxSubArray {

	public static void main(String[] args) {
		int input[] = {-2, 3, -1, 2};
		int n = 3;// sum of n numbers

		int currentWindowSize = 0;
		int sum = 0;
		int j = 0;
		int max =0;

		for (int i = 0; i < input.length; i++) {
			sum += input[i];
			currentWindowSize++;
		
			if (currentWindowSize == n) {
				max = sum > max ? sum :max ;
				sum = sum - input[j];
				j++;currentWindowSize--;
			} 
		}
		
		System.out.println(max);
	}

}
