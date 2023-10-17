package com.nagarro.QueueDSA;

public class Dequeue {
	
	public static int dequeue(Queue queue) {
		if(queue.front == -1) {
			System.out.println("Queue is empty!!");
			return Integer.MAX_VALUE;
		}
		else {
			int front_element = queue.list[queue.front];
			queue.list[queue.front] = Integer.MIN_VALUE;
			if(queue.front == queue.rear) {
				queue.front = -1;
				queue.rear = -1;
			}
			else {
				queue.front++;
			}
			return front_element;
		}
	}
	
}
