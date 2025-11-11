# **Curso ALURA - Praticando Java: Encapsulamento**



## CadastraVeiculos

Você está desenvolvendo um sistema para uma oficina mecânica registrar os veículos que chegam para manutenção. Cada carro precisa ser identificado com algumas informações para o controle interno.

Crie um programa que:

- Defina uma classe com os atributos `modelo`, `placa` e `ano`.
- Defina uma instancia dessa classe através do **método construtor**.
- Exiba as informações do veículo no console.

**Exemplo de entrada:**

```bash
Carro gol = new Carro("Gol", "ABC-1234", 2020);
```

**Saída esperada:**

```bash
Veículo cadastrado:
Modelo: Gol
Placa: ABC-1234
Ano: 2020
```



## **Agenda de contatos**

Você está desenvolvendo um aplicativo de agenda para uma empresa. Os funcionários precisam acessar rapidamente os contatos de clientes e fornecedores, mantendo as informações organizadas e fáceis de localizar.

Crie uma classe que:

- Armazene contatos com nome e telefone em uma lista
- Permita visualizar todos os contatos cadastrados
- Formate a exibição para melhor legibilidade

**Exemplo de entrada:**

```bash
contatos.add(new Contato("João Silva", "(11) 99999-0000"));
contatos.add(new Contato("Luana Santos", "(21) 98888-0000"));
contatos.add(new Contato("Pedro Oliveira", "(31) 97777-0000"));
```

**Saída esperada:**

```bash
1. João Silva - (11) 99999-0000
2. Luana Santos - (21) 98888-0000
3. Pedro Oliveira - (31) 97777-0000
```



## **Cadastro de produtos com validação**

Imagine que você é responsável pelo módulo de cadastro de um sistema de gestão de estoque. Durante o processo de entrada de mercadorias, é crítico evitar que produtos sejam registrados com valores inconsistentes, pois isso poderia causar problemas financeiros e operacionais.

Seu desafio é implementar uma proteção que **impeça a atribuição de preços negativos** aos produtos, garantindo que o sistema mantenha dados confiáveis.

Crie um programa que:

- Defina uma classe para representar um produto com nome e preço.
- Valide se o preço é um valor não negativo antes de atualizá-lo.
- Se o valor for negativo, então deverá ser redefinido para `0.00`.
- Exiba uma mensagem quando a validação falhar.
- Por fim, exiba uma mensagem com os dados do produto.

**Exemplo de entrada:**

```bash
nome = "Mouse"  
preco = -59.90  
```

**Saída esperada:**

```bash
Preço inválido.
Produto: Mouse
Preço: 0,00
```



## **Controle de senha**

Você está desenvolvendo um sistema de autenticação para um aplicativo bancário. Os usuários precisam ter total segurança de que suas senhas não podem ser alteradas sem autorização, mesmo que alguém tenha acesso temporário ao dispositivo.

Crie uma classe que:

- Armazene com segurança a senha do usuário
- Permita alterar a senha apenas com a confirmação da senha atual
- Forneça feedback sobre o resultado da operação

**Exemplo de entrada:**

```bash
Usuario user = new Usuario("123456");
user.setSenha("123456", "abc123");
```

**Saída esperada:**

Em caso de sucesso:

```bash
Senha alterada com sucesso!
```

Em caso de falha:

```bash
Senha atual incorreta. A senha não foi alterada.
```



# **Controle do nível de bateria**

Imagine que você está desenvolvendo um sistema para dispositivos portáteis, onde precisa monitorar o nível de energia da bateria. O dispositivo deve informar ao usuário o status atual da bateria, garantindo que os valores sempre estejam dentro de um intervalo válido.

Crie um programa que:

- Defina uma classe que armazene o nível da bateria.
- Permita definir o nível apenas se estiver entre 0 e 100.
- Forneça uma forma de exibir o status da bateria com base no nível atual:
  - **Até 20%:** “Bateria fraca”
  - **Entre 21% e 79% :** “Bateria ok”
  - **Igual ou acima de 80%:** “Bateria cheia”
- Instancie essa classe, defina um nível e exiba o status.

**Exemplo de entrada:**

```bash
Bateria b = new Bateria(); 
b.setNivel(85);
```

**Saída esperada:**

```bash
Status: Bateria cheia 
```



## **Controle de saldo bancário**

Você está desenvolvendo um sistema para um banco digital. Os clientes precisam confiar que suas transações serão seguras e que o sistema nunca permitirá que eles gastem mais do que possuem em conta. Seu desafio é garantir essa segurança nas operações financeiras de depositar e sacar.

