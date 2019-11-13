package problemStatments;

import baisc.LinkedList;
import baisc.Node;

public class ReverseLinkedList {

	public static void main(String[] args) {

		LinkedList list = new LinkedList();
		list.insert(12);
		list.insert(10);		
		list.insert(6);
		list.insert(5);
		
		list.print();
		
		reverseOperation(list);
		
	}
	
	public static void reverseOperation(LinkedList list)	{
		Node current =  list.Head;
		Node prev = null;
		Node next = null;
		
		
		while(current != null)	{
			
			//	storing reference at current node
			next = current.reference;
			
			//	update reference at current node with previous node
			current.reference = prev;
			
			//	updating previous node with current node
			prev = current;
			
			//	updating current node to next node
			current = next;	
		}
		
		list.Head = prev;
		
		System.out.println();
		list.print();
	}
}
