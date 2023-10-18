package LinkedListDS;

public class Print {
	
	public static void display(LinkedList list) {
		if(list.head == null) {
			System.out.println("List is empty!");
		}
		else {
			Node node = list.head;
			while(node.getNext() != null) {
				System.out.print(node.getData()+"->");
				node = node.getNext();
			}
			System.out.println(node.getData());
		}
	}
	
	
}
