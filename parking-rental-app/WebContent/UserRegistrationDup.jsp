<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html long="en">
<head>
<!-- required meta tags -->
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<!-- bootstrap CSS -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">

<!-- CSS link -->
<link rel="stylesheet" href="style.css">
<style>
.selector-for-some-widget {
  box-sizing: content-box;
}
</style>
    <style>
#footer {
	position: fixed;
	bottom: 0;
	width: 100%;
	background-color: black;
	color: turquoise;
	text-align: center;
  	height: 5%;
}
</style>
<script>
function validateFields()
{
var location=document.getElementById("location").value;
var vehicleType=document.getElementById("vehicleType").value;
var engineType=document.getElementById("engineType").value;
var classification=document.getElementById("classification").value;
var term=document.getElementById("term").value;

if(location=="" || location==null && vehicleType=="" || vehicleType==null && engineType=="" || engineType==null && classification=="" || classification==null && term=="" || term==null){
	document.getElementById('validate').innerHTML="*Please fill the form";
	return false;
}else if(location=="" || vehicleType=="" || engineType=="" || classification=="" || term==""){
	document.getElementById('validate').innerHTML="*Please fill the missing field/s";
	return false;
}else{
	document.getElementById('validate').innerHTML="";
	return true;
}
}
</script>
<script>
function EmailAjax(){
console.log("EmailAjax logged-in");
var email=document.getElementById("email").value;
var url="http://localhost:8080/parking-rental-app/validateEmail/"+email;
console.log(url);
const xmlHttp=new XMLHttpRequest();
xmlHttp.open("GET", url);
xmlHttp.send();
xmlHttp.onload=function(){
	console.log(this.responseText);
	document.getElementById('display').innerHTML=this.responseText;
	document.getElementById('here').innerHTML="here";
}
}
</script>
<script>
function ajaxWithObj(){
	console.log("ajaxWithObj logged-in");
	var location=document.getElementById("location").value;
	var vehicleType=document.getElementById("vehicleType").value;
	var engineType=document.getElementById("engineType").value;
	var classification=document.getElementById("classification").value;
	var term=document.getElementById("term").value;

	var url="http://localhost:8080/parking-rental-app/getPriceAndDiscount/"+location+"/"+vehicleType+"/"+engineType+"/"+classification+"/"+term;
	console.log(url);
	const xmlHttp=new XMLHttpRequest();
	xmlHttp.open("GET", url);
	xmlHttp.send();
	xmlHttp.onload=function(){
		
		console.log(this.responseText);
		var obj=JSON.parse(this.responseText);
		console.log(obj.price);
		console.log(obj.discount);
		document.getElementById("price").value=obj.price;
		document.getElementById("discount").value=obj.discount;
		var totalAmount=obj.price-((obj.price*obj.discount)/100);
		document.getElementById("totalAmount").value=totalAmount;
	}
	}
</script>
</head>
<body style="background-color: turquoise;">
	<nav class="navbar fixed-top navbar-dark bg-dark">
		<div class="container-fluid">
			<img src="Xworkz-Logo.png" class="w3-bar w3-border" width="85"
				height="40">
			<div class="navbar-left" class="w3-bar w3-border">
				<a href="Landing.jsp" class="btn btn-info"
					style="background-color: turquoise;">Home</a>
						<a href="UserLogin.jsp" class="btn btn-info"
					style="background-color: turquoise;">Log-in</a>
			</div>
		</div>
	</nav>
<div style="top:50%; left:1%; id="container">
<h5 style=color:red;>${error}<a href="UserLogin.jsp">here</a></h5>
<h5 style=color:green;>${success}</h5>
<h4 style="color:blue;">User Registration:</h4>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<form action="userRegistration" method="post" onsubmit="return validateFields()" class="container center" style="margin-right: 50px">
<span style="color:red;" id="display"></span><a id="here" href="UserLogin.jsp"></a>

<table style="border: 1px solid black;">
<tr>
<td><label for="name">Name:</label></td>
<td><input type="text" id="name" name="name"/></td>
</tr>
<tr>
<td><label for="email">Email:</label></td>
<td><input type="text" id="email" name="email" onchange="EmailAjax()"/></td>
</tr>
<tr>
<td><label for="phoneNo">Phone No.:</label></td>
<td><input type="text" id="phoneNo" name="phoneNo"/></td>
</tr>
<tr>
<td><label style="color:blue;">parking Info:</label></td>
</tr>
<tr>
<td><label for="location">Location:</label></td>
<td><select name="location" id="location">
	<option value="">Select</option>
  	<option value="RajajiNagar">RajajiNagar</option>
  	<option value="E.city">E.city</option>
  	<option value="VijayaNagar">VijayaNagar</option>
  	<option value="BTM">BTM</option> 
</select></td>
</tr>
<tr>
<td><label for="vehicleNo">Vehicle_No:</label></td>
<td><input type="text" id="vehicleNo" name="vehicleNo"/></td>
</tr>
<tr>
<td><label for="vtype">Vehicle Type:</label></td>	
<td><input type="radio" id="vehicleType" name="vehicleType" value="2_Wheeler">2 Wheeler 
<input type="radio" id="vehicleType" name="vehicleType" value="4_Wheeler">4 Wheeler</td>
</tr>
<tr>
<td><label for="etype">Engine Type:</label></td>
<td><input type="radio" id="engineType" name="engineType" value="Normal">Normal
<input type="radio" id="engineType" name="engineType" value="Electrical">Electrical</td>
</tr>
<tr>
<td><label for="classification">classification:</label></td> 
<td><select name="classification" id="classification">
    <option value="">Select</option>
	<optgroup label="Bike">
	<option value="Bike">Bike</option>
    </optgroup>
    <optgroup label="Cars">
      <option value="BMW">BMW</option>
      <option value="Renault">Renault</option>
	  <option value="Skoda">Skoda</option>
	  <option value="Kia">Kia</option>
	  <option value="Toyata">Toyata</option>
    </optgroup>
  </select></td>
  </tr>
<tr>
<td><label for="term">term:</label></td>		
<td><select name="term" id="term"  onchange="ajaxWithObj()">
	<option value="">Select</option>
  <option value="1_day">1 Day</option>
  <option value="7_days">7 Days</option>
  <option value="15_days">15 Days</option>
  <option value="30_days">30 Days</option> 
  <option value="90_days">90 Days</option>
  <option value="180_days">180 Days</option>
  <option value="360_days">360 Days</option>
</select></td>
</tr>
<tr>
<td><label for="Price">Price:</label></td>
<td><input type="text"  id="price" name="price" readonly/>
</td>
</tr>
<tr>
<td><label for="discount">Discount(%):</label></td>
<td><input type="text" id="discount" name="discount" readonly/>
</td>
</tr>
<tr>
<td><label for="totalAmount">Total Amount:</label></td>
<td><input type="text" id="totalAmount" name="totalAmount" readonly/></td>
</tr>
<tr>
<td></td>
<td><input type="checkbox" id="agreement" name="agreement" onchange="document.getElementById('smtBtn').disabled=!this.checked;" /><label for="agreement">Agreement</label></td>
</tr>
<tr>
<td><label></label></td>
<td><label></label></td>
</tr>
<tr>
<td><button type="submit" id="smtBtn" class="btn-success" disabled>Register</button></td>
<td><input type="Reset" value="Reset" class="btn-primary"/></td>
</tr>
</table>
</form>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
		<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"
integrity="sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz"
		crossorigin="anonymous"></script>
	<div class="footer">
		<small>Copyright &copy; 2023 | www.x-workz.in</small>
	</div>
</body>
</html>