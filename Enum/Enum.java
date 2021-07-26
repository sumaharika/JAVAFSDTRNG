package com.ust.examples;

import java.util.Enumeration;
import java.util.Hashtable;

public class Enum {

	public static void main(String[] args) {
		Enumeration names;
		String key;
		Hashtable<String,String> hashtable= new Hashtable<String,String>();
		hashtable.put("key1","vinni");
		hashtable.put("key2","suma");
		hashtable.put("key3","rani");
		hashtable.put("key4","chanit");
		names=hashtable.keys();
		while(names.hasMoreElements()) {
			key=(String) names.nextElement();
			System.out.println("key:"+key+"& Value:"+ hashtable.get(key));
		}
		
	}

}
