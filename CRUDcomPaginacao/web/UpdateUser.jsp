<%-- 
    Document   : UpdateUser
    Created on : 16/06/2022, 10:56:46
    Author     : pedro
--%>
<style>
    body {
        background-color: white;
    }
</style>
<%@page import="w3adda.UserDAO"%>
<jsp:useBean id="u" class="w3adda.UserBean"></jsp:useBean>
<jsp:setProperty property="*" name="u"/>

<%
int i=UserDAO.update(u);
response.sendRedirect("viewUsers.jsp");
%>
