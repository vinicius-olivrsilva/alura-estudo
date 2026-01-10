function sortear() {
    let quantidade = parseInt(document.getElementById("quantidade").value);
    let minimo = parseInt(document.getElementById("de").value);
    let maximo = parseInt(document.getElementById("ate").value);

    let listaSorteados = [];
    let numero;

    for (let i = 0; i < quantidade; i++) {
        numero = obterNumeroAleatorio(minimo, maximo);

        while(listaSorteados.includes(numero)) {
            numero = obterNumeroAleatorio(minimo, maximo);
        }
        listaSorteados.push(numero);
    }

    let resultados = document.getElementById('resultado');
    resultados.innerHTML = `<label class="texto__paragrafo">Números sorteados: ${listaSorteados}</label>`;
    alterarStatusBotao();

    console.log(listaSorteados);
}

function obterNumeroAleatorio(min, max){
    return Math.floor(Math.random() * (max - min + 1 ) + min)
}

function alterarStatusBotao() {
    let botao = document.getElementById("btn-reiniciar");
    if (botao.classList.contains("container__botao-desabilitado")) {
        botao.classList.remove("container__botao-desabilitado");
        botao.classList.add("container__botao");
    } else {
        botao.classList.remove("container__botao");
        botao.classList.add("container__botao-desabilitado");
    }
}

function reiniciar(){
    limparCampo('quantidade');
    limparCampo('de');
    limparCampo('ate');
    document.getElementById('resultado').innerHTML = '<label class="texto__paragrafo">Números sorteados:  nenhum até agora</label>';
    alterarStatusBotao();
}

function limparCampo(tag){
    return document.getElementById(tag).value = '';
}