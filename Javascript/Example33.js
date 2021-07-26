/**
 * 
 */
var txt="";
function message(){
	try{
		adddlert("Welcome guest!");
	}
	catch(err){
		txt="There was an error on this page.\n\n";
		txt +="click ok to continue viewing this page,\n";
		txt +="or cancel to return to the home page.\n\n";
		if(!confirm(txt)){
			document.location.href="https://www.w3schools.com/";
			
		}
	}
}