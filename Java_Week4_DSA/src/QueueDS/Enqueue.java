package QueueDS;


public class Enqueue {
	
	public static void enqueue(Queue queue, int data) {
		if(queue.rear + 1 == queue.capacity) {
			System.out.println("Queue is full!!");
		}
		else {
			queue.rear++;
			queue.list[queue.rear] = data;
			if(queue.front == -1) {
				queue.front++;
			}
		}
	}
	
}
