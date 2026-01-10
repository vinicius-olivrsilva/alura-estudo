## CURSO: PRÁTICA JAVA - COLEÇÕES E STREAMS

Exercícios para prática de Colletions e Stream API



### **Adicionando elementos a uma lista**

Você está desenvolvendo um sistema para gerenciar os nomes dos funcionários de uma empresa de tecnologia. O sistema precisa permitir que novos funcionários sejam adicionados a uma lista de nomes.

**Sua tarefa é** criar uma lista de strings e adicionar os nomes dos funcionários "João", "Maria", " Vitor" e “Ana” a essa lista. Depois, imprima a lista para verificar se os nomes foram adicionados corretamente.

**Saída esperada:**

```java
 Lista de funcionários: [João, Maria, Vitor, Ana]
```



### **Removendo elementos**

Você está trabalhando no sistema de gestão de uma escola, garantindo que a lista de estudantes esteja sempre correta. Durante uma revisão nos cadastros, percebeu que **um nome foi adicionado incorretamente**: “Pedro”. Para evitar confusões na emissão de certificados e registros, você precisa corrigir essa informação imediatamente.

**Sua tarefa é** remover o nome “Pedro” da lista. Considere que a lista inicial possui os seguintes nomes: `Joana, Lucas, Pedro e Antônio`.

**aída esperada:**

```bash
Lista inicial: [Joana, Lucas, Pedro, Antônio]
Lista após a exclusão: [Joana, Lucas, Antônio]
```



### **Acessando elementos**

Você faz parte da equipe de tecnologia de uma empresa que precisa garantir que o cadastro de funcionários esteja sempre atualizado. Hoje, você recebeu uma solicitação para manter o controle de acesso à empresa. Para isso, seu código deve ser capaz de:

- Verificar quantos funcionários estão registrados
- Descobrir o nome do segundo funcionário da lista

**Exemplo de entrada:**

```java
funcionarios.add("João");
funcionarios.add("Maria");
funcionarios.add("Ana");
funcionarios.add("Pedro");
funcionarios.add("Antônio");
```

**Saída esperada:**

```java
A segunda pessoa da lista é: Maria
Total de funcionários: 5
```





### **Elementos únicos em uma lista**

Você é uma pessoa desenvolvedora de software responsável por otimizar o sistema de gestão de eventos de uma empresa. Recentemente, a organização relatou um problema: **eventos duplicados estão aparecendo na lista de cadastros**, o que pode gerar inconsistências nos relatórios e dificultar processos administrativos.

Sua tarefa é exibir a lista de eventos sem valores duplicados.

**Exemplo de entrada:**

```java
eventos.add("IA Conference Brasil"); 
eventos.add("AI Summit"); 
eventos.add("DevFest"); 
eventos.add("Cloud Expo"); 
eventos.add("IA Conference Brasil"); 
eventos.add("DevFest");
```

**Saída esperada:**

```java
Lista de eventos: [DevFest, AI Summit, Cloud Expo, IA Conference Brasil]
```





### **Criando um Map de clientes**

Você foi encarregado de desenvolver um sistema para gerenciar os clientes de uma livraria. Para garantir um controle preciso dos registros, cada cliente deve possuir um ID único associado ao seu nome.

Para resolver essa tarefa você deve:

- Armazenar os clientes através de uma chave e valor: `(id, nome)`
- Cadastrar três clientes
- Recuperar o nome do cliente de ID igual a 2

**Saída esperada:**

```java
// O nome do cliente com ID 2 é: Marcos
```





### **Verificando se a chave existe**

Você é uma pessoa desenvolvedora que está criando um sistema de gerenciamento de clientes para uma empresa. A equipe de atendimento precisa **acessar os dados dos clientes cadastrados no sistema através de um ID** e conta com sua ajuda para implementar este sistema de busca.

Sua tarefa é:

