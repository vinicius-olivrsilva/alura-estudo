
function alterarStatus(jogo){
    const item = document.getElementById(`game-${jogo}`);
    const imagem = item.querySelector('.dashboard__item__img');
    const botao = item.querySelector('.dashboard__item__button');

    const estaAlugado = botao.classList.contains('dashboard__item__button--return');

    if(estaAlugado) {
        botao.classList.remove('dashboard__item__button--return');
        botao.textContent = 'Alugar';
        imagem.classList.remove('dashboard__item__img--rented');
    } else {
        botao.classList.add('dashboard__item__button--return');
        botao.textContent = 'Devolver';
        imagem.classList.add('dashboard__item__img--rented');
    }
}