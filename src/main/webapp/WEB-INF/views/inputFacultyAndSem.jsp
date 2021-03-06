<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Grades</title>
	<link rel="stylesheet" type="text/css" href="<c:url value="/resource/css/bootstrap.min.css"/>">
	<link rel="stylesheet" type="text/css" 	href="<c:url value="/resource/css/myCSS.css"/>">
</head>
<body>
		<div class="jumbotron">
		<div class="container">
			<h1>Grades</h1>			
			<div style="padding-top: 20px">
				<a class="btn btn-danger" href="<c:url value="/examSection/manageGrades" />">Back</a>
			</div>
		</div>
	</div>
	
	<div class="container">
	<form:form class="form-horizontal" modelAttribute="input" enc-type="form-data">
		<fieldset>
		<legend></legend>
		<div class="form-group">
			<label for="facultyName" class="control-label col-md-2">Faculty Name</label>
			<div class="col-md-10">
			 	<form:select path="department" items="${facultyNames }">
					</form:select>
			 </div>
		</div>
		
		<div class="form-group">
			<label for="instructorId" class="control-label col-lg-2">Semester(0 for all Sem)</label>
			<div class="col-md-10">
				<form:input id="semester" path="semester" type="number" /> <form:errors cssClass="text-danger" path="semester"/>
			 </div>
		</div>		

		<div class="form-group">
			<div class="col-lg-offset-2 col-lg-10">
				<input class="btn btn-primary" type="submit" value="See Info"/>
			</div>
		</div>
		</fieldset>
	</form:form>
	</div>
</body>
</html>