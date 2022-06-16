<%-- 
    Document   : index.jsp
    Created on : 16/06/2022, 15:48:23
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
        <form action="usuarioCrud.jsp" method="post">
            <label>Nome</label><br>
            <input type="text" name="nome"></input><br><br>
            <label>Login</label><br>
            <input type="text" name="login"></input><br><br>
            <label>Senha</label><br>
            <input type="password" name="senha"></input><br><br>
            <label>Perfil</label><br>
            <input type="text" name="perfil"></input><br><br>
            
            <input type="submit" value="Adicionar">
    </body>
</html>
