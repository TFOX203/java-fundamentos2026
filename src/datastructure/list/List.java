package datastructure.list;
/*
 * interface oriented development: we use interface to abstract different solutions
 * Alexander pulpon
 */

public interface List<E> {
	/*
	 * Add element to the tail of the list
	 */
	public void add(E e);
		
	
	//public INT add(E e);
	//remove the element
	public E remove(int index);
	//remove the last element
	public E removeFromTail();
	//remove the first  element from the head
	public E removeFromHead();
	//add an element to the especifico from the list
	public void add(E e, int position);

}
