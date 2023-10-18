package QueueDS;


public class Size {
	
	public static int size(Queue queue) {
		if(queue.rear == -1) {
			return 0;
		}
		return queue.rear - queue.front + 1;
	}
	
}
