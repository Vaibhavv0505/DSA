package com.nagarro.HashTableDS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class HashTable {
	
	HashNode[] hash_table;
	ArrayList <Integer> keys;
	int capacity;
	int size;
	
	public HashTable(int capacity) {
		this.hash_table = new HashNode[capacity];
		Arrays.fill(this.hash_table, null);
		this.capacity = capacity;
		this.size = 0;
		this.keys = new ArrayList<>();
	}
	
	public int getHashCode(int key) {
		return key % this.capacity;
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the size of the hash table :\t");
		int capacity = scanner.nextInt();
		HashTable map = new HashTable(capacity);
		String decision = "y";
		
		do {
			try {
				Scanner sc = new Scanner(System.in);
				System.out.println("Press 1: Insert");
				System.out.println("Press 2: Delete");
				System.out.println("Press 3: Contains");
				System.out.println("Press 4: Get Value By Key");
				System.out.println("Press 5: Size");
				System.out.println("Press 6: Iterator");
				System.out.println("Press 7: Print");
				System.out.print("Enter an option :\t");
				int choice = sc.nextInt();
				switch(choice) {
					case 1:
						System.out.print("Enter the key :\t");
						int key = sc.nextInt();
						System.out.print("Enter the value :\t");
						int value = sc.nextInt();
						Insertion.insert(map, key, value);
						break;
					case 2:
						System.out.print("Enter the key :\t");
						int element = sc.nextInt();
						HashNode node = Deletion.delete(map, element);
						if(node != null) {
							System.out.println("Deleted pair is :- " + element + " : " + node.getValue());
						}
						break;
					case 3:
						System.out.print("Enter the key :\t");
						int data = sc.nextInt();
						if(Contains.contain(map, data)) {
							System.out.println("Key " + data + " is present");
						}
						else {
							System.out.println("Key " + data + " is not present");
						}
						break;
					case 4:
						System.out.print("Enter the key :\t");
						int ele = sc.nextInt();
						int val = GetValueByKey.getValueByKey(map, ele);
						if(val != Integer.MAX_VALUE) {
							System.out.println("Value is : " + val);
						}
						else {
							System.out.println("Key " + ele + " is not present");
						}
						break;
					case 5:
						System.out.println("Size of hash map is : " + Size.getSize(map));
						break;
					case 6:
						Iterator it = new Iterator(map);
						System.out.println("Elements through iterator in hash map is :");
						while(it.hasNext()) {
							HashNode next_node = it.next();
							System.out.println(next_node.getKey() + " : " + next_node.getValue());
						}
						break;
					case 7:
						Print.display(map);
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
