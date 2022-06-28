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
public class ClienteBean {
    
    private int codCliente;
    private String cpf, nome, endereco;
    private int datanascimento;
    
    public int getCodCliente() {
        return codCliente;
    }
    
    public void setCodCliente(int cod) {
        this.codCliente = cod;
    }
    
    public String getCpf() {
        return cpf;
    }
    
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getEndereco() {
        return endereco;
    }
    
    public void setCodImagem(String endereco) {
        this.endereco = endereco;
    }
    
    public int getNascimento() {
        return datanascimento;
    }
    
    public void setNascimento(int nascimento) {
        this.datanascimento = nascimento;
    }
    
}
