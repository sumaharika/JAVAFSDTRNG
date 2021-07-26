package com.ust.examples;

import java.util.ArrayList;
import java.util.Collections;

public class Collection1 {

	public static void main(String[] args) {
		ArrayList arr=new ArrayList();
		arr.add(2);
		arr.add(4.2f);
		arr.add("String hi");
		//System.out.println(arr);
		System.out.println(arr);
		arr.remove(1);
		arr.add(2,"Suma");
		System.out.println(arr);
		
		ArrayList<Integer> x=new ArrayList<Integer>();
		x.add(4);
		x.add(10);
		x.add(1);
		x.add(0);
		Collections.sort(x);
		System.out.println(x);
		x.set(3,40);
		System.out.println(x);
		if(x.contains(1)) {
		System.out.println(x.indexOf(1));
	}



	}

}
