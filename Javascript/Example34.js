/**
 * 
 */
function myFunction(){
	let text=document.getElementById("demo").innerHTML;
	document.getElementById("demo").innerHTML=
	text.replace(/microsoft/i,"w3schools");
}