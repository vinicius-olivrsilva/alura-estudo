alert("Desafio 1")

let diaSemana = prompt("Qual o dia da semana?")

if (diaSemana == "Sábado" || diaSemana == "Domingo") {
    alert("Bom fim de semana!")
} else {
    alert("Boa semana!")
}

alert("Desafio 2")
let numeroParOuImpar = prompt("Digite um numero");
if (numeroParOuImpar % 2 == 0) {
    alert("O número digitado é par") 
} else {
    alert("O número digitado é impar")
}

alert("Desafio 3")
let pontuaçãoJogo = prompt("Digite a pontuação do jogo")
if (pontuaçãoJogo >= 100) {
    alert("Parabéns, você venceu!")
} else {
    alert("Tente novamente para ganhar.")
}

alert("Desafio 4 - Saldo da Conta")
let saldo = 110.97;
alert(`Seu saldo da conta é: R$ ${saldo} reais`)

alert("Desafio 5")
let nomePessoa = prompt("Digite seu nome")
alert("Bem vindo(a) " + nomePessoa)