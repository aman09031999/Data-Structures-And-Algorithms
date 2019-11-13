package circularLinkedList;

public class MainApp {

	public static void main(String[] args) {
		int[] arr = {12,6,8,3};
		
		CircularLinkedList list = new CircularLinkedList();
		
		list.insert(arr.length, arr);
		list.println();
		
		list.createCircle(list);
		list.println();
	}

}
