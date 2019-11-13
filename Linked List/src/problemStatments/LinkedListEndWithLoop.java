package problemStatments;

import baisc.LinkedList;
import baisc.Node;

public class LinkedListEndWithLoop {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.insert(12);
		list.insert(10);
		list.insert(6);
		list.insert(5);
		list.insert(1);
		
		/*	creating loop in Linked List	*/
		list.Head.reference.reference.reference.reference = list.Head;
		int i = detectLoop(list);
		
		if(i == 0)
			System.out.println("Loop Not Found...!!");
	}
	
	public static int detectLoop(LinkedList list)	{
		Node slow = list.Head;
		Node fast = list.Head;
		
		while(slow.reference != null && fast.reference != null && fast.reference.reference != null)	{
			
			slow = slow.reference;
			fast = fast.reference.reference;
			
			if(slow == fast)
			{
				System.out.println("Loop Found...!!");
				return 1;
			}
		}
		return 0;
	}
}
