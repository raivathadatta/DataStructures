package com.BridgeLabs.LinkList;

interface INode<K> {
	// data = null;

	

	K getKey();

	void setKey(K data);

	INode<K> getNext();

	void setNext(INode<K> next);
}

public class Node<K> implements INode<K> {
	K key;
	INode<K> next;

	public Node(K key) {
		this.key=key;
	}

	

	public Node(K key, Node<K> next) {
		super();
		this.key = key;
		this.next = next;
	}
	@Override
	public K getKey() {
		return key;
	}

	public void setKey(K data) {
		this.key = data;

	}

	@Override
	public INode<K> getNext() {
		return next;
	}

	@Override
	public void setNext(INode<K> next) {
		this.next = next;
	}

}
