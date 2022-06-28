package model;

public class Pedidos {
    private int idPedidos;
    private int quantidade;
    private String formaPag;
    private Double valor;
    private int produtosId;
    private int usuariosId;

    public Pedidos() {
    }
    
    public Pedidos(int idPedidos, int quantidade, String formaPag, Double valor, int produtosId, int usuariosId) {
        this.idPedidos = idPedidos;
        this.quantidade = quantidade;
        this.formaPag = formaPag;
        this.valor = valor;
        this.produtosId = produtosId;
        this.usuariosId = usuariosId;
    }

    public Pedidos(int quantidade, String formaPag, Double valor, int produtosId, int usuariosId) {
        this.quantidade = quantidade;
        this.formaPag = formaPag;
        this.valor = valor;
        this.produtosId = produtosId;
        this.usuariosId = usuariosId;
    }
    
    public int getIdpedidos() {
        return idPedidos;
    }
    public void getIdpedidos(int idPedidos) {
        this.idPedidos = idPedidos;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void getQuantidade(int quantidade) {
        this.quantidade = quantidade;
    } 
    public String getFormaPag() {
        return formaPag;
    }
    public void getFormaPag(String formaPag) {
        this.formaPag = formaPag;
    }
    public Double getValor() {
        return valor;
    }
    public void getValor(Double valor) {
        this.valor = valor;
    }
    public int getProdutosid() {
        return produtosId;
    }
    public void getProdutosid(int produtosId) {
        this.produtosId = produtosId;
    }
     public int getUsuariosId() {
        return usuariosId;
    }
    public void getUsuariosId(int usuariosId) {
        this.usuariosId = usuariosId;
    }
}
