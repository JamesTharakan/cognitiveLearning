package puzzles.algorithms.slidingWindow;

public class SumOfNnumber {

	public static void main(String[] args) {
		int input[] = { 0, 1, 2, 3, 4 , 5, 6, 7, 8, 9, 10 };
		int n = 3;// sum of n numbers

		int currentWindowSize = 0;
		int sum = 0;
		int j = 0;

		for (int i = 0; i < input.length; i++) {
			sum += input[i];
			currentWindowSize++;
		
			if (currentWindowSize == n) {
				System.out.println(sum);
				sum = sum - input[j];
				j++;
				currentWindowSize--;	//Why am i reducing the size; so that next number is added !! 
			} 
		}
	}

}
