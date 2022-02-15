package sorting;

import sorting.bubble.BubbleSort;
import sorting.heap.HeapSort;
import sorting.insertion.InsertionSort;
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
		
		Sort sortStrategy = simpleStaticSortFactory(SortType.BUBBLE);
		
		
		/*for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+",");
			}
			System.out.println(" ");
		}
		

		for (int i = 0; i < arr.length; i++) {*/
			sortStrategy.sort(arr[0]);
		/*}
		
		System.out.println("\nAfter Sorting\n");
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+",");
			}
			System.out.println(" ");
		}*/
		
		
	}

	static Sort simpleStaticSortFactory(SortType strategy ) {
		Sort object = null;
		switch (strategy) {
		case HEAP:
			object = new HeapSort();
			break;
		case MERGE:
			object = new MergeSort();
			break;
		case QUICK:
			object = new QuickSort();
			break;
		case BUBBLE:
			object = new BubbleSort();
			break;	
		case INSERTION:
			object = new InsertionSort();
			break;	
			
		default:
			break;
		}
		System.out.println("Sorting type used :"+strategy);
		return object;

	}
}
