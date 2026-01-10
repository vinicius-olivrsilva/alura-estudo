let listaAmigos = [];

function adicionar(){
    const elementoNome = document.getElementById('nome-amigo'); // Coleta o nome digitado no input
    const nome = elementoNome.value;                            // Adicina o nome em uma variável
    let amigos = document.getElementById('lista-amigos'); 
    
    if (nome == '') {
        alert('Informe o nome do amigo!');
        return;
    }
    
    if (listaAmigos.includes(nome)) {
        alert('Nome já adicionado!');
        return;
    }

    listaAmigos.push(nome);                     // Adiciona o nome na lista de amigos
    amigos.textContent = listaAmigos;           // ao mesmo tempo adicionando o nome no label da tela

    elementoNome.value = '';                    // limpa o input para recever outro nome
}

function sortear(){
    if (listaAmigos.length < 4) {
        alert("Adicione pelo menos 4 amigos!")
        return;
    }
    embaralha(listaAmigos);                     // função que embaralha os nomes dentro da lista (embalhara a ordem de indices do array)
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