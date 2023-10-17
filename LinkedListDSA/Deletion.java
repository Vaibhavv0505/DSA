package com.nagarro.LinkedListDSA;

public class Deletion {
	
	// Deletion at last position
	public static Node delete(LinkedList list) {
		Node deleted_node = null;
		if(list.head == null) {
			System.out.println("List is empty!!");
		}
		else {
			Node previous_node = null;
			Node last_node = list.head;
			while(last_node.getNext() != null) {
				previous_node = last_node;
				last_node = last_node.getNext();
			}
			if(previous_node == null) {
				deleted_node = list.head;
				list.head = null;
			}
			else {
				deleted_node = previous_node.getNext();
				previous_node.setNext(null);
			}
			Size.deleteNode(list);
		}
		return deleted_node;
	}
	
	// Deletion at any position
	public static Node deleteAtPosition(LinkedList list, int position) {
		Node deleted_node = null;
		if(position <= 0) {
			System.out.println("Position must greater than 0 !!!");
		}
		else {
			if(list.head == null) {
				System.out.println("List is empty!");
			}
			else if(position == 1) {
				deleted_node = list.head;
				list.head = list.head.getNext();
				Size.deleteNode(list);
			}
			else if(position >= Size.getTotalNode(list)) {
				deleted_node = delete(list);
			}
			else {
				Node node = list.head;
				int count = 2;
				while(count < position) {
					node = node.getNext();
					count += 1;
				}
				deleted_node = node.getNext();
				node.setNext(node.getNext().getNext());
				Size.deleteNode(list);
			}
		}
		
		
		return deleted_node;
	}
	
	

}
