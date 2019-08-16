package edu.escuelaing.arem.firstWorkshop;


/**
 *  Clase que representa la funciones basicas de una linked list
 *  
 *  @author CrkJohn
 */
public interface ILikendList<T> {
	
	
	/**
	 *  @param nodo nodo que se quiere agregar a la linked list
	 */
	
	public void agregarNodo(T nodo);
	
	
	/**
	 * @param id indice del nodo que se desea obtener de la linked list
	 * @throws Exception Se dara una excepcion si el id del elemento no se encuentra en la linked list
	 * @return retorna el nodo indexado en ese id
	 */
	
	public T getNodo(int id) throws Exception;

}
