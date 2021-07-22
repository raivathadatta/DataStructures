package com.BridgeLabs.queue;

public class Queue<T> {
	int length=0;
	Node head;

	class Node {
		T data;
		Node next;
	}

	public void add(T data) {
		Node node = new Node();
		node.data = data;
		if (head.data == null) {
			head = node;
		length++;}
		else {
			Node temp = new Node();
			temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = node;
			length++;
		}
	}

	public T pop() {
		length--;
		head=head.next;
		return head.data;
	}
	public int length() {
		return length;
	}

	public void print() {
		Node node =new Node();
       node =head;
		while(node.next!=null) {
			System.out.println(node.data);
			node=node.next;
		}
		
	}
}
