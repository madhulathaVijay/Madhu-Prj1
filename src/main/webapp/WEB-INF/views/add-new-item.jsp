<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ADD NEW</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>

</head>
<body>
<body>
	<jsp:include page="header.jsp" />

	
	<section class="container-fluid p-4">
	<form  action="${pageContext.request.contextPath}/admin/product-save" th:action="@{/product-save}" th:object="${product}" class="form" action='' method="POST" >
	
	<div>
			<div><label for="id">Enter Product Id</label> </div>
			<div><input type="text" id="id" name="id" th:field="*{id}"> </div>
		</div>
		<div>
			<div><label for="productName">Enter Product Name</label> </div>
			<div><input type="text" id="productName" name="productName" th:field="*{productName}"> </div>
		</div>
		<div>
			<div><label for="cost">Enter Product Cost</label> </div>
			<div><input type="text" id="cost" name="cost" th:field="*{cost}"> </div>
		</div>
		<div>
			<div><label for="productDescription">Enter Product Description</label> </div>
			<div><input type="text" id="productDescription" name="productDescription" th:field="*{productDescription}"> </div>
		</div>
			<div>
			<div><input type="submit" value="Add"> </div>
		</div>
	</form>
	</div>
	</section>

	
</body>

	
</html>