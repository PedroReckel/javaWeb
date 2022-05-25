<%-- 
    Document   : index
    Created on : 24/05/2022, 19:36:17
    Author     : Aluno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <style>
            * {
                font-family: arial;
            }
        </style>
        <title>Formulário em HTML</title>
    </head>
    <body>
        <h1>Cadastro:</h1>
        <form action="retorno.jsp" method="get">
            <p>Digite seu nome:</p>
            <input type="text" name="nome" value="">
            <p>Digite seu e-mail:</p>
            <input type="text" name="email" value="">
            <button name="enviar">Enviar</button>
        </form>
    </body>
</html>
