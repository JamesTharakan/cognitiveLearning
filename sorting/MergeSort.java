package sorting;

public class MergeSort {
	public static void mergeSort(int input[]) {

		if (input == null) {
			throw new IllegalArgumentException("Data is null");
		}

		int arrayLength = input.length;

		if (arrayLength < 2) {
			return;
		}

		int mid = arrayLength / 2;  
		int left[] = new int[mid];
		int right[] = new int[arrayLength-mid];

		for (int i = 0; i <= mid-1; i++) {
			left[i] = input[i];
		}
		for (int i = mid; i <= arrayLength-1; i++) {
			right[i-mid] = input[i];
		}
		mergeSort(left);
		mergeSort(right);

		merge(left, right, input);

	}

	private static void merge(int[] left, int[] right, int[] input) {
		int i = 0; // Pointer for left array 
		int j = 0; // Pointer for right array
		int k = 0; // Pointer for result array
		
		

		while (i < left.length && j < right.length) {

			if (left[i] <= right[j]) {
				input[k] = left[i++];
			} else {					
				input[k] = right[j++];
			}
			k++;
		}

		while (i < left.length) {
			input[k++] = left[i++];
		}
		while (j < right.length) {
			input[k++] = right[j++];
		}
	}

	
	
}
