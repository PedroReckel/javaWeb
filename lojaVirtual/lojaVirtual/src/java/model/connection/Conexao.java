/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Patrick
 */
public class Conexao {
    
    public static Connection getConexao() throws SQLException {
    try {
           String url = "jdbc:mysql://127.0.0.1:3306/lojavirtual";
           Class.forName("com.mysql.jdbc.Driver");
           return DriverManager.getConnection(url ,"root","1234");
            
        } catch (ClassNotFoundException  ErroSQL) {
            throw new RuntimeException("ERRO NO BANCO DE DADOS, PROCURE O ADMINISTRADOR"+ErroSQL);
         
        }
    }
    
}
