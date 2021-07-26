package com.ust.examples;
import java.util.*;
public class Hashset2 {

	public static void main(String[] args) {
		HashSet<String> hs= new HashSet<String>();
		hs.add("Geeks");
		hs.add("for");
		hs.add("Geeks");
		hs.add("is");
		hs.add("very helpful");
		Iterator<String> itr=hs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			//System.out.println();
		}

	}

}
