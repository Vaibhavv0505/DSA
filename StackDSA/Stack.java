package com.nagarro.StackDSA;


import java.util.Scanner;


public class Stack {
	
	int[] list;
	int top;
	int capacity;
	
	public Stack(int capacity) {
		this.list = new int[capacity];
		this.top = -1;
		this.capacity = capacity;
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the capacity of the stack :\t");
		int capacity = scanner.nextInt();
		Stack stack = new Stack(capacity);
		String decision = "y";
		
		do {
			try {
				Scanner sc = new Scanner(System.in);
				System.out.println("Press 1: Push");
				System.out.println("Press 2: Pop");
				System.out.println("Press 3: Peek");
				System.out.println("Press 4: Contains");
				System.out.println("Press 5: Size");
				System.out.println("Press 6: Reverse");
				System.out.println("Press 7: Iterator");
				System.out.println("Press 8: Print");
				System.out.print("Enter an option :\t");
				int choice = sc.nextInt();
				switch(choice) {
					case 1:
						System.out.print("Enter the data :\t");
						int data = sc.nextInt();
						Push.push(stack, data);
						break;
					case 2:
						int top = Pop.pop(stack);
						if(top != Integer.MAX_VALUE) {
							System.out.println("Popped element from stack is : " + top);
						}
						break;
					case 3:
						int top_element = Peek.peek(stack);
						if(top_element != Integer.MAX_VALUE) {
							System.out.println("Peek element of stack is : " + top_element);
						}
						break;
					case 4:
						System.out.print("Enter the element :\t");
						int element = sc.nextInt();
						if(Contains.contain(stack, element)) {
							System.out.println("Element " + element + " is present");
						}
						else {
							System.out.println("Element " + element + " is not present");
						}
						break;
					case 5:
						System.out.println("Size of stack is : " + Size.size(stack));
						break;
					case 6:
						Reverse.reverse(stack);
						break;
					case 7:
						Iterator it = new Iterator(stack);
						System.out.println("Elements through iterator in stack is :");
						while(it.hasNext()) {
							System.out.print(it.next() + " ");
						}
						System.out.println();
						break;
					case 8:
						Print.display(stack);
						break;
					default:
						System.out.println("Invalid Option!!!");
						break;
				}
			}
			catch(Exception e) {
				System.out.println("Invalid input !!!");
			}
			finally {
				Scanner sc = new Scanner(System.in);
				System.out.print("Do you want to perform more operation (y/n):\t");
				decision = sc.next();
			}
				
				
		}while(decision.equals("y") || decision.equals("Y"));
		
		
	}

	
}
