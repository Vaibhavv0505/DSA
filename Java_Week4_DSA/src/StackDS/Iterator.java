package StackDS;

public class Iterator {
	
	private int current_index;
	private Stack stack;
	
	public Iterator(Stack stack) {
		this.current_index = stack.top;
		this.stack = stack;
	}
	
	public boolean hasNext() {
		boolean exist = false;
		if(this.current_index >= 0) {
			exist = true;
		}
		return exist;
	}
	public int next() {
		int value = Integer.MAX_VALUE;
		if(this.current_index >= 0) {
			value = this.stack.list[current_index];
			this.current_index--;
		}
		return value;
	}
	
}
