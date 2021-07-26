/**
 * 
*/
 
function func(){
	const xhttp=new XMLHttpRequest();
	xhttp.onload=function(){
		document.getElementById("demo1").innerHTML=this.status;
		document.getElementById('demo2').innerHTML=this.statusText
		document.getElementById('demo3').innerHTML=this.responseText;
		
	}
	xhttp.open("GET",url);
	xhttp.send();
	}
