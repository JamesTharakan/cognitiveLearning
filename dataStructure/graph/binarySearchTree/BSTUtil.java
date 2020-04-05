package dataStructure.graph.binarySearchTree;

import dataStructure.node.Node;

public class BSTUtil {

	public static Node<Integer> insert(Node<Integer> root, Node<Integer> newNode) {
		if (root == null) {
			root = newNode;
			return root;
		}
		if (root.getData() == newNode.getData()) {
			System.out.println("Duplicate :: "+newNode.getData());
			return root;
		}

		if (root.getData() > newNode.getData()) {
			root.setLeft( insert(root.getLeft(), newNode) );
		} else {
			root.setRight(insert(root.getRight(), newNode));
		}
		return root;
	}

	
	/**
	 * In-Order Traversal
	 * 
	 * @param root
	 */
	public static void traverse(Node root) {
		if (root == null)
			return;
		
		if (root.getLeft() != null) {
			traverse(root.getLeft());
		}
		
		System.out.print(" " + root.getData());
		
		if (root.getRight() != null) {
			traverse(root.getRight());
		}

	}
	
	/**
	 * Deletes the key and return the new root
	 * @param root
	 * @param key
	 * @return
	 */
	public static  Node delete(Node  root ,int key){
		Node found= null;
		
		if(root == null)
			return null;
		
		else if((Integer)root.getData() <  key){
			root.setLeft(delete(root.getLeft(),key));;
		}else{
			
		}
			
		
		
		return found;
		
	}

}
