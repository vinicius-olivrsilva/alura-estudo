let listaDeNumerosSorteados = [];
let numeroLimite = 7;
let numeroSecreto = geraNumeroAleatorio();
let tentativas = 1;

// APREDENDO A ECONOMIZAR LINHAS DE CÓDIGO

// let titulo = document.querySelector('h1');
// titulo.innerHTML = "Jogo do número secreto, Bruna";

// let primeiroParagrafo = document.querySelector('p');
// primeiroParagrafo.innerHTML = "Escolha um número entre 1 e 10";

function exibirMensageminicial(){
    exibirTextoNaTela("h1", "Jogo do número secreto");
    exibirTextoNaTela("p", `Escolha um número entre 1 e ${numeroLimite}`);
}

function exibirTextoNaTela (tag, texto) {
    let campo = document.querySelector(tag);
    campo.innerHTML = texto;
    responsiveVoice.speak(texto, 'Brazilian Portuguese Female', {rate: 1.2});
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
            exibirTextoNaTela("p", `O número secreto é maior que ${chute}`)
        }
        tentativas++;
        limparCampo();
    }
}

function geraNumeroAleatorio() {
    let numeroEscolhido = parseInt(Math.random() * numeroLimite + 1);
    let quantidadeDeElementosNaLista = listaDeNumerosSorteados.length;

    if (quantidadeDeElementosNaLista == numeroLimite) {
        listaDeNumerosSorteados = [];
    }

    if(listaDeNumerosSorteados.includes(numeroEscolhido)){
        return geraNumeroAleatorio();
    } else{
        listaDeNumerosSorteados.push(numeroEscolhido);
        console.log(listaDeNumerosSorteados);
        return numeroEscolhido;
    }
}

function reiniciarJogo() {
    numeroSecreto = geraNumeroAleatorio(); // gerar outro numero aleatorio
    limparCampo();  
    tentativas = 1;
    exibirMensageminicial();
    document.getElementById("reiniciar").setAttribute("disabled", true);
}