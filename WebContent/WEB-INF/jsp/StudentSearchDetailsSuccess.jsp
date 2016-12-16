<%@page import="java.lang.reflect.Field"%>
<%@page import="com.illinois.mark.controller.StudentFormDataController"%>
<%@ page import="com.illinois.mark.model.Student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
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
	<%
	    Student student = (Student) request.getAttribute(StudentFormDataController.STUDENT_OBJECT);
						    if (student == null) {
	%>
	<h4>No Student found with Id ${studentId}</h4>
	<%
	    } else {
	%>
	<button onclick="myFunction()">Print this page</button>
	<br />
	<br />
	<table class="table table-striped">
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
			<td align="left">
				<%
				    String str = field.getName();
																								            out.print(Student.class.getMethod("get" + str.substring(0, 1).toUpperCase() + str.substring(1))
																								                    .invoke(student));
				%>
			</td>
		</tr>
		<%
		    }
												    }
		%>
	</table>
	<br />
	<script>
		function myFunction() {
			window.print();
		}
	</script>

	<%@ include file="footer.jsp"%>

</body>
</html>