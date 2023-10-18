package StackDS;

public class Peek {
	
	public static int peek(Stack stack) {
		if(stack.top == -1) {
			System.out.println("Stack is empty!!");
			return Integer.MAX_VALUE;
		}
		else{
			return stack.list[stack.top];
		}
	}

}
