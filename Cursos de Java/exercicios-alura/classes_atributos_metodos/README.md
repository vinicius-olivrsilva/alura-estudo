# Curso - Praticando Java: Classes, Atributos e métodos



## RelatorioProduto

Imagine que você é responsável pelo controle de estoque de uma loja de informática que está expandindo seus negócios. Com o aumento da demanda, é importante manter um registro organizado e preciso de todos os produtos disponíveis. Sua tarefa é criar um sistema que **armazene as informações de cada item e gere um relatório** para facilitar a gestão do estoque.

Sua tarefa é criar uma classe que:

- Represente um produto com os atributos `nome`, `preço` e `quantidade`.
- Implemente um método que mostre os dados formatados, garantindo que o preço seja exibido com duas casas decimais.

**Exemplo de entrada:**

```bash
nome = "Mouse Gamer"  
preco = 159.9  
quantidade = 25  
```

**Saída esperada:**

```bash
Produto: Mouse Gamer
Preço: R$ 159,90
Quantidade em estoque: 25
```



## ImprimeResumo do livro

Imagine que você está criando um sistema de catalogação para uma biblioteca. Seu objetivo é **desenvolver uma estrutura que armazene dados de obras literárias** e as exiba em um formato padronizado, facilitando a consulta por outros leitores.

Crie um programa que:

- Defina uma classe com os atributos `título`, `autor` e `páginas`.
- Implemente um método que use `printf` para mostrar os dados no formato: `"[TÍTULO]" de [AUTOR] com [PÁGINAS] páginas`.

**Exemplo de entrada:**

```bash
l.titulo = "O Guia do Mochileiro das Galáxias";  
l.autor = "Douglas Adams";  
l.paginas = 208;  
```

**Saída esperada:**

```bash
"O Guia do Mochileiro das Galáxias" de Douglas Adams com 208 páginas  
```



## **ZerandoSaldo**

Imagine que você está desenvolvendo um sistema de conta digital onde os usuários podem realizar transações financeiras. Em determinadas situações, como encerramento de conta, é necessário **zerar o saldo disponível**.

Crie um programa que:

- Defina uma classe com o atributo `saldo`.
- Implemente um método que redefine o valor do saldo para `0.0`.
- Implemente um método que mostra o saldo atual formatado.

**Exemplo de entrada:**

```bash
conta.saldo = 1579.42;  
 
conta.exibirSaldo();  
conta.zerarSaldo();  
conta.exibirSaldo();
```

**Saída esperada:**

```bash
Saldo atual: R$ 1579.42 
Saldo atual: R$ 0.00 
```



## ControleTemperatura

Imagine que você faz parte de uma equipe de agricultura tecnológica responsável por monitorar estufas inteligentes. Cada setor possui sensores que coletam dados críticos para o crescimento das plantas. Seu desafio é desenvolver um sistema que não apenas registre a temperatura, mas também **alerte quando as condições saírem do ideal**, garantindo a saúde das culturas.

Crie uma classe que:

- Possua os atributos `local`, indicando o setor monitorado, e `temperatura atual`, armazenando a última medição.
- Implemente um método que mostre:
  - O local do sensor.
  - A temperatura formatada com **uma casa decimal**.
  - Um **alerta** se a temperatura ultrapassar **37.5ºC**.

**Exemplo de entrada:**

```bash
local = "Setor A"  
temperaturaAtual = 39.2  
```

**Saída esperada:**

```bash
Sensor no local: Setor A
Temperatura: 39,2 ºC
Alerta: Temperatura acima do limite!
```



## CalculaNotas

Imagine que você está desenvolvendo um sistema acadêmico simplificado para auxiliar professores no acompanhamento de alunos. Seu desafio é criar uma solução que automatize o cálculo de médias e forneça rapidamente o resultado, eliminando a necessidade de cálculos manuais e reduzindo erros.

Crie uma classe que:

