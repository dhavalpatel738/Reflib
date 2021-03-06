<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>vRealize Reference Cost Update</title>

<spring:url value="/resources/core/css/hello.css" var="coreCss" />
<spring:url value="/resources/core/css/bootstrap.min.css" var="bootstrapCss" />
<link href="${bootstrapCss}" rel="stylesheet" />
<link href="${coreCss}" rel="stylesheet" />
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
			<h3>Update Your Reference Data</h3>
			<form class="form-horizontal">
				<div class="form-group row">
					<label for="example-license-input" class="control-label col-xs-1">License</label>
					<div class="col-xs-5">
						<input class="form-control" type="text" id="example-license-input" placeholder="Enter License">
					</div>
					<a href="licenseAgreement" class="btn btn-primary" role="button">Submit</a>
					<!-- button type="submit" class="btn btn-primary" onclick="location.href='/spring4/downloadWar'">Submit</button -->
				</div>
			</form>
			
	</div>
</div>


<spring:url value="/resources/core/css/hello.js" var="coreJs" />
<spring:url value="/resources/core/css/bootstrap.min.js" var="bootstrapJs" />

<script src="${coreJs}"></script>
<script src="${bootstrapJs}"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>

</body>
</html>