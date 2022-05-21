<%-- 
    Document   : cadastro
    Created on : 18 de mai. de 2022, 20:22:37
    Author     : pedro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" type="text/css" href="estilo.css">
    </head>
    <body id="corpo">
        
        
        <form id="form2" action="Cadastrese" method="get">
            <fildset style="width: 20px">
                <legend> Cadastrar-se </legend>
                <label for="id=usuario">Usuário<br/>
                <input type="text" id="usuario" name="usuario" value="" size="15" /><br/><br/>
                <label for="id=senha">Senha<br/>
                <input type="password" id="senha" name="senha" value="" size="15" /><br/><br/>
                <input type="submit" value="Cadastre-se" name="enviar" />
            </fildset>

        </form>
    </body>
</html>
