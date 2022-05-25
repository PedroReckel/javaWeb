<%-- 
    Document   : retorno
    Created on : 24/05/2022, 19:44:54
    Author     : Aluno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <style>
            * {
                font-family: arial;
            }
        </style>
        <title>Formulário em HTML</title>
    </head>
    <body>
        <h1>Retorno:</h1>
        <%
          String usuario = request.getParameter("nome");  
          String Email = request.getParameter("email");
          out.println("<p>" + usuario +"</p>");
          out.println("<p>" + Email + "</p>");
        %>    
    </body>
</html>
