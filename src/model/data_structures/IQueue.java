package model.data_structures;

/**
 * 
 * @author Mario Hurtado
 * @param <Item>
 */
public interface IQueue<Item> extends Iterable<Item>{

	/**
	 * Retorna true si la Cola esta vacia
	 * @return true si la Cola esta vacia, false de lo contrario
	 */
	public boolean isEmpty();
	
	/**
	 * Retorna el numero de elementos contenidos
	 * @return el numero de elementos contenidos
	 */
	public int size();
	
	/**
	 * Inserta un nuevo elemento en la Cola
	 * @param t el nuevo elemento que se va ha agregar
	 */
	public void enqueue(Item t);
	
	/** 
	 * Quita y retorna el elemento agregado menos recientemente
	 * @return el elemento agregado menos recientemente
	 */
	public Item dequeue();
	
}
