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
 	<p>
            Coucou:
           
        </p>
	
	<%
		ArrayList<Integer> liste = new ArrayList<Integer>();
		liste.add( 12 );
		out.println( liste.get( 0 ) );

     %>
     
     
</body>
</html>