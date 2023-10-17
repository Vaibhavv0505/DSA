package com.nagarro.QueueDSA;

public class Reverse {
	
	public static void reverse(Queue queue) {
		
		int front_index = queue.front;
		int rear_index = queue.rear;
		while(front_index < rear_index) {
			int temp = queue.list[front_index];
			queue.list[front_index] = queue.list[rear_index];
			queue.list[rear_index] = temp;
			front_index++;
			rear_index--;
		}
	}
	
}
