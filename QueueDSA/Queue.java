package com.nagarro.QueueDSA;


import java.util.Scanner;


public class Queue {
	
	int[] list;
	int front;
	int rear;
	int capacity;
	
	public Queue(int capacity) {
		this.list = new int[capacity];
		this.front = -1;
		this.rear = -1;
		this.capacity = capacity;
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the capacity of the queue :\t");
		int capacity = scanner.nextInt();
		Queue queue = new Queue(capacity);
		String decision = "y";
		
		do {
			try {
				Scanner sc = new Scanner(System.in);
				System.out.println("Press 1: Enqueue");
				System.out.println("Press 2: Dequeue");
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
						Enqueue.enqueue(queue, data);
						break;
					case 2:
						int front = Dequeue.dequeue(queue);
						if(front != Integer.MAX_VALUE) {
							System.out.println("Dequeue element from queue is : " + front);
						}
						break;
					case 3:
						int front_element = Peek.peek(queue);
						if(front_element != Integer.MAX_VALUE) {
							System.out.println("Peek element of queue is : " + front_element);
						}
						break;
					case 4:
						System.out.print("Enter the element :\t");
						int element = sc.nextInt();
						if(Contains.contain(queue, element)) {
							System.out.println("Element " + element + " is present");
						}
						else {
							System.out.println("Element " + element + " is not present");
						}
						break;
					case 5:
						System.out.println("Size of Queue is : " + Size.size(queue));
						break;
					case 6:
						Reverse.reverse(queue);
						break;
					case 7:
						Iterator it = new Iterator(queue);
						System.out.println("Elements through iterator in queue is :");
						while(it.hasNext()) {
							System.out.print(it.next() + " ");
						}
						System.out.println();
						break;
					case 8:
						Print.display(queue);
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
