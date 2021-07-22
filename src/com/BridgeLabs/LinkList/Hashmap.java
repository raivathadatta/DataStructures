package com.BridgeLabs.LinkList;

public class Hashmap<K, V> {
	 LinkList<K> list =new LinkList<>();

	
	public V get(K key) {
		HashMapNoad<K, V> map = (HashMapNoad<K, V>) this.list.search(key);
		if (map == null) {
			return null;
		}
		return map.value;
	}
public void add(K key,V value) {

	HashMapNoad<K, V> map1 = (HashMapNoad<K, V>) list.search(key);
	 System.out.println(map1.key+"head141");
	if(map1==null) {
		
	 map1 = new HashMapNoad<>(key, value);
	 System.out.println(map1.key+"head");
	//	list.append(map1);
	}
	else 
		map1.setValue(value);
}


}
