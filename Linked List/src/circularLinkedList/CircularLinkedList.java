package circularLinkedList;

import baisc.Node;

public class CircularLinkedList {

	Node Head;
	Node headNode = Head;
	Node tailNode = null;
	
	public void insert(int length, int[] arr)	{
		
		for(int i=0;i<length;i++)	
		{
			Node newNode = new Node();
			newNode.data = arr[i];
			newNode.reference = null;
			
			if(Head == null) {
				Head = newNode;
			}	else	{
				Node node = Head;
				
				while(node.reference != null)	{
					node = node.reference;
				}
				
				node.reference = newNode;
			}
		}
	}
	
	public void createCircle(CircularLinkedList list)	{
		
		Node node = Head;
		
		while(node.reference != null)	{
			node = node.reference;
		}
		
		node.reference = Head;
/*
		this.tailNode = node;
		this.tailNode = Head;
*/		
	}
	
	public void print()		{
		Node node = Head;
		int length = 0;
		System.out.print("[ HEAD {" + Head + "} -> ");
		
		while(node.reference != null)	{
			System.out.print("{ " + node.data + ", " + node.reference +" }" + " -> ");
			node = node.reference;
		}
		System.out.print("{ " + node.data + ", " + node.reference +" }" + " -> ");
		System.out.println("NULL ]");
		
		System.out.println("Linked List Length : " + listLength());
	}
	
	void println()	{
		Node node = Head;
		int i = 0;
		System.out.print("[ HEAD {" + Head + "} -> ");
	
		while(i<listLength() && node.reference != null) {
			System.out.print("{ " + node.data + ", " + node.reference +" }" + " -> ");
			node = node.reference;
		}
		
		System.out.print("{ " + node.data + ", " + node.reference +" }" + " -> ");
		System.out.println("NULL ]");
		
	}
	
	
	public void print(CircularLinkedList list)		{
		Node node = list.Head;
		
		System.out.print("[ HEAD -> ");
		
		while(node.reference != null)	{
			System.out.print("{ " + node.data + ", " + node.reference +" }" + " -> ");
			node = node.reference;
		}
		System.out.print("{ " + node.data + ", " + node.reference +" }" + " -> ");
		System.out.println("NULL ]");
		
		System.out.println("Linked List Length : " + listLength(list));
	}
	
	public int listLength()		{
		int length = 0;
		Node node = Head;
		while(node.reference != null)	{
			node = node.reference;
			++length;
		}
		++length;
		
		return length;
	}
	
	public int listLength(CircularLinkedList list)		{
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
