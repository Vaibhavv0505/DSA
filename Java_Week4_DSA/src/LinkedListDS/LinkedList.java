package LinkedListDS;

import java.util.Scanner;

public class LinkedList {
	
	Node head;
	int total_node;
	
	public LinkedList() {
		this.total_node = 0;
	}
	
	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		String decision = "y";
		
		do {
			try {
				Scanner sc = new Scanner(System.in);
				System.out.println("Press 1: Insert");
				System.out.println("Press 2: Insert at position");
				System.out.println("Press 3: Delete");
				System.out.println("Press 4: Delete at position");
				System.out.println("Press 5: Center");
				System.out.println("Press 6: Reverse");
				System.out.println("Press 7: Size");
				System.out.println("Press 8: Iterator");
				System.out.println("Press 9: Print");
				System.out.print("Enter an option :\t");
				int choice = sc.nextInt();
				switch(choice) {
					case 1:
						System.out.print("Enter the data:\t");
						int data = sc.nextInt();
						Insertion insert_object = new Insertion(data);
						insert_object.insert(list);
						break;
					case 2:
						System.out.print("Enter the data:\t");
						int val = sc.nextInt();
						System.out.print("Enter the position:\t");
						int pos = sc.nextInt();
						Insertion insert = new Insertion(val);
						insert.insertAtPosition(list,pos);
						break;
					case 3:
						Node node = Deletion.delete(list);
						if(node != null) {
							System.out.println("Node " + node.getData() + " is deleted");
						}
						break;
					case 4:
						System.out.print("Enter the position:\t");
						int position = sc.nextInt();
						Node deleted_node = Deletion.deleteAtPosition(list,position);
						if(deleted_node != null) {
							System.out.println("Node " + deleted_node.getData() + " is deleted");
						}
						break;
					case 5:
						Center.findCenter(list);
						break;
					case 6:
						Reverse.reverse(list);
						break;
					case 7:
						int length = Size.getTotalNode(list);
						System.out.println("Size of linked list is "+length);
						break;
					case 8:
						Iterator it = new Iterator(list);
						System.out.println("Nodes through iterator in linked list is :");
						while(it.hasNext()) {
							System.out.print(it.next().getData() + " ");
						}
						System.out.println();
						break;
					case 9:
						Print.display(list);
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
