<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
    <%@ page import="java.util.List" %>
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
     
     <p>
            Récupération du bean :
            <%	
	    com.sdzee.beans.Coyote notreBean = (com.sdzee.beans.Coyote) request.getAttribute("coyote");
	    out.println( notreBean.getPrenom() );
            out.println( notreBean.getNom() );
            %>
        </p>
        <p>Ceci est une page générée depuis une JSP script et balise JSP.</p>
        <p>
            <% String attribut2 = (String) request.getAttribute("test"); %>
            <%= attribut2 %>

            <% String parametre = request.getParameter( "auteur" ); %>
            <%= parametre %>
        </p>
        <p>
            Récupération du bean :
            <jsp:useBean id="coyote" class="com.sdzee.beans.Coyote" scope="request" />
            <jsp:getProperty name="coyote" property="prenom" />
            <jsp:getProperty name="coyote" property="nom" />
        </p>
        

        <p>Ceci est une page générée depuis une JSP la récup ci-dessous est en EL Expression langage.</p>
        <p>
            ${test}
            ${param.auteur}
        </p>
        <p>
            Récupération du bean :
            ${coyote.prenom}
            ${coyote.nom}
        </p>
        
        <p>
            Récupération de la liste :
            <%
            List<Integer> liste = (List<Integer>) request.getAttribute( "liste" );
            for( Integer i : liste ){
                out.println(i + " : ");	
            }
            %>
        </p>
        
         <p>
            Récupération du jour du mois :
            <%
            Integer jourDuMois = (Integer) request.getAttribute( "jour" );
            if ( jourDuMois % 2 == 0 ){
                out.println("Jour pair : " + jourDuMois);
            } else {
                out.println("Jour impair : " + jourDuMois);
            }
            %>
        </p>

</body>
</html>