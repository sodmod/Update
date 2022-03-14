<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Nice Work Badmus</title>
</head>
<body>
	<%--To add data --%>
	<%--<form action="addAlien">
			<input type="text" name="UserName"><br>
			<input type="text" name="fName"><br>
			<input type="text" name="mName"><br>
			<input type="text" name="lName"><br>
			<input type="text" name="phoneNumber"><br>
			<input type="submit"><br>
		</form>
	--%>
	
	<%-- To get data with the primary key phoneNumber --%>
	<form action="getAlien">
		<input type="text" name="phoneNumber"><br>
		<input type="submit"><br>
	</form>

</body>
</html>