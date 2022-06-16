<%-- 
    Document   : usuarioCrud
    Created on : 16/06/2022, 15:31:27
    Author     : pedro
--%>

<%@page import="model.UsuarioDAO"%>
<%@page import="model.Usuarios"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html><head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <%
        String acao = request.getParameter("acao");
        String nome = request.getParameter("nome");
        String login = request.getParameter("login");
        String senha = request.getParameter("senha");
        String perfil = request.getParameter("perfil");
    if (acao.equals("inserir")) {
        Usuarios u = new Usuarios(nome, login, senha, perfil);
        UsuarioDAO dao = new UsuarioDAO();
        dao.inserirUsuario(u);
    } if(acao.equals("alterar")) {
        int id = Integer.parseInt(request.getParameter("id"));
        Usuarios u = new Usuarios(id,nome, login, senha, perfil);
        UsuarioDAO dao = new UsuarioDAO();
        dao.atualizar(u);
    } if(acao.equals("deletar")) {
        int id = Integer.parseInt(request.getParameter("id"));
        UsuarioDAO dao = new UsuarioDAO();
        dao.apagar(id);
    } 
    response.sendRedirect("formUsuario.jsp");
    %>
    </body></html>
