package test;

import org.junit.Test;

import junit.framework.TestCase;
import model.data_structures.ILinkedList;
import model.data_structures.LinkedList;

public class LinkedListTest extends TestCase{

	@Test
	public void testAgregar() {
		ILinkedList<Integer> arreglo = new LinkedList<>();
		arreglo.add(3);
		assertEquals(arreglo.getCounter(), 1);
	}
	
}
