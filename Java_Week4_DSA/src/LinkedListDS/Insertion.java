package LinkedListDS;

public class Insertion {
	
	private Node new_node;
	
	// Constructor to create new node with given data
	public Insertion(int data) {
		this.new_node = new Node(data);
	}
	
	// Insertion at last position
	public void insert(LinkedList list) {
		if(list.head == null) {
			list.head = this.new_node;
			
		}
		else {
			Node last_node = list.head;
			while(last_node.getNext() != null) {
				last_node = last_node.getNext();
			}
			last_node.setNext(this.new_node);
		}
		Size.addNode(list);
	}
	
	
	// Insertion at any position
	public void insertAtPosition(LinkedList list, int position) {
		
		if(position <= 0) {
			System.out.println("Position must greater than 0 !!!");
		}
		else {
			if(list.head == null) {
				list.head = this.new_node;
			}
			else if(position == 1) {
				this.new_node.setNext(list.head);
				list.head = new_node;
			}
			else if(position > Size.getTotalNode(list)) {
				insert(list);
			}
			else {
				Node node = list.head;
				int count = 2;
				while(count < position) {
					node = node.getNext();
					count += 1;
				}
				this.new_node.setNext(node.getNext());
				node.setNext(this.new_node);
				Size.addNode(list);
			}
		}
		
	}
	
	
}
