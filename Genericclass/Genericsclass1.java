package com.ust.examples;
 class Genericclass {

	public static void main(String[] args) {
		 GenericsClass<Integer> intobj=new  GenericsClass<>(5);
	    System.out.println("Generic class returns"+ intobj.getData());
	    GenericsClass<String> stringobj =new GenericsClass<>("java programming");
	    System.out.println("Generic class returns:"+stringobj.getData());
	}
	    
}
class  GenericsClass<T>{
private T data;
public GenericsClass(T data) {
	this.data = data;
	}
	public T getData() {
		return this.data;
	}
}
public class Genericsclass1{
	
}