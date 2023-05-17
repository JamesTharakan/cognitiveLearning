package search.binary;

//complexity  : log(n)  
public class Binary {

	public static void main(String[] args) {

		int[] input = { 0, 1, 2, 3, 5, 6, 7, 8 };
		System.out.println("Key index position is  :: " + binarySearch(input, 4, 0, input.length - 1));
	}

	public static int binarySearch(int[] input, int key, int left, int right) {
		while (left <= right) {
			int mid = (left + right) / 2;

			if (input[mid] == key)
				return mid;

			if (input[mid] > key)
				right = mid - 1;
			else
				left = mid + 1;
		}
		return -1;
	}
	
	
	public static int binarySearchRecursive(int[] input, int key, int left, int right) {
		if(left > right)
			return -1;
		
		int mid = (left + right) / 2;

		if (input[mid] == key)
			return mid;
		
		if (input[mid] > key)
			return binarySearchRecursive(input,  key,  left,  mid - 1);
		else
			return binarySearchRecursive(input,  key,  mid + 1,  right);
	}
}


//code the recursive also

