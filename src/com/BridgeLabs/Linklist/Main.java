package com.BridgeLabs.Linklist;

public class Main {

public static void main(String[] args) {
	LinkList list =new LinkList();
	list.insertAtEnding(1);
	list.insertAtEnding(2);
	list.insertAtEnding(3);
	list.insertAtEnding(10);
	list.insertAtBegin(4);
	list.insertAtBegin(5);
	//list.display();
	list.insertInAfter(2, 8);
	//list.display();
	list.display();
	list.deleteAtEnding();	
	list.display();
}
}
