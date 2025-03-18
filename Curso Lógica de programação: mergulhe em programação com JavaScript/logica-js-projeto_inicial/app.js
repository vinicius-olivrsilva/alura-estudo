alert("Jogo do numero secreto");
let numeroSecreto = 4;
console.log(numeroSecreto);
let chute = prompt ("Escolha um número entre 1 e 10");


if(numeroSecreto == chute) {
    alert(`Acertou! O numero secreto é ${numeroSecreto}`);
} else {
    alert("Vocẽ errou!")
}