/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w3adda;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pedro 
*/
public class ProdutoDAO {
    
    public static Connection getConnection() {
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/lojavirtual", "root", "");
        } catch (Exception e) {
            System.out.println(e);
        }
        return con;
    }
    
    public static int save(ProdutoBean u) {
        int status = 0;
        try {
            Connection con = getConnection();
            PreparedStatement ps = con.prepareStatement("insert into produtos(categoria,descricao,codImagem,preco) values(?,?,?,?)");
            ps.setString(1, u.getCategoria());
            ps.setString(2, u.getDescricao());
            ps.setString(3, u.getCodImagem());
            ps.setDouble(6,  u.getPreco());
            status = ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
        return status;
    }
    
    public static int update(ProdutoBean u) {
        int status = 0;
        try {
            Connection con = getConnection();
            PreparedStatement ps = con.prepareStatement("update produtos set categoria=?,descricao=?,=?,codImagem=?,preco=? where codProduto=?");
            ps.setString(1, u.getCategoria());
            ps.setString(2, u.getDescricao());
            ps.setString(3, u.getCodImagem());
            ps.setDouble(5, u.getPreco());
            ps.setInt(7, u.getCod());
            status = ps.executeUpdate();
        } catch (Exception e ) {
            System.out.println(e);
        }
        return status;
    }
    
    public static int delete(ProdutoBean u) {
        int status = 0;
        try {
            Connection con = getConnection();
            PreparedStatement ps = con.prepareStatement("delete from produtos where codProduto=?");
            ps.setInt(1, u.getCod());
            status = ps.executeUpdate();
        } catch (Exception e) {
            System.out.println();
        }
        return status;
    }
     
    public static List<ProdutoBean> getAllRecords() {
        List<ProdutoBean> list = new ArrayList<ProdutoBean>();
 
        try {
            Connection con = getConnection();
            PreparedStatement ps = con.prepareStatement("select * from produtos");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                ProdutoBean u = new ProdutoBean();
                u.setCod(rs.getInt("codProduto"));
                u.setCategoria(rs.getString("categoria"));
                u.setDescricao(rs.getString("descricao"));
                u.setCodImagem(rs.getString("codImagem"));
                u.setPreco((float) rs.getDouble("preco"));  // u.setPreco(rs.getDouble("preco"));
                list.add(u);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return list;
    }
    
    public static ProdutoBean getRecordById(int id) {
        ProdutoBean u = null;
        try {
            Connection con = getConnection();
            PreparedStatement ps = con.prepareStatement("select * from produtos where codProduto=?");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                u = new ProdutoBean();
                u.setCod(rs.getInt("codProduto"));
                u.setCategoria(rs.getString("categoria"));
                u.setDescricao(rs.getString("descricao"));
                u.setCodImagem(rs.getString("codImagem"));
                u.setPreco(rs.getFloat("preco"));
            }
        } catch (Exception e) {
            System.out.print(e);
        }
        return u;
    }
    
    public static List<ProdutoBean> getRecords(int start, int total) {
        List<ProdutoBean> list = new ArrayList<ProdutoBean>();
        try {
            Connection con = getConnection();
            PreparedStatement ps = con.prepareStatement(
                    "select * from produtos limit " + (start - 1) + "," + total);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                ProdutoBean e = new ProdutoBean();
                e.setCod(rs.getInt(1));
                e.setCategoria(rs.getString(2));
                e.setPreco((float) rs.getDouble(7));  //e.setPreco(rs.getFloat(7));
                list.add(e);
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return list;
    }
}