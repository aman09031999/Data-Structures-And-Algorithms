package problemStatments;

import baisc.LinkedList;
import baisc.Node;

public class StartingNodeOfLoop {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.insert(12);
		list.insert(10);
		list.insert(6);
		list.insert(5);
		list.insert(1);
		
		/*	Creating Loop in the LinkedList	*/
		list.Head.reference.reference.reference.reference.reference = list.Head.reference.reference;
		
		System.out.println("Starting Node of Loop : " + startingNode(list.Head));

	}

	public static Node startingNode(Node Head) {
		
		if(Head == null || Head.reference == null)
			return null;
		
		/*	Initialize the slow and fast pointer with 'Head'	*/
			Node slow = Head;
			Node fast = Head;
		
		/*	move slow-pointer with 1-step
		 *  move fast-pointer with 2-step	*/	
			slow = slow.reference;
			fast = fast.reference.reference;
		
		/*	Check whether loop exist or not	*/
			while(fast != null && fast.reference != null)	{
				if(slow == fast)
						break;
				slow = slow.reference;
				fast = fast.reference;
			}
		
		/*	if loop doesn't exist, return : NULL	*/		
		if(slow != fast)
			return null;
		
		slow = Head;
		while(slow != fast)	{
			slow = slow.reference;
			fast = fast.reference;
		}
		
		return slow;		
	}
}