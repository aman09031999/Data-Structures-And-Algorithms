package baisc;

public class MainApp {

	public static void main(String[] args) {
	
		LinkedList list = new LinkedList();
		list.insert(12);
		list.insert(6);
		list.insert(8);
		list.insert(3);
		
		list.print();
		
		System.out.println();
		
		list.insertAtStart(15);
		list.print();
		
		System.out.println();
		
		list.insertAt(3, 10);
		list.print();

		System.out.println();
		
		list.insertAt(5, 1);
		list.print();
	}
}
