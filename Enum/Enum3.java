package com.ust.examples;
enum Directions1{
	EAST,
	WEST,
	NORTH,
	SOUTH,
}
public class Enum3 {
Directions1 dir;
public Enum3(Directions1 dir) {
	this.dir=dir;
}
public void getmyDirection1() {
	switch(dir) {
	case EAST:
		System.out.println("In East Direction");
		break;
	case WEST:
		System.out.println("In West Direction");
		break;
	case NORTH:
		System.out.println("In North Direction");
		break;
	default:
		System.out.println("In South Direction");
		break;
	}
}
	public static void main(String[] args) {
		Enum3 obj1=new Enum3(Directions1.EAST);
		obj1.getmyDirection1();
		Enum3 obj2=new Enum3(Directions1.SOUTH);
		obj2.getmyDirection1();

	}

}
