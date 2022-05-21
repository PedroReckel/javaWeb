/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package VideoAulaServlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author pedro
 */
public class Cadastrese extends HttpServlet {

    public void destroy() {
        super.destroy();
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String usuario = request.getParameter("usuario");
        String senha = request.getParameter("senha");
        
        int tamUsuario = usuario.length();
        int tamSenha = senha.length();
        
        if (tamUsuario > 12 || tamSenha < 6) {
            response.sendRedirect("cadastro.jsp");
        } else {
            response.sendRedirect("index.html");
        }
    }
    public void init() throws ServletException {
        
        super.init();
    }    
}
