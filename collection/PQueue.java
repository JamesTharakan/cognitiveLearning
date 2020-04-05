package collection;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PQueue {

	public static void main(String[] args) {
		PriorityQueue <Integer>pq= new PriorityQueue<Integer>();
		
		//pq.add(new Integer(55));pq.add(new Integer(5));pq.add(new Integer(25));pq.add(new Integer(51));
		pq.offer(new Integer(55));pq.offer(new Integer(5));pq.offer(new Integer(25));pq.offer(new Integer(51));
		System.out.print("ForEach ::");
		for (Object object : pq) {
			System.out.print(object+",");
			
		}
		System.out.println();
		System.out.print("Sys.out::");
		System.out.print(pq);
		System.out.println();
		System.out.print("Iterator:: ");
		
		Iterator itr = pq.iterator();
		while(itr.hasNext()){
			System.out.print(itr.next()+" ");
		}
		
		
		System.out.print("\nUsing queue API POLL, it maintains the ordering(PriorityQueue):: ");
		while(pq.peek()!=null){
			System.out.print(pq.poll()+" ");
		}
	}

}
