package LinkedListDS;

public class Iterator {
	
	Node node;
	Node head;
	
	public Iterator(LinkedList list) {
		this.node = list.head;
		this.head = list.head;
	}
	
	public boolean hasNext() {
		boolean exist = false;
		if(this.node != null) {
			exist = true;
		}
		return exist;
	}
	
	public Node next() {
		Node current_node = null;
		if(this.node == null) {
			return null;
		}
		else {
			current_node = this.node;
			this.node = this.node.getNext();
			return current_node;
		}
	}
	
}
