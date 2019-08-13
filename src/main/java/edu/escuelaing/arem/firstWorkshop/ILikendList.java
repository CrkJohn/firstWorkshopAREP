package edu.escuelaing.arem.firstWorkshop;

public interface ILikendList<T> {
	
	public void add(T node);
	
	public T getNode(int id) throws Exception;
	
}
