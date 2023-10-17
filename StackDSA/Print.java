package com.nagarro.StackDSA;

public class Print {
	
	public static void display(Stack stack) {
		if(stack.top == -1) {
			System.out.println("Stack is empty!!");
		}
		else {
			System.out.println("Elements in stack :");
			for(int i = 0; i <= stack.top; i++) {
				System.out.print(stack.list[i]+" ");
			}
			System.out.println();
		}
	}
	
	
}
