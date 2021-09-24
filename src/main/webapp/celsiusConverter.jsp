<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>TempertureConverter</title>
<style>
body {background-color: LightCoral;}
.h1{
	font-family: Arial, Helvetica, sans-serif;
}
</style>
</head>
<body>
<h1 class="h1">Fahrenheit to Celsius Conversion</h1>
<form action="getCelsiusServlet" method="post"> <!-- getCelsiusServlet Action Attribute points to a java servlet -->
Enter a whole number to convert from Fahrenheit to Celsius
<input type="text" name="celsiusTemp" size="10"> <!-- name="celsiusTemp" identifies user input into text box -->
<input type="submit" value="Calculate Temp" />
</form>
</body>
</html>

