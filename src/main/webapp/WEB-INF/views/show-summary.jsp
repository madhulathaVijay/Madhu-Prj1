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
			<th><b>coronaKitId</b></th>
			<th><b>productId</b></th>
			<th><b>quantity</b></th>
			<th><b>Amount</b></th>
		</tr>



		<%-- Arranging data in tabular form 
        --%>
		<tr>
			<td>${kitDetails.coronaKitId}</td>
			<td>${kitDetails.productId}</td>
			<td>${kitDetails.quantity}</td>
			<td>${kitDetails.amount}</td>
		</tr>
	</table>


	<jsp:include page="footer.jsp" />
</body>
</html>