package sorting.insertion;

import sorting.strategyPattern.Sort;

public class InsertionSort implements Sort{
	
	public InsertionSort(){
		System.out.println("\n\t\t\t\tInsertion Sort");
	}

	public void sort(int[] input) {
		int key, pointer,n;
		n =input.length;
		for (int i = 1; i <= n - 1; i++) {
			key = input[i];
			pointer = i - 1;

			while (pointer >= 0 && key <= input[pointer]) {
				input[pointer + 1] = input[pointer];
				pointer--;
			}
			input[pointer + 1]=key;
		}

	}

}
