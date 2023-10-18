package StackDS;

public class Reverse {
	
	public static void reverse(Stack stack) {
		Stack stack_copy = new Stack(stack.capacity);
		while(stack.top != -1) {
			Push.push(stack_copy, Pop.pop(stack));
		}
		stack.list = stack_copy.list;
		stack.top = stack_copy.top;
	}
	
}
