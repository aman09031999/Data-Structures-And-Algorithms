package problemStatments;

import baisc.LinkedList;
import baisc.Node;

public class IntersectionPointofTwoLinkedList {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.Head = new Node(3);
		list.Head.reference = new Node(6);
		list.Head.reference.reference = new Node(9);
		list.Head.reference.reference.reference = new Node(15);
		list.Head.reference.reference.reference.reference = new Node(30);
		
		list.Head2 = new Node(10);
		list.Head2.reference = new Node(15);
		list.Head2.reference.reference = new Node(30);
		
		list.printTwoList();
		System.out.println();
		FindNode node = new FindNode();
		System.out.println("Intersection Node : " + node.getNode(list.Head, list.Head2));
	}
}

class FindNode	{
	
	public int getNode(Node head1, Node head2)	{
		
		int c1 = getCount(head1);
		System.out.println("No. of Nodes in List-1 : " + c1);
		int c2 = getCount(head2);
		System.out.println("No. of Nodes in List-2 : " + c2);
		int d = 0;
		
		if(c1>c2)	{
			d = c1 - c2;
			return findIntersectionNode(d, head1, head2);
		}
		else	{
			d = c2 - c1;
			return findIntersectionNode(d, head1, head2);
		}
	}
	public static int findIntersectionNode(int d, Node head1, Node head2)	{
		Node list1 = head1;
		Node list2 = head2;

		for(int i=0;i<d;i++)	{
			if(list1 == null)
				return -1;
			list1 = list1.reference;
		}

		while(list1 != null && list2 != null) {
			if(list1.data == list2.data)
				return list1.data;
			
			list1 = list1.reference;
			list2 = list2.reference;
		}		
		return 0;
	}
	
	public int getCount(Node head)	{
		Node node = head;
		int count = 0;
		while(node != null)	{
			++count;
			node = node.reference;
		}
		return count;
	}
}