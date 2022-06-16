<%-- 
    Document   : testarConexao
    Created on : 16/06/2022, 15:33:40
    Author     : pedro
--%>

<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql:localhost/dbvendas", "root","root");
            out.print("conexao realizada!");
        } catch (ClassNotFoundException erroClass) {
            out.print("Class Driver não foi localizado erro = " + erroClass);
        } catch (SQLException e) {
            System.out.println("Erro na conexão ao banco de dados = "+e);
        }
        %>
    </body>
</html>
