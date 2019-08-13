package edu.escuelaing.arem.firstWorkshop;

public class Node<T> {
	
	private Node next , before;
	T data;
	
	public Node(T data, Node next, Node before) {
		 this.data = data;
		 this.next = next;
		 this.before = before;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public Node getBefore() {
		return before;
	}

	public void setBefore(Node before) {
		this.before = before;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	
	public String toString() {
		return data.toString();
	}

	
}
