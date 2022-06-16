<%-- 
    Document   : viewUsers
    Created on : 16/06/2022, 11:06:51
    Author     : pedro
--%>

<%@page import="w3adda.UserBean"%>
<!DOCTYPE html>
 
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>View Users</title>
    </head>
    <body bgcolor="white">
         <%@ include file="header.html" %>  <br>
 
        <%@page import="w3adda.UserDAO, w3adda.UserBean.*,java.util.*"%>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 
        <h1>Lista de usuários</h1>
 
        <%
            List<UserBean> list = UserDAO.getAllRecords();
            request.setAttribute("list", list);
        %>
 
        <table border="1" width="90%">
            <tr><th>Id</th><th>Nome</th><th>Senha</th><th>Email</th><th>Sexo</th><th>Pais</th><th>Salarop</th><th>Editar</th><th>Deletar</th></tr>
                    <c:forEach items="${list}" var="u">
                <tr><td>${u.getId()}</td><td>${u.getName()}</td><td>${u.getPassword()}</td><td>${u.getEmail()}</td><td>${u.getSex()}</td><td>${u.getCountry()}</td><td>${u.getSalary()}</td><td><a href="updateForm.jsp?id=${u.getId()}">Edit</a></td><td><a href="DeleteUser.jsp?id=${u.getId()}">Delete</a></td></tr>
            </c:forEach>
        </table>
        <br/><a href="addUserForm.jsp">Adicionar novo usuário</a>
 
    </body>
</html>