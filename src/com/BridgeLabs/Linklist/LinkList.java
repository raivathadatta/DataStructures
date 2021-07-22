package com.BridgeLabs.LinkList;

public class LinkList<T> {
	Node head;

	public class Node {
		public Object data;
		Node next;
	}

	public <T> void append(T data) {
		Node node = new Node();
		node.data = data;
		node.next = null;
		if (head == null) {
			head = node;
		} else {
			Node check = head;
			while (check.next != null) {
				check = check.next;
			}
			check.next = node;
		}
	}

	public void display() {
		Node node = head;
		while (node != null) {
			System.out.println(node.data);
			node = node.next;

		}
		// System.out.println(node.data);

	}

	public void deleatAtBeging() {
		head = head.next;
	}

	public void deleteAtEnding() {
		Node node = new Node();
		node = head;
		while (node.next.next != null) {
			node = node.next;
		}
		node.next = null;
	}

	public <T> void insertAtBegin(T data) {
		Node node = new Node();
		node.data = data;
		node.next = null;
		if (head == null) {
			head = node;
		} else {
			Node temp = new Node();
			temp.data = head.data;
			temp.next = head.next;
			head = node;
			node.next = temp;

		}
	}

	public <T> void insertInAfter(T data1, T data) {
		Node node = new Node();
		node.data = data;
		node.next = null;
		if (head == null) {
			insertAtBegin(data);
		} else {
			Node temp = new Node();
			temp.data = data1;
			temp.next = null;
			Node check = head;
			while (check != null) {
				if (check.data == data1) {
					temp = check.next;
					check.next = node;
					node.next = temp;

					break;
				} else
					check = check.next;
			}
		}
	}

	public int size() {
		Node node = new Node();
		node = head;
		int count = 0;
		while (node.next != null) {
			count++;
			node = node.next;
		}
		count++;
		return count;
	}

	public Node search(T key) {
		Node node = head;
		while (node.next != null) {
			if (node.data == key)
				return node;
		}
		if (node.data == key)
			return node;

		return null;
	}
}
