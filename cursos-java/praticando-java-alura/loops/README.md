# Curso Praticando Java: laços for e while

## ContagemDegraus

Carla começou a praticar trilha e deseja saber quantos degraus precisará subir para chegar ao topo de uma escadaria. Ela sobe um degrau por vez e quer um programa que mostre sua subida até o topo. Sua tarefa é criar um programa que receba um número e simule a subida da escadaria.

Exemplo de entrada:
```java
Digite a quantidade de degraus: 5
```
Saída esperada:
```java
Subindo o degrau 1
Subindo o degrau 2
Subindo o degrau 3
Subindo o degrau 4
Subindo o degrau 5
Você chegou ao topo!
```



## Soma números

João recebeu uma lista de valores representando as receitas de sua loja de roupas. Ele quer calcular a soma total dessas receitas para entender o desempenho financeiro semanal.

```bash
int[] valores = {10, 20, 30, 40, 50}
```

Crie um programa que ajude João a calcular o valor total.

**Saída esperada:**

```bash
A soma total das receitas é: 150
```



## SomaPares

Maria quer calcular a soma de todos os números pares de 1 a 100. Ela decidiu usar um loop para iterar pelos números e somar apenas aqueles divisíveis por 2. Crie um programa que realize essa tarefa.

**Saída esperada:**

```bash
A soma dos números pares de 1 a 100 é: 2550
```



## CalculadoraFatorial

Pedro quer calcular o fatorial de um número. O fatorial de um número é o produto de todos os números inteiros positivos de 1 até o próprio número. Por exemplo, o fatorial de 5 é `5 × 4 × 3 × 2 × 1 = 120`. Crie um programa que receba um número e calcule seu fatorial.

**Exemplo de entrada:**

```bash
Digite um número: 5
```

**Saída esperada:**

```bash
O fatorial de 5 é: 120
```



## EncontreOMaior

Carlos tem uma lista de números e quer descobrir qual é o maior valor. Para isso, ele decidiu percorrer a lista comparando cada número com o maior encontrado até o momento. Crie um programa que receba uma lista de números e encontre o maior número.

**Exemplo de entrada:**

```bash
Digite os números separados por espaço: 3 7 2 9 5
```

**Saída esperada:**

```bash
O maior número é: 9
```



## MonitorandoLogins

Leonardo trabalha no setor de segurança de um sistema bancário e precisa garantir que os usuários tenham um número limitado de tentativas para inserir a senha corretamente. **Se o usuário errar a senha 3 vezes seguidas, sua conta deve ser bloqueada temporariamente.**

Com base nesse cenário, crie um programa que **peça uma senha ao usuário e permita até 3 tentativas** de erro antes de bloquear o acesso. Se o usuário digitar corretamente antes disso, o sistema deve conceder o acesso imediatamente.

**Exemplo de entrada:**

```java
Digite sua senha: 1234
```

**Saída esperada:**

```java
Senha Correta! Acesso concedido!
```

ou

**Exemplo de entrada:**

```java
Digite sua senha: 1111  
Senha incorreta. Você tem 2 tentativas restantes.  
Digite sua senha: 2222  
Senha incorreta. Você tem 1 tentativa restante.  
Digite sua senha: 3333
Copiar código
```

**Saída esperada:**

```Java
Conta bloqueada temporariamente.
```





## NomeValido

Um sistema de cadastro exige que os usuários informem um nome válido. No entanto, alguns usuários tentam deixar o campo em branco ou inserir nomes muito curtos. O sistema precisa garantir que o nome tenha pelo menos 3 caracteres antes de prosseguir com o cadastro.

Com base nesse cenário, crie um programa que **continue pedindo um nome** até que o usuário **insira um valor válido com pelo menos 3 caracteres**.

**Exemplo de entrada:**

```java
Digite seu nome:  
Nome inválido. Digite novamente.  
Digite seu nome: A  
Nome inválido. Digite novamente.  
Digite seu nome: Ana
```

**Saída esperada:**

```java
Nome "Ana" cadastrado com sucesso!
```



## ContandoPositivosNegativos

Ana é professora de matemática e está sempre curiosa sobre as respostas de seus alunos. Hoje, ela propôs um exercício no qual os alunos devem contar **quantos números positivos e negativos existem em uma sequência de números fornecida por ela.**

Ela quer que os alunos criem um programa que permita **inserir vários números, um por vez, e que pare quando o número "fim" for digitado. **

**Exemplo de entrada:**

```java
Digite um número (ou 'fim' para encerrar): 3
Digite um número (ou 'fim' para encerrar): -1
Digite um número (ou 'fim' para encerrar): 7
Digite um número (ou 'fim' para encerrar): fim
```

**Saída esperada:**

```java
Números positivos: 2
Números negativos: 1
```



## PulandoNumeros

Gustavo está desenvolvendo um jogo educativo de matemática e deseja um sistema que exiba os números de 1 até um valor definido pelo usuário, ignorando aqueles que terminam em 5. Essa mecânica tem o objetivo de tornar o jogo mais desafiador e imprevisível.

Com base nesse cenário, crie um programa que **conte de 1 até um número digitado** pelo usuário, mas **ignore números terminados em 5**.

**Dica:** Para saber se um número termina em 5, sempre dividimos ele por 10 e verificamos o **resto da divisão**. Se o resto for 5, significa que o número termina em 5.

**Exemplo de entrada:**

```java
Digite um número: 20
```

**Saída esperada:**

```java
1 2 3 4 6 7 8 9 10 11 12 13 14 16 17 18 19 20
```



## SistemControlAcess

Maria está preparando um evento de aniversário e quer organizar a lista de convidados. Ela precisa de um sistema que:

- Exiba a lista de convidados já cadastrados caso o usuário digite "ver".
- Adicione novos nomes à lista, caso o nome não esteja lá.
- Caso o nome já esteja na lista, o programa deve informar que o nome já foi registrado.
- O programa deve permitir que Maria continue a adicionar nomes até ela digitar "sair".

Ajude Maria e faça o código para este sistema.

**Saída esperada:**

```Java
Digite o nome do convidado (ou 'ver' para visualizar a lista, 'sair' para terminar): Ana
Ana foi adicionado à lista de convidados.
Digite o nome do convidado (ou 'ver' para visualizar a lista, 'sair' para terminar): Bruno
Bruno foi adicionado à lista de convidados.
Digite o nome do convidado (ou 'ver' para visualizar a lista, 'sair' para terminar): ana
O nome ana já está na lista de convidados.
Digite o nome do convidado (ou 'ver' para visualizar a lista, 'sair' para terminar): Jaqueline
Jaqueline foi adicionado à lista de convidados.
Digite o nome do convidado (ou 'ver' para visualizar a lista, 'sair' para terminar): ver
Lista atualizada de convidados: [Ana, Bruno, Jaqueline]
Digite o nome do convidado (ou 'ver' para visualizar a lista, 'sair' para terminar): sair
Programa finalizado.
```
