package model;

public class Produtos {
    private int idProdutos;
    private String categoria;
    private String descricao;
    private String codImagem;
    private Double preco;

    public Produtos() {
    }
    
    public Produtos(int idProdutos, String categoria, String descricao, String codImagem, Double preco) {
        this.idProdutos = idProdutos;
        this.categoria = categoria;
        this.descricao = descricao;
        this.codImagem = codImagem;
        this.preco = preco;
    }

    public Produtos(String categoria, String descricao, String codImagem, Double preco) {
        this.categoria = categoria;
        this.descricao = descricao;
        this.codImagem = codImagem;
        this.preco = preco;
    }
    
    public int getIdprodutos() {
        return idProdutos;
    }
    public void getIdprodutos(int idProdutos) {
        this.idProdutos = idProdutos;
    }
    public String getCategoria() {
        return categoria;
    }
    public void getCategoria(String categoria) {
        this.categoria = categoria;
    } 
    public String getDescricao() {
        return descricao;
    }
    public void getDescricao(String descricao) {
        this.descricao = descricao;
    }
    public String getCodimagem() {
        return codImagem;
    }
    public void getCodimagem(String codImagem) {
        this.codImagem = codImagem;
    }
    public Double getPreco() {
        return preco;
    }
    public void setPreco(Double preco) {
        this.preco = preco;
    }
}
