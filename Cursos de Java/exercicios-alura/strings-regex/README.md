# **Curso - Praticando Java: String e Regex**



## **Removendo espaços em branco**

Joana está desenvolvendo um sistema de cadastro de usuários e percebeu que muitos nomes estão sendo cadastrados com espaços em branco no início ou no final. Ela quer um programa que remova esses espaços automaticamente.

Crie um programa que receba um **nome** e **exiba o nome sem espaços em branco** no início ou no final.

**Exemplo de entrada:**

```bash
Digite o nome:    João Silva   
```

**Saída esperada:**

```bash
Nome sem espaços: João Silva
```



## **Convertendo para maiúsculas e minúsculas**

Carlos está desenvolvendo um sistema de relatórios e precisa padronizar o texto para que todos os títulos estejam em maiúsculas e as descrições em minúsculas. Faça um programa que receba um **texto** e exiba o **texto em maiúsculas** e o **texto em minúsculas**.

**Exemplo de entrada:**

```bash
Digite o texto: Olá, Mundo!
```

**Saída esperada:**

```bash
Texto em maiúsculas: OLÁ, MUNDO!
Texto em minúsculas: olá, mundo!
```



## **Substituindo parte de uma String**

Ana está desenvolvendo um sistema de edição de textos e precisa substituir uma palavra específica por outra em um texto. Crie um programa que:

- Receba um **texto**, **uma palavra** a ser substituída e uma **nova palavra**, exiba o **texto com as substituições** realizadas.
- Se a palavra a ser substituída **não for encontrada no texto**, o programa deve informar ao usuário que a palavra não foi encontrada e encerrar a execução.

**Exemplo de entrada:**

```bash
Digite o texto: O gato caça o rato.
Digite a palavra a ser substituída: gato
Digite a nova palavra: cachorro
```

**Saída esperada:**

```bash
Texto modificado: O cachorro caça o rato.
```



## **Extraindo parte de uma string**

Pedro está desenvolvendo um sistema de processamento de arquivos e precisa extrair o nome do arquivo sem a extensão. Crie um programa que receba o nome de um arquivo e exiba o nome sem a extensão.

**Exemplo de entrada:**

```bash
Digite o nome do arquivo: relatorio_final.pdf
```

**Saída esperada:**

```bash
Nome do arquivo sem extensão: relatorio_final
```



# **Verificando se uma String contém uma Substring**

Laura está desenvolvendo um sistema de busca e precisa verificar se uma palavra específica está presente em um texto. Crie um programa que receba um **texto** e uma **palavra**, e exiba uma mensagem indicando se a palavra está presente no texto.

**Exemplo de entrada:**

```bash
Digite o texto: O gato caça o rato.
Digite a palavra: gato
```

**Saída esperada:**

```bash
A palavra "gato" está presente no texto.
```



## **Formatando números**

Roberto está desenvolvendo um sistema de relatórios financeiros e precisa formatar valores monetários com duas casas decimais. Construa um programa que receba um **valor monetário** e exiba o **valor formatado** com duas casas decimais.

**Exemplo de Entrada:**

```java
Digite o valor: 19,9876
```

**Saída esperada:**

```java
Valor formatado: R$ 19,99
```



## **Validando códigos de referência**

Pedro está desenvolvendo um sistema de controle de produtos e precisa verificar se os códigos de referência dos produtos seguem o formato correto. O formato do código de referência é composto por:

- 3 letras maiúsculas
- Um hífen
- 4 dígitos numéricos Crie um programa que receba um código de referência e informe se ele está no formato correto.

**Exemplo de entrada:**

```java
Digite o código de referência: ABC-1234
```

**Saída esperada:**

```java
O código de referência está válido.
```





## **Validando CPF**

Roberto está desenvolvendo um sistema de cadastro de clientes e precisa validar os números de CPF fornecidos. Ele quer um programa que verifique se o CPF está no formato correto (`XXX.XXX.XXX-XX`).

Crie um programa que **receba um CPF** e exiba uma mensagem indicando se o **CPF está no formato** válido.

**Exemplo de entrada:**

```java
Digite o CPF: 123.456.789-09
```

**Saída esperada:**

```bash
O CPF 123.456.789-09 está no formato válido.
```





## **Extraindo hashtags de um texto**

Patrícia está desenvolvendo um sistema de análise de redes sociais e precisa extrair todas as hashtags de um texto. Ela quer um programa que encontre todas as palavras que começam com "#".

Crie um programa que **receba um texto** e exiba todas as **hashtags encontradas**.

**Exemplo de entrada:**

```bash
Digite o texto: Olá #mundo! Estou aprendendo #Java e #programação.
```

**Saída esperada:**

```bash
Hashtags encontradas: #mundo, #Java, #programação
```



## **Validando senhas com Regex**

arla está desenvolvendo um sistema de cadastro de usuários e precisa validar as senhas. A senha deve ter pelo menos:

- 8 caracteres
- Uma letra maiúscula
- Uma letra minúscula
- Um número
- Um caractere especial

Crie um programa que receba uma **senha** e exiba uma mensagem **indicando se a senha é válida ou não**.

**Exemplo de entrada:**

```java
Digite a senha: Senha123!
```

**Saída esperada:**

```java
A senha é válida.
```