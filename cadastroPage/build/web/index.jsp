<%-- 
    Document   : index
    Created on : 24/05/2022, 20:17:31
    Author     : Aluno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="estilo.css">
        <title></title>
    </head>
    <body>
    <%@include file="cabecalho.jsp"%>
        
        <%
            String usuario = request.getParameter("nome");
            out.println(usuario + ", tudo bem com você?");
        %>
    </body>
    <%@include file="rodape.jsp"%>
</html>
