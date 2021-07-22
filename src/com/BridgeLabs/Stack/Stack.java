package com.BridgeLabs.Stack;

public class Stack<T> {
	static int length = 0;
	Node head;

	class Node {
		T data;
		Node next;
	}

	public void push(T data) {
		Node node = head;
		if (node == head) {
			head = node;
			length++;
		} else {
			Node newNode = new Node();
			newNode.data = data;
			newNode.next = null;
			head = newNode;
			head.next = node;
			length++;
		}
	}

	public Object pop() {
		Node node = head;
		if (head == null)
			return null;
		head = head.next;
		length--;
		return node.data;
	}

	public T pop1() {
		Node node = head;

		return head.data;
	}

	public int size() {
		return length;
	}

	public void display() {
		// TODO Auto-generated method stub
		Node node = head;
		while (node.next != null) {
			System.out.println(node.data);
			node = node.next;
		}
	}

}
