<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Date Time</title>
</head>
<body>
	<h1>Select Time</h1>
	<form action="seatAvailabilty" method="get">
		<select name="timeChoice">
			<c:forEach var="time" items="${timeList}">
				<option>${time.getTime()}</option>
			</c:forEach>
		</select> <input type="submit" value="Next">
	</form>
</body>
</html>