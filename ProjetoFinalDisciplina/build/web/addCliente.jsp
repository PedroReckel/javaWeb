<%-- 
    Document   : addCliente
    Created on : 19/06/2022, 16:24:59
    Author     : pedro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="w3adda.ClienteDAO"%>
<jsp:useBean id="u" class="w3adda.ClienteBean"></jsp:useBean>
<jsp:setProperty property="*" name="u"/>

 <%
    int i=ClienteDAO.save(u);
    if(i>0){
    response.sendRedirect("home.jsp");
    }else{
    response.sendRedirect("errorPage.jsp");
    }
%>   