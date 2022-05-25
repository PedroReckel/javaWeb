var modal = document.getElementById('id01');
var nome = document.getElementById('nome')
var senha = document.getElementById('senha')
var botao = document.getElementById('botao')
var idade = document.getElementById('idade')
var setor = document.getElementById('setor')

// Quando o usuário clicar em qualquer lugar fora do modal, ele fecha!
window.onclick = function(event) {
    if (event.target == modal) {
        modal.style.display = "none";
    }
}

botao.addEventListener("click", function(e) {
    e.preventDefault()
    const valorNome = nome.value
    const valorSenha = senha.value
    const valorIdade = idade.value
    const valorSetor = setor.value

    if (valorNome === "" || valorSenha === "" || valorIdade === "" || valorSetor === "") {
        alert(`Preencher todos os campos!`)
    } else if (valorIdade < 18) {
        alert(`Você é menor de 18 anos!`)
    } else if (valorNome.length < 5) {
        alert(`O nome tem que ter pelo menos 5 cararacteres`)
    }
})