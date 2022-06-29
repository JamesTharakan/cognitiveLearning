package sorting.quick;

import java.util.concurrent.ThreadLocalRandom;

import sorting.strategyPattern.Sort;

public class QuickSort implements Sort{
	
	public void sort(int input[]) {
		quickSort(input, 0, input.length - 1);
	}

	private static void quickSort(int[] input, int start, int end) {
		if (start < end) {
			int pIndex = randomizedParition(input, start, end);
			quickSort(input, start, pIndex - 1);
			quickSort(input, pIndex + 1, end);
		}
	}

	private static int randomizedParition(int[] input, int start, int end) {
		int pIndex = ThreadLocalRandom.current().nextInt(start, end);
		swap(input, pIndex, end);
		return parition(input, start, end);
	}

	// Find the place(pIndex) where the element(pivot) has to be placed
	private static int parition(int[] input, int start, int end) {
		int pIndex = start;
		int pivot = input[end];

		for (int i = start; i < end; i++) {
			if (input[i] <= pivot) {
				swap(input, i, pIndex);
				pIndex++;
			}
		}
		swap(input, end, pIndex); //end:pivot index
		return pIndex;
	}

	private static void swap(int[] input, int i, int pIndex) {
		if (i == pIndex)
			return;
		int temp = input[i];
		input[i] = input[pIndex];
		input[pIndex] = temp;
	}
}
