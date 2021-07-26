package com.ust.examples;

import java.util.*;
public class Collection3 {

	public static void main(String[] args) {
		List list=Arrays.asList("one two three four five six seven eight nine".split(" "));
        System.out.println("List:"+list);	
	    List sublist = Arrays.asList("three four".split(" " ));
	    System.out.println("SubList:"+sublist);
	    System.out.println(
	    		"indexofSubList:" + Collections.indexOfSubList(list, sublist));
	    System.out.println(
	    		"lastIndexOfSubList:"+ Collections.lastIndexOfSubList(list, sublist));
	}
	

}
