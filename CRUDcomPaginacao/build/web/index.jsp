<%-- 
    Document   : index
    Created on : 16/06/2022, 11:05:25
    Author     : pedro
--%>

<%@page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>W3Adda Welcome Page</title>
        <style>
            body {
               background-color: white;
            }
        </style>
    </head>
    <body>
        <%@ include file="header.html" %>  <br>
        <a href="addUserForm.jsp">Adicionar usuários</a>
        <a href="viewUsers.jsp">Ver usuários</a>
    </body>
</html>