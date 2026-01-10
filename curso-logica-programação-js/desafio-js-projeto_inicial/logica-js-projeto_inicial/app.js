alert("Boas vindas ao nosso site!");

let nome = prompt("Qual o nome do usuário?");
let idade = prompt("Qual a sua idade?");
let numeroDeVendas = 50;
let saldoDisponivel = 1000;

let mensagemDeErro = "Erro! Preencha todos os campos";
alert (mensagemDeErro);

if (idade >= 18){
    alert(nome + " " + idade + " anos " + "pode tirar a habilitação!")
}