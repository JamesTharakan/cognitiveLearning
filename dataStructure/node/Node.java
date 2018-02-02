package dataStructure.node;

public class Node <T>{

	T data;
	Node <T> left;
	Node <T> right;

	public Node(Node <T> left,T data,  Node <T> right) {
		this.data = data;
		this.left = left;
		this.right = right;
	}
	
	public String toString(){
		return "Data:"+this.data;
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
	public void setLeft(Node <T>  left) {
		this.left = left;
	}
	public Node getRight() {
		return right;
	}
	public void setRight(Node <T> right) {
		this.right = right;
	}

}
