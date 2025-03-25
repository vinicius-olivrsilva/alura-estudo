let numeroDesafio = 1;
function exibeDesafio(texto){
    console.log(`Desafio ${numeroDesafio} - ${texto}`)
    numeroDesafio++;
}

function exibeLista(lista) {
    console.log(lista)
}

exibeDesafio("Criar lista vazia")
var listaGenerica = [];
exibeLista(listaGenerica)

exibeDesafio("criar lista linguagensDeProgramacao")
var linguagensDeProgramacao = ["Javascript", "C", "C++", "Kotlin", "Python"]
exibeLista(linguagensDeProgramacao)

linguagensDeProgramacao.push("Java", "Ruby", "Golang");

exibeLista(linguagensDeProgramacao)

console.log("=========================================")
exibeLista(linguagensDeProgramacao[0])
exibeLista(linguagensDeProgramacao[2])
exibeLista(linguagensDeProgramacao[7])

