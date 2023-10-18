package QueueDS;


public class Iterator {
	
	private int current_index;
	private int start_index;
	private int last_index;
	private Queue queue;
	
	public Iterator(Queue queue) {
		this.current_index = queue.front;
		this.queue = queue;
		this.start_index = queue.front;
		this.last_index = queue.rear;
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
			value = this.queue.list[current_index];
			this.current_index++;
		}
		return value;
	}
	
}
