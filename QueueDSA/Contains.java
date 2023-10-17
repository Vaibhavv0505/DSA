package com.nagarro.QueueDSA;

public class Contains {
	
	public static boolean contain(Queue queue, int element) {
		for(int i = queue.front; i <= queue.rear; i++) {
			if(queue.list[i] == element) {
				return true;
			}
		}
		return false;
	}
	
}
