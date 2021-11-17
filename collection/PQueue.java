package collection;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PQueue {

	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		// add or offer calls: offer
		pq.add(55);
		pq.add(25);
		pq.add(51);

		pq.offer(55);
		pq.offer(5);

		System.out.print("For Each :: ");
		for (Object object : pq) {
			System.out.print(object + ",");

		}
		System.out.print("\nSys.out :: " + pq);

		System.out.print("\nIterator :: ");

		Iterator<Integer> itr = pq.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}

		System.out.print("\nONLY by using queue API POLL, it maintains the insersion order(Queue behaviour):: ");
		while (pq.peek() != null) {
			System.out.print(pq.poll() + " ");
		}
	}

}
