package dataStructure.graph.binarySearchTree;

import dataStructure.node.Node;

public class BST {

	public static void main(String[] args) {

		Node <Integer>root= null;
		
		
		int input[]={2,4,9,6,10,-1,1};
		for (int i = 0; i < input.length; i++) {
			root = BSTUtil.insert(root, new Node <Integer>(null,input[i],null));
		}
		
		BSTUtil.traverse(root);
//		root = BSTUtil.delete(root, new Node<Integer>(null,9,null));
		System.out.println("\nBST.main()");
		BSTUtil.traverse(root);
		
		
	}

}
