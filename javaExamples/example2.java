package com.ust.examples;
//depicting the use of if else and nested if condition//
public class example2 {
	float price;
	String item;

	public static void main(String[] args) {
		example2 e1=new example2();
		example2 e2=new example2();
		e1.price = 5.3f;
		e2.price =35f;
		e1.item ="pen";
		e2.item ="pencil";
		
		if(e1.price > e2.price) {
			e1.item = "scale";
		}
		if(e1.price < e2.price) {
			e1.item = "book";
		}
		else if(e1.price == e2.price) {
			e1.item ="box";
		}
		System.out.println(e1.item);

	}
	}
