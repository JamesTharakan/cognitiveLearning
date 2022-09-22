package dataStructure.heap;

import java.util.PriorityQueue;

/**
 * 

	In the below class we are building a Max heap from Binary Tree(Complete Binary Tree or Almost CBT)
 */

public class BuildHeapFromArray {

	public static void main(String[] args) {

		int[] Heap_array = getArray();
		int n = Heap_array.length;
		// Build heap for all non-leaf nodes
		for (int i = n / 2 - 1; i >= 0; i--) {	// 0 to (n/2)-1 nodes are non leaf nodes. Leaf nodes are considered as hepified.
			buildHeap(Heap_array, n, i);
		}
		
		System.out.println("\nArray content of Max Heap :");
		for (int i = 0; i < Heap_array.length; i++) {
			System.out.print(Heap_array[i]+ " ");
		}
		System.out.println();
		displayHeap(Heap_array, Heap_array.length);

}
	private static void displayHeap(int[] heap ,int n) {
		// n is number of elements in the heap
        // It can be further optimised by calculating height of the heap
        // and looping i only till height of the tree
        for (int i = 0; i <= n / 2; i++) {
            for (int j = 0; j < Math.pow(2, i) && j + Math.pow(2, i) <= n; j++) { // Each row has 2^n nodes
                System.out.print(heap[j + (int) Math.pow(2, i) - 1] + " ");
            }
            System.out.println();
        }
		
	}
	public static void buildHeap(int arr[], int n, int currentRootIndex) {
		// Find largest among root, left child and right child
		int largest = currentRootIndex; //current root
		int left = 2 * currentRootIndex + 1;
		int right = 2 * currentRootIndex + 2;

		//below 2 if to find the greatest leftChild.
		if (left < n && arr[left] > arr[largest])
			largest = left;

		if (right < n && arr[right] > arr[largest])
			largest = right;

		// Swap and continue heapifying if root is not largest
		//i.e, if the current root is not bigget that its largest child then swap its places
		if (largest != currentRootIndex) {
			int swap = arr[currentRootIndex];
			arr[currentRootIndex] = arr[largest];
			arr[largest] = swap;
			
			buildHeap(arr, n, largest);
		}
	}
	private static int[]  getArray() {
		// TODO Auto-generated method stub
		int[] input = { 0, 11, 52, 3, 5, 36, 17, 8 };
		System.out.println("\nInput array : ");
		for (int i = 0; i < input.length; i++) {
			System.out.print(input[i]+" ");
		}
		System.out.println();
		return input;
	}
}	
	
