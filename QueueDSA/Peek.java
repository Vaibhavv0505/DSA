package com.nagarro.QueueDSA;

public class Peek {
	
	public static int peek(Queue queue) {
		if(queue.front == -1) {
			System.out.println("Queue is empty!!");
			return Integer.MAX_VALUE;
		}
		else{
			return queue.list[queue.front];
		}
	}
	
}
