<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Welcome</title>
</head>
<body>

<% 	if (null != request) {
	String name = (String)request.getParameter("name");
	String password = (String)request.getParameter("password");
	if (name.equals("caca") && password.equals("caca")) {%>
	<h2> Hello <%=name %>, your password is <%=password%> !!</h2>
<%} else { %>
	<jsp:forward page="index.html"></jsp:forward>	
<%	}} else {
%>
	<jsp:forward page="index.html"></jsp:forward>
	<%} %>
</body>
</html>