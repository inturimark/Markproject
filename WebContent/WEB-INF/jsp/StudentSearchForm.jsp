<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Mark Project</title>
</head>
<body>

	<%@ include file="header.jsp"%>

	<h3>${message}</h3>

	<form method="post"
		action="${pageContext.request.contextPath}/StudentSearchDetails.html">
		<input type="text" name="studentId" /> <input value="search"
			type="submit" />
	</form>

	<br />
	<br />
	<br />
	<br />
	<%@ include file="footer.jsp"%>

</body>
</html>