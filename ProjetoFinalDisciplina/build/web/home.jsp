<%-- 
    Document   : home
    Created on : 19/06/2022, 13:30:48
    Author     : pedro
--%>

<%@page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Página HOME</title>
        <style>
            body {
               background-color: white;
               font-family: arial;
            }
            
            a {
                text-decoration: none;
                color: black;
            }
            
            a:hover {
                font-weight: bolder;
            }
            
            #nav1 {
                margin-left: 25px;
            }
            
            #nav2 {
                margin-left: 100px;
            }
        </style>
    </head>
    <body>
        <%@ include file="header.html" %>  <br>
        <a href="produtos.jsp" id="nav1">Ver lista de produtos</a>
        <a href="verCarrinho.jsp" id="nav2">Ver carrinho</a>
    </body>
</html>