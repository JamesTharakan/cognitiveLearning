package sorting.insertion;

public class InsertionSortLearn {

	public static void main(String[] args) {

		int input[] = { 5, 4, 1, 8,2 };
		for (int i = 0; i < input.length; i++) {
			System.out.print(input[i] + " ");
		}
		System.out.println(" ");
		input = insertionSort(input, 5);
	}

	private static int[] insertionSort(int[] input, int n) {
		int key, pointer;
		for (int i = 1; i <= n - 1; i++) {
			key = input[i];
			pointer = i - 1;

			while (pointer >= 0 && key <= input[pointer]) {
				input[pointer + 1] = input[pointer];
				pointer--;
				for (int a = 0; a < input.length; a++) {
					System.out.print(input[a] + " ");
				}
				System.out.println("");
			}
			input[pointer + 1]=key;
			
			System.out.print("\t");
			for (int k = 0; k < input.length; k++) {
				System.out.print(input[k] + " ");
			}
			System.out.println("");
		}

		return input;
	}

}
