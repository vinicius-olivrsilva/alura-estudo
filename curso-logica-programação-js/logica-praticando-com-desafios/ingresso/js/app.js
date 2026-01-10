 // Selecionar qual tipo no input
 // acessar e armazenar quantidade
 // realizar método ao clicar no botao Comprar
 // exibir a quantidade de ingressos restantes

 function comprar(){
    const tipoIngresso = document.getElementById('tipo-ingresso').value;
    const idConcatenado = `qtd-${tipoIngresso}`;
    let quantidadeDisponivel = Number(document.getElementById(idConcatenado).textContent);
    let quantidadeComprada = document.getElementById('qtd').value;

     if(quantidadeComprada > 0) {
        if (quantidadeComprada <= quantidadeDisponivel) {
            if (quantidadeDisponivel > 0){
                quantidadeDisponivel = quantidadeDisponivel - quantidadeComprada;
                document.getElementById(idConcatenado).textContent = quantidadeDisponivel;
                alert("INGRESSO COMPRADO COM SUCESSO!");
           } else {
               alert (`INFELIZMENTE NÃO TEMOS INGRESSOS SUFICIENTES`);
            }
        } else {
            alert ("Está tentando comprar mais ingresso que temos disponiveis");
        }  
     } else {
        alert ("QUANTIDADE DE COMPRA NEGATIVA - TENTE NOVAMENTE!");
     }
     
    document.getElementById('qtd').value = '';
 }