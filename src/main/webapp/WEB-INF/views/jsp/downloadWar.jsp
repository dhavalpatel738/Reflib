<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>vRealize Reference Cost Update</title>

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<spring:url value="/resources/core/css/hello.css" var="coreCss" />
<link href="${coreCss}" rel="stylesheet" />

<spring:url value="/resources/core/css/hello.js" var="coreJs" />
<script src="${coreJs}"></script>

</head>
<body>
<nav class="navbar navbar-inverse navbar-fixed-top">
	<div class="container">
		<div class="navbar-header">
			<a class="navbar-brand" href="#">VMware vRBC Manager</a>
		</div>
	</div>
</nav>

<div class="jumbotron">
	<div class="container">
			<h3>Download RefDB</h3>
			<div class="dropdown">
				<button class="btn btn-primary dropdown-toggle" type="button" data-toggle="dropdown">Select RefDB Version 
				<span class="caret"></span></button>
				<ul class="dropdown-menu">
					<li><a href="#">Version 7.0</a></li>
					<li><a href="#">Version 7.1</a></li>
					<li><a href="#">Version 7.2</a></li>
				</ul>
			</div>
		</div>
</div>

</body>
</html>