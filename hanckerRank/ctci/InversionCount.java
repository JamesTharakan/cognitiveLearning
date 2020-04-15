package  hanckerRank.ctci;

import java.util.Scanner;

public class InversionCount {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++) {
			int n = in.nextInt();
			int[] arr = new int[n];
			
			for (int arr_i = 0; arr_i < n; arr_i++) {
				arr[arr_i] = in.nextInt();
			}
			
			int temp[] = new int[arr.length];
			long result = InversionCount.mergeSort(arr, temp, 0, arr.length - 1);
			
			System.out.println(result);
		}
		in.close();
	}

	public static long mergeSort(int input[], int[] temp, int left, int right) {

		if (left >= right) { // Untill the size of array is 2
			return 0;
		}
		int mid = (left + right) / 2;
		long count = 0;
		count += mergeSort(input, temp, left, mid);
		count += mergeSort(input, temp, mid + 1, right);
		count += merge(input, temp, left, right);
		return count;
	}

	private static long merge(int[] input, int[] temp, int leftStart, int rightEnd) {

		int leftEnd = (leftStart + rightEnd) / 2;
		int rightStart = leftEnd + 1;

		int left = leftStart;
		int index = leftStart;
		int right = rightStart;

		long mergecount = 0;
		while (left <= leftEnd && right <= rightEnd) {
			if (input[left] <= input[right]) {
				temp[index++] = input[left++];

			} else {
				temp[index++] = input[right++];
				//  merge count= the number of elements in the left array 
				mergecount = mergecount + (leftEnd - left + 1);
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
		return mergecount;
	}
}
