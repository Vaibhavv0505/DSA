package com.nagarro.HashTableDS;

public class HashNode {
	
	private int key;
	private int value;
	private HashNode next;
	
	public HashNode(int key, int value) {
		this.key = key;
		this.value = value;
		this.next = null;
	}
	
	// Setter methods
	public void setValue(int value) {
		this.value = value;
	}
	public void setNext(HashNode next) {
		this.next = next;
	}
	
	// Getter methods
	public HashNode getNext() {
		return this.next;
	}
	public int getKey() {
		return this.key;
	}
	public int getValue() {
		return this.value;
	}
}
