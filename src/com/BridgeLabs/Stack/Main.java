package com.BridgeLabs.Stack;

public class Main {
	public static void main(String[] args) {
		/*
		 * Stack stack=new Stack(); stack.push(10); stack.push("10");
		 * System.out.println(stack.isEmpty()); stack.pop();
		 * System.out.println(stack.peek()); stack.display(); stack.push("100");
		 * stack.push(101); stack.push(002); stack.push("103"); stack.display();
		 */
		//////////////////////////////////////////////////////
		StackusingCollections stack = new StackusingCollections();
		stack.push(10);
		stack.push("101");
		stack.peek();
		System.out.println(stack.isEmpty());
stack.display();
	}
}
