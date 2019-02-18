package test;

import junit.framework.TestCase;
import model.data_structures.IQueue;
import model.data_structures.Queue;

/**
 * Clase test para realizar pruebas autom�ticas a los m�todos de la clase Queue.
 * @author Mario Hurtado.
 *
 */
public class QueueTest extends TestCase{

	/**
	 * Test del m�todo isEmpty() de la clase IQueue.
	 */
	public void testIsEmpty() {
		IQueue<Integer> cola = new Queue<>();	
		cola.enqueue(256);
		assertEquals( false, cola.isEmpty());
		cola.dequeue();
		assertEquals(true, cola.isEmpty());
	}
	
	/**
	 * Test del m�todo size() de la clase IQueue.
	 */
	public void testSize() {
		IQueue<Integer> cola = new Queue<>();	
		cola.enqueue(1);
		
		cola.enqueue(2);
		cola.enqueue(3);
		cola.enqueue(4);
		cola.enqueue(5);
		assertEquals(5, cola.size());
	}
	
	/**
	 * Test del m�todo enqueue() de la clase IQueue.
	 */
	public void testEnqueue() {
		IQueue<Integer> cola = new Queue<>();	
		cola.enqueue(1);
		cola.enqueue(2);
		cola.enqueue(3);
		cola.dequeue();
		cola.dequeue();
		cola.enqueue(4);
		assertEquals(2, cola.size());
	}
	
	
	/**
	 * Test del m�todo dequeue() de la clase IQueue.
	 */
	public void testDequeue() {
		IQueue<Integer> cola = new Queue<>();	
		cola.enqueue(1);
		cola.enqueue(2);
		cola.enqueue(3);
		cola.dequeue();
		assertEquals(2, cola.size());
	}
}
