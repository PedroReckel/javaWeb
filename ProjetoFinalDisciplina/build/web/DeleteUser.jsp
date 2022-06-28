<%-- 
    Document   : DeleteUser
    Created on : 16/06/2022, 10:54:58
    Author     : pedro
--%>

<%@page import="w3adda.UserDAO"%>
<jsp:useBean id="u" class="w3adda.UserBean"></jsp:useBean>
<jsp:setProperty property="*" name="u"/>

<%
UserDAO.delete(u);
response.sendRedirect("verCarrinho.jsp");
%>
