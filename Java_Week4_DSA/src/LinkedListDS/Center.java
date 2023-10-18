package LinkedListDS;

import java.lang.Math;

public class Center {
	
	public static void findCenter(LinkedList list) {
		int length = Size.getTotalNode(list);
		if(length == 0) {
			System.out.println("List is empty!!");
		}
		else {
			int count = Math.floorDiv(length, 2);
			int i = 1;
			Node current = list.head;
			while(i < count) {
				current = current.getNext();
				i += 1;
			}
			if(length == 1) {
				System.out.println("The data of central node is "+current.getData());
			}
			else if(length % 2 == 0) {
				System.out.println("The data of central nodes are "+current.getData()+" and "+current.getNext().getData());
			}
			else {
				System.out.println("The data of central node is "+current.getNext().getData());
			}
		}
	}
	
	
}