- Armazenar os clientes através de um `Map<Integer, String>`, onde a chave é o ID e o valor é o nome.
- Cadastrar cinco clientes no sistema.
- Verificar se um ID específico existe antes de tentar recuperar o nome do cliente.
- Se a chave existir, você pode acessar o nome associado; caso contrário, exiba uma mensagem informando que o cliente não foi encontrado.

**Exemplo de entrada:**

```java
clientes.put(1, "Maria");
clientes.put(2, "Marcos");
clientes.put(3, "Ana");
clientes.put(4, "Joana");
clientes.put(5, "Karen");
```

**Saída esperada:**

Caso o cliente exista:

```java
O nome do cliente com ID 5 é: Karen
```

Caso não exista:

```java
 Cliente com ID 6 não encontrado.
```





### **Selecionando funcionários com nomes curtos**

Imagine que a equipe de RH precisa gerar relatórios específicos com listas de funcionários **cujos nomes tenham um determinado número de caracteres ou menos** para facilitar segmentações internas. Para isso, você deve ajudá-los desenvolvendo um programa capaz de:

- Criar uma lista contendo os nomes dos funcionários.
- Filtrar apenas os nomes que tenham menos de 5 caracteres ou exatamente 5 caracteres.
- Criar uma lista contendo os nomes filtrados.
- Exibir a lista filtrada no console.

**Exemplo de entrada:**

```java
List<String> funcionarios = List.of("Ana", "Bruno", "Carlos", "Amanda", "Alice", "Daniel", "Caroline");
```

**Saída esperada:**

```java
[Ana, Bruno, Alice]
```





### **Calculando o quadrado dos números**

Você está desenvolvendo uma aplicação matemática que precisa calcular o quadrado de uma lista de números. Essa funcionalidade será usada para gerar gráficos e análises estatísticas. Para resolver essa tarefa você deve:

- Criar uma lista contendo os números fornecidos.
- Calcular o quadrado de cada número **utilizando o método `map`**.
- Criar uma nova lista contendo os resultados.
- Exibir a lista de quadrados no console.

**Exemplo de entrada:**

```java
List<Integer> numeros = List.of(2, 3, 5, 7, 11);
```

**Saída esperada:**

```java
 Quadrados dos números: [4, 9, 25, 49, 121]
```





### **Calculando o total com imposto**

Imagine que você trabalha no setor financeiro de uma empresa e precisa calcular o valor total gasto na compra de produtos. No entanto, a empresa precisa considerar **um imposto de 8% sobre o valor total** para definir corretamente o preço final dos produtos.

Crie um programa que:

- Crie uma lista contendo os preços dos produtos.
- Utilize `reduce()` para calcular o total gasto.
- Calcule o valor do imposto (8%) sobre o total.
- Exiba o valor total antes e depois da aplicação do imposto, com duas casas decimais.

**Exemplo de entrada:**

```java
List<Double> precosProdutos = List.of(29.99, 49.50, 15.75, 99.99);
```

**Saída esperada:**

```bash
Valor total antes do imposto: 195.23
Valor total com imposto de 8%: 210.85
```





###  **Calculando estatísticas das notas**

Você deseja analisar as notas dos alunos e alunas em uma disciplina para entender melhor o desempenho da turma. Além da média, você também quer saber a menor e a maior nota para ter um panorama completo. Para isso, você deve criar um programa que seja capaz de:

- Criar uma lista contendo as notas dos alunos.
- Utilizar **reduce() para calcular a soma total** das notas.
- Calcular a média das notas.
- Determinar a menor e a maior nota da lista. Dica: use a função `max` e `min` da classe `Stream`.
- Exibir os resultados no console.

**Exemplo de entrada:**

```java
List<Double> notas = List.of(7.5, 8.0, 6.5, 9.0, 10.0);
```

**Saída esperada:**

```bash
A média das notas é: 8.2
A menor nota foi: 6.5
A maior nota foi: 10.0
```

