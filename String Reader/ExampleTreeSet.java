package com.ust.examples;
import java.util.*;
public class ExampleTreeSet {

	public static void main(String[] args) {
		TreeSet<String> ts=new TreeSet<String>();
		ts.add("Geek");
		ts.add("for");
		ts.add("Geeks");
		ts.add("is");
		ts.add("very helpful");
		Iterator<String> itr=ts.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
