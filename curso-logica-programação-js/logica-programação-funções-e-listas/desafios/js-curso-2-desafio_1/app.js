let cabecalho = document.querySelector('h1');
cabecalho.innerHTML = "Hora do desafio";

function botaoConsole() {
    console.log("O botao foi clicado");
}

function botaoAlert() {
    alert("Eu amo aprender a programar");
}

function botaoPrompt() {
    let cidade = prompt("Digite o nome de uma cidade do Brasil");
    alert(`Estive em ${cidade} e lembrei de você`);
}

function botaoSoma() {
    alert("Digite dois números inteiros para fazer a soma: ");
    let primeiroNumero = Number(prompt("Primeiro número"));
    let segundoNumero = Number(prompt("Segundo número"));
    let soma = primeiroNumero + segundoNumero;
    alert(`${primeiroNumero} + ${segundoNumero} = ${soma}`);
}