package com.ust.examples;
class GenericsClas <T extends Number> {

	  public void display() {
	    System.out.println("This is a bounded type generics class.");
	  }
	}

	public class GenericsClass3 {
	  public static void main(String[] args) {

	    // create an object of GenericsClass
	    GenericsClas<Float> obj = new GenericsClas<>();
	     obj.display();
	  }
	}