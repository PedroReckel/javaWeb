let qtd = document.getElementById('qtdButton');
let botao = document.getElementById('btnComprar');

botao.addEventListener("click", function(e) {
    e.preventDefault();
    const valorQtd = qtd.value;

    if (valorQtd === "") {
        alert('Preencher o campo quantidade!');
    } else {
        alert('Produto comprado!');
    }
});