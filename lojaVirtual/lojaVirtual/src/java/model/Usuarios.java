package model;

public class Usuarios {
    private int idUsuarios;
    private String nome;
    private String cpf;
    private String senha;

    public Usuarios() {
    }
    
    public Usuarios(int idUsuarios, String nome, String cpf, String senha) {
        this.idUsuarios = idUsuarios;
        this.nome = nome;
        this.cpf = cpf;
        this.senha = senha;
    }

    public Usuarios(String nome, String cpf, String senha) {
        this.nome = nome;
        this.cpf = cpf;
        this.senha = senha;
    }
    
    public int getIdsuarios() {
        return idUsuarios;
    }
    public void setIdusuarios(int idUsuarios) {
        this.idUsuarios = idUsuarios;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void getCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
}
