package com.ust.examples;

import java.util.LinkedHashMap;
import java.util.Map;

public class Hshmap3 {

	public static void main(String[] args) {
		LinkedHashMap<Integer, String> hm =
				new LinkedHashMap<Integer, String>();
		hm.put(3, "geeks");
		hm.put(2, "for");
		hm.put(1, "geeks");
		for(Map.Entry<Integer, String> mapElement:hm.entrySet()) {
			Integer key=mapElement.getKey();
			String value=mapElement.getValue();
			System.out.println(key+" : "+ value);
		}
	}

}
