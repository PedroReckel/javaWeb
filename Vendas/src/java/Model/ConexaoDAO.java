/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author pedro
 */
public class ConexaoDAO {
    public static Connection getConexao() throws SQLException {
        try{
            String url = "jdbc:mysql:localhost/dbvendas";
            Class.forName("com.mysql.jdbc.Driver");
            return DriverManager.getConnection(url, "root", "");
        } catch (ClassNotFoundException ErroSQL) {
            throw new RuntimeException("ERRO NO BANCO DE DADOS, PROCURE O ADMINISTRADOR" + ErroSQL);
        }
    }
}
