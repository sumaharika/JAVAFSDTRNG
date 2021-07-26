package com.ust.examples;

import java.util.LinkedHashMap;

public class Hashmap2 {

	public static void main(String[] args) {
		LinkedHashMap<Integer,String> hml=
				new LinkedHashMap<Integer,String>();
		hml.put(3, "Geeks");
		hml.put(2, "for");
		hml.put(1, "Geeks");
		System.out.println("Mappings of LInkedHashMap:"+hml);
	}

}
