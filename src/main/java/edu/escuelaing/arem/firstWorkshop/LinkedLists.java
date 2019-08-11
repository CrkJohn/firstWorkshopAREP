package edu.escuelaing.arem.firstWorkshop;

import java.util.LinkedList;

public class LinkedLists{
	
	private static Node head = null;
	
	static class Node {
        Object data; 
        Node next; 
        public Node(Object d){ 
            data = d; 
            next = null; 
        }     
    }
	
	public static LinkedLists insert(LinkedLists linked,Object obj) {
		Node nwNode =  new Node(obj);
		nwNode.next =  null;
		if(linked.head == null) {
			linked.head = nwNode;
		}else{
			Node lastNode = linked.head;
			while(lastNode.next != null) {
				lastNode = lastNode.next; 
			}
			lastNode.next = nwNode;
		}
		return linked;
	}
	
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
	
	public static void printList(LinkedLists list) { 
	  Node currNode = list.head; 
	  System.out.print("LinkedList: "); 
	  if(currNode == null)return;
	  do {
		 System.out.print(currNode.data + " "); 
		 currNode = currNode.next;
	  }while (currNode != null); 
	        
	  System.out.println(); 
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

}
