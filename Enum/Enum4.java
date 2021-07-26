package com.ust.examples;
enum Direction{
	EAST ("E"),
	WEST ("W"),
	NORTH ("N"),
	SOUTH ("S");
	private final String shortcode;
	Direction(String code){
		this.shortcode =code;
	}
	public String getDirectionCode() {
		return this.shortcode;
	}
}
public class Enum4 {

	public static void main(String[] args) {
		Direction dir=Direction.SOUTH;
		System.out.println(dir.getDirectionCode());
		Direction dir2=Direction.EAST;
		System.out.println(dir2.getDirectionCode());

	}

}
