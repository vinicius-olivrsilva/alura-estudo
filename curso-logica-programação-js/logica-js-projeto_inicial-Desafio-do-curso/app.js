alert("Jogo do numero secreto");
let numeroMaximo = 75;
let numeroSecreto = parseInt(Math.random() * numeroMaximo + 1);
console.log(numeroSecreto);
let chute;
let tentativas = 1;

while(chute != numeroSecreto){
    chute = prompt (`Escolha um número entre 1 e ${numeroMaximo}`)

    if(numeroSecreto == chute) {
        break;
    } else {
        let maiorMenor = chute > numeroSecreto ? "menor" : "maior";
        alert(`O número secreto é ${maiorMenor} que ${chute}`);

        // if (chute > numeroSecreto){
        // alert(`O número secreto é menor que ${chute}`);
        // } else {
        // alert(`O número secreto é maior que ${chute}`);
        // }
        
        tentativas++;
    }
}

let palavraTentativa = tentativas > 1 ? "tentativas" : "tentativa";
alert(`Você acertou o número secreto ${numeroSecreto} com ${tentativas} ${palavraTentativa}`);

// if (tentativas > 1) {
//     alert(`Você acertou o número secreto ${numeroSecreto} com ${tentativas} tentativas`);
// } else {
//     alert(`Você acertou o número secreto ${numeroSecreto} com ${tentativas} tentativa`);
// }