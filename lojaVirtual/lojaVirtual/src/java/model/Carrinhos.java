package model;

public class Carrinhos {
    private int idCarrinhos;
    private int quantidade;
    private int produtosId;
    private int usuariosId;

    public Carrinhos() {
    }
    
    public Carrinhos(int idCarrinhos, int quantidade, int produtosId, int usuariosId) {
        this.idCarrinhos = idCarrinhos;
        this.quantidade = quantidade;
        this.produtosId = produtosId;
        this.usuariosId = usuariosId;
    }

    public Carrinhos(int quantidade, int produtosId, int usuariosId) {
        this.quantidade = quantidade;
        this.produtosId = produtosId;
        this.usuariosId = usuariosId;
    }
    
    public int getIdcarrinhos() {
        return idCarrinhos;
    }
    public void getIdcarrinhos(int idCarrinhos) {
        this.idCarrinhos = idCarrinhos;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void getQuantidade(int quantidade) {
        this.quantidade = quantidade;
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
