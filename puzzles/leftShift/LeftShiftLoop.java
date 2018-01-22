package puzzles.leftShift;

public class LeftShiftLoop {

	public static void main(String[] args) {

		int n = 4;// Array size
		int k = 2;// Number of shifts
		
		int a[]={1,2,3,4};	
		
		System.out.println("Shifting " + k + " times a array of lenght " + a.length);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println(" ");
		for (int i = 1; i <= k; i++) {
			leftShift(a);
		}

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

	}

	private static void leftShift(int[] a) {
			int temp = a[0];
			for (int i = 0; i < a.length - 1; i++) {
				a[i] = a[i + 1];
			}
			a[a.length - 1] = temp;
	}
}
