<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="post" action="AddContactServlet">
		<table align='center'>
			<tr>
				<td>firstname</td>
				<td><input type="text" name="firstname" value=""></td>
			</tr>
			<tr>
				<td>lastname</td>
				<td><input type="text" name="lastname" value=""></td>
			</tr>

			<tr>
				<td>email</td>
				<td><input type="text" name="email" value=""></td>
			</tr>

			<tr>
				<td></td>
				<td><input type="submit" value="submit" name="submit"></td>
			</tr>

			<tr>
				<td></td>
				<td><input type="reset" value="reset" name="reset"></td>
			</tr>
		</table>
	</form>

</body>
</html>