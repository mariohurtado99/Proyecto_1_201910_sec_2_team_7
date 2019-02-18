package model.data_structures;

/**
 * 
 * @author Mario Hurtado
 * @param <T> clase gen�rica
 */
public interface ILinkedList<T> extends Iterable<T> {

	/**
	 * M�todo que da el tama�o de la lista.
	 * @return
	 */
	public int getCounter();
	
	/**
	 * M�todo que agrega un objeto a la lista.
	 * @param obj Objeto a agregar.
	 */
	public void add(T obj);
	
	/**
	 * M�todo que obtiene la informaci�n de un elemento de la lista.
	 * @param i �ndice de la lista.
	 * @return Informaci�n que hay en el elemento con el �ndice i de la lista.
	 */
	public T get(int i);
//	public void agregar(Node<T> obj) ;
//	public T darObj(int pos);
//	public T darPrimer();
//	public int darTamanho();
//	public boolean siguiente();
//	public boolean anterior();
}
