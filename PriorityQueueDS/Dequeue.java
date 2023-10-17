package com.nagarro.PriorityQueueDS;

public class Dequeue {
	
	public static int dequeue(PriorityQueue priority_queue) {
		if(priority_queue.front == 0) {
			System.out.println("Queue is empty!!");
			return Integer.MAX_VALUE;
		}
		else {
			int front_element = priority_queue.list[priority_queue.front];
			if(priority_queue.front == priority_queue.rear) {
				priority_queue.list[priority_queue.rear] = Integer.MAX_VALUE;
				priority_queue.front = 0;
				priority_queue.rear = 0;
			}
			else {
				priority_queue.list[priority_queue.front] = priority_queue.list[priority_queue.rear];
				priority_queue.list[priority_queue.rear] = Integer.MAX_VALUE;
				priority_queue.rear--;
				int parent_index = 1;
				int left_child_index = 2;
				int right_child_index = 3;
				int height = (int)Math.ceil(Math.log(priority_queue.rear + 1) / Math.log(2)) - 1;
				int i = 0;
				while(i < height && (priority_queue.list[left_child_index] < priority_queue.list[parent_index] || priority_queue.list[right_child_index] < priority_queue.list[parent_index])) {
					int current_index;
					if(priority_queue.list[left_child_index] < priority_queue.list[right_child_index]) {
						current_index = left_child_index;
					}
					else {
						current_index = right_child_index;
					}
					int temp = priority_queue.list[current_index];
					priority_queue.list[current_index] = priority_queue.list[parent_index];
					priority_queue.list[parent_index] = temp;
					parent_index = current_index;
					left_child_index = 2*current_index;
					right_child_index = 2*current_index + 1;
					i++;
				}
			}
			return front_element;
		}
	}
	
	
}
