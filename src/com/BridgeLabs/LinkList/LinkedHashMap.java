package com.BridgeLabs.LinkList;

import java.util.ArrayList;

public class LinkedHashMap<K, V> {

	ArrayList<LinkList<K>> myBucketArray;
	public final int numBuckets;

	public LinkedHashMap() {
		this.numBuckets = 10;
		this.myBucketArray = new ArrayList<>(numBuckets);
		for (int i = 0; i < numBuckets; i++) {
			this.myBucketArray.add(null);
		}
	}

	private int getBucketIndex(K key) {
		int hashCode = Math.abs(key.hashCode());
		int index = hashCode % this.numBuckets;
		System.out.println(hashCode + "hash code");
		return index;
	}

	public V get(K key) {
		int index = this.getBucketIndex(key);
		LinkList<K> map2 = this.myBucketArray.get(index);
		if (map2 == null)
			return null;
		HashMapNoad<K, V> map = (HashMapNoad<K, V>) map2.search(key);
		return (map == null) ? null : map.value;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((myBucketArray == null) ? 0 : myBucketArray.hashCode());
		result = prime * result + numBuckets;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LinkedHashMap other = (LinkedHashMap) obj;
		if (myBucketArray == null) {
			if (other.myBucketArray != null)
				return false;
		} else if (!myBucketArray.equals(other.myBucketArray))
			return false;
		if (numBuckets != other.numBuckets)
			return false;
		return true;
	}

	public void add(K key, V value) {
		int index = this.getBucketIndex(key);
		LinkList<K> map = this.myBucketArray.get(index);
		if (map == null) {
			map = new LinkList<>();
			this.myBucketArray.set(index, map);
		}
		HashMapNoad<K, V> map1 = (HashMapNoad<K, V>) map.search(key);

		if (map1 == null) {
			map1 = new HashMapNoad(key, value);
			map1.key = key;
			map1.value = value;
			map.append(map1);
		}
		map1.value = value;
	}

	public String toString() {
		return "" + myBucketArray;
	}
}
