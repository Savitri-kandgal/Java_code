<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>X-workz</title>
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
<body style="background-color:papayawhip;">
	<nav class="navbar navbar-inverse">
			<div class="container-fluid">
			<div class="navbar-header">
				<p class="navbar-text" style="color: white; font-size: 20px;">X-Workz</p>
			</div>
			<ul class="nav navbar-nav navbar-right">
			<li><a href="ImageDispaly.jsp"><span class="glyphicon glyphicon-list-alt"></span>Download-Files</a></li>
			<li><a href="displayList"><span class="glyphicon glyphicon-list-alt"></span>view-Data</a></li>
			<li><a href="Landing.jsp"><span class="glyphicon glyphicon-user"></span>Home</a></li>
			</ul>
		</div>
	</nav>
<h2>welcome to registration page</h2>
<h5 style=color:red;>${error}</h5>
<h5 style=color:green;>${success}</h5>
<h5 style=color:green;>${email}</h5>
<h5 style=color:red;>${failed}</h5>
<form action="register" method="post" enctype="multipart/form-data">
<table>
<tr>
<td>Name: </td>
<td><input type="text" name="name" value="${dto.name}"></td>
</tr>
<tr></tr>
<tr>
<td>Email:</td>
<td><input type="text" name="email" id="mail" value="${dto.email}" onchange="ajax()">
<span id="display" style="color:red"></span>
</td>
</tr>
<tr></tr>
<tr>
<td>
Mobile No.:</td><td><input type="text" name="mobileNo" value="${dto.mobileNo}"></td>
</tr>
<tr></tr>
<tr>
<td>
Comments:</td><td> <textarea rows="4" cols="20" name="comments"></textarea></td>
</tr>
<tr></tr>
<tr>
<td>
File:</td><td><input type="file" name="file"></td>
</tr>
<tr></tr>
<tr>
<td>
<input type="submit" value="submit"></td>
</tr>
</table>
</form>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>  

</body>
</html>