<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
 <meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
 <style>
        .view {
            background-color: green;
            border: 2px solid black;
            color: white;
            padding: 5px 10px;
            text-align: center;
            display: inline-block;
            font-size: 20px;
            margin: 10px 30px;
            cursor: pointer;
        }
    </style>
    
    <style>
.footer {
   position: fixed;
   left: 0;
   bottom: 0;
   width: 100%;

   background-color: black;
   color: white;
   text-align: center;
}
</style>
</head>
<body>
	<nav class="navbar navbar-inverse">
		<div class="container-fluid">
			<div class="navbar-header">
				<p class="navbar-text" style="color: white; font-size: 20px;">X-Workz</p>
			</div>
			<ul class="nav navbar-nav navbar-right">
				<li><a href="Welcome.jsp"><span
						class="glyphicon glyphicon-user"></span>Home</a></li>
			</ul>
		</div>
	</nav>
<h4>Please fill the below form:</h4>
<form action="click" method="post">
<pre>
<label for="name">Name:</label><input id="country" type="name" name="name">
<label for="email">Email:</label><input id="email" type="text" name="email">
<label for="country">Choose Country:</label><select name="country" id="country">
<option value="select">Select</option>
  <option value="India">India</option>
  <option value="UK">UK</option>
  <option value="USA">USA</option>
  <option value="Pakistan">Pakistan</option>
</select>
<label for="mobile">Mobile:</label><input id="mobile" type="text" name="mobile">
<label for="type">Contact Type:</label><select name="type" id="type">
<option value="select">select</option>
  <option value="Mobile">Mobile</option>
  <option value="Work">Work</option>
  <option value="Home">Home</option>
  <option value="Main">Main</option>
</select>
<label for="description">Description:</label>
<textarea id="description" name="description" rows="4" cols="50">
add description here...
</textarea> 
<input class="view" type="submit" value="submit"> 
<!-- <input formmethod="get" formaction="view" type="submit" value="VIEW"><br>  -->
</pre>
</form>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
	
	<div class="footer">
	<small>@ 2023 Copyright &copy; xworkz.com</small>
 <p> <a href="contact.html">Contact Details</a><p>
</div>
</body>
</html>