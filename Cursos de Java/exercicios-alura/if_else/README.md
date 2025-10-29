# **Curso Java: praticando IF - ELSE**

É hora de colocar o conhecimento em prática com uma série de atividades focadas no tema

## **VerificaParImpar**

Ana precisa identificar se um número é par ou ímpar para um jogo que está desenvolvendo. Para isso, deseja criar um programa que analisa se o número que ela definiu previamente é par ou ímpar.

Como você ajudaria Ana a escrever um programa que determine se um número é par ou ímpar e exiba o resultado corretamente?

Saída esperada:
```java
O número 8 é par.
```
Ou
```java
O número 7 é ímpar. 
```


## **VerificaAprovacao**

Julia é professora e precisa de um programa que ajude a **determinar se um aluno foi aprovado** na disciplina. A regra da escola é:

- O estudante é aprovado se média final é **maior ou igual** a 7.0.
- Se a média for **entre 5.0 e 6.9**, está de recuperação.
- Se for **abaixo de 5.0**, está reprovado.

Crie um programa que, a partir de uma variável `media`, exiba a situação do estudante conforme as regras da escola.

**Saída esperada:**

```java
O estudante teve média 8.2 e foi aprovado. 
```

Ou

```java
O estudante teve média 5.8 e está de recuperação.
```

Ou

```java
O estudante teve média 4.3 e foi reprovado.
```



## ValidaSenha

Jéssica trabalha no setor de TI de uma empresa e precisa garantir a segurança dos acessos ao sistema interno. Os funcionários utilizam uma senha fixa para acessar suas contas, e **o sistema deve verificar se a senha inserida está correta.**

Ajude Jéssica a criar um programa que, com base em **uma senha pré-definida, por exemplo: `123456`, verifique se o que o usuário digitou está correto ou não.** O programa deve comparar a tentativa com a senha correta e exibir se o acesso foi permitido ou negado.

**Saída esperada:**

```bash
Digite a senha: 123456 
Acesso permitido!
```

Ou

```bash
Digite a senha: 123 
Acesso negado! 
```



## ComparaNumeros

Pedro está aprendendo Java e se deparou com um problema: ele precisa criar um programa que compare dois números inteiros fornecidos pelo usuário e informe qual é o maior ou se são iguais. Mas, ele está com dificuldades para implementar a lógica de comparação e exibir o resultado corretamente.

Ajude Pedro a resolver esse problema! Crie um programa que solicite ao usuário **dois números inteiros**, compare-os e exiba uma mensagem indicando qual é o **maior ou se ambos são iguais**.

**Exemplo de entrada:**

```bash
Digite o primeiro número: 10 
Digite o segundo número: 25
```

**Saída esperada:**

```bash
O maior número é 25. 
```



## VerificaDesconto

Marcos trabalha em uma loja e precisa verificar se um cliente tem direito a um desconto de 10% em sua compra. O desconto é aplicado apenas se o valor da compra for **maior ou igual a R$ 100,00**. Para isso, ele quer um programa que **permita inserir o valor da compra** e **exiba se o desconto foi aplicado ou não**, juntamente com o novo valor após o desconto, caso aplicável.

Com base nesse cenário, crie um programa que receba o **valor da compra** e **exiba uma mensagem** informando se o desconto foi aplicado ou não.

**Exemplo de entrada:**

```bash
Digite o valor da compra: 120.0
```

**Saída esperada:**

```bash
Desconto de 10% aplicado. 
Novo valor: R$ 108.0 
```

Caso o valor da compra seja menor que R$ 100,00, o programa exibirá por exemplo:

```ruby
Nenhum desconto aplicado. 
Valor total: R$ 80.0 
```



## VerificaDiaUtil

Carlos trabalha em uma empresa de logística que opera apenas de segunda a sexta, sem atividades nos finais de semana. Para evitar confusões, ele precisa de um programa que, **ao receber um dia da semana, informe se é um dia útil ou não.**

Crie um programa que receba um **dia da semana** (em letras minúsculas) e **exiba uma mensagem** indicando se **é um dia útil ou não**.

**Exemplo de Entrada:**

```java
Digite o dia da semana (em letras minúsculas): quarta
```

**Saída esperada:**

```bash
Quarta é um dia útil. 
```



## VerificaIntervalo

Emerson trabalha em um banco e precisa verificar se um número digitado pelo cliente está dentro da faixa permitida de valores para um empréstimo, que vai de **1000 a 5000 reais.**

Crie um programa que **receba um valor** e exiba se ele está **dentro do intervalo permitido ou não**.

**Exemplo de entrada:**

```java
Digite o valor do empréstimo: 750
```

**Saída esperada:**

```java
O valor 750, não está dentro do intervalo permitido para empréstimo.
```



## VerificaTriangulo

Marcos está estudando geometria e precisa verificar se três lados podem formar um triângulo. Para que três lados formem um triângulo, **a soma de dois lados deve ser maior que o terceiro lado.** Ele quer um programa que receba três lados e exiba uma mensagem informando se os lados podem formar um triângulo ou não.

Com base nesse cenário, crie um programa que **receba três lados** e **exiba uma mensagem** informando se os lados podem formar um **triângulo ou não**.

**Exemplo de entrada:**

```java
Digite o primeiro lado: 3 
Digite o segundo lado: 4 
Digite o terceiro lado: 5 
```

**Saída esperada:**

```java
Os lados podem formar um triângulo. 
```



## VerificaSangue

Maria trabalha em um banco de sangue e precisa verificar se um doador é compatível para doar sangue. Para ser compatível, o doador deve atender aos seguintes critérios:

- Ter entre 18 e 65 anos.
- Pesar mais de 50 kg.

Ela deseja um programa que **receba a idade e o peso do doador e informe se ele é compatível para doar sangue**. Se não for, o programa deve indicar qual critério não foi atendido.

Como você criaria um programa que receba **a idade e o peso** do doador e exiba uma mensagem **indicando se ele é compatível ou não**, além de informar o critério não atendido, se for o caso?

**Exemplo de entrada:**

```java
Digite a idade do doador: 17 
Digite o peso do doador (em kg): 55
```

**Saída esperada:**

```bash
O doador não é compatível.  
Motivo: Deve ter entre 18 e 65 anos. 
```



## VerificaPermissao

João está desenvolvendo um sistema de segurança para uma empresa. Para acessar o sistema, o usuário precisa fornecer:

- Um código de acesso numérico (o código correto é 2023).
- Um nível de permissão numérico (os níveis válidos são 1, 2 ou 3).

O sistema só permitirá o acesso se:

- O código de acesso estiver correto.
- O nível de permissão for válido (1, 2 ou 3).

Caso contrário, o acesso será negado, e o programa deve informar o motivo (código incorreto, nível de permissão inválido ou ambos).

Crie um programa que receba o **código de acesso e o nível de permissão** e exiba uma mensagem indicando se o **acesso foi permitido ou negado**, além do **motivo**, se for o caso.

**Exemplo de entrada:**

```Java
Digite o código de acesso: 2023 
Digite o nível de permissão: 2 
```

**Saída esperada:**

```java
Acesso permitido. Bem-vindo ao sistema!
```

