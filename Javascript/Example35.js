/**
 * 
 */
function person(first,last,age,eye){
	this.firstName=first;
	this.lastName=last;
	this.age=age;
	this.eyecolor=eye;
}
const myFather=new person("srinivasaRao","Allam",50,"black");
document.getElementById("demo").innerHTML="My father is"+myFather.age+".";