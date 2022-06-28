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
            <input type="hidden" name="id" value="<%=u.getcodProduto()%>"/>
            <table>
                <tr><td>Produto:</td><td><input type="text" name="name" value="<%= u.getName()%>"/></td></tr>
                <tr><td>Categoria:</td><td>
                        <select name="categoria">
                            <option>Eletrônicos</option>
                            <option>Móveis</option>
                            <option>Peças para automóveis</option>
                            <option>Sapatos</option>
                        </select>
                <tr><td>Descrição:</td><td><input type="text" name="descricao" value="<%= u.getDesc()%>"/></td></tr>
                <tr><td>Preço:</td><td><input type="number" step="0.01" name="preco" value="<%= u.getPre()%>"/></td></tr>                        
                    </td></tr>
                <tr><td colspan="2"><input type="submit" value="Edit User"/></td></tr>
            </table>
        </form>

    </body>
</html>