- Represente os alunos com os atributos `nome`, `nota 1´ e `nota 2`.
- Implemente um método que:
  - Calcule a média das notas.
  - Exiba o nome do aluno, suas notas e a média (com uma casa decimal).
  - Indique se o aluno foi **aprovado (média >= 7)** ou **reprovado**.

**Exemplo de entrada:**

```bash
nome = "João Silva"  
nota1 = 6.5  
nota2 = 7.5  
```

**Saída esperada:**

```bash
Aluno: João Silva
Nota 1: 6.5
Nota 2: 7.5
Média: 7,0
Situação: Aprovado
```



## CorrigeCadastro

Você está desenvolvendo um sistema de controle de colaboradores para uma empresa de tecnologia. Às vezes, é necessário atualizar o cargo e o nível de acesso de um funcionário devido a promoções ou mudanças de departamento. Seu programa deve permitir essas alterações e mostrar as informações atualizadas.

Crie uma classe que:

- Represente um colaborador com os atributos `nome`, `cargo` e `nivel de acesso`.
- Implemente um método que permita alterar o cargo e o nível de acesso.
- Exiba no console as informações antes e depois da atualização.

**Exemplo de entrada:**

```bash
Nome: Júlia Oliveira  
Cargo atual: Pessoa Desenvolvedora Júnior  
Novo cargo: Pessoa Desenvolvedora Plena
Nível de acesso atual: 1  
Novo nível de acesso: 2  
```

**Saída esperada:**

```bash
--- Antes da atualização ---
Nome: Júlia Oliveira
Cargo: Pessoa Desenvolvedora Júnior
Nível de acesso: 1 

--- Após atualização ---
Nome: Júlia Oliveira
Cargo: Pessoa Desenvolvedora Plena
Nível de acesso: 2
```



## ControleTarefas

Você está desenvolvendo um sistema de gerenciamento de tarefas pessoais para ajudar usuários a organizar suas atividades diárias. Cada tarefa precisa ser registrada com uma descrição e um status que indique se já foi concluída ou não. Seu objetivo é **criar uma estrutura que armazene essas tarefas** e permita visualizá-las.

Crie um programa que:

- Defina uma classe com os atributos `descrição` e `concluída`.
- Implemente um método que **mostre a descrição da tarefa e seu status**.
- Crie uma lista de tarefas e exiba todas as tarefas cadastradas. **Dica:** use `ArrayList`.

**Exemplo de entrada:**

```bash
Tarefa t1 = new Tarefa();  
t1.descricao = "Estudar Java";  
t1.concluida = false;  
 
Tarefa t2 = new Tarefa();  
t2.descricao = "Fazer exercícios";  
t2.concluida = true;  
```

**Saída esperada:**

```bash
Tarefa: Estudar Java - Status: Pendente  
Tarefa: Fazer exercícios - Status: Concluída
```



## ControleEstoque

Você está desenvolvendo um sistema de gerenciamento para uma loja de roupas e precisa garantir que o estoque seja atualizado corretamente a cada venda realizada. Seu programa deve processar as vendas e alertar quando não houver produtos suficientes no estoque.

Crie um programa que:

- Defina uma classe com os atributos `nome` e `quantidade`.
- Implemente um método que:
  - Subtraia a quantidade vendida do estoque se houver disponibilidade.
  - Exiba uma mensagem formatada com o saldo atual usando `printf`
  - Exiba um alerta “Estoque insuficiente” quando não for possível atender a venda.

**Exemplo de entrada:**

```bash
item.nome = "Camiseta";
item.quantidade = 10;
 
item.vender(3);
item.vender(8);
```

**Saída esperada:**

```bash
Venda realizada. Estoque restante de Camiseta: 7
Estoque insuficiente
```



## MultaPorAtraso

Imagine que você está desenvolvendo um sistema de controle de devoluções para uma livraria. Quando um livro é devolvido com atraso, é necessário **calcular o valor da multa** conforme os dias de atraso.

Crie um programa que:

- Defina uma classe com os atributos `título` e `dias de atraso`.
- Implemente um método que:
  - Cobre R$ 2,50 por dia de atraso.
  - Retorne o valor total da multa.
- Implemente um método que mostre o título e o valor da multa formatado.

**Exemplo de entrada:**

```bash
pedido.titulo = "Dom Casmurro";  
pedido.diasAtraso = 3;  
 
pedido.exibirDetalhes();
```

**Saída esperada:**

```bash
Livro: Dom Casmurro | Multa por 3 dias de atraso: R$ 7,50 
```



## CarrinhoDeCompra

Você está desenvolvendo o sistema de checkout de um e-commerce de produtos eletrônicos. Seu desafio é calcular o valor total do carrinho de compras, considerando que cada produto pode ter quantidades diferentes e preços variados.

Crie um programa que:

- Defina uma classe com os atributos `nome`, `preço` e `quantidade`.
- Implemente um método que retorne o valor total do item (preço x quantidade).
- Crie uma lista de item e calcule o valor total da compra.

**Exemplo de entrada:**

```bash
i1.nome = "Teclado";
i1.preco = 120.0;
i1.quantidade = 1;       
 
i2.nome = "Mouse";
i2.preco = 60.0;
i2.quantidade = 2;
```

**Saída esperada:**

```bash
Total da compra: R$ 240.00
```



