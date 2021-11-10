package puzzles.hanckerRank.random;

import utils.JUtil;

public class swapa {

	public static void main(String[] args) {
//		int a[]= new int[]{2,3,4,1,5}; //3
		int a[]= new int[]{4,3,1,2}; //3
		System.out.println("swapa.main()"+minimumSwaps(a));
	}

	static int minimumSwaps(int[] arr) {
		int count = 0;
		for (int i = 0; i+1 < arr.length; i++) {
			JUtil.printIntArray(i + "::", arr);
			if (arr[i] > arr[i + 1]) {
				int temp = arr[i + 1];
				arr[i + 1] = arr[i];
				arr[i] = temp;

				i = -1;//Math.max(0, i - 2);
				count++;
			}
			System.out.println("-----"+count);
			JUtil.printIntArray(i + "::", arr);
		}
		return count;
	}
}
