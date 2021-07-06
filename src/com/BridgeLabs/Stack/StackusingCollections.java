package com.BridgeLabs.Stack;

import java.util.LinkedList;
import java.util.List;

public class StackusingCollections {
	private List<Object> list = new LinkedList<Object>();

	public void push(Object data) {
		list.add(data);
	}

	public Object peek() {
		return list.get(0);
	}

	public void pop() {
		list.remove(0);
	}

	public boolean isEmpty() {
		if (list.size() == 0) {
			return true;
		}
		return false;
	}

	public int size() {
		return list.size();
	}

	public void display() {
		// TODO Auto-generated method stub

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}