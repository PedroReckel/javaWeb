<%-- 
    Document   : addUser
    Created on : 16/06/2022, 10:57:34
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
int i=UserDAO.save(u);
if(i>0){
response.sendRedirect("AddUserSuccess.jsp");
}else{
response.sendRedirect("errorPage.jsp");
}
%>
