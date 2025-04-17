let listaAmigos = [];

function adicionar(){
    const elementoNome = document.getElementById('nome-amigo');
    const nome = elementoNome.value;
    let amigos = document.getElementById('lista-amigos');

    listaAmigos.push(nome);
    amigos.textContent = listaAmigos;

    elementoNome.value = '';
}

function sortear(){
    embaralha(listaAmigos);
    let sorteio = document.getElementById('lista-sorteio');
    for(let i = 0;  i < listaAmigos.length; i++) {
        if (i == listaAmigos.length - 1) {
            sorteio.innerHTML = sorteio.innerHTML + listaAmigos[i] + ' --> ' + listaAmigos[0] + '<br>';
        } else {
            sorteio.innerHTML = sorteio.innerHTML + listaAmigos[i] + ' --> ' + listaAmigos[i + 1] + '<br>';
        }
    }
}

function embaralha(lista) {
    for (let indice = lista.length; indice; indice--) {

        const indiceAleatorio = Math.floor(Math.random() * indice);

        // atribuição via destructuring
        [lista[indice - 1], lista[indiceAleatorio]] = 
            [lista[indiceAleatorio], lista[indice - 1]];
    }
}

function reiniciar() {
    listaAmigos = [];
    // esvaziar a lista na pagina HTML
    document.getElementById('lista-amigos').innerHTML = '';
    // limpar nomes sorteados
    document.getElementById('lista-sorteio').innerHTML = '';
}