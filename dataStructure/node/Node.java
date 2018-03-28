package dataStructure.node;

import java.util.Comparator;

public class Node<T> implements Comparator<Node> {

	T data;
	Node<T> left;
	Node<T> right;

	public Node(Node<T> left, T data, Node<T> right) {
		this.data = data;
		this.left = left;
		this.right = right;
	}

	public String toString() {
		return "Data:" + this.data;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public Node getLeft() {
		return left;
	}

	public void setLeft(Node<T> left) {
		this.left = left;
	}

	public Node getRight() {
		return right;
	}

	public void setRight(Node<T> right) {
		this.right = right;
	}

	public int compare(Node node1, Node node2) {
		
		if (node1.data instanceof String)
			return ((String) node1.data).compareTo((String) node2.data);
		
		if (node1.data instanceof Integer) 
			 return compareIntegers((Integer)node1.data,(Integer)node2.data);
		
		return 0;
			
	}

	private int compareIntegers(Integer node1, Integer node2) {
		int value = 1;
		
		if (node1 == node2) 
			return 1;
		
		if (node1 < node2) 
			return -1;
		
		return value;
		
	}

}
