package com.nagarro.HashTableDS;


public class Print {
	
	public static void display(HashTable map) {
		
		if(Size.getSize(map) > 0) {
			System.out.println("Key - value pairs are :-");
			for(int i = 0; i < map.capacity; i++) {
				HashNode node = map.hash_table[i];
				while(node != null) {
					System.out.println(node.getKey() + " : " + node.getValue());
					node = node.getNext();
				}
			}
		}
		else {
			System.out.println("Hash map is empty!!");
		}
		
	}
	
}
