package com.nagarro.PriorityQueueDS;


public class Enqueue {
	
	public static void enqueue(PriorityQueue priority_queue, int data) {
		if(priority_queue.rear == priority_queue.capacity) {
			System.out.println("Queue is full!!");
		}
		else if(priority_queue.front == 0) {
			priority_queue.front++;
			priority_queue.rear++;
			priority_queue.list[priority_queue.rear] = data;
		}
		else {
			priority_queue.rear++;
			priority_queue.list[priority_queue.rear] = data;
			int current_index = priority_queue.rear;
			int parent_index = Math.floorDiv(current_index, 2);
			while(parent_index > 0 && priority_queue.list[current_index] < priority_queue.list[parent_index]) {
				int temp = priority_queue.list[current_index];
				priority_queue.list[current_index] = priority_queue.list[parent_index];
				priority_queue.list[parent_index] = temp;
				current_index = parent_index;
				parent_index = Math.floorDiv(current_index, 2);
			}
		}
	}
	
	
}
