# Curso Praticando Java: Herança, Interface e Polimorfismo

Exercícios da plataforma Alura

## **Identificando o estudante**

Você está construindo um sistema acadêmico para uma escola. Cada aluno possui um nome e pode ser identificado no sistema com uma mensagem padrão. A escola também possui alunos bolsistas. Para deixar o sistema mais informativo, queremos exibir o tipo do aluno no momento da identificação, como "bolsista" ou "regular".

Crie um programa que:

- Defina uma classe `Aluno` com nome e tipo.
- Crie um método `identificar()` que que imprime: `"Aluno: [nome] - Tipo: [tipo]"`.
- Crie uma classe `Bolsista` que herda de `Aluno` e define o tipo automaticamente como "bolsista". Crie um objeto Aluno regular e um Bolsista, e chame o método `identificar()` de cada um.

**Exemplo de entrada:**

```java
Aluno aluno1 = new Aluno("Fernanda", "regular");
Bolsista aluno2 = new Bolsista("Lucas");
 
aluno1.identificar();
aluno2.identificar();
```

**Saída esperada:**

```bash
Aluno: Fernanda - Tipo: regular
Aluno: Lucas - Tipo: bolsista
```



## **Sistema escolar**

Você está desenvolvendo um sistema de gestão para uma escola, onde é necessário organizar informações de alunos e docentes. Cada pessoa na escola possui dados básicos, como nome e idade. No entanto, cada grupo também possui características próprias: os alunos possuem uma nota final e os docentes são responsáveis por uma disciplina.

Crie um programa que:

- Defina uma classe `Pessoa` com os atributos nome e idade.

- Crie as classes

   

  ```
  Aluno
  ```

   e

  ```
  Docente
  ```

  ambas herdando de

  ```
  Pessoa
  ```

  , adicionando:

  - Para `Aluno`: um atributo **nota**.
  - Para `Docente`: um atributo **disciplina**.

- Instancie dois objetos Aluno e dois objetos Docente

- Exiba as informações no terminal.

**Exemplo de entrada:**

```bash
aluno1.exibirDados();
aluno2.exibirDados();
 
docente1.exibirDados();
docente2.exibirDados();
```

**Saída esperada:**

```bash
Aluno: Julia - Idade: 16 - Nota: 8.5
Aluno: Caio - Idade: 17 - Nota: 7.2
Docente: Marta - Idade: 40 - Disciplina: Matemática
Docente: Roberto - Idade: 38 - Disciplina: História
```



## **Gerenciamento de biblioteca**

Imagine que você está desenvolvendo um sistema para uma biblioteca que precisa catalogar diferentes tipos de mídias: livros, revistas e e-books. **Cada mídia possui informações específicas**, como título e ano de publicação, mas algumas têm características únicas, como autor (livros), edição (revistas) ou formato (e-books). Seu programa deve ser capaz de exibir esses dados para facilitar a consulta pelos bibliotecários.

Crie um programa que:

- Defina uma classe `Midia` com os atributos título e ano de publicação.

- Defina um método que gere um código no formato “LIB- + os três primeiros caracteres do título + ano de publicação”, por exemplo:

  - **Código: LIB-O H1937 | Livro: "O Hobbit" - Autor: J.R.R. Tolkien**

- Crie as classes

  ```
  Livro
  ```

  ```
  Revista 
  ```

  e 

  ```
  Ebook
  ```

  , todas herdando de

  ```
  Midia
  ```

  , adicionando:

  - `Livro`: atributo autor.
  - `Revista`: atributo edição.
  - `Ebook`: atributo formato.

- Cadastre uma mídia de cada tipo.

- Exiba o código e os detalhes de cada mídia usando o método `exibirInfo`.

**Exemplo de entrada:**

```bash
livro.exibirInfo();
revista.exibirInfo();
ebook.exibirInfo();
```

**Saída esperada:**

```bash
Código: LIB-O G1979 | Livro: "O Guia do Mochileiro das Galáxias" - Autor: Douglas Adams
Código: LIB-Nat2023 | Revista: "National Geographic" - Edição: 245
Código: LIB-Cle2008 | Ebook: "Clean Code" - Formato: PDF
```



## **Sistema bancário**

Imagine que você está desenvolvendo um sistema para um banco digital, onde todas as operações financeiras precisam ser tratadas de forma uniforme, mas cada uma com seu comportamento específico. O banco deseja que, independentemente do tipo de operação (depósito, saque, etc.), todas sigam a mesma estrutura básica para facilitar a manutenção e expansão do sistema.

Crie um programa que:

- **Tenha uma interface `AcaoBancaria`** com o método `executar()`, que representa o contrato que toda operação bancária deve seguir.

- Tenha uma classe abstrata `OperacaoBancaria`

  , que implementa essa interface e contém:

  - O atributo `valor`
  - Um construtor para inicializar esse valor

- Tenha duas subclasses** que estendem

  ```
  OperacaoBancaria
  ```

  - `Deposito`: deve imprimir `"Depósito de R$[valor] realizado"`
  - `Saque`: deve imprimir `"Saque de R$[valor] realizado"`

**Exemplo de entrada:**

```bash
OperacaoBancaria deposito = new Deposito(200.0); 
OperacaoBancaria saque = new Saque(50.5); 
  
deposito.executar(); 
saque.executar();
```

**Saída esperada:**

```bash
Depósito de R$200,00 realizado
Saque de R$50,50 realizado
```