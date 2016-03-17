<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Issued Books</title>
</head>
<body>
	<h1>Issued Books to student ${student.getStudentId() }</h1>
	
		<table border="2px" cellspacing="2px" cellpadding="2px">
			<tr>
				<th>Id</th>
				<th>Name</th>
				<th>Author</th>
				<th>Faculty</th>
				<th>Semester</th>
				<th>Publisher</th>
				
			</tr>
			
			<tr>
				<td>${book2.getBookId() }</td>
				<td>${book2.getName() }</td>
				<td>${book2.getAuthor() }</td>
				<td>${book2.getFaculty() }</td>
				<td>${book2.getSemester() }</td>
				<td>${book2.getPublisher() }</td>
			</tr>
		
			
		
		</table>
		
		<a href="<c:url value="/library"></c:url>">Library Home</a>
</body>
</html>