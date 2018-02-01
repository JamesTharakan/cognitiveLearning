package puzzles.leftShift;

public class LeftRotationRecursive {

	public static void main(String[] args) {

		int k = 4;// Number of shifts
		
		int a[]={1,2,3,4,5};	
		System.out.println("Shifting " + k + " times a array of lenght " + a.length);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println(" ");
		leftShiftRecursive(a, k);

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

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
