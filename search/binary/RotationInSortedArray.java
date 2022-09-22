package search.binary;

public class RotationInSortedArray {

	public static void main(String[] args) {
		
		int[] input = { 2,3, 5, 6, 7, 8 ,0, 1};
		
		int miniIndex =findMiniNumberIndex(input);
		System.out.println("How many times rotated  :: " + ((input.length)-miniIndex));
		
		System.out.println("Original element at index 5 :"+input[(miniIndex+5) % input.length]);
		
	}

	private static int findMiniNumberIndex(int[] input) {
		
		int mid = -1;
		
		int left =0;
		int right = input.length -1;
		while(left <= right) {
			 mid = (left +right)/2;
			 
			if(input[mid] <= input[mid+1] && input[mid]< input[mid-1]) {
				return mid;
			}else if( input[mid] > input[left]) { //unsorted
				left =(mid+1) % input.length ;		//remember this formula :)
			}else{
				left =(mid + input.length -1) % input.length ;
			}
		}
	 return mid;
	}

}
