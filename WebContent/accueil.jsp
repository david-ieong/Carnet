<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Accueil de mon carnet de voyage</title>
</head>
<body>
<form method="get" action="addContact.jsp">
<button>Ajouter Contact</button><br>
<button onclick="document.forms[0].action='removeContact.jsp'">Supprimer Contact</button><br>
<button onclick="document.forms[0].action='updateContact.jsp'">Modifie Contact</button><br>
<button onclick="document.forms[0].action='searchContact.jsp'">Recherche Contact</button><br>
</form>
</body>
</html>