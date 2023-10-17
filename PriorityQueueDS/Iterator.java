package com.nagarro.PriorityQueueDS;


public class Iterator {

	private int current_index;
	private int start_index;
	private int last_index;
	private PriorityQueue priority_queue;
	
	public Iterator(PriorityQueue priority_queue) {
		this.current_index = priority_queue.front;
		this.priority_queue = priority_queue;
		this.start_index = priority_queue.front;
		this.last_index = priority_queue.rear;
	}
	
	public boolean hasNext() {
		boolean exist = false;
		if(this.current_index >= this.start_index && this.current_index <= this.last_index) {
			exist = true;
		}
		return exist;
	}
	public int next() {
		int value = Integer.MAX_VALUE;
		if(this.current_index >= this.start_index && this.current_index <= this.last_index) {
			value = this.priority_queue.list[current_index];
			this.current_index++;
		}
		return value;
	}
	
}
