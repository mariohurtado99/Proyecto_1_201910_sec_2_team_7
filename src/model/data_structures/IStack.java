package model.data_structures;

/**
 * 
 * @author Mario Hurtado
 *
 * @param <Item>
 */
public interface IStack<Item> extends Iterable<Item>{
	
	/**
	 * Retorna true si la Pila esta vacia
	 * @return true si la Pila esta vacia, false de lo contrario
	 */
	public boolean isEmpty();
	
	/**
	 * Retorna el numero de elementos contenidos
	 * @return el numero de elemntos contenidos
	 */
	public int size();
	
	/**
	 * Inserta un nuevo elemento en la Pila
	 * @param t el nuevo elemento que se va ha agregar
	 */
	public void push(Item t);
	
	/**
	 * Quita y retorna el elemento agregado más recientemente
	 * @return el elemento agregado más recientemente
	 */
	public Item pop();	
}
