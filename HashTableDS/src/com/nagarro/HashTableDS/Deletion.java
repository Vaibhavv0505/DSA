package com.nagarro.HashTableDS;

public class Deletion {
	
	public static HashNode delete(HashTable map, int key) {
		HashNode node = null;
		if(Contains.contain(map, key)) {
			int hash_code = map.getHashCode(key);
			node = map.hash_table[hash_code];
			map.keys.remove(new Integer(key));
			Size.decreaseSize(map);
			if(node.getKey() == key) {
				map.hash_table[hash_code] = node.getNext();
			}
			else {
				HashNode previous_node = node;
				while(node.getNext() != null) {
					if(node.getKey() == key) {
						break;
					}
					previous_node = node;
					node = node.getNext();
				}
				previous_node.setNext(node.getNext());
			}
		}
		else {
			System.out.println(key + " is not present in the hash map");
		}
		return node;
	}
	
	
}
