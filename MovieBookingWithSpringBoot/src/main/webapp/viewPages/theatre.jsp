
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>theatre</title>
<link rel="stylesheet" type="text/css" href="stylesheets/style.css">
</head>
<body>
	<div class="main">
	<h1>Select Theatre</h1>
	<form action="date" method="get">
		<select name="theatreChoice">
			<c:forEach var="theatre" items="${theatreList}">
				<option>${theatre.theatreName}</option>
			</c:forEach>
		</select> <input type="submit" value="Next">
	</form>
	</div>
</body>
</html>