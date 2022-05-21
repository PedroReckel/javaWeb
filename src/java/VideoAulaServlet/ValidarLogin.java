/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package VideoAulaServlet;

import java.io.IOException;
/*import java.io.PrintWriter;*/
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author pedro
 */
public class ValidarLogin extends HttpServlet {
    
    public void destroy() {
        super.destroy();
    }
   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String usuario = request.getParameter("usuario");
        String senha = request.getParameter("senha");
        HttpSession sessao = request.getSession(true);
        sessao.setAttribute("nome",usuario);
     
        if (usuario.equals("Pedro") && senha.equals("123456")) {
            response.sendRedirect("principal.jsp");
        } else {
            response.sendRedirect("cadastro.jsp");
        }
        
    }
    public void init() throws ServletException {
        
        super.init();
    }
}
