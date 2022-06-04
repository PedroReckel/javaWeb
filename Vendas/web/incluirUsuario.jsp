<%-- 
    Document   : incluirUsuario
    Created on : 4 de jun. de 2022, 14:29:55
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
            <input type="text" name="nome"></input><br>
            <label>Login</label><br>
            <input type="text" name="login"></input><br>
            <label>Senha</label><br>
            <input type="text" name="senha"></input><br>
            <label>Pefil</label><br>
            <input type="text" name="perfil"></input><br>
            
            <input type="submit" value="Adcionar"></input>
        </form>
    </body>
</html>
