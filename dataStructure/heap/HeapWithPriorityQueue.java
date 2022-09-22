package dataStructure.heap;

import java.util.Iterator;
import java.util.PriorityQueue;
/**
 * 
 * A binary heap is one way to implement a priority queue.
 * 
 *
 */
public class HeapWithPriorityQueue {

	public static void main(String[] args) {

		int[] priority_array = getArray();
		
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		for (int i = 0; i < priority_array.length; i++) {
			pq.offer(priority_array[i]);
		}
		
		/*
		 * The Iterator is not guaranteed to traverse the
		 * elements of the PriorityQueue in any particular order. If you need ordered
		 * traversal, consider using Arrays.sort(pq.toArray()).
		 */
		System.out.println("\nIterator");
		for (Iterator iterator = pq.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			System.out.print(integer+" ");
		}
		
				
		System.out.println("\nPolling a queue");
		while (pq.peek() != null) {
			System.out.print(pq.poll() + " ");
		}
		

	}
	
	
	private static int[]  getArray() {

		int[] input = { 0, 11, 52, 3, 5, 36, 17, 8 };
		System.out.println("\nInput array : ");
		for (int i = 0; i < input.length; i++) {
			System.out.print(input[i]+" ");
		}
		System.out.println();
		return input;
	}

}
