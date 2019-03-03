package sorting.heap;

import utils.JUtil;

public class learn {
	public static void main(String[] args) {
		int arr[]={12 ,10 ,3 ,11, 2,100};
		sort(arr);
		JUtil.printIntArray("Finally", arr);
	}

	public static void  sort(int arr[]) {
		int n = arr.length;
		// Build heap for all non-leaf nodes
		for (int i = n / 2 - 1; i >= 0; i--) {   //
			buildHeap(arr, n, i);
			JUtil.printIntArray("buit heap with the first "+i+ " nodes ", arr);
		}
		// Heap sort
		for (int i = n - 1; i >= 0; i--) {
			int temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;
			
			JUtil.printIntArray("Swapped first & Last. Now calling again with the first "+i+" nodes", arr);
			// Heapify root element
			buildHeap(arr, i, 0);
		}
	}
	public static void buildHeap(int arr[], int arraySize, int currentRootIndex) {	// Find largest among root, left child and right child
		int largest = currentRootIndex; //current root
		int leftChildIndex = 2 * currentRootIndex + 1;
		int rightChildIndex = 2 * currentRootIndex + 2;

		if (leftChildIndex < arraySize && arr[leftChildIndex] > arr[largest])
			largest = leftChildIndex;

		if (rightChildIndex < arraySize && arr[rightChildIndex] > arr[largest])
			largest = rightChildIndex;

		// Swap and continue heapifying if root is not largest
		if (largest != currentRootIndex) {
			int swap = arr[currentRootIndex];
			arr[currentRootIndex] = arr[largest];
			arr[largest] = swap;
			buildHeap(arr, arraySize, largest);
		}
	}
}
