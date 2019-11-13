package problemStatments;

import baisc.LinkedList;
import baisc.Node;

public class StoreSumOfTwoLinkedList {

	public static void main(String[] args) {
		LinkedList list1 = new LinkedList();
		list1.insert(1);
		list1.insert(0);
		list1.insert(2);
		list1.insert(3);
		list1.insert(5);
		
		
		LinkedList list2 = new LinkedList();
		list2.insert(9);
		list2.insert(1);
		list2.insert(2);
	
		System.out.print("List - 1 : ");
		list1.print();
		System.out.println();
		
		System.out.print("List - 2 : ");
		list2.print();
		System.out.println();
		
		Operation sum = new Operation();
		sum.sumFunctionType1(list1.Head, list2.Head);
		System.out.println();
		
		sum.sumFunctionType2(list1.Head, list2.Head);
		System.out.println();
		
		sum.sumFunctionType3(list1, list2);
		System.out.println();
	}

}

class Operation	{
	public LinkedList list1 = new LinkedList();
	public LinkedList list2 = new LinkedList();
	public LinkedList list3 = new LinkedList();
	
	public int sum = 0;
	public int carry = 0;
	
	public void sumFunctionType1(Node head1, Node head2)	{
		Node node1 = head1;
		Node node2 = head2;
		
		while(node1 != null && node2 != null)	{
			sum = node1.data + node2.data;
			list1.insert(sum);
			
			node1 = node1.reference;
			node2 = node2.reference;
		}
		
		System.out.println("Sum Operation Type - 1");
		System.out.print("List - 3 : ");
		list1.print();
	}
	
	public void sumFunctionType2(Node head1, Node head2)	{
		Node node1 = head1;
		Node node2 = head2;
		
		while(node1 != null && node2 != null)	{
			
			int i = node1.data + node2.data;
			i = carry + i;
			sum = i % 10;		//	Generate sum value at 10th place
			carry = i/10;		//	Generate carry
			list2.insert(sum);
			
			node1 = node1.reference;
			node2 = node2.reference;
		}
		
		System.out.println("Sum Operation Type - 2");
		System.out.print("List - 4 : ");
		list2.print();
	}
	
	
	public void sumFunctionType3(LinkedList list1, LinkedList list2)	{
		Node node1 = list1.Head;
		Node node2 = list2.Head;
		
		int len1 = list1.listLength();
		System.out.println("length : " + len1);
		
		int len2 = list2.listLength();
		System.out.println("length : " + len2);
		
		if(len1 > len2)
			findSum(len1, node1, node2);
		else
			findSum(len2, node2, node1);		
	}
	
	public void findSum(int len, Node node, Node node2)	{
		int j = 0;
		
		
		System.out.print("[ HEAD -> ");
		while(node != null && j<len)	{
			
			if(node2 == null)	{
				int i = node.data + 0;
				i = carry + i;
				sum = i % 10;		//	Generate sum value at 10th place
				carry = i/10;		//	Generate carry
				
				System.out.print(sum + " -> ");
				list3.insert(sum);
				
				node = node.reference;
			}
			else	{
				int i = node.data + node2.data;;
				i = carry + i;
				sum = i % 10;		//	Generate sum value at 10th place
				carry = i/10;		//	Generate carry
				
				System.out.print(sum + " -> ");
				list3.insert(sum);
				
				node = node.reference;
				node2 = node2.reference;
			}
			
			++j;
		}
		System.out.print("NULL ]");
		
		System.out.println("Sum Operation Type - 3");
		System.out.print("List - 4 : ");
		list3.print();
	}
}
