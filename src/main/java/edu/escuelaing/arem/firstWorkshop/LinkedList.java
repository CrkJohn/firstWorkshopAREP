package edu.escuelaing.arem.firstWorkshop;

import java.util.List;

import lombok.ToString;

public class LinkedList<T> implements ILikendList<T>{
	
	private static Node head = null;
	
	public void add(T data) {
		Node newNode = new Node<T>(data,null,null);
		if(head == null) {
			head = newNode;
		}else{
			Node lastNode = head;
			while(lastNode.getNext() != null) {
				lastNode = lastNode.getNext(); 
			}
			newNode.setBefore(lastNode);
			lastNode.setNext(newNode);
			head.setBefore(newNode); // last Node			
		}
	}
	
	
	public T getNode(int id) throws Exception {
		if(head == null){
			throw new  Exception("head null");
		}
		int currentIndex  = 0;
		Node current = head;
		while(currentIndex!=id && current.getNext()!=null) {
			current =  current.getNext();
			currentIndex++;
		}
		if(currentIndex != id) {
			throw new  Exception("Id fuera rango");
		}
		return (T) current.getData();
	}
	
	
	public String ToString() {
		Node current = head;
		StringBuilder builder = new StringBuilder();
		builder.append("{ ");
		while(current.getNext()!=null) {
			builder.append(current.getData().toString() + " , ");
			current =  current.getNext();
		}
		builder.append( current.getData().toString() +" }");
		return builder.toString();
	}


	 /*
	public static LinkedLists delete(LinkedLists linked,Object obj) {
		if(linked.head!= null && linked.head.data.equals(obj)) {
			linked.head = linked.head.next;
			return linked;
		}
		Node lastNode = linked.head;
		while(lastNode.next !=null && !lastNode.next.data.equals(obj)) {
			lastNode = lastNode.next; 
		}
		if(lastNode.next == null) {
			System.out.println("Not found element");
			return linked;
		}else if(lastNode.next.data.equals(obj)){
			Node tmpNode = lastNode.next;
			lastNode.next = tmpNode.next;
		}
		return linked;
	}
	
	 
	public static void main(String args[]) {
		LinkedLists linked = new LinkedLists();
		linked = insert(linked, "Kha");
		linked = insert(linked, "Kha2");
		linked = insert(linked, "Kha3");	
		linked = delete(linked, "Kha2");	
		linked = delete(linked, "Kha4");
		linked = delete(linked, "Kha");
		linked = delete(linked, "Kha3");
		printList(linked);
		
		
	}

		

	*/
	



}
