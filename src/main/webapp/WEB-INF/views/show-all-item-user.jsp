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
			<th><b>Id</b></th>
			<th><b>deliveryAddress</b></th>
			<th><b>Order Date</b></th>
			<th><b>Amount</b></th>
		</tr>



		<%-- Arranging data in tabular form 
        --%>
		<tr>
			<td>${coronaKit.id}</td>
			<td>${coronaKit.deliveryAddress}</td>
			<td>${coronaKit.orderDate}</td>
			<td>${coronaKit.totalAmount}</td>
		</tr>
	</table>

	<form action="${pageContext.request.contextPath}/user/checkout" method="get">
		<div>
			<div>
				<input type="submit" value="Checkout">
			</div>
		</div>

	</form>


	<jsp:include page="footer.jsp" />

</body>
</html>