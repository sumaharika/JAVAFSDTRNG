package com.ust.examples;

public class Example27 {
	int a=9;
	int b=18;
	void m1() {
		a=10;
		b=20;
	}
}
class test{
	static void m1(Example27[]e) {
		e[1].m1();
	}
}
	class Array{

	public static void main(String[] args) {
		Example27[]ex= {new Example27(),new Example27(),new Example27()};
		test.m1(ex);
		for(int i=0;i<ex.length;i++) {
			System.out.println(ex[i].a + "\t");
			System.out.println(ex[i].b + "\n");
		}

	}

	}