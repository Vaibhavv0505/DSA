package PriorityQueueDS;


public class Print {
	
	public static void display(PriorityQueue priority_queue) {
		
		if(priority_queue.front == 0) {
			System.out.println("Priority queue is empty!!");
		}
		else {
			System.out.println("Elements in priority queue :");
			for(int i = priority_queue.front; i <= priority_queue.rear; i++) {
				System.out.print(priority_queue.list[i]+" ");
			}
			System.out.println();
		}
		
	}
	
	
}
