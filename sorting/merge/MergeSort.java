package sorting.merge;

public class MergeSort {
	/**
	 * 
	 * @param input
	 * @param temp, pass a empty temp array of the size of input array
	 * @param left
	 * @param right
	 */
	public static void mergeSort(int input[], int[] temp, int left, int right) {

		if (left >= right) {	//Untill the size of array is 2
			return;
		}
		int mid = (left + right) / 2;

		mergeSort(input, temp, left, mid);
		mergeSort(input, temp, mid + 1, right);
		merge(input, temp, left, right);

	}

	private static void merge(int[] input, int[] temp, int leftStart, int rightEnd) {

	//  leftStart
		int leftEnd = (leftStart + rightEnd) / 2;
		int rightStart = leftEnd + 1;
	//  rightEnd

	//	Iterator for left array, right array and temp array
		int left = leftStart;
		int right = rightStart;
		int index = leftStart;
		

		while (left <= leftEnd && right <= rightEnd) {
			if (input[left] <= input[right]) {
				temp[index++] = input[left++];
			} else {
				temp[index++] = input[right++];
			}
		}

		while (left <= leftEnd) {
			temp[index++] = input[left++];
		}
		while (right <= rightEnd) {
			temp[index++] = input[right++];
		}

		int size = rightEnd + 1 - leftStart;
		System.arraycopy(temp, leftStart, input, leftStart, size);
		
		/*
		System.out.print(" Copying "+size +" elements from "+ leftStart +" :: " );
		for (int i = 0; i < temp.length; i++) {
			System.out.print(" "+temp[i] );
		}
		System.out.print(" :::: ");
		for (int i = 0; i < input.length; i++) {
			System.out.print(" "+input[i] );
		}
		System.out.println();
		*/
		
	}
}
