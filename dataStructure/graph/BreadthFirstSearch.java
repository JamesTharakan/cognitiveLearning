package dataStructure.graph;

import java.util.PriorityQueue;
import dataStructure.node.Node;

public class BreadthFirstSearch {

	public static void main(String[] args) {

		Node<Integer> root = createBST();

		PriorityQueue <Node<Integer>>pq = new PriorityQueue<Node<Integer>>(root);
		if(root !=null)
			pq.offer(root);
		breadthFirstSearch(pq);

	}

	private static void breadthFirstSearch(PriorityQueue<Node<Integer>> pq) {

		while (!pq.isEmpty()) {
			Node<Integer> current = (Node<Integer>)pq.poll();
			System.out.print(" " + current.getData());
			if (current.getLeft() != null) {
				pq.offer(current.getLeft());
			}
			if (current.getRight() != null) {
				pq.offer(current.getRight());
			}
		}
	}

	private static Node<Integer> createBST() {

		Node<Integer> root = null;

		int input[] = { 2, 4, 9, 6, 10, -1, 1 };

		for (int i = 0; i < input.length; i++) {
			root = BSTUtil.insert(root, new Node<Integer>(null, input[i], null));
		}
		
		return root;
	}

}
