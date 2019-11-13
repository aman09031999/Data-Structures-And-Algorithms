package baisc;

public class LinkedList {

	public Node Head;
	public Node Head2;
	
	public void insert(int data) {
		
		Node newNode = new Node();
		newNode.data = data;
		newNode.reference = null;
		
		if(Head == null)	{
			Head = newNode;	
			
			
		} else {
			
			Node node = Head;
			
			while(node.reference != null)	{
				node = node.reference;
			}
			
			node.reference = newNode;
		}
	}
	
	public void insertAtStart(int data)	{
		Node newNode = new Node();
		newNode.data = data;
		newNode.reference = null;

		newNode.reference = Head;
		Head = newNode;
		
	}
	
	public void insertAt(int index, int data)	{
		
		Node newNode = new Node();
		newNode.data = data;
		newNode.reference = null;
		
		Node node = Head;
		int i = 1;
		
		while(i<index-1)	{
			node = node.reference;
			++i;
		}
		
		newNode.reference = node.reference;
		node.reference = newNode;	
		
	}

/*	
	insert(int data)				//	Add data in the end
	insertAt(int data, int index)	//	Add data at 'K' Position
	insertAtStart(int data)			//	Add data at the Start
	delete(int index)				//	Delete Data
*/
	public void print()		{
		Node node = Head;
		
		System.out.print("[ HEAD -> ");
		
		while(node != null)	{
//			System.out.print("{ " + node.data + " : " + node.reference +" }" + " -> ");
			System.out.print(node.data + " -> ");
			node = node.reference;
		}
		System.out.println("NULL ]");
		
		System.out.println("Linked List Length : " + listLength());
	}
	
	public void printTwoList()		{
		Node node = Head;
		Node node2 = Head2;
		
		System.out.print("LIST-1 : [ HEAD -> ");
		while(node != null)	{
//			System.out.print("{ " + node.data + " : " + node.reference +" }" + " -> ");
			System.out.print(node.data + " -> ");
			node = node.reference;
		}
		System.out.println("NULL ]");
		
		System.out.println("Linked List Length : " + listLength(Head));
		
		System.out.print("LIST-2 : [ HEAD -> ");
		while(node2 != null)	{
//			System.out.print("{ " + node.data + " : " + node.reference +" }" + " -> ");
			System.out.print(node2.data + " -> ");
			node2 = node2.reference;
		}
		System.out.println("NULL ]");
		
		System.out.println("Linked List Length : " + listLength(Head2));
	}
	
	public int listLength()		{
		int length = 0;
		Node node = Head;
		while(node != null)	{
			node = node.reference;
			++length;
		}		
		return length;
	}
	
	public void print(Node Head)		{
		Node node = Head;
		
		System.out.print("[ HEAD -> ");
		
		while(node != null)	{
//			System.out.print("{ " + node.data + " : " + node.reference +" }" + " -> ");
			System.out.print(node.data + " -> ");
			node = node.reference;
		}
		System.out.println("NULL ]");
		
		System.out.println("Linked List Length : " + listLength(Head));
	}
	
	
	public int listLength(Node Head)		{
		int length = 0;
		Node node = Head;
		while(node != null)	{
			++length;
			node = node.reference;
		}
	
		return length;
	}
}
