package com.nagarro.LinkedListDSA;

public class Reverse {
	
	// Reverse the linked list
	public static void reverse(LinkedList list) {
		
		
		if(list.head == null) {
			System.out.println("List is Empty!!");
		}
		else {
			Node previous = null;
			Node current = list.head;
			Node next;
			while(current != null) {
				next = current.getNext();
				current.setNext(previous);
				previous = current;
				current = next;
			}
			list.head = previous;
		}
		
		
	}
	
	
}
