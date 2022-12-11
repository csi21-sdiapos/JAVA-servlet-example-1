<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>

<head>
	<meta charset="ISO-8859-1">
	<title>index.jsp</title>
</head>

<body>
	<form id="calculadoraForm" method="POST" action="operar">
		<h1>Index JSP</h1>
		
		<input id="idNum1" type="text" name="num1" /> 
		<input id="idNum2" type="text" name="num2" />
		
		<button id="idSuma" type="submit" name="suma">Sumar</button>
		<button id="idResta" type="submit" name="resta">Restar</button>
	</form>
</body>
</html>