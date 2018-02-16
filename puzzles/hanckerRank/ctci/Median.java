package puzzles.hanckerRank.ctci;

import java.util.Scanner;

public class Median {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		int []input = null;
		
		int[] a = new int[t];
        for(int a_i=0; a_i < t; a_i++){
            a[a_i] = in.nextInt();
            
            	input = new int[a_i+1];
            	for(int j=0;j<input.length;j++){
                	input[j]=a[j];
                }
            
            
            mergeSort(input, new int[input.length], 0, input.length - 1); // this input array has unfilled data hence wrong
           
			System.out.println(getMedianValue(input));
        }
		
        in.close();
		
	}

	public static void mergeSort(int input[], int[] temp, int left, int right) {

		if (left >= right) { // Untill the size of array is 2
			return;
		}
		int mid = (left + right) / 2;

		mergeSort(input, temp, left, mid);
		mergeSort(input, temp, mid + 1, right);
		merge(input, temp, left, right);

	}

	private static void merge(int[] input, int[] temp, int leftStart, int rightEnd) {

		int leftEnd = (leftStart + rightEnd) / 2;
		int rightStart = leftEnd + 1;

		int left = leftStart;
		int index = leftStart;
		int right = rightStart;

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
	}

	public static float getMedianValue(int[] input) {
		if (input.length == 0) {
			return 0;
		} else if (input.length % 2 == 1) { //odd
			return input[input.length / 2];
		} else {
			return (
					input[(input.length / 2)] + input[(input.length / 2)-1]
					) / 2f;
		}
	}

}
