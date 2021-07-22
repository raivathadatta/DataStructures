package findthefrequencyofword;

import java.util.HashMap;
import java.util.LinkedList;

public class FindtheFrequency {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		String str = "do to do to do to do";
		String[] array = str.split(" ");
		HashMap map = new HashMap();

		for (int i = 0; i < array.length; i++) {
			if (map.containsKey(array[i])) {
				int value = 1 + (int) map.get(array[i]);
				map.put(array[i], value);
			} else {
				map.put(array[i], 1);
				//list.add(array[i]);
			}
		}
		for(int i=0;i<map.size();i++) {
			System.out.println(map.get(array[i])+map.toString());
		}
		map.remove("to");
		System.out.println(map.toString());
	}
}
