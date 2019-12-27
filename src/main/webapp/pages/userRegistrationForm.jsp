<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Registration Page</title>
</head>
<body>
	<form:form action="registerUser" method="post" modelAttribute="userCommand">
	<table>
		<tr><td><form:hidden path="userId"/></td></tr>
		<tr><td>Enter First Name  ::</td><td><form:input path="firstName"/></td></tr>
		<tr><td>Enter Last Name  ::</td><td><form:input path="lastName"/></td></tr>
		<tr><td>Enter Email  ::</td><td><form:input path="email"/></td></tr>
		<tr><td>Enter Phone Number  ::</td><td><form:input path="phoneNo"/></td></tr>
		<tr><td>Select Date Of Birth  ::</td><td><form:input path="dateOfBirth"/></td></tr>
		<tr><td>Select Gender  ::</td><td>Male <form:radiobutton path="gender" value="male"/>
						&nbsp;&nbsp;&nbsp;&nbsp;Female <form:radiobutton path="gender" value="female"/></td></tr>
		<tr><td>>Select Country  ::</td><td><form:select path="country"/></td></tr>
		<tr><td>>Select State  ::</td><td><form:input path="state"/></td></tr>
		<tr><td>>Select City  ::</td><td><form:input path="city"/></td></tr>
		<tr><td><input type="reset" value="Reset Form Values"></td>
			<td><input type="submit" value="Register User"></td></tr>
	</table>
	</form:form>
</body>
</html>