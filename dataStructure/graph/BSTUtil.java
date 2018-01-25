package dataStructure.graph;

import dataStructure.node.Node;

public class BSTUtil {

	public static Node insert(Node root, Node newNode) {
		if (root == null) {
			root = newNode;
			return root;
		} else {
			if (root.getData() == newNode.getData()) {
				System.out.println("BSTUtil.insert():: No duplicates!!");
				return root;
			}

			if (root.getData() > newNode.getData()) {
				root.setLeft(insert(root.getLeft(), newNode));
			} else {
				root.setRight(insert(root.getRight(), newNode));
			}
		}
		return root;
	}

	/**
	 * In-Order Traversal
	 * 
	 * @param root
	 */
	public static void traverse(Node root) {
		if (root == null) {
			return;
		} else {
			if (root.getLeft() != null) {
				traverse(root.getLeft());
			}
			System.out.print(" " + root.getData());
			if (root.getRight() != null) {
				traverse(root.getRight());
			}
		}

	}

}
