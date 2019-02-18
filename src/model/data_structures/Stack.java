package model.data_structures;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * 
 * @author Mario Hurtado
 * Stack ejemplo sacada de: https://introcs.cs.princeton.edu/java/43stack/Stack.java.html
 * @param <Item>
 */
public class Stack<Item> implements Iterable<Item>, IStack<Item> {
	/**
	 * Tamaño de la pila.
	 */
    private int n;         
    
    /**
     * Tope de la pila.
     */
    private Node first;     

    
    private class Node {
    	
    	/**
    	 *Referencia al item actual. 
    	 */
        private Item item;
        
        /**
         * Referencia al siguiente.
         */
        private Node next;
    }

   /**
     * Inicializa una pila vacía.
     */
    public Stack() {
        first = null;
        n = 0;
    }

    /**
     * Retorna True si la pila está vacía.
     *
     * @return true si la pila es vacía, false de lo contrario.
     */
    public boolean isEmpty() {
        return first == null;
    }

    /**
     * Retorna el número de items en la pila.
     *
     * @return Número de items en la pila.
     */
    public int size() {
        return n;
    }

    /**
     * Añade el elemento a la pila.
     *
     * @param  item Item a agregar.
     */
    public void push(Item item) {
        Node oldfirst = first;
        first = new Node();
        first.item = item;
        first.next = oldfirst;
        n++;
    }

    /**
     * Elimina y retorna el item más recientemente agregado a la pila.
     *
     * @return Item más recientemente añadido.
     * @throws NoSuchElementException Si la pila está vacía.
     */
    public Item pop() {
        if (isEmpty()) throw new NoSuchElementException("Stack underflow");
        Item item = first.item;        // save item to return
        first = first.next;            // delete first node
        n--;
        return item;                   // return the saved item
    }


    /**
     * Retorna el item más recientemente añadido a la pila.
     *
     * @return Item añadido más recientemente a la pila.
     * @throws NoSuchElementException Si la pila es vacía.
     */
    public Item peek() {
        if (isEmpty()) throw new NoSuchElementException("Stack underflow");
        return first.item;
    }

    /**
     * Retorna una representación en String de la pila.
     *
     * @return Secuencia de items en la pila en orden LIFO, separados por espacio.
     */
    public String toString() {
        StringBuilder s = new StringBuilder();
        for (Item item : this) {
            s.append(item);
            s.append(' ');
        }
        return s.toString();
    }
       

    /**
     * Retorna un iterador de la pila que itera sobre los elementos de ésta en orden LIFO.
     *
     * @return Iterador de la pila que itera en orden LIFO.
     */
    public Iterator<Item> iterator()  { return new ListIterator();  }

    // an iterator, doesn't implement remove() since it's optional
    private class ListIterator implements Iterator<Item> {
        private Node current = first;
        public boolean hasNext()  { return current != null;                     }
        public void remove()      { throw new UnsupportedOperationException();  }

        public Item next() {
            if (!hasNext()) throw new NoSuchElementException();
            Item item = current.item;
            current = current.next; 
            return item;
        } 
    }
}