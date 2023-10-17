package com.nagarro.HashTableDS;

public class Contains {
	
	public static boolean contain(HashTable map, int key) {
		
		int hash_code = map.getHashCode(key);
		HashNode node = map.hash_table[hash_code];
		boolean exist = false;
		
		if(node != null) {
			
			while(node != null) {
				if(node.getKey() == key) {
					exist = true;
					break;
				}
				node = node.getNext();
			}
		}
		
		return exist;
	}
	
}
