package model.data_structures;

import java.util.Iterator;

/**
 * 
 * @author Mario Hurtado 
 * @param <T>
 */
public class LinkedList<T> implements ILinkedList<T> {

	/**
	 * 
	 */
	private static int tamano;
	
	/**
	 * 
	 */
	private Node head;
 
	/**
	 * 
	 */
	public LinkedList() {
 
	}
 
	/**
	 * 
	 */
	public void add(T data ) {
		if (head == null) {
			head = new Node(data);
		}
		Node crunchifyTemp = new Node(data);
		Node crunchifyCurrent = head;
		if (crunchifyCurrent != null) {
			while (crunchifyCurrent.getSiguiente() != null) {
				crunchifyCurrent = crunchifyCurrent.getSiguiente();
			}
			crunchifyCurrent.setSiguiente(crunchifyTemp);
		}
		incrementCounter();
	}
 
	/**
	 * 
	 */
	public int getCounter() {
		return tamano;
	}
 
	/**
	 * 
	 */
	private static void incrementCounter() {
		tamano++;
	}
 
	/**
	 * 
	 */
	private void decrementCounter() {
		tamano--;
	}
 
	/**
	 * 
	 * @param data
	 * @param index
	 */
	public void add(Object data, int index) {
		Node crunchifyTemp = new Node(data);
		Node crunchifyCurrent = head;
		if (crunchifyCurrent != null) {
			for (int i = 0; i < index && crunchifyCurrent.getSiguiente() != null; i++) {
				crunchifyCurrent = crunchifyCurrent.getSiguiente();
			}
		}
		crunchifyTemp.setSiguiente(crunchifyCurrent.getSiguiente());
		crunchifyCurrent.setSiguiente(crunchifyTemp);
		incrementCounter();
	}
 
	public T get(int index)
	{
		if (index < 0)
			return null;
		Node crunchifyCurrent = null;
		if (head != null) {
			crunchifyCurrent = head.getSiguiente();
			for (int i = 0; i < index; i++) {
				if (crunchifyCurrent.getSiguiente() == null)
					return null;
 
				crunchifyCurrent = crunchifyCurrent.getSiguiente();
			}
			return (T) crunchifyCurrent.getDato();
		}
		return (T) crunchifyCurrent;
 
	}
	public boolean remove(int index) {
		if (index < 1 || index > size())
			return false;
		Node crunchifyCurrent = head;
		if (head != null) {
			for (int i = 0; i < index; i++) {
				if (crunchifyCurrent.getSiguiente() == null)
					return false;
 
				crunchifyCurrent = crunchifyCurrent.getSiguiente();
			}
			crunchifyCurrent.setSiguiente(crunchifyCurrent.getSiguiente().getSiguiente());
			decrementCounter();
			return true;
 
		}
		return false;
	}
 
	/**
	 * 
	 * @return
	 */
	public int size() {
		return getCounter();
	}
 
	public String toString() {
		String output = "";
 
		if (head != null) {
			Node crunchifyCurrent = head.getSiguiente();
			while (crunchifyCurrent != null) {
				output += "[" + crunchifyCurrent.getDato().toString() + "]";
				crunchifyCurrent = crunchifyCurrent.getSiguiente();
			}
 
		}
		return output;
	}
	
	
	/**
	 * Iterador 
	 */
	 public Iterator<T> iterator() {
	        return new Iterator<T>() {

	        	/**
	        	 * 
	        	 */
	            Node current = head;

	            @Override
	            public boolean hasNext() {
	                return current != null;
	            }

	            @Override
	            public T next() {
	                if (hasNext()) {
	                    T data = (T) current.getDato();
	                    current = current.getSiguiente();
	                    return data;
	                }
	                return null;
	            }

	            @Override
	            public void remove() {
	                throw new UnsupportedOperationException("Remove not implemented.");
	            }

	        };

	    }
	


}
