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
<h1 class="h1">Celsius to Fahrenheit Conversion</h1>
<form action="getFarenheitServlet" method="post"> <!-- getFahrenheitServlet Action Attribute points to a java servlet -->
Enter a whole number to convert from Celsius to Fahrenheit
<input type="text" name="farenheitTemp" size="10"> <!-- name="farenheitTemp" identifies user input into text box -->
<input type="submit" value="Calculate Temp" />
</form>
</body>
</html>