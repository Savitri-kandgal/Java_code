<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
<script src="https://kit.fontawesome.com/c4254e24a8.js" crossorigin="annonymous"></script>
<style>
.input-group span{
	position: absolute;
	bottom: 12px;
	right: 17px;
	font-size: 14px;
	color: red;
}
#submit-error{
	color: red;
}
.input-group span i{
color: seagreen;
}
</style>
<script type="text/javascript">
var nameError=document.getElementById('name-error');
var emailError=document.getElementById('email-error');
var mobileError=document.getElementById('mobileNo-error');
var commentError=document.getElementById('comment-error');
var submitError=document.getElementById('submit-error');

function validateName(){
	var name=document.getElementById('name').value;
	if(name.length==0){
		nameError.innerHTML='Name is required';
		return false;
	}
	if(!name.match([A-Za-z]{3}[A-Za-z]*$/)){
		nameError.innerHTML='Enter atleast 3 letters';
		return false;
	}
	nameError.innerHTML='<i class="fas fa-check-circle"></i>';
	return true;
}

function validateMobileNo(){
	var mobileNo=document.getElementById('mobileNo').value;
	if(mobileNo.length==0){
		mobileError.innerHTML='mobileNo is required';
		return false;
	}
	if(!mobileNo.length!==10){
		mobileError.innerHTML='mobileNo should be 10 digits';
		return false;
	}
	if(!mobileNo.match(/^[0-9]{10}$/)){
		mobileError.innerHTML='Only digits please';
		return false;
	}
	
	nameError.innerHTML='<i class="fas fa-check-circle"></i>';
	return true;
}
</script>
</head>
<body>
	<nav class="navbar navbar-inverse">
			<div class="container-fluid">
			<div class="navbar-header">
				<p class="navbar-text" style="color: white; font-size: 20px;">X-Workz</p>
			</div>
			<ul class="nav navbar-nav navbar-right">
			<li><a href="view">
				<span class="glyphicon glyphicon-list-alt"></span>view</a></li>
				<li><a href="Welcome.jsp"><span
						class="glyphicon glyphicon-user"></span>Home</a></li>
			</ul>
		</div>
	</nav>
<h2>welcome to registration page</h2>
<h5 style=color:red;>${error}</h5>
<h4 style=color:green;>${success}</h4>
<h4 style=color:green;>${email}</h4>
<h5 style=color:red;>${failed}</h5>

<div class="container">
<form action="register" method="post" enctype="multipart/form-data">
<i class="fas fa-paper-plane"></i>

<div class="input-group">
<lable>Full Name</lable>
<input type="text" name="name" value="${dto.name}" placeholder="Enter your full name" id="name" onkeyup="validateName()">
<span id="name-error"></span>
</div>

<div class="input-group">
<lable>Email-Id</lable>
<input type="text" name="email" value="${dto.email}" placeholder="Enter email-id" id="email" onkeyup="validateEmail()">
<span id="email-error"></span>
</div>

<div class="input-group">
<lable>Phone No.</lable>
<input type="text" name="mobileNo" value="${dto.mobileNo}" placeholder="Enter Mobile No." id="mobileNo" onkeyup="validateMobileNo()">
<span id="mobileNo-error"></span>
</div>

<div class="input-group">
<lable>Comment</lable>
<textarea rows="4" cols="20" name="comments" placeholder="Enter you comment" id="comments" onkeyup="validateComment()"></textarea>
<span id="comment-error"></span>
</div>

<div class="input-group">
<lable>Upload File</lable>
<input type="file" name="file">
<span id="file-error"></span>
</div>

<button type="submit">Submit</button>
<span id="submit-error"></span>


<!-- <input type="submit" value="submit"> -->

</form>
</div>
<script src="script.js"></script>
</body>
</html>


<%-- 

Email: <input type="text" name="email" value="${dto.email}">
Mobile No.: <input type="text" name="mobileNo" value="${dto.mobileNo}">
Comments: <textarea rows="4" cols="20" name="comments"></textarea>
File: <input type="file" name="file">
<input type="submit" value="submit">
</pre>

 --%>
