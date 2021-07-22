package com.BridgeLabs.queue;

public class Main {
public static void main(String[] args) {
	Queue<Integer> queue= new Queue();
	queue.add(10);
	queue.add(20);
	queue.add(23);
	queue.print();
	System.out.println(queue.pop());
}
}
