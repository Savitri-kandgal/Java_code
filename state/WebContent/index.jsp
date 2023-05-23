<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>State</title>
<style>
body {
  background-color: lavender;
}

*{
  text-align: left;
  color: black;
  box-sizing: border-box;
} 

.someclass {
    width: 200px;
}
input {
  width: 30%;
}

input[type=text]:focus{
  border: 2px solid green;
  border-radius: 3px;
   background-color: lightblue;
}

input[type=submit], input[type=reset] {
  background-color: #04AA6D;
  color: white;
  padding: 5px 10px;
  border: none;
  border-radius: 10px;
  cursor: pointer;
  float: right;

}

input[type=text], select, textarea {
  width: 100%;
  padding: 12px;
  border: 1px solid #ccc;
  border-radius: 4px;
  resize: vertical;
}

input[type=submit]:hover {
  background-color: #45a049;
}

.container {
  border-radius: 5px;
  background-color: #f2f2f2;
  padding: 30px;
}

.col-25 {
  float: left;
  width: 25%;
  margin-top: 2px;
}

.col-75 {
  float: left;
  width: 50%;
  margin-top: 2px;
}

/* Clear floats after the columns */
.row::after {
  content: "";
  display: table;
  clear: both;
}

h1 {
  color: white;
  text-align: center;
}

@media screen and (max-width: 600px) {
  .col-25, .col-75, input[type=submit] {
    width: 100%;
    margin-top: 0;
  }
}

form {
    width: 70%;
  background: gray;
  margin: 0 auto;
}

</style>
</head>
<body>
	<H2 style="color: Red;">Enter State details:</H2>
<div class="container">	
	<form method="post" action="send">
	<div class="row">
    	<div class="col-25"> 
			<label for="Name">Name:</label>
		</div>
		<div class="col-75">
			<input type="text" name="name">
		</div>
	</div>
	<div class="row">
    	<div class="col-25"> 	
			<label for="capital">Capital City:</label>
		</div>
		<div class="col-75">
		<input type="text" name="cc"> 		
		</div>
	</div>
	<div class="row">
    	<div class="col-25">
    			Nick Name:
    	</div>
		<div class="col-75">
			<input type="text" name="nName"> 
		</div>
	</div>
	<div class="row">
    	<div class="col-25">
State code:
	</div>
		<div class="col-75">
		<input type="text" name="code"> 
				</div>
	</div>
	<div class="row">
    	<div class="col-25">
Motto:
</div>
		<div class="col-75">
		<input type="text" name="motto">
						</div>
	</div>
	<div class="row">
    	<div class="col-25">
Anthem:
	</div>
		<div class="col-75">
		<input type="text" name="anthem"> 
						</div>
	</div>
	<div class="row">
    	<div class="col-25">
Country:
	</div>
		<div class="col-75">
		<input type="text" name="country"> 
								</div>
	</div>
	<div class="row">
    	<div class="col-25">
Region:
	</div>
		<div class="col-75">
		<input type="text" name="region"> 
										</div>
	</div>
	<div class="row">
    	<div class="col-25">
Previous Name:
	</div>
		<div class="col-75">
		<input type="text" name="pn">
</div>
</div>
<div class="row">
<div class="col-25">
Formation Date:
</div>
<div class="col-75">
<input type="date" name="fd"> 
</div>
</div>
<div class="row">
<div class="col-25">
Largest City:
</div>
<div class="col-75">
<input type="text" name="lc"> 
</div>
</div>
<div class="row">
<div class="col-25">
Largest Metro:
</div>
<div class="col-75">
<input type="text" name="lm">
</div>
</div>
<div class="row">
<div class="col-25"> 
Total Districts: 
</div>
<div class="col-75">
<input type="number" name="districts" min="20" max="40"> 
</div>
</div>

<h3 style="color: blue;">Government</h3>

