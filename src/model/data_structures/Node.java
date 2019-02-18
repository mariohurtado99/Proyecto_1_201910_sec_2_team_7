package model.data_structures;

/**
 * 
 * @author Mario Hurtado
 * Clase gen�rica.
 * @param <T>
 */
public class Node<T> {
	/**
	 * Atributo que representa el elemento siguiente al actual.
	 */
	private Node<T> siguiente;
	
	/**
	 * Atributo que representa el elemento anterior al actual.
	 */
	private Node<T> anterior;
	
	/**
	 * Atributo que representa un dato.
	 */
	private T dato;

	/**
	 * Constructor.
	 * @param datoo Referencia al elemento actual, que en este caso es el primero.
	 */
	public Node(T datoo) {
		siguiente = null;
		anterior = null;
		dato = datoo;
	}

	/**
	 * M�todo que establece cu�l ser� el elemento siguiente al actual.
	 * @param sig Elemento que se establecer� como siguiente.
	 */
	public void setSiguiente(Node<T> sig) {
		siguiente = sig;
	}
	
	/**
	 * M�todo que establece cu�l ser� el elemento anterior al actual.
	 * @param ant Elemento que se establecer� como anterior al actual.
	 */
	public void setAnterior(Node<T> ant) {
		anterior = ant;
	}

	/**
	 * M�todo para establecer un dato que entra como par�metro.
	 * @param dat Dato que entra como par�metro.
	 */
	public void setDato(T dat) {
		dato = dat;
	}
	
	/**
	 * M�todo que retorna el nodo siguiente al actual.
	 * @return Nodo siguiente al actual.
	 */
	public Node<T> getSiguiente() {
		return siguiente;
	}

	/**
	 * M�todo que retorna el nodo anterior al actual.
	 * @return Nodo anterior al actual.
	 */
	public Node<T> getAnterior() {
		return anterior;
	}

	/**
	 * M�todo que retorna el dato actual.
	 * @return Dato actual.
	 */
	public T getDato() {
		return dato;
	}
}
