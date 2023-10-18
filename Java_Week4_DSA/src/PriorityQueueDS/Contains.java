package PriorityQueueDS;


public class Contains {
	
	public static boolean contain(PriorityQueue priority_queue, int element) {
		for(int i = priority_queue.front; i <= priority_queue.rear; i++) {
			if(priority_queue.list[i] == element) {
				return true;
			}
		}
		return false;
	}
	
}
