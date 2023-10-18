package PriorityQueueDS;

import java.util.Arrays;
import java.util.Scanner;


public class PriorityQueue {
	
	int[] list;
	int front;
	int rear;
	int capacity;
	
	public PriorityQueue(int capacity) {
		int height = (int)Math.ceil(Math.log(capacity + 1) / Math.log(2)) - 1;
		int total_capacity = (int)Math.pow(2, height+1);
		this.list = new int[total_capacity];
		Arrays.fill(this.list, Integer.MAX_VALUE);
		this.front = 0;
		this.rear = 0;
		this.capacity = capacity;
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the capacity of the priority queue :\t");
		int capacity = scanner.nextInt();
		PriorityQueue priority_queue = new PriorityQueue(capacity);
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
						Enqueue.enqueue(priority_queue, data);
						break;
					case 2:
						int front = Dequeue.dequeue(priority_queue);
						if(front != Integer.MAX_VALUE) {
							System.out.println("Dequeue element from priority queue is : " + front);
						}
						break;
					case 3:
						int front_element = Peek.peek(priority_queue);
						if(front_element != Integer.MAX_VALUE) {
							System.out.println("Peek element of priority queue is : " + front_element);
						}
						break;
					case 4:
						System.out.print("Enter the element :\t");
						int element = sc.nextInt();
						if(Contains.contain(priority_queue, element)) {
							System.out.println("Element " + element + " is present");
						}
						else {
							System.out.println("Element " + element + " is not present");
						}
						break;
					case 5:
						System.out.println("Size of Priority Queue is : " + Size.size(priority_queue));
						break;
					case 6:
						Reverse.reverse(priority_queue);
						break;
					case 7:
						Iterator it = new Iterator(priority_queue);
						System.out.println("Elements through iterator in priority queue is :");
						while(it.hasNext()) {
							System.out.print(it.next() + " ");
						}
						System.out.println();
						break;
					case 8:
						Print.display(priority_queue);
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
