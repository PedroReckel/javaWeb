<%-- 
    Document   : formUsuario
    Created on : 16/06/2022, 16:19:41
    Author     : pedro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Formulário Usuário</h1>
        <table border="1" width="90%">
            <tr>
                <th>Id</th>
                <th>Nome</th>
                <th>Login</th>
                <th>Senha</th>
                <th>Perfil</th>
                    <c:forEach items="${list}" var="u">
                <tr>
                    <td>${u.getid()}</td>
                    <td>${u.getnome()}</td>
                    <td>${u.gelLogin()}</td>
                    <td>${u.getsenha()}</td>
                    <td>${u.getperfil()}</td>
                    <td><a href="updateForm.jsp?id=${u.getId()}">Edit</a>
                    </td><td><a href="DeleteUser.jsp?id=${u.getId()}">Delete</a></td></tr>
            </c:forEach>
        </table>
    </body>
</html>
