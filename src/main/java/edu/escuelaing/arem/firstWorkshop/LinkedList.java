package edu.escuelaing.arem.firstWorkshop;

import java.util.List;

import lombok.ToString;


/**
 * Clase que representa una linked list de tipo T
 * 
 * @author CrkJohn 
 */
public class LinkedList<T> implements ILikendList<T>{
	
	private static Nodo head = null;

	public  LinkedList(){
		head = null;
	}
	public void agregarNodo(T data) {
		Nodo newNodo = new Nodo<T>(data,null,null);
		if(head == null) {
			head = newNodo;
		}else{
			Nodo lastNodo = head;
			while(lastNodo.getSiguiente() != null) {
				lastNodo = lastNodo.getSiguiente(); 
			}
			newNodo.setAnterior(lastNodo);
			lastNodo.setSiguente(newNodo);
			head.setAnterior(newNodo); // last Nodo			
		}
	}
	

	public T getNodo(int id) throws Exception {
		if(head == null){
			throw new  Exception("head null");
		}
		int currentIndex  = 0;
		Nodo current = head;
		while(currentIndex!=id && current.getSiguiente()!=null) {
			current =  current.getSiguiente();
			currentIndex++;
		}
		if(currentIndex != id) {
			throw new  Exception("Id fuera rango");
		}
		return (T) current.getDato();
	}
	
	
	
	/**
	 * @return retorna un string que es  la respresentacion de linked list
	 */	
	public String ToString() {
		Nodo current = head;
		StringBuilder builder = new StringBuilder();
		builder.append("{ ");
		while(current.getSiguiente()!=null) {
			builder.append(current.getDato().toString() + " , ");
			current =  current.getSiguiente();
		}
		builder.append( current.getDato().toString() +" }");
		return builder.toString();
	}

	
}
