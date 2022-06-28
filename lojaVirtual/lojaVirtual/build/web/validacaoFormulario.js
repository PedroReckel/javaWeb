let cpf = document.getElementById("cpf");
let nome = document.getElementById("nome");
let senha = document.getElementById("senha");
let btnEnviar = document.getElementById("btnEnviar");

btnEnviar.addEventListener("click", function(e) {
    e.preventDefault();
    const valorCpf = cpf.value;
    const valorNome = nome.value;
    const valorSenha = senha.value;

    if (valorCpf === "" || valorNome === "" || valorSenha === "") {
        alert('Preencher todos os campos!');
    }
});