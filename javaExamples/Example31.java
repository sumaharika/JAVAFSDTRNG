package com.ust.examples;

public class Example31 {
	String name;
	public void eat() {
		System.out.println("i can eat");
	}
}

class Dog extends Example31{
	public void display() {
		System.out.println("my name is"+" "+ name);
		
	}
	
}
class main{
	public static void main(String[] args) {
		Dog labrador=new Dog ();
		labrador.name="puppy";
		labrador.display();
		labrador.eat();

	}


}

