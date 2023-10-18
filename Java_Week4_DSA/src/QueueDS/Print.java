package QueueDS;


public class Print {
	
	public static void display(Queue queue) {
		if(queue.front == -1) {
			System.out.println("Queue is empty!!");
		}
		else {
			System.out.println("Elements in queue :");
			for(int i = queue.front; i <= queue.rear; i++) {
				System.out.print(queue.list[i]+" ");
			}
			System.out.println();
		}
	}
	
}
