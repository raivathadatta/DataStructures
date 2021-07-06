package com.BridgeLabs.Stack;

import com.BridgeLabs.Linklist.*;

public class Stack {
	LinkList list = new LinkList();

	public <T> void push(T data) {
		list.insertAtBegin(data);
	}

	public void pop() {
		list.deleatAtBeging();
	}

	public <T> Object peek() {
		return list.displayHead();

	}

	public boolean isEmpty() {
		if (list.size() == 0) {
			return true;
		} else
			return false;
	}

	public void display() {
		list.display();
	}
}