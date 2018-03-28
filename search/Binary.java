package search;

public class Binary {

	public static void main(String[] args) {

		int[] input = { 0, 1, 2, 3, 4, 5, 6, 7, 8 };
		System.out.println("Key index position is  :: " + binarySearch(input, 50, 0, input.length - 1));
	}

	public static int binarySearch(int[] input, int key, int left, int right) {
		int index = -1;
		while (left <= right) {
			int mid = (left + right) / 2;

			if (input[mid] == key)
				return mid;

			if (input[mid] > key)
				right = mid - 1;
			else
				left = mid + 1;
		}
		return index;
	}
}
