package sorting;

import sorting.heap.HeapSort;

public class TestSorting {

	public static void main(String[] args) {
		int arr[]={12 ,10 ,3 ,11, 2,100};
		
		for (int i = arr.length / 2 - 1; i >= 0; i--) {
			HeapSort.buildHeap(arr, arr.length, i);
		}
	}

}
