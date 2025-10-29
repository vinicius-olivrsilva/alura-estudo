# **Curso -  Prática Java: Variáveis e tipos**

## **ConvertTemperatura** 
Você está desenvolvendo um sistema de monitoramento de temperatura para uma estufa de plantas. Você recebe os dados de temperatura em graus Celsius, mas precisa exibi-los em Fahrenheit para um relatório que será enviado para um cliente nos Estados Unidos.

Crie um programa que receba uma temperatura em graus Celsius (int) e exiba a temperatura convertida em graus Fahrenheit (double). A fórmula para conversão é:
Fahrenheit = (Celsius * 9 / 5) + 32

Exemplo de entrada: int celsius = 20;

Saída esperada: A temperatura em graus Fahrenheit é: 68.0

## **CadastraLivros**

Você está iniciando suas atividades como pessoa desenvolvedora e foi designado para criar um programa de cadastro de livros que será escolhida através de um único caractere. O sistema armazenar em variáveis:

Título
Autor
Número de páginas
Preço de um livro
Categoria do livro As categorias disponíveis são:
F - Ficção
N - Não-ficção
T - Tecnologia
H - História
Escreva um programa que armazene em variáveis as informações de um livro e com base na categoria armazenada exiba uma mensagem de confirmação de acordo com o que foi escolhido.

Exemplo de entrada:
char categoria = 'F';

Saída esperada:
Livro cadastrado: "O Pequeno Príncipe", de Antoine de Saint-Exupéry. Ele possui 96 páginas, custa R$39,9 e pertence à categoria Ficção.

## **Primitivos**
Você está desenvolvendo um aplicativo que calcula a média de notas dos alunos. Para isso, você precisa armazenar as notas em variáveis do tipo double. Você decide criar três variáveis chamadas nota1, nota2 e nota3, e atribuir a elas os valores 7.5, 8.0 e 9.0, respectivamente e em seguida, calcular a média e exibi-la na tela.

Para resolver essa tarefa, você deve criar um programa que:

Declare as variáveis nota1, nota2 e nota3
Atribua os valores mencionados.
Calcule a média das notas.
Imprima o resultado na tela. Saída esperada:

## **ClassificaCategoria**
Você trabalha em um e-commerce e precisa classificar os produtos em diferentes categorias com base no preço.

Escreva um programa que classifique um produto em uma categoria com base em um preço e exiba a categoria correspondente, conforme as seguintes regras:

Econômico: preço até R\$ 50,00.

Intermediário: preço entre R\$ 50,01 e R\$ 200,00.

Premium: preço acima de R\$ 200,00. Exemplo de entrada:

double preco = 150.00;

Saída esperada:

Categoria do produto: Intermediário

## **ParOuImpar**

Você está desenvolvendo um jogo e quer um programa que determine se um número é par ou ímpar.

Escreva um programa que classifique um número e exiba uma mensagem informando se o número é par ou ímpar.

Exemplo de entrada:

int numero = 7;

Saída esperada:

O número é ímpar.

## **ConversorMoeda**

Você está organizando uma viagem internacional e precisa converter uma quantia em reais (R$) para dólares americanos (US$) com base na taxa de câmbio atual. A taxa utilizada no momento é de R$ 5,25 para cada US$ 1.

Crie um programa que realize a conversão para dólares usando a taxa de câmbio e exiba o valor convertido.

Exemplo de entrada:

double valorReais = 451.50;

## **DebugIdade**

Você está desenvolvendo um programa que precisa verificar se uma pessoa é maior de idade ou não. O programa deve exibir uma mensagem informando se a pessoa pode ou não acessar um determinado conteúdo restrito. No entanto, você cometeu um erro ao implementar a lógica de verificação e precisa corrigir isso.

Sua tarefa é:

Identificar e corrigir o erro de escopo de variáveis no código.
Garantir que o programa exiba a mensagem correta com base na idade da pessoa, no código abaixo a saída será Você é menor de idade.
Código para ser corrigido:
```java
public class Main {
public static void main(String[] args) {
if (idade >= 18) {
int idade = 17;
String mensagem = "Você é maior de idade.";
} else {
String mensagem = "Você é menor de idade.";
}
        System.out.println(mensagem);
    }
}
```

## **Viagem**
Você está planejando uma viagem de carro e deseja calcular quantos quilômetros poderá percorrer com o combustível disponível no tanque. Para isso, você precisa considerar:

O consumo médio do veículo (km/l)
A capacidade total do tanque de combustível (litros)
A quantidade de combustível disponível no momento (litros)
A distância da viagem planejada (km)
Com essas informações, o programa deverá calcular:

A autonomia máxima do carro (quantos quilômetros pode percorrer com um tanque cheio).
A autonomia atual, baseada na quantidade de combustível disponível.
Se a quantidade de combustível atual será suficiente para percorrer um determinado trajeto informado pelo usuário.
Fórmulas de apoio:

autonomia maxima=consumo medio×capacidade do tanque

autonomia atual=consumo medio×combustıvel disponivel

Exemplo de entrada:
```
double consumoMedio = 12.5; // O carro faz 12,5 km por litro
double capacidadeTanque = 50; // O tanque tem capacidade para 50 litros
double combustivelAtual = 20; // Há 20 litros disponíveis
double distanciaViagem = 200; // A viagem planejada tem 200 km
```
Saída esperada:
```
Autonomia máxima do veículo: 625.0 km
Autonomia atual: 250.0 km
Você conseguirá completar a viagem sem precisar abastecer.
``` 