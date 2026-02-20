package datastructure.list;

/*
 *interface oriented development: we use interfaces to 
 *abstract different solutions
 *In a interface,you can declare methods,but without
 *implementations,in other words, without method body,
 *or only with method signature (firma). As each method
 *could have multiples different implementation
 * @author Alexander
 * 12 feb 2026
 */
/**
 *
 *@author Alexander Pulpon
 *17 feb 2026
 */
public class LinkedistImpl<E> implements List<E>{

	// The reference to the last element in the list
	private Node<E> last;
	// The reference to the first element of the list
	private Node<E> first;
	//this method removes a node the tail of the list
	public Node<E> remove(){
		
		Node<E> temp2;
		Node<E> temp = first;
		//& means and
		while(temp != null && temp.next !=null) {//while temp is not nul an temp.next is not null
			temp2 = temp;
			//move to the next node
			temp = temp.next;
		
		}
		
		return null;
	}

	public void add(E e)  {
		//1. check the parameter if it is valid
		if(e == null) {
			try {
				throw new Exception("You can not pass a null node to the list");
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		}
		Node<E> node = new Node(e);
		//2. add the node to the tail of the list
		//2.1 Check first if the head element is null
		// in the case of null, it means the list is empty
		if(first == null) {//if the list is empty
			// the list is empty
			last = node;
			first = node;
		}
		else {
			last.next = node;
			last = node;
			
		}
		
		

	}

	public Node<E> getLast() {
		return last;
	}

	public Node<E> getFirst() {
		return first;
	}

		//print all the nodes of the list
	public void printList() {
//		System.out.println(first.getData());
//		System.out.println(first.getNext().getData());
//		System.out.println(first.getNext().getNext().getData());
//		System.out.println(first.getNext().getNext().getNext().getData());
		
		Node<E> temp = first;
		while(temp != null) {//while is not null
			//print the data stored in this node
			System.out.println(temp.getData());
			//move to the next node
			temp = temp.next;
			
			
		}
	}


	@Override
	public E remove(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E removeFromTail() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E removeFromHead() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(E e, int position) {
		// TODO Auto-generated method stub
		
	}
	
}



class Node<E> {

	public Node(E e) {
		data = e;
	}
	// The data stored in a node of the list
	private E data;
	// Each node needs to pint to the next node, we use this variable to do it
	protected Node<E> next;
	public E getData() {
		return data;
	}
	public void setData(E data) {
		this.data = data;
	}
	public Node<E> getNext() {
		return next;
	}
	public void setNext(Node<E> next) {
		this.next = next;
	}

}
