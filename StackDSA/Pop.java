package com.nagarro.StackDSA;

public class Pop {
	
	public static int pop(Stack stack) {
		if(stack.top == -1) {
			System.out.println("Stack is empty!!");
			return Integer.MAX_VALUE;
		}
		else {
			int top_element = stack.list[stack.top];
			stack.list[stack.top] = Integer.MIN_VALUE;
			stack.top--;
			return top_element;
		}
	}
	
}
