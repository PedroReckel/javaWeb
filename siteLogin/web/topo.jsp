<%-- 
    Document   : topo
    Created on : 18 de mai. de 2022, 21:33:08
    Author     : pedro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="estilo.css"/>
        <title>JSP Page</title>
    </head>
    <body>
        <!--
        <%
            HttpSession sessao = request.getSession(true);
            String nome = (String) sessao.getAttribute("nome");
        %>
        -->
        <h1>Bem vindo(a) a JAVA WEB <%=nome%>!</h1>
        <a href="principal.jsp">[HOME]</a>
        <a href="serviços.jsp">[SERVIÇOS]</a>
        <a href="atendimento.jsp">[ATENDIMENTO]</a>
        <a href="sair">[SAIR]</a>
    </body>
</html>
