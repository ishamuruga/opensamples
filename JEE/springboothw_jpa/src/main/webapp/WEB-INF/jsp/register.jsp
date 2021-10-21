<%@taglib uri="http://www.springframework.org/tags/form" prefix="frm"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html>
<head>
<style>
.error {
	color: #ff0000;
	font-style: italic;
	font-weight: bold;
}
</style>
</head>
<body>
	<h1>Customer Entry Form</h1>

	<frm:form method="post" action="/doRegister"
		modelAttribute="mycustomer">

		<table>
			<tr>
				<td>Customer ID</td>
				<td><frm:input path="custid" /></td>
				<frm:errors path="custid" cssClass="error" />
			</tr>
			<tr>
				<td>Name</td>
				<td><frm:input path="name" /></td>
				<frm:errors path="name" cssClass="error" />
				
			</tr>

			<tr>
				<td>Email</td>
				<td><frm:input path="email" /></td>
				<frm:errors path="email" cssClass="error" />
			</tr>

			<tr>
				<td>Age</td>
				<td><frm:input path="age" /></td>
				<frm:errors path="age" cssClass="error" />
			</tr>

			<tr>
				<td colspan="2"><input type="submit" value="Add Customer">
				</td>
			</tr>

		</table>


	</frm:form>

</body>
</html>