package sorting.heap;

import sorting.strategyPattern.Sort;

/**
 * 
 * Build the MaxHeap. Exchange the root with the last element. Repeat
 */
public class HeapSort implements Sort{

	public void  sort(int arr[]) {
		int n = arr.length;
		// Build heap for all non-leaf nodes
		for (int i = n / 2 - 1; i >= 0; i--) {		//  0 to (n/2)-1 nodes are non leaf nodes. Leaf nodes are considered as hepified.
			buildHeap(arr, n, i);
		}
		// Heap sort
		for (int i = n - 1; i >= 0; i--) {			// swap, as in max_heap the arr[0] element is always the largest element.
			int temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;
			
			// Heapify root element
			buildHeap(arr, i, 0);			// again build the heap excluding(controlled by i) the elements that are sorted
		}
	}
	
	/**
	 * MaxHeap
	 * @param arr
	 * @param n
	 * @param currentRootIndex
	 */
	public static void buildHeap(int arr[], int n, int currentRootIndex) {
		// Find largest among root, left child and right child
		int largest = currentRootIndex; //current root
		int left = 2 * currentRootIndex + 1;
		int right = 2 * currentRootIndex + 2;

		if (left < n && arr[left] > arr[largest])
			largest = left;

		if (right < n && arr[right] > arr[largest])
			largest = right;

		// Swap and continue heapifying if root is not largest
		if (largest != currentRootIndex) {
			int swap = arr[currentRootIndex];
			arr[currentRootIndex] = arr[largest];
			arr[largest] = swap;
			
			buildHeap(arr, n, largest);
		}
	}
}
