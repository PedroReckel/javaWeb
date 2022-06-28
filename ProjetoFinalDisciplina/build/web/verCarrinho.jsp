<%-- 
    Document   : viewUsers
    Created on : 16/06/2022, 11:06:51
    Author     : pedro
--%>

<%@page import="w3adda.CarBean"%>
<!DOCTYPE html>
 
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Carrinho</title>
    </head>
    <body bgcolor="white">
         <%@ include file="header.html" %>  <br>
 
        <%@page import="w3adda.CarDAO, w3adda.CarBean.*,java.util.*"%>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 
        <h1>Carrinho de compras</h1>
 
        <%
            List<CarBean> list = CarDAO.getAllRecords();
            request.setAttribute("list", list);
        %>
 
        <table border="1" width="90%">
            <tr><th>Id</th><th>Categoria</th><th>Descriçao</th><th>Imagem</th><th>Preço</th><th>Editar</th><th>Deletar</th></tr>
                    <c:forEach items="${list}" var="u">
                <tr><td>${u.getCod()}</td><td>${u.getCategoria()}</td><td>${u.getDescricao()}</td><td>${u.getCodImagem()}</td><td>${u.getPreco()}</td><td><a href="updateForm.jsp?id=${u.getCod()}">Editar</a></td><td><a href="DeleteUser.jsp?id=${u.getCod()}">Deletar</a></td></tr>
            </c:forEach>
        </table>
        <br/><a href="concluirCompra.jsp">Adicionar novo produto</a>
 
    </body>
</html>