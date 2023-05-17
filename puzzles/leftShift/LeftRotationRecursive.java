package puzzles.leftShift;

import java.util.Arrays;

public class LeftRotationRecursive {

	public static void main(String[] args) {

		int k = 4;// Number of shifts
		
		int arr[]={1,2,3,4,5};	
        
		Arrays.stream(arr).forEach(num -> System.out.print(num + " "));
		
		System.out.println(" ");
		leftShiftRecursive(arr, k);

		Arrays.stream(arr).forEach(num -> System.out.print(num + " "));

	}

	private static int[] leftShiftRecursive(int[] a, int k) {
		if (k > 1) {
			leftShiftRecursive(a, k - 1);
		}
			int temp = a[0];
			for (int i = 0; i < a.length - 1; i++) {
				a[i] = a[i + 1];
			}
			a[a.length - 1] = temp;
		
		return a;
	}
}
