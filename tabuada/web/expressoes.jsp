<%-- 
    Document   : expressoes
    Created on : 21 de mai. de 2022, 15:59:08
    Author     : pedro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="style.css"/>
        <title>Resultados</title>
    </head>
    <body>
        <h1>Segue os resultados abaixo:</h1>
        <%
            String limitSTR = request.getParameter("number");
            int number = -1;
            if (limitSTR != null) number = Integer.parseInt(limitSTR);
            
            for (int i = 0; i < 11; i++) {
                out.println(number + " x " + i + " = " + number * i + "<br>");
            }
        %>
    </body>
</html>
