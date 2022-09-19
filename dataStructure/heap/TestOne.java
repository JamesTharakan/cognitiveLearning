package dataStructure.heap;

import java.util.PriorityQueue;

/**
 * A binary heap is one way to implement a priority queue.
 */
//What heap is this . Min or Max. 
//What are you doing in the class ?

public class TestOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] priority_array = getArray();
		
		PriorityQueue pq = new PriorityQueue();
		for (int i = 0; i < priority_array.length; i++) {
			pq.offer(priority_array[i]);
		}
		
		while (pq.peek() != null) {
			System.out.print(pq.poll() + " ");
		}
	////////////////////////////////////////////////	
		System.out.println();
		int[] Heap_array = getArray();
		int n = Heap_array.length;
		// Build heap for all non-leaf nodes
		for (int i = n / 2 - 1; i >= 0; i--) {		//  0 to (n/2)-1 nodes are non leaf nodes. Leaf nodes are considered as hepified.
			buildHeap(Heap_array, n, i);
		}
		
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
	private static int[]  getArray() {
		// TODO Auto-generated method stub
		int[] input = { 0, 11, 52, 3, 5, 36, 17, 8 };
		return input;
	}
}	
	
