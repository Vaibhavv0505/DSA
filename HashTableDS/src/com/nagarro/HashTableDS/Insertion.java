package com.nagarro.HashTableDS;

public class Insertion {
	
	public static void insert(HashTable map, int key, int value) {
		
		int hash_code = map.getHashCode(key);
		HashNode new_node = new HashNode(key, value);
		HashNode node = map.hash_table[hash_code];
		map.keys.add(key);
		if(node == null) {
			map.hash_table[hash_code] = new_node;
			Size.increaseSize(map);
		}
		else {
			boolean exist = false;
			while(node.getNext() != null) {
				if(node.getKey() == key) {
					exist = true;
					break;
				}
				node = node.getNext();
			}
			if(exist || node.getKey() == key) {
				node.setValue(value);
			}
			else {
				node.setNext(new_node);
				Size.increaseSize(map);
			}
		}
		
		
	}
	
}
