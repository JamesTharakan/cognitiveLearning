package sorting;

import sorting.bubble.BubbleSort;
import sorting.heap.HeapSort;
import sorting.merge.MergeSort;
import sorting.quick.QuickSort;
import sorting.strategyPattern.Sort;

public class TestSorting {

	public static void main(String[] args) {
		
		
		int arr[][]= {
					{ 12, 10, 3, 11, -1, 2, 2, 100 },
					{ 77,22,23 },
					{1,2,3,4,5,6,7},
					{7,6,5,4,3,2,1},
				{13,9,2,25,5}
		};
		
		Sort sortStrategy = getSortObject(Sort.BUBBLE_SORT);
		
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+",");
			}
			System.out.println(" ");
		}
		

		for (int i = 0; i < arr.length; i++) {
			sortStrategy.sort(arr[i]);
		}
		
		System.out.println("\nAfter Sorting\n");
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+",");
			}
			System.out.println(" ");
		}
		
		
	}

	static Sort getSortObject(int strategy) {
		Sort object = null;
		switch (strategy) {
		case Sort.HEAP_SORT:
			object = new HeapSort();
			break;
		case Sort.MERGE_SORT:
			object = new MergeSort();
			break;
		case Sort.QUICK_SORT:
			object = new QuickSort();
			break;
		case Sort.BUBBLE_SORT:
			object = new BubbleSort();
			break;	
		default:
			break;
		}

		return object;

	}
}
