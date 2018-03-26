package sorting;

import sorting.heap.HeapSort;
import sorting.merge.MergeSort;
import sorting.quick.QuickSort;
import sorting.strategyPattern.Sort;

public class TestSorting {

	public static void main(String[] args) {
		int arr[] = { 12, 10, 3, 11, -1, 2, 2, 100 };

		Sort sortStrategy = getSortObject(Sort.QUICK_SORT);
		sortStrategy.sort(arr);

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
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
		default:
			break;
		}

		return object;

	}
}
