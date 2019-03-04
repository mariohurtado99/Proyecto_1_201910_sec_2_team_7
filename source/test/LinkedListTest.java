package test;

import org.junit.Test;

import junit.framework.TestCase;
import model.data_structures.ILinkedList;
import model.data_structures.LinkedList;

/**
 * Clase test para la lista encadenada.
 * @author Mario Hurtado.
 *
 */
public class LinkedListTest extends TestCase{

	/**
	 * Test del método getCounter() de la clase ILinkedList.
	 */
	public void testGetCounter() {
		ILinkedList<Integer> arreglo = new LinkedList<>();
		arreglo.add(1);
		arreglo.add(2);
		arreglo.add(3); 
		arreglo.add(4);
		arreglo.add(5);
		assertEquals(5, arreglo.size());
	}
	
	/**
	 * Test del método add() de la clase ILinkedList.
	 */
	public void testAdd() {
		LinkedList<Integer> arreglo2 = new LinkedList<>();
		arreglo2.add(1);
		arreglo2.add(2);
		arreglo2.add(3);
		assertEquals(3, arreglo2.size());
	}
	
	/**
	 * Test del método get() de la clase ILinkedList.
	 */
	public void testGet() {
		LinkedList<String> arreglo2 = new LinkedList<>();
		arreglo2.add("Hola, ");
		arreglo2.add("Como");
		arreglo2.add("Va");
		arreglo2.add("La");
		arreglo2.add("Causa");
		assertEquals("Va", arreglo2.get(2));
		assertEquals("Hola, ", arreglo2.get(0));
		assertEquals("Causa", arreglo2.get(4));
		
	}
}
