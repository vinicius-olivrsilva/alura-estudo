function calcularDescontoTotal(quantidadeJogos) {
    const precoUnitario = 50;
    let descontoPorJogo = 0;

    if (quantidadeJogos >= 10) {
        descontoPorJogo = precoUnitario * 0.20; // 20%
    } else if (quantidadeJogos >= 5) {
        descontoPorJogo = precoUnitario * 0.10; // 10%
    }

    let contador = 0;
    let descontoTotal = 0;

    while (contador < quantidadeJogos) {
        descontoTotal += descontoPorJogo;
        contador++;
    }

    console.log(`Desconto total: R$${descontoTotal.toFixed(2)}`);
    return descontoTotal;
}

// Exemplo de uso:
calcularDescontoTotal(7);  // Deve aplicar 10% de desconto por jogo
