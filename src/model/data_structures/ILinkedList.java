package model.data_structures;

/**
 * 
 * @author Mario Hurtado
 * @param <T> clase genérica
 */
public interface ILinkedList<T> extends Iterable<T> {

	/**
	 * Método que da el tamaño de la lista.
	 * @return
	 */
	public int getCounter();
	
	/**
	 * Método que agrega un objeto a la lista.
	 * @param obj Objeto a agregar.
	 */
	public void add(T obj);
	
	/**
	 * Método que obtiene la información de un elemento de la lista.
	 * @param i Índice de la lista.
	 * @return Información que hay en el elemento con el índice i de la lista.
	 */
	public T get(int i);
//	public void agregar(Node<T> obj) ;
//	public T darObj(int pos);
//	public T darPrimer();
//	public int darTamanho();
//	public boolean siguiente();
//	public boolean anterior();
}
