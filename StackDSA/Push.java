package com.nagarro.StackDSA;

public class Push {
	
	public static void push(Stack stack, int data) {
		if(stack.top + 1 == stack.capacity) {
			System.out.println("Stack is full!!");
		}
		else {
			stack.top++;
			stack.list[stack.top] = data;
		}
	}
	
	
}
