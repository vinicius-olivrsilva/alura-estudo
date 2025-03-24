function desafio(item, desafio){
    alert(`Desafio ${item} - ${desafio}`);
}

desafio(1, "Ola mundo no console");
function olaMundo(){
    console.log("Olá Mundo")
}
olaMundo();

desafio(2, "Exibe o nome no console");
function exibeNome(){
    let nome = prompt("Digite o nome");
    console.log(nome)
}
exibeNome();

desafio(3, "Dobra o numero digitado");
function dobroNum (numero) {
    return numero *2;
}
let numeroDobrado = prompt("Digite um numero");
console.log(dobroNum(numeroDobrado));

desafio(4, "Calcula a média de três números");
function mediaTresNumeros(num1, num2, num3) {
    return (num1 + num2 + num3) / 3
}
console.log(mediaTresNumeros(7, 8, 9));

desafio(5, "Qual o maior número");
function maiorMenor (num1, num2) {
    let maior = (num1 > num2) ? num1 : num2;
    return `O maior número entre ${num1} e ${num2} é ${maior}`
}
let primeiro = prompt("Digite dois numeros: o primeiro ");
let segundo = prompt("Digite dois numeros: o primeiro ");
console.log(maiorMenor(primeiro, segundo));

desafio(6, "Criar uma função que recebe um número como parâmetro e retorna o resultado da multiplicação desse número por ele mesmo")
function quadrado(numero) {
    return numero = numero * numero;
}
let multiplicacao = prompt("Digite um numero: ")
console.log(quadrado(multiplicacao));