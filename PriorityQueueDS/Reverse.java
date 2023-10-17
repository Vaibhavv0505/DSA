package com.nagarro.PriorityQueueDS;

public class Reverse {
	
	public static void reverse(PriorityQueue priority_queue) {
		
		if(priority_queue.front == 0) {
			System.out.println("Priority queue is empty !!");
		}
		else {
			System.out.println("Elements in priority queue in reverse order is :");
			for(int i = priority_queue.rear; i >= priority_queue.front; i--) {
				System.out.print(priority_queue.list[i] + " ");
			}
			System.out.println();
		}
		
	}
	
}
