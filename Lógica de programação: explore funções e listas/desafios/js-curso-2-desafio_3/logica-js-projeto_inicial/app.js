function desafio(qtd, descricao){
    alert(`Desafio - ${qtd} - ${descricao}`)
}
//============= Desafios =====================
desafio(1, "Calcular o IMC")
    let altura = Number(prompt("Digite sua altura em metros").replace(",", "."));
    let peso = Number(prompt("Digite seu peso em Kg"));
function calculaIMC(){
    let IMC = peso / (altura * altura)
    return IMC; 
}
console.log(calculaIMC(altura, peso));

desafio(2, "fatorial")
let numeroFatorial = parseInt(prompt("Digite o numero para calcular o fatorial"));
function calculaFatorial(numeroFatorial) {
    let multiplicacao = 1;
    while(numeroFatorial > 1){
        multiplicacao = multiplicacao * numeroFatorial;
        numeroFatorial--;
    }
    return multiplicacao;
}
console.log("O fatorial é: " + calculaFatorial(numeroFatorial));

desafio(3, "Conversor")
let valorEmDolar = Number(prompt("Digite o valor em dolares").replace(",", "."));
function conversor(valorEmDolar){
    let valorEmReais = valorEmDolar * 5.76;
    return valorEmReais;
}
let valorEmReais = conversor(valorEmDolar);
console.log(`${valorEmDolar} dolares são R$ ${valorEmReais.toFixed(2)} reais`)

let formatado = new Intl.NumberFormat("pt-BR", {
    style: "currency",
    currency: "BRL"
}).format(valorEmReais);
console.log(formatado)

desafio(4, "mostre na tela a área e o perímetro de uma sala retangular")
let alturaRet = prompt("Digite a altura");
let largura = prompt("Digite a largura");
function calculaRetangulo(altura, largura){
    let area = altura * largura;
    let perimetro = (altura * 2) + (largura * 2);
    console.log("A área do retangulo é: " + area + " m²");
    console.log("O perimetro do retangulo é: " + perimetro + " metros");
}
calculaRetangulo(alturaRet, largura);

desafio(5, "calcular área e merimetro de uma sala circular")
let raio = Number(prompt("Digite o valor do raio da sala circular"))

function calculaCirculo (raio) {
    let PI = 3.14;
    let areaCirculo = PI * (raio*raio);
    let perimetroCirculo = 2 * PI * raio;

    console.log("A área do circulo é: " + areaCirculo + " m²");
    console.log("O perimetro do circulo é: " + perimetroCirculo + " metros");
}
calculaCirculo(raio);

desafio(6, "Mostra tabuada de um numero")
let numeroTabuada = Number(prompt("Digite qual numero voce deseja a tabuada: "));

function tabuada(numeroTabuada){
    console.log("TABUADA DO " + numeroTabuada)
    let contTab = 1
    while (contTab < 10) {
        let multTabuada = numeroTabuada * contTab;
        console.log(` ${numeroTabuada} x ${contTab} = ${multTabuada}`)
        contTab++;
    }
}

tabuada(numeroTabuada);