package com.ust.examples;

public class Example24 {
	String fName;
	String lName;
	String city;
	String Address;
	String dob;
	float salary;
	char e;
	Example24(String a,String b,String c,String d,String e,float f){
			fName=a;
			lName=b;
			city=c;
			Address=d;
			dob=e;
			salary=f;
		}
	void display (){
	System.out.println(fName+" "+lName+" "+city+" "+Address+" "+dob+" "+salary);
	}

	public static void main(String[] args) {
		Example24 e1=new Example24("suma","Allam" ,"Draksharamam" ,"jhsif","27 -06-1999",50000.0f);
		Example24 e2=new Example24("shakeena","sholam" ,"kkd" ,"abc","09 -05-1998",30000.0f);
		Example24 e3=new Example24("bhagi","rao" ,"rjy" ,"xyz","27 -12-1997",20000.0f);
		Example24 e4=new Example24("hema","krishna" ,"annv" ,"opq","18 -09-1999",40000.0f);
		Example24 e5=new Example24("sravs","jaya" ,"kkd" ,"deff","02-02-1999",70000.0f);
        /*e1.display();
        e2.display();
	    e3.display();
        e4.display();
        e5.display();*/
		Example24 array[]=new Example24[5];
		array[0]=new Example24("suma","Allam" ,"Draksharamam" ,"jhsif","27 -06-1999",50000.0f);
        array[1]=new Example24("shakeena","sholam" ,"kkd" ,"abc","09 -05-1998",30000.0f);
		array[2]=new Example24("bhagi","rao" ,"rjy" ,"xyz","27 -12-1997",20000.0f);
		array[3]=new Example24("hema","krishna" ,"annv" ,"opq","18 -09-1999",40000.0f);
		array[4]=new Example24("sravs","jaya" ,"kkd" ,"deff","02-02-1999",70000.0f);
		
		//for(Example24 e:array) {
			//e.display();
			for(int i=0;i<array.length;i++) {
				array[i].display();
		}
								
	}
}


