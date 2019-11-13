package problemStatments;

import baisc.LinkedList;
import baisc.Node;

public class IntersectionOfLinkedList {

	public static void main(String[] args) {
		LinkedList list1 = new LinkedList();
		list1.insert(20);
		list1.insert(4);
		list1.insert(15);
		list1.insert(10);
		
		LinkedList list2 = new LinkedList();
		list2.insert(10);
		list2.insert(2);
		list2.insert(4);
		list2.insert(8);
	
		System.out.print("List - 1 : ");
		list1.print();
		System.out.println();
		
		System.out.print("List - 2 : ");
		list2.print();
		System.out.println();
		
		IntersectionOperation intersection = new IntersectionOperation(list1.Head, list2.Head);
		System.out.print("List - 3 (List-1 U List-2) : ");
		intersection.print();
	}
}

class IntersectionOperation	{
	
	public LinkedList list = new LinkedList();
	
	public IntersectionOperation(Node Head1,Node Head2)	{
		Node node1 = Head1;
		Node node2 = Head2;
		
		while(node1.reference != null)	{
			list.insert(node1.data);
			node1 = node1.reference;
		}
		
		list.insert(node1.data);
		node1 = node1.reference;
		
		while(node2.reference != null)	{
			if(!isPresent(list.Head,node2.data))	{
				list.insert(node2.data);
				
				node2 = node2.reference;	
			}
		}
	}
	
	public boolean isPresent(Node Head, int data)	{
		Node node = Head;
		
		while(node != null)	{
			if(node.data == data)
				return true;
		}
		
		return false;
	}
	
	public void print()		{
		Node node = list.Head;
		
		System.out.print("[ HEAD -> ");
		
		while(node.reference != null)	{
			System.out.print("{ " + node.data + ": " + node.reference +" }" + " -> ");
			node = node.reference;
		}
		System.out.print("{ " + node.data + ": " + node.reference +" }" + " -> ");
		System.out.println("NULL ]");
		
		System.out.println("Linked List Length : " + listLength());
	}
	
	public int listLength()		{
		int length = 0;
		Node node = list.Head;
		while(node.reference != null)	{
			node = node.reference;
			++length;
		}
		++length;
		
		return length;
	}
}
