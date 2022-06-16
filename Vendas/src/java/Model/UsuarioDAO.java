/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import static model.ConexaoDAO.getConexao;

/**
 *
 * @author pedro
 */
public class UsuarioDAO {
    Connection con;

    public UsuarioDAO()  {
        try {
            this.con = getConexao();
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<Usuarios> listar()  {
        List<Usuarios> usuario = new ArrayList<>();
        try {
           
            
            String sql = "SELECT * FROM usuarios";
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                int idusuario = rs.getInt("idusuario");
                String nome = rs.getString("nome");
                String login = rs.getString("login");
                String senha = rs.getString("senha");
                String perfil = rs.getString("perfil");
                
                usuario.add(new Usuarios(idusuario, nome, login, senha, perfil));
            }
            
           
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
         return usuario;
    }
    
    public void inserirUsuario(Usuarios usuario) throws SQLException {

        String sql = "INSERT INTO usuarios (nome,login,senha, perfil) values (?,?,?,?)";
        PreparedStatement stmt = con.prepareStatement(sql);
        
        stmt.setString(1, usuario.getNome());
        stmt.setString(2, usuario.getLogin());
        stmt.setString(3, usuario.getSenha());
        stmt.setString(4, usuario.getPerfil());
        stmt.executeUpdate();

    }
    
    public boolean atualizar(Usuarios usuario) throws SQLException {
        boolean linhaAtualizada;

        String sql = "UPDATE  usuarios SET nome=?,login=?,senha=?, perfil=? WHERE idusuario = ?";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setString(1, usuario.getNome());
        stmt.setString(2, usuario.getLogin());
        stmt.setString(3, usuario.getSenha());
        stmt.setString(4, usuario.getPerfil());
        stmt.setInt(5, usuario.getIdusuario());
        linhaAtualizada = stmt.executeUpdate() > 0;
        return linhaAtualizada;
    }

    public boolean apagar(int id) throws SQLException {
        boolean linhaApagada;
        String sql = "DELETE FROM usuarios  WHERE idusuario = ?";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setInt(1, id);
        linhaApagada = stmt.executeUpdate() > 0;
        return linhaApagada;
    }
    
    public Usuarios pesquisar(int id) throws SQLException {
        Usuarios usuario = null;
        String sql = "SELECT * FROM usuario  WHERE idusuario = ?";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setInt(1, id);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            String nome = rs.getString("nome");
            String login = rs.getString("login");
            String senha = rs.getString("senha");
            String perfil = rs.getString("perfil");
            usuario = new Usuarios(id, nome, login, senha, perfil);
        }

        return usuario;
    }
    
    public boolean validar(Usuarios usuario) throws SQLException {
        String sql = "SELECT * FROM usuario  WHERE login = ? and senha = ?";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setString(1, usuario.getLogin());
        stmt.setString(2, usuario.getSenha());
        ResultSet rs = stmt.executeQuery();
        if (rs.first()) {
           return true;
        }

        return false;
    }
}