<div class="row">
<div class="col-25">
Government body:
</div>
<div class="col-75">
<input type="text" name="gb"> 
</div>
</div>
<div class="row">
<div class="col-25">
Governor:
</div>
<div class="col-75">
<input type="text" name="governor">
</div>
</div>
<div class="row">
<div class="col-25">
CM:
</div>
<div class="col-75">
<fieldset id="cm">
<input type="radio" name="cm" value="Siddaramaiah">
<label for="Siddaramaiah">Siddaramaiah</label><br>
<input type="radio" name="cm" value="Shivakumar">
<label for="Shivakumar">D K Shivakumar</label><br>
 </fieldset>
</div>
</div>
<div class="row">
<div class="col-25">
Deputy CM:
</div>
<div class="col-75">
<input type="text" name="dpm"> 
</div>
</div>
<div class="row">
<div class="col-25">
Chief Secretary:
</div>
<div class="col-75">
<input type="text" name="cs">
</div>
</div>
<div class="row">
<div class="col-25">
State legislature:
</div>
<div class="col-75">
<input type="text" name="sl"> 
</div>
</div>
<div class="row">
<div class="col-25">
Council:
</div>
<div class="col-75">
<input type="text" name="council"> 
</div>
</div>
<div class="row">
<div class="col-25">
Assembly:
</div>
<div class="col-75">
<input type="text" name="assembly"> 
</div>
</div>
<div class="row">
<div class="col-25">
National Parliament:
</div>
<div class="col-75">
<input type="text" name="np"> 
</div>
</div>
<div class="row">
<div class="col-25">
Rajya Sabha:
</div>
<div class="col-75">
<input type="text" name="rs">
</div>
</div>
<div class="row">
<div class="col-25"> 
Lok Sabha:
</div>
<div class="col-75"><input type="text" name="ls"> 
</div>
</div>
<div class="row">
<div class="col-25">
High Court:</div>
<div class="col-75"><input type="text" name="hc">
</div>
</div>
<h3 style="color: blue;">Area:</h3>

<div class="row">
<div class="col-25">
Area Rank:
</div>
<div class="col-75">
<input type="text" name="ar"> 
</div>
</div>
<div class="row">
<div class="col-25">
Total Area:
</div>
<div class="col-75">
<input type="text" name="ta">
</div>
</div>

<h3 style="color: blue;">Dimensions:</h3>

<div class="row">
<div class="col-25">
Length:
</div>
<div class="col-75">
<input type="text" name="length"> 
</div>
</div>
<div class="row">
<div class="col-25">
Width:
</div>
<div class="col-75">
<input type="text" name="width">
</div>
</div>

<h3 style="color: blue;">Population:</h3>

<div class="row">
<div class="col-25">
Total:
</div>
<div class="col-75">
<input type="text" name="total"> 
</div>
</div>
<div class="row">
<div class="col-25">
Rank:
</div>
<div class="col-75">
<input type="text" name="rank"> 
</div>
</div>
<div class="row">
<div class="col-25">
Density:
</div>
<div class="col-75">
<input type="text" name="density"> 
</div>
</div>
<div class="row">
<div class="col-25">
Urban:
</div>
<div class="col-75">
<input type="text" name="urban">
</div>
</div>
<div class="row">
<div class="col-25">
Rural:
</div>
<div class="col-75">
<input type="text" name="rural"> 
</div>
</div>
<div class="row">
<div class="col-25">
Demonym(s):
</div>
<div class="col-75">
<input type="text" name="demonym">
</div>
</div>
<div class="row">
<div class="col-25">
Unemployment rate:
</div>
<div class="col-75">
<input type="text" name="unemployment">
</div>
</div>

<h3 style="color: blue;">Language:</h3>

