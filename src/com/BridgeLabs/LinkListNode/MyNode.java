package com.BridgeLabs.LinkListNode;

public class MyNode<K> implements INode<K> {
	private K key;;
	public K getKey() {
		return key;
	}
	public void setKey(K key) {
		this.key = key;
	}
	public INode<K> getNext() {
		return next;
	}
	public void setNext(INode<K> next) {
		this.next = next;
	}
	private INode<K> next;
	@Override
	public String toString() {
		StringBuilder stringBuilder =new StringBuilder();
		stringBuilder.append("MyNOde {"+" key=").append(key).append("}");
		if(next!=null)
			stringBuilder.append(next);
		return stringBuilder.toString();
	}
	
	
}
