<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Remove contact</title>
</head>
<body>
	<form method="post" action="RemoveContactServlet">
		<table align='center'>
			<!-- table in year 2014, yep -->
			<tr>
				<td>id</td>
				<td><input type="text" name="idContact" value=""></td>
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