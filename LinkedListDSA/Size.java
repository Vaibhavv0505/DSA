package com.nagarro.LinkedListDSA;


public class Size {
	
	
	public static int getTotalNode(LinkedList list) {
		return list.total_node;
	}
	public static void addNode(LinkedList list) {
		list.total_node += 1;
	}
	public static void deleteNode(LinkedList list) {
		list.total_node -= 1;
	}
	
}
