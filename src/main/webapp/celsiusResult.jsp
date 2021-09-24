<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Results</title>
<style>
body {background-color: LightGreen;}
.h1{
	font-family: Arial, Helvetica, sans-serif;
}
.p1{
	font-family: "Lucida Console", "Courier New", monospace;
}
</style>
</head>
<body>
<h1 class="h1">Temperature Converted from Fahrenheit to Celsius</h1>
<p class="p1">
Temperature in Fahrenheit: ${celsiusConverted.getTemp()} <br /> <!-- Using taglib to output results -->
Temperature in Celsius: ${celsiusConverted.getCelsius()} <br />
</p>
<a href="index.jsp">Enter another temperature</a>
</body>
</html>

<!-- NEED TO CHANGE GETTERS TO CELSIUS -->
<!-- Set request.attribute to celsiusConverted on the servlet page  -->