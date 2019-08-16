<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 	<p>Généré par une JSP</p> 
	<% 
      String attribut = (String) request.getAttribute("test");
      out.println( attribut );
     %>
</body>
</html>