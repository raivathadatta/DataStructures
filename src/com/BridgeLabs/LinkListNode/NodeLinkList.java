package com.BridgeLabs.LinkListNode;

public class NodeLinkList<k> {
	INode<k> head;
	MyNode<k> tail;

	public void addNewNode(k key) {
		MyNode<k> node =new MyNode<>();
		node.setKey(key);
		node.setNext(null);
		if (this.head == null) {
			head = node;
		} else if (this.tail == null) {
			tail = node;
		} else {
			INode<k> temp = this.head;
			while(temp.getNext()!=null)
			temp=temp.getNext();
			
			temp.setNext(temp);
		}
	}
	public INode<k> pop(){
		INode<k> temp =this.head;
		this.head=head.getNext();
		return temp;
				
	}
	public void printNodes() {
		System.out.println(head);
	}
	public k search(k key) {
		// TODO Auto-generated method stub
		INode<k> temp = this.head;
		while(temp.getNext()!=null) {
			if(temp.getKey()==key)
		return key;
		}
			return null;
		
		
		//return null;
	}
}
