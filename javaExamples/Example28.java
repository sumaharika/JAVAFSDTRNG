package com.ust.examples;

public class Example28 {
int x;
float y;
String z;
Example28(){}
Example28(int x,float y)
{
	x=this.x;
	y=this.y;
	
}
Example28(int a,float b, String c){
//this(a,b);
	x=a;
	y=b;
z=c;
}
public static void main(String[] args) {
       Example28 e1=new Example28();
       System.out.println(e1.x);
       Example28 e2=new Example28(2,4.5f);
       System.out.println(e2.y);
       Example28 e3=new Example28(2,4.5f,"suma");
       System.out.println(e3.z);
}


}
