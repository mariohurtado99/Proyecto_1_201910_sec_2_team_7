package model.data_structures;

import java.util.Iterator;

/**
 * 
 * @author Mario Hurtado 
 * @param <T>
 */
public class LinkedList<T> implements ILinkedList<T> {

	public Node head;
	public int listCount;

	public LinkedList(){
		head = new Node(0);
		listCount = 0;
	}

	public void show(){
		Node current = head;
		while(current.getSiguiente()!=null){
			System.out.print(current.getDato()+" -> ");
			current = current.getSiguiente();
		}
		System.out.println(current.getDato());
	}

    public void add(T d){
    	Node end = new Node(d);
    	Node current = head;

    	while(current.getSiguiente() != null){
    		current = current.getSiguiente();
    	}
    	current.setSiguiente(end);
    	listCount++;
    }

    public boolean add(T d,int index){
    	Node end = new Node(d);
    	Node current = head;
    	int jump;

    	if(index>listCount || index<1){
    		System.out.println("Add Failed: index out of bounds of size of linked list!!");
    		return false;
    	}
    	else{
    		jump = 0;
    		while(jump<index-1){
    			current = current.getSiguiente();
    			jump++;
    		}
    		end.setSiguiente(current.getSiguiente()); 
    		current.setSiguiente(end);
    		listCount++;
    		System.out.println("Success! "+d+" added at index "+index);
            return true;
    	}
    }

   

    public boolean deleteNodeAtIndex(int index){
    	Node current = head;
    	int jump;
    	if(index>listCount || index<1){
    		System.out.println("Delete Failed: index out of bounds of size of linked list!!");
    		return false;
    	}    	
    	else{
    		jump=0;
    		while(jump<index-1){
    			current = current.getSiguiente();
    			jump++;
    		}
    		current.setSiguiente(current.getSiguiente().getSiguiente()); 
    		System.out.println("Success! Node at index "+index+" deleted.");
    		listCount--;
    		return true;
    	}
    	
    	

    }
    
    public int size() {
		return listCount;
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

	public T get(int index)
	// returns the element at the specified position in this list.
	{
		// index must be 1 or higher
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
}
