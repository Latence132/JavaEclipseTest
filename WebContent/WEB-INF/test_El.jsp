<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <title>Test des expressions EL</title>
    </head>
    <body>
    <p>
        <!-- Initialisation d'un bean de type Coyote avec une action standard, pour l'exemple : -->
        <jsp:useBean id="coyote" class="com.sdzee.beans.Coyote" />
        <!-- Initialisation de sa propri�t� 'pr�nom' : -->
        <jsp:setProperty name="coyote" property="prenom" value="Wile E."/>
        <!-- Et affichage de sa valeur : -->
        <jsp:getProperty name="coyote" property="prenom" />
       
    </p>
    <p>${coyote.prenom }</p>
    <div> <% 
    	/* Cr�ation d'une liste de l�gumes et insertion de quatre �l�ments */
    	java.util.List<String> legumes = new java.util.ArrayList<String>();
        legumes.add( "poireau" );
        legumes.add( "haricot" );
        legumes.add( "carotte");
        legumes.add( "pomme de terre" );
        request.setAttribute( "legumes" , legumes );
        %>

        <!-- Les quatre syntaxes suivantes retournent le deuxi�me �l�ment de la liste de l�gumes  -->
        ${ legumes.get(1) }<br />
        ${ legumes[1] }<br />
        ${ legumes['1'] }<br />
        ${ legumes["1"] }<br />
      </div>
      <p>
        <% 
        /* Cr�ation d'une Map */
        java.util.Map<String,Integer> desserts = new java.util.HashMap<String, Integer>();
        desserts.put("cookies", 8);
        desserts.put("glaces", 3);
        desserts.put("muffins", 6);
        desserts.put("tartes aux pommes", 2);
        
        request.setAttribute("desserts" , desserts);
        %>
        
        <!-- Les quatre syntaxes suivantes retournent la valeur associ�e � la cl� "cookies" de la Map de desserts  -->
        ${ desserts.cookies }<br />
        ${ desserts.get("cookies") }<br />
        ${ desserts['cookies'] }<br />
        ${ desserts["cookies"] }<br />

        <% 
        /* Cr�ation d'une cha�ne nomm�e "element" et contenant le mot "cookies" */
        String element = "cookies"; 
        request.setAttribute("element",element);
        %>
        <!-- Il est �galement possible d'utiliser un objet au lieu d'initialiser la cl� souhait�e directement dans l'expression -->
        ${ desserts[element] }<br />
    </p>
    
    
    </body>
</html>