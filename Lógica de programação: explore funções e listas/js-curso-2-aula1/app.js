let numeroSecreto = geraNumeroAleatorio();
let tentativas = 1;

// APREDENDO A ECONOMIZAR LINHAS DE CÓDIGO

// let titulo = document.querySelector('h1');
// titulo.innerHTML = "Jogo do número secreto, Bruna";

// let primeiroParagrafo = document.querySelector('p');
// primeiroParagrafo.innerHTML = "Escolha um número entre 1 e 10";

function exibirMensageminicial(){
    exibirTextoNaTela("h1", "Jogo do número secreto");
    exibirTextoNaTela("p", "Escolha um número entre 1 e 10");
}

function exibirTextoNaTela (tag, texto) {
    let campo = document.querySelector(tag);
    campo.innerHTML = texto;
}

function limparCampo() {
    chute = document.querySelector("input");
    chute.value = "";
}

exibirMensageminicial();

function verificarChute() {
    let chute = document.querySelector("input").value;
    if(chute == numeroSecreto){
        exibirTextoNaTela("h1", `Acertou!!! O número secreto é ${numeroSecreto}`);
        let palavraTentativa = tentativas > 1 ? "tentativas" : "tentativa!";
        let mensagemTentativas = `Acertou com ${tentativas} ${palavraTentativa}`;
        exibirTextoNaTela("p", mensagemTentativas);
        document.getElementById("reiniciar").removeAttribute("disabled");
    } else {
        if(chute > numeroSecreto){
            exibirTextoNaTela("p", `O número secreto é menor que ${chute}`)
        } else {
            exibirTextoNaTela("p", `O número secreto é Maior que ${chute}`)
        }
        tentativas++;
        limparCampo();
    }
}

function geraNumeroAleatorio() {
    return parseInt(Math.random()*10 + 1);
}

function reiniciarJogo() {
    numeroSecreto = geraNumeroAleatorio();
    limparCampo();
    tentativas = 1;
    exibirMensageminicial();
    document.getElementById("reiniciar").setAttribute("disabled", true);
}