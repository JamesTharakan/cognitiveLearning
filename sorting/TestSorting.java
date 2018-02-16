package sorting;

import puzzles.hanckerRank.ctci.InversionCount;

public class TestSorting {

	public static void main(String[] args) {
		int input[]={2 ,1 ,3 ,1, 2};//4
		
		
		int temp[]=new int[input.length];
		
		long count = InversionCount.mergeSort(input, temp, 0, input.length - 1);
		
		System.out.println("Number of Inversions :: "+count);
	}

}
