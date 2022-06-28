<%-- 
    Document   : paginationPage
    Created on : 16/06/2022, 11:05:47
    Author     : pedro
--%>
<style>
    body {
        background-color: white;
    }
</style>
<%@page import="w3adda.ProdutoBean"%>
<!DOCTYPE html>
 
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Lista produtos</title>
    </head>
    <body bgcolor="white">
         <%@ include file="header.html" %>  <br>
 
        <%@page import="w3adda.ProdutoDAO, w3adda.ProdutoBean.*,java.util.*"%>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 
        <h1>Produtos disponíveis</h1>
 
        <%
            List<ProdutoBean> list = ProdutoDAO.getAllRecords();
            request.setAttribute("list", list);
        %>
 
        <table border="1" width="90%">
            <tr><th>Id</th><th>Categoria</th><th>Descriçao</th><th>Imagem</th><th>Preço</th><th>Ação</th></tr>
                    <c:forEach items="${list}" var="u">
                <tr><td>${u.getCod()}</td><td>${u.getCategoria()}</td><td>${u.getDescricao()}</td><td>${u.getCodImagem()}</td><td>${u.getPreco()}</td><td><a href="verCarrinho.jsp?id=${u.getCod()}">Comprar produto</a></td></tr>
            </c:forEach>
        </table>
        <br/>
 
    </body>
</html>