Crie uma classe que:

- Permita criar contas com titular e saldo inicial.
- Realize depósitos com valores positivos.
- Autorize saques apenas quando houver saldo suficiente.
- Exiba o saldo atualizado após cada operação.

**Exemplo de entrada:**

```bash
Conta conta = new Conta("Ana");
conta.depositar(1000.00);
conta.sacar(1200.00);
conta.exibirSaldo();
```

**Saída esperada:**

```bash
Saldo insuficiente para saque.
Saldo atual de Ana: 1000,00
```



## **Avaliação de filmes**

Você está desenvolvendo um sistema para uma plataforma de streaming que deseja oferecer recomendações mais precisas aos usuários. Para isso, é importante coletar avaliações confiáveis e calcular médias que reflitam a qualidade real dos filmes.

Crie uma classe que:

- Armazene o título do filme e suas avaliações. As avaliações são armazenadas em uma lista
- Permita adicionar novas avaliações (apenas entre 1 e 5)
- Calcule e exiba a média das avaliações com precisão decimal

**Exemplo de entrada:**

```bash
Filme matrix = new Filme("Matrix");
matrix.adicionarAvaliacao(5);
matrix.adicionarAvaliacao(4);
matrix.adicionarAvaliacao(5);
matrix.adicionarAvaliacao(3);
matrix.adicionarAvaliacao(4);
```

**Saída esperada:**

```bash
Média de avaliações para Matrix: 4,20
```



## **Validação de login**

Imagine que você está desenvolvendo um sistema de acesso para um laboratório de informática da escola. Os estudantes precisam autenticar-se com suas credenciais pessoais, mas o sistema deve proteger contra tentativas de adivinhação de senhas.

Crie uma classe que:

- Armazene o login e a senha de forma encapsulada.

- Um método `validarSenha()` que receba as credenciais digitadas e retorne se o login foi bem-sucedido.

- Uma lógica no arquivo principal que utilize a classe

   

  ```
  Scanner
  ```

   

  para ler o login e senha digitados, controlando as tentativas com um loop.

  - Bloqueie o acesso após 3 falhas consecutivas.
  - Exiba mensagens informando o resultado da tentativa e quantas restam.

**Exemplo de entrada:**

```bash
Login: aluno2025
Senha correta: escola@123
Tentativas: "senhaerrada", "123456", "escola@123"
```



## **Sistema de pontos para alunos**

magine que você está desenvolvendo um sistema de pontuação para uma plataforma de estudos. Cada aluno ganha pontos conforme participa de atividades como assistir aulas, responder quizzes ou completar tarefas. Seu objetivo é criar uma classe que gerencie essa pontuação e determine o nível atual do aluno com base na quantidade total de pontos acumulados.

Crie uma classe que:

- Armazene os atributos nome, pontos e nível.
- Implemente um método `ganharPontos()` para adicionar pontos ao aluno.
- O nível do aluno deve subir conforme a pontuação total:
  - **Nivel 1:** 0 a 99 pontos
  - **Nível 2:** 100 a 199 pontos
  - **Nível 3:** 200 a 299 pontos
  - E assim por diante (a cada 100 pontos, sobe de nível)
- Implemente um método `exibirStatus()` que mostre o nome, pontos e nível atual.

**Exemplo de entrada:**

```bash
Aluno aluno = new Aluno("Fernanda");
 
aluno.ganharPontos(120);
aluno.exibirStatus();
```

**Saída esperada:**

```bash
Nome: Fernanda
Pontos: 120
Nível: 2
```



# **Registro de notas**

Você está desenvolvendo um módulo acadêmico para registrar o desempenho dos alunos em cada disciplina. O sistema precisa ser flexível para receber diferentes quantidades de notas, mas deve garantir que todas estejam dentro do intervalo válido.

Crie um programa que:

- Defina uma classe que armazene o nome da disciplina e a lista das notas dos alunos
- Valide se cada nota está entre 0 e 10
- Calcule a média apenas das notas válidas
- Informe quantas notas foram registradas com sucesso e quantas foram ignoradas

**Exemplo de entrada:**

```bash
Disciplina matematica = new Disciplina("Matemática");
matematica.adicionarNota(7.5);
matematica.adicionarNota(11.0);
matematica.adicionarNota(8.0);
matematica.adicionarNota(-3.0);
matematica.adicionarNota(9.5);
```

**Saída esperada:**

```bash
Nota inválida ignorada: 11.0
Nota inválida ignorada: -3.0
Total de notas válidas: 3
Média em Matemática: 8,33
```