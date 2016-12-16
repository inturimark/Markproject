<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="java.lang.reflect.Field"%>
<%@page import="com.illinois.mark.controller.StudentFormDataController"%>
<%@ page import="com.illinois.mark.model.Student"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Mark Project</title>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</head>
<body>


	<%@ include file="header.jsp"%>

	<h3>${message}</h3>

	<form method="post" modelAttribute="studentObject"
		action="${pageContext.request.contextPath}/AddStudentDetails.html">

		<table class="table table-striped" >
			<%
			    Field[] fields = Student.class.getDeclaredFields();
			    for (Field field : fields) {
			        field.setAccessible(true);
			%>
			<tr>
				<td align="center">
					<%
					    out.print(field.getName());
					%>
				</td>
				<td><input type="text" name="<%out.print(field.getName());%>" /></td>
			</tr>
			<%
			    }
			%>
		</table>


		<input value="register" type="submit" />
	</form>

	<%@ include file="footer.jsp"%>

</body>
</html>