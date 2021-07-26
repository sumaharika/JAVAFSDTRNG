package com.ust.examples;

import java.lang.System.Logger.Level;

public class Enum1 {
	enum level{
		LOW,MEDIUM,HIGH;
	}
	public static void main(String[] args) {
		//level myvar=level.MEDIUM;
		System.out.println(level.values());
		for(level l:level.values()) {
			System.out.println(l.name());
		}
	}

}
