package edu.escuelaing.arem.firstWorkshop;



/**
 * Esta clase representa el nodo de tipo T que esta almacenado en una linked list,
 * donde en el tiene almacenado el nodo siguiente a �l y a su vez el anterior
 * 
 * @author CrkJohn
 *  
 */

public class Nodo<T> {
	
	private Nodo siguente , anterior;
	T dato;
	
	
	/**
	 * Constructor de la clase
	 * @param dato valor del nodo
	 * @param siguente nodo siguiente de la linked list
	 * @param anterior nodo anterior de la linked list
	 */
	public Nodo(T dato, Nodo siguente, Nodo anterior) {
		 this.dato = dato;
		 this.siguente = siguente;
		 this.anterior = anterior;
	}
	
	/**
	 * @return retorno el nodo siguiente del invocado, este puede ser nulo si la cola de la linked list.
	 */
	public Nodo getSiguiente() {
		return siguente;
	}

	
	/**
	*  @param siguiente el nodo adyancente al cual se le quiere generar un puntero.
	*/
	public void setSiguente(Nodo siguiente) {
		this.siguente = siguiente;
	}
	
	

	/**
	 * @return retorno el nodo anterior del invocado, este puede ser nulo si es la cabeza de la linked list.
	 */
	public Nodo getAnterior() {
		return anterior;
	}
	
	
	/**
	 * @param anterior el nodo anterior al cual se le quiere generar un puntero.
	 */

	public void setAnterior(Nodo anterior) {
		this.anterior = anterior;
	}
	
	
	/**
	 * @return retorna el valor de tipo T almacenado en el nodo
	 */
	

	public T getDato() {
		return dato;
	}
	
	
	/**
	 * @param dato valor que se quiere almacenar en el nodo
	 */	

	public void setDato(T dato) {
		this.dato = dato;
	}
	
	
	
	/**
	 * @return retorna la representacion en string del valor almacenado
	 */
	public String toString() {
		return dato.toString();
	}

	
}
