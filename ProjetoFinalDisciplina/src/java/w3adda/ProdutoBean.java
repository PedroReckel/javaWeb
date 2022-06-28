/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w3adda;

/**
 *
 * @author pedro
 */
public class ProdutoBean {
    
    private int codProduto;
    private String categoria, descricao, codImagem;
    private double preco;
    
    public int getCod() {
        return codProduto;
    }
    
    public void setCod(int cod) {
        this.codProduto = cod;
    }
    
    public String getCategoria() {
        return categoria;
    }
    
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    public String getDescricao() {
        return descricao;
    }
    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public String getCodImagem() {
        return codImagem;
    }
    
    public void setCodImagem(String codImagem) {
        this.codImagem = codImagem;
    }
    
    public double getPreco() {
        return preco;
    }
    
    public void setPreco(float preco) {
        this.preco = preco;
    }
    
}
