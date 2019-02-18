package test;

import junit.framework.TestCase;
import model.data_structures.IStack;
import model.data_structures.Stack;

/**
 * Clase para realizar pruebas unitarias de los métodos de la clase Stack.
 * @author Mario Hurtado.
 *
 */
public class StackTest extends TestCase {
	
	/**
	 * Test del método isEmpty() de la clase IStack.
	 */
	public void testIsEmpty() {
		IStack<Integer> pila = new Stack<>();
		pila.push(34);
		pila.push(1);
		pila.push(2);
		assertEquals(false, pila.isEmpty());
		pila.pop();
		pila.pop();
		pila.pop();
		assertEquals(true, pila.isEmpty());
	}
	
	/**
	 * Test del método size() de la clase IStack.
	 */
	public void testSize() {
		IStack<Integer> pila = new Stack<>();
		pila.push(1);
		pila.push(2);
		pila.push(3);
		assertEquals(3, pila.size());
		pila.pop();
		pila.pop();
		pila.pop();
		assertEquals(0, pila.size());
	}
	
	/**
	 * Test del método push() de la clase IStack.
	 */
	public void testPush() {
		IStack<Integer> pila = new Stack<>();
		pila.push(1);
		pila.push(2);
		pila.push(3);
		pila.pop();
		pila.push(4);
		assertEquals(3, pila.size());
		pila.push(5);
		assertEquals(4, pila.size());
		pila.push(6);
		pila.push(7);
		pila.push(8);
		pila.push(9);
		pila.push(10);
		assertEquals(9, pila.size());
	}
	
	/**
	 * Test del método pop() de la clase IStack.
	 */
	public void testPop() {
		IStack<Integer> pila = new Stack<>();
		pila.push(1);
		pila.push(2);
		pila.push(3);
		pila.push(4);
		pila.push(5);
		pila.pop();
		assertEquals(4, pila.size());
		pila.pop();
		pila.pop();
		pila.pop();
		assertEquals(1, pila.size());
		pila.pop();
		
		assertEquals(true, pila.isEmpty());
	} 
}
