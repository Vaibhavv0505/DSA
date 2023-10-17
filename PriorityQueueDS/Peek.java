package com.nagarro.PriorityQueueDS;

public class Peek {
	
	public static int peek(PriorityQueue priority_queue) {
		if(priority_queue.front == 0) {
			System.out.println("Queue is empty!!");
			return Integer.MAX_VALUE;
		}
		else{
			return priority_queue.list[priority_queue.front];
		}
	}
	
}
