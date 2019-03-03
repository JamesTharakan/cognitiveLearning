package utils;

public class JUtil {

	public static void printIntArray(String label, int array[]) {
		System.out.print(label + "[ ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println("] ");
	}

	public static void printMe(String label, Object printMe) {
		System.out.print(label + "::" + printMe);

	}
}
