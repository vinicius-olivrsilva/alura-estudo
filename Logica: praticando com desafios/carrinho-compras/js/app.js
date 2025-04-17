    let valorTotal = 0;
    limpar();

function adicionar() {
    // 1 - recuperar valores: nome, qauntidade, valor
    // 2 - calcular o preço, o subtotal
    // 3 - adicionar no carrinho
    // 4 - Atualiza o valor total

    // 1 - recuperar valores: nome, qauntidade, valor
    let produto = document.getElementById('produto').value;
    let nomeProduto = produto.split('-')[0];    // transforma em um array e eu escolhi a posição 0 "o que vem antes do - hífen"
    let valorUnitario = Number(produto.split('$')[1]);
    let quantidade = document.getElementById('quantidade').value;
    
    // 2 - calcular o preço, o subtotal
    let preco = valorUnitario * quantidade;
    console.log(preco);

    // 3 - adicionar no carrinho
    let carrinho = document.getElementById('lista-produtos');
    carrinho.innerHTML = carrinho.innerHTML + `<section class="carrinho__produtos__produto">
          <span class="texto-azul">${quantidade}x</span> ${nomeProduto} <span class="texto-azul">R$${preco},00</span>
        </section>`

    // 4 - Atualiza o valor total
    valorTotal = valorTotal + preco;
    let campoTotal = document.getElementById('valor-total');
    campoTotal.textContent = `R$ ${valorTotal}`
    document.getElementById('quantidade').value = '';
}


function limpar(){
    document.getElementById('lista-produtos').innerHTML = '';
    document.getElementById('valor-total').textContent = `R$ 0`;
    valorTotal = 0;
}