alert("Jogo do numero secreto");
let numeroSecreto = 4;
console.log(numeroSecreto);
let chute;
let tentativas = 1;


while(chute != numeroSecreto){
    chute = prompt ("Escolha um número entre 1 e 10")

    if(numeroSecreto == chute) {
        alert(`Você acertou o número secreto ${numeroSecreto} com ${tentativas} tentativas`);
    } else {
        if (chute > numeroSecreto){
        alert(`O número secreto é menor que ${chute}`);
        } else {
        alert(`O número secreto é maior que ${chute}`);
        }
        tentativas++;
    }
}