<div class="row">
<div class="col-25">
Official:
</div>
<div class="col-75">
<input type="text" name="Officials"> 
</div>
</div>
<div class="row">
<div class="col-25">			
Official script:
</div>
<div class="col-75">
<input type="text" name="script"> 
</div>
</div>
<div class="row">
<div class="col-25">
Time zone:
</div>
<div class="col-75">
<input type="text" name="tz"> 
</div>
</div>
<div class="row">
<div class="col-25">		
Vehicle registration:
</div>
<div class="col-75">
<input type="text" name="vr"> 
</div>
</div>
<div class="row">
<div class="col-25">
ISO 3166 code:
</div>
<div class="col-75">
<input type="text" name="iso">
</div>
</div>
<div class="row">
<div class="col-25"> 
Website:
</div>
<div class="col-75">
<input type="text" name="website"> 
</div>
</div>
<div class="row">
<div class="col-25">
Symbols of Karnataka:
</div>
<div class="col-75">
<input type="text" name="sk">
</div>
</div>
<div class="row">
<div class="col-25"> 
Song:
</div>
<div class="col-75">
<input type="text" name="song">
</div>
</div>
<div class="row">
<div class="col-25">
Bird:
</div>
<div class="col-75">
<input type="text" name="bird">
</div>
</div>
<div class="row">
<div class="col-25">
Flower:
</div>
<div class="col-75">
<input type="text" name="flower"> 
</div>
</div>
<div class="row">
<div class="col-25">
Mammal:
</div>
<div class="col-75">
<input type="text" name="mammal"> 
</div>
</div>
<div class="row">
<div class="col-25">
Tree:
</div>
<div class="col-75">
<input type="text" name="tree"> 
</div>
</div>
<div class="row">
<div class="col-25">
Flag:
</div>
<div class="col-75">
<input type="text" name="flag">
</div>
</div>
<div class="row">
<div class="col-25">
Biggest river:
</div>
<div class="col-75">
<input type="text" name="river">
</div>
</div>
<div class="row">
<div class="col-25">
Famous temples:
</div>
<div class="col-75">
<input type="text" name="temple"> 
</div>
</div>
<div class="row">
<div class="col-25">
Traditional dress:
</div>
<div class="col-75">
<input type="text" name="dress"> 
</div>
</div>
<div class="row">
<div class="col-25">
Famous food:
</div>
<div class="col-75">
<input type="text" name="food"> 
</div>
</div>
<div class="row">
<div class="col-25">
Traditional dance:
</div>
<div class="col-75">
<input type="text" name="dance"> 
</div>
</div>
<div class="row">
<div class="col-25">
Airports:
</div>
<div class="col-75">
<input type="text" name="airports">
</div>
</div>
<div class="row">
<div class="col-25">
No. of Villages:
</div>
<div class="col-75">
<input type="text" name="villages"> 
</div>
</div>
<div class="row">
<div class="col-25">
Lowest temparature place:
</div>
<div class="col-75">
<input type="text" name="lTemp"> 
</div>
</div>
<div class="row">
<div class="col-25">
First inscription:
</div>
<div class="col-75">
<input type="text" name="inscription">
</div>
</div>

<h3 style="color: blue;">tallest monolithic statue:</h3>

<div class="row">
<div class="col-25">
Statue Name:
</div>
<div class="col-75">
<input type="text" name="sn"> 	
</div>
</div>
<div class="row">
<div class="col-25">	
Height:
</div>
<div class="col-75">
<input type="text" name="height"> 
</div>
</div>
<div class="row">
<div class="col-25">
Location:
</div>
<div class="col-75">
<input type="text" name="location"> 
</div>
</div>
<div class="row">
<div class="col-25">
Home minister:
</div>
<div class="col-75">
<input type="text" name="homeMinister">
</div>
</div>

<h3 style="color: blue;">Highest Grossed Movie</h3>

<div class="row">
<div class="col-25">
Film Name:
</div>
<div class="col-75">
<input type="text" name="film"><!-- K.G.F: Chapter 2  -->
</div>
</div>
<div class="row">
<div class="col-25">
Director:
</div>
<div class="col-75">
<input type="text" name="director"> 
</div>
</div>
<div class="row">
<div class="col-25">
Released Year:
</div>
<div class="col-75">
<input type="text" name="year"> 
</div>
</div>
<div class="row">
<div class="col-25">
Budget:
</div>
<div class="col-75">
<input type="text" name="year">  <!-- 100 crores INR -->
</div>
</div>
<div class="row">
<div class="col-25">
Gross:
</div>
<div class="col-75">
<input type="text" name="gross"> <!-- 1,200 crore  -->
</div>
</div>
			
			 
			<input type="submit" value="submit" style="height:50px; width:70px">   
			<!-- <input type="reset" value="Reset"> -->
	</form>
	</div>
</body>
</html>