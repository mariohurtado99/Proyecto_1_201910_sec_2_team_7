package test;

import junit.framework.TestCase;
import model.data_structures.IQueue;
import model.data_structures.Queue;

public class QueueTest extends TestCase{
	
	public void testIsEmpty() {
		IQueue<Integer> cola = new Queue<>();	
		cola.enqueue(256);
		assertEquals( false, cola.isEmpty());
		cola.dequeue();
		assertEquals(true, cola.isEmpty());
	}
	
	public void testSize() {
		IQueue<Integer> cola = new Queue<>();	
		cola.enqueue(1);
		
		cola.enqueue(2);
		cola.enqueue(3);
		cola.enqueue(4);
		cola.enqueue(5);
		assertEquals(5, cola.size());
	}
	
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
	
	
	public void testDequeue() {
		IQueue<Integer> cola = new Queue<>();	
		cola.enqueue(1);
		cola.enqueue(2);
		cola.enqueue(3);
		cola.dequeue();
		assertEquals(2, cola.size());
	}
}
