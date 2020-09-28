<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="header.jsp" />
	<hr />
	<%-- Required View Template --%>
	AVAILABLE PRODUCTS
	<!--  <form action="admin?action=logout" method="post">
						<input type="submit" value="Logout" />  
					</form>  -->
	<hr />
	<table border="1" width="500" align="center">
		<tr bgcolor="00FF7F">
			<th><b>Product Id</b></th>
			<th><b>Product Name</b></th>
			<th><b>Product Cost</b></th>
			<th><b>Product Description</b></th>
			<th><b>Action</b></th>
		</tr>


  <c:forEach items ="${listProducts}" var="product">
		<%-- Arranging data in tabular form 
        --%>
		<tr>
			<td>${product.id}</td>
			<td>${product.productName}</td>
			<td>${product.cost}</td>
			<td>${product.productDescription}</td>
			<td>
				<div>
					<form action="admin?action=product-delete" method="post">
						<input type="hidden" name="productId" value=${product.id} /> <input
							type="submit" value="Delete Product" />
					</form>
				</div>
			</td>

		</tr>
		</c:forEach> 
	</table>

	<form action="${pageContext.request.contextPath}/admin/product-entry" method="get">
		<div>
			<div>
				<input type="submit" value="Add New Product">
			</div>
		</div>

	</form>


	<jsp:include page="footer.jsp" />
</body>
</html>