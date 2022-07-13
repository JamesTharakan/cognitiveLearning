package puzzles;

public class MinimumSwaps {

	public static void main(String[] args) {
		int input[] = {7,1,3,2,4,5,6 };  //considering the number are of a sequence. what if {8,1,3,2,4,5,6 };
		
		int res = minimumSwaps(input);
		System.out.println("MinimumSwaps.main(): "+res);
		for (int i = 0; i < input.length; i++) {
			System.out.print(input[i]+ " ");
		}
	}

	private static int minimumSwaps(int[] input) {
		int swap =0;
		for (int i = 0; i < input.length; i++) {
			while(input[i] != (i+1) ){
				swap(input ,i, input[i]-1);
				swap++;
			}
		}
		return swap;
	}

	private static void swap(int[] arr, int from , int to) {
		int temp = arr[to];
		arr[to] = arr[from];
		arr[from] = temp;
	}
	
	

}
