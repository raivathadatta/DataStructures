package com.BridgeLabs.LinkList;

public class HashMapNoad<K, V> implements INode<K> {
	K key;
	V value;
	HashMapNoad<K, V> next;

	public HashMapNoad(K key, V value) {
		this.key = key;
		this.value = value;
	}

	@Override
	public K getKey() {
		return this.key;
	}

	@Override
	public void setKey(K key) {
		this.key = key;
	}

	@Override
	public INode<K> getNext() {
		return next;
	}

	@Override
	public void setNext(INode<K> next) {
		this.next =  (HashMapNoad<K, V>) next;
	}

	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}
}
