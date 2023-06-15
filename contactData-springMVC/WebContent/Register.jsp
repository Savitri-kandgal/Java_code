<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>X-workz</title>
</head>
<body>
<h2>welcome to registration page</h2>
<h5 style=color:red;>${error}</h5>
<h4 style=color:green;>${success}</h4>
<h4 style=color:green;>${email}</h4>
<h5 style=color:red;>${failed}</h5>
<form action="register" method="post" enctype="multipart/form-data">
<pre>
Name: <input type="text" name="name" value="${dto.name}">
Email: <input type="text" name="email" value="${dto.email}">
Mobile No.: <input type="text" name="mobileNo" value="${dto.mobileNo}">
Comments: <textarea rows="4" cols="20" name="comments"></textarea>
File: <input type="file" name="file">
<input type="submit" value="submit">
</pre>
</form>
</body>
</html>