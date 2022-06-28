/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Usuarios;
import static model.connection.Conexao.getConexao;

/**
 *
 * @author edna_
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
                int idUsuarios = rs.getInt("idUsuarios");
                String nome = rs.getString("nome");
                String cpf = rs.getString("cpf");
                String senha = rs.getString("senha");
                
                usuario.add(new Usuarios(idUsuarios, nome, cpf, senha));
            }
           
           
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
         return usuario;
    }
    
    public void inserirUsuario(Usuarios usuario) throws SQLException {

        String sql = "INSERT INTO usuarios (nome,cpf,senha) values (?,?,?)";
        PreparedStatement stmt = con.prepareStatement(sql);
        
        stmt.setString(1, usuario.getNome());
        stmt.setString(2, usuario.getCpf());
        stmt.setString(3, usuario.getSenha());
        stmt.executeUpdate();

    }
    
    public boolean atualizar(Usuarios usuario) throws SQLException {
        boolean linhaAtualizada;

        String sql = "UPDATE  usuarios SET nome=?,cpf=?,senha=? WHERE idUsuarios = ?";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setString(1, usuario.getNome());
        stmt.setString(2, usuario.getCpf());
        stmt.setString(3, usuario.getSenha());
        linhaAtualizada = stmt.executeUpdate() > 0;
        return linhaAtualizada;
    }

    public boolean apagar(int id) throws SQLException {
        boolean linhaApagada;
        String sql = "DELETE FROM usuarios  WHERE idUsuarios = ?";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setInt(1, id);
        linhaApagada = stmt.executeUpdate() > 0;
        return linhaApagada;
    }
    
    public Usuarios pesquisar(int id) throws SQLException {
        Usuarios usuario = null;
        String sql = "SELECT * FROM usuario WHERE idUsuarios = ?";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setInt(1, id);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            String nome = rs.getString("nome");
            String cpf = rs.getString("cpf");
            String senha = rs.getString("senha");
            usuario = new Usuarios(id, nome, cpf, senha);
        }

        return usuario;
    }
    
    public boolean validar(Usuarios usuario) throws SQLException {
        String sql = "SELECT * FROM usuario  WHERE cpf = ? and senha = ?";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setString(1, usuario.getCpf());
        stmt.setString(2, usuario.getSenha());
        ResultSet rs = stmt.executeQuery();
        return rs.first();
    }
}
