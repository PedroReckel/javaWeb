<%-- 
    Document   : envOpcoes
    Created on : 21 de mai. de 2022, 13:51:05
    Author     : pedro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" language="java"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Exemplo 2 - Form com seleção</title>
    </head>
    <body>
        <%
            String[] e = request.getParameterValues("programas");
            if (e != null) {
                out.println("<h2>Você selecionou os seguintes programas</h2>");
                for (int i = 0; i < e.length; i++) {
                    out.println("<b>"+ e[i] +"</b>");
            } 
        %>
        h2>Selecione um ou mais programas usando o Ctrl</h2>
        <form action="envOpcoes.jsp" method="post">
            <select name="programs" size="8" multiple="multiple">
                <option value="Eclipse">Eclipse</option>
                <option value="NetBeans">NetBeans</option>
                <option value="VisualStudio.net">VisualStudio.net</option>
                <option value="BROffice.org">BROffice.org</option>
                <option value="Dreamweaver">Dreamweaver</option>
            </select>
            <input type="submit" name="btEnviar" value="Enviar">
        </form>
    </body>
</html>
