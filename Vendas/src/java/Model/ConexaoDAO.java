/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author pedro
 */
public class conexaoDAO {
    public Station Connection getConexao() throws SQLException {
        try {
            String url = "jdbc:mysql://localhost/vendas"
            Class.forName("com.mysql.jdbc.Driver");
            return DriverManager.getConnetion(url, "root", "");
        } catch (ClassNotFoundException ErroSQL) {
            throw new RumtimeException("ERRO NO BANCO DE DADOS, PROCURE 0 ADMINISTRADOR" + ErroSQL);
        }
    }
}
