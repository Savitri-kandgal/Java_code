<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Welcome page</title>
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
<body  style="background-color:powderblue;">
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
	<form action="view" method="get">
			<h3>
				<mark>Welcome to Contact App:</mark></h3>
				<pre>
<input class="view" type="submit" value="View Contact List"></pre></form>
<pre>
<button class="view" onclick="window.location.href ='AddContact.jsp';">Add Contact Info</button>
</pre>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
	<div class="footer">
	<small>@ 2023 Copyright &copy; xworkz.com</small>
 <p> <a href="contact.html">Contact Details</a><p>
</div>
</body>
</html>