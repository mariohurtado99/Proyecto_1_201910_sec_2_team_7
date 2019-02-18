package model.data_structures;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * 
 * @author Mario Hurtado
 * Cola ejemplo sacada de: https://introcs.cs.princeton.edu/java/43stack/Queue.java.html
 * @param <Item>
 */
public class Queue<Item> implements Iterable<Item>, IQueue<Item> {
	/**
	 * Número de elementos en la cola.
	 */
    private int n;         
    
    /**
     * Inicio de la cola.
     */
    private Node first;    
    
    /**
     * Fin de la cola.
     */
    private Node last;     

    /**
     * Clase LinkedList de Soporte.
     */
    private class Node {
    	
    	/**
    	 * Item en el nodo.
    	 */
        private Item item;   
        
        /**
         * Referencia al siguiente Item.
         */
        private Node next;   
    }

    /**
     * Inicializa una cola vacía.
     */
    public Queue() {
        first = null;
        last = null;
        n = 0;
    }

    /**
     * Returns verdadero si la cola está vacía.
     *
     * @return True si está vacía, false de lo contrario.
     */
    public boolean isEmpty() {
        return first == null;
    }

    /**
     * Retorna el número de items en la cola..
     *
     * @return Cantidad de items en la cola.
     */
    public int size() {
        return n;
    }

    /**
     * Retorna el número de items en la cola..
     *
     * @return Cantidad de items en la cola.
     */
    public int length() {
        return n;
    }

    /**
     * Retorna el item agregado menos recientemente.
     *
     * @return Item menos recientemente agregado.
     * @throws NoSuchElementException Si la cola está vacía.
     */
    public Item peek() {
        if (isEmpty()) throw new NoSuchElementException("Queue underflow");
        return first.item;
    }

    /**
     * Añade un item a la cola.
     */
    public void enqueue(Item item) {
        Node oldlast = last;
        last = new Node();
        last.item = item;
        last.next = null;
        if (isEmpty()) first = last;
        else oldlast.next = last;
        n++;
    }

    /**
     * Elimina y retorna el item menos recientemente agregado a la cola.
     *
     * @return Item menos recientemente agregado.
     * @throws NoSuchElementException Si la cola es vacía.
     */
    public Item dequeue() {
        if (isEmpty()) throw new NoSuchElementException("Queue underflow");
        Item item = first.item;
        first = first.next;
        n--;
        if (isEmpty()) last = null;   
        return item;
    }

    /**
     * Retorna una representación en String de la cola.
     *
     * @return Secuencia de items en orden FIFO, separados por espacios.
     */
    public String toString() {
        StringBuilder s = new StringBuilder();
        for (Item item : this)
            s.append(item + " ");
        return s.toString();
    }


    /**
     * Retorna un iterador que itera sobre los items de la cola en orden FIFO.
     *
     * @return Iterador que itera en orden FIFO.
     */
    public Iterator<Item> iterator() {
        return new ListIterator();
    }

    // an iterator, doesn't implement remove() since it's optional
    private class ListIterator implements Iterator<Item> {
        private Node current = first;  // node containing current item

        public boolean hasNext() {
            return current != null;
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }

        public Item next() {
            if (!hasNext()) throw new NoSuchElementException();
            Item item = current.item;
            current = current.next;
            return item;
        }
    } 
}