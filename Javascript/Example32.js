/**
 * 
 */
const person={fnmae:"suma",lname:"Allam",age:22};
let txt="";
for(let x in person){
	txt +=person[x] +" ";
}
document.getElementById("demo").innerHTML=txt;