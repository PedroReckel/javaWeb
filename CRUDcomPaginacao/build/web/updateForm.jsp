<%-- 
    Document   : updateForm
    Created on : 16/06/2022, 11:06:32
    Author     : pedro
--%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Edit Form</title>
        <style>
            body {
                background-color: white;
            }
        </style>
    </head>
    <body>
        <%@ include file="header.html" %>  <br>
        <%@page import="w3adda.*"%>

        <%
            String id = request.getParameter("id");
            UserBean u = UserDAO.getRecordById(Integer.parseInt(id));
        %>

        <h1>Editar formulário</h1>
        <form action="UpdateUser.jsp" method="post">
            <input type="hidden" name="id" value="<%=u.getId()%>"/>
            <table>
                <tr><td>Nome:</td><td><input type="text" name="name" value="<%= u.getName()%>"/></td></tr>
                <tr><td>Senha:</td><td><input type="password" name="password" value="<%= u.getPassword()%>"/></td></tr>
                <tr><td>Email:</td><td><input type="email" name="email" value="<%= u.getEmail()%>"/></td></tr>
                <tr><td>Salario:</td><td><input type="number" step="0.01" name="salary" value="<%= u.getSalary()%>"/></td></tr>
                <tr><td>Sexo</td><td><input type="radio" name="sex" value="male"/>Male <input type="radio" name="sex" value="female"/>Female </td></tr>
                <tr><td>Pais:</td><td>
                        <select name="country">
                            <option>India</option>
                            <option>New Zealand</option>
                            <option>Srilanka</option>
                            <option>Other</option>
                            <option>Brazil</option>
                        </select>
                    </td></tr>
                <tr><td colspan="2"><input type="submit" value="Edit User"/></td></tr>
            </table>
        </form>

    </body>
</html>
