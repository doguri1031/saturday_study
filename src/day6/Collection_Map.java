package day6;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Collection_Map {

	public static void main(String[] args) {

		Map<String,String> map = new HashMap<String, String>();
		Map<String,String> map2 = new TreeMap<String, String>();
		Map<String,String> map3 = new LinkedHashMap<String, String>();
		
		map2.put("fruit1", "apple");
		map2.put("fruit4", "melon");
		map2.put("fruit3", "banana");
		map2.put("aruit2", "grape");
		
		
		
		for (String s : map2.keySet()) {
			System.out.println(s);
		}
		
		for (String s : map2.values()) {
			System.out.println(s);
		}
		
		
		
	}

}
