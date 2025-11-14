# **Data e Hora**

## **Data e hora atual**

Você está desenvolvendo um **sistema de log** para um aplicativo de gerenciamento de tarefas. Sempre que uma **nova tarefa é criada**, o sistema deve registrar a **data e a hora exatas** do momento da criação.

Para isso, implemente um programa que:

- Simule a criação de uma tarefa através de uma variável simples, por exemplo `String tarefa = "Enviar relatório semanal";`.
- Registre a data e a hora exatas da criação.
- Exiba essas informações no formato adequado.

**Saída esperada:**

```bash
Data atual: 2025-03-15 
Hora atual: 14:30:45.089914300
```

*Obs: A hora e data atual dependerá do horário que você está realizando esta atividade.*



## **Formatando data e hora para relatórios**

Você trabalha no setor de tecnologia de uma empresa que gera relatórios diários. Esses relatórios incluem informações como transações realizadas, atualizações de pedidos e registros de atendimento ao cliente. A equipe responsável pela análise dos relatórios solicitou que a data e a hora sejam exibidas em um formato mais familiar para os usuários brasileiros.

Para resolver essa tarefa, você deve:

- Capturar a **data e a hora atuais**.
- Formatar a **data no padrão dd-MM-yyyy** (dia-mês-ano).
- Formatar a **hora no padrão HH:mm** (hora e minutos).
- Exibir o resultado da formatação.

**Saída esperada:**

```bash
Data formatada: 15-03-2025
Hora formatada: 14:30
```





## **Diferença entre horas**

Você é responsável pelo **controle de tempo em projetos** dentro de uma agência de desenvolvimento. Você precisa monitorar **o tempo gasto em cada tarefa** para garantir que os projetos sejam executados dentro do prazo.

Para isso, crie um programa que:

- Receba dois horários representando o início e o término de uma atividade.
- Calcule a **diferença em horas e minutos** entre esses dois horários.
- Exiba o resultado formatado.

**Saída esperada:**

Se o primeiro horário for 14:30:00 e o segundo horário for 16:45:00, a saída deve ser:

```bash
Diferença de tempo: 2 horas e 15 minutos
```





##  **Calculando a data de entrega**

Você é responsável pelos projetos em uma empresa de desenvolvimento de software. Para garantir que os prazos sejam cumpridos, **você precisa calcular a data de entrega** de cada projeto com base na **data de início e no prazo estimado em dias**.

Você precisa criar um programa que:

- Receba uma **data de início**.
- Adicione o **prazo em dias** ao início do projeto.
- Exiba a **data final** formatada corretamente.

**Saída esperada:**

Se a data de início for 15 de março de 2025 e o prazo for 15 dias, a saída deve ser:

```bash
Data de entrega: 30-03-2025
```





## **Ajustando a data de vencimento**

Você trabalha no setor financeiro de uma empresa de serviços e é responsável por **gerenciar o vencimento das faturas dos clientes.** Em alguns casos, os clientes solicitam um adiamento da data de pagamento, e **o sistema precisa calcular a nova data de vencimento com base na quantidade de meses adicionados**.

Crie um programa que:

- Receba uma **data de vencimento original**.
- Adicione um **número de meses** ao vencimento.
- A data ajustada deve ser exibida no formato `dd-MM-yyyy`.

**Saída esperada:**

Se a data de vencimento original for 20 de março de 2025 e o adiamento for de 1 mês, a saída deve ser:

```java
Nova data de vencimento: 20-04-2025
```





## **Verificando a data de um evento**

Você trabalha em uma agência de turismo e é responsável pelo agendamento de eventos como passeios e excursões. Para garantir uma boa organização, o sistema precisa **verificar se um evento já ocorreu ou ainda está por vir com base na data atual.**

Crie um programa que:

- Receba uma **data de evento** previamente cadastrada.
- Compare essa data com a **data atual**.
- Exiba a data do evento e a data atual no formato `dd-MM-yyyy`.
- Informe se o evento **já ocorreu ou ainda está por vir**.

**Saída esperada:**

Se a data do evento for 10 de março de 2025 e a data atual for 15 de março de 2025, a saída deve ser:

```bash
Data do evento: 10-03-2025
Data atual: 15-03-2025
O evento já ocorreu.
```





## **Lembrete de pagamento**

Você trabalha no setor financeiro de uma empresa e precisa garantir que as contas sejam pagas **antes do vencimento**. Para isso, o sistema deve calcular a data exata em que um **lembrete de pagamento deve ser disparado com base no prazo de antecedência definido.**

Por exemplo, se uma conta vence no dia 20 de um mês e os lembretes devem ser enviados 10 dias antes, a notificação deve ser disparada no dia 10. Já se o vencimento for 30 de março de 2025 e a antecedência for de 5 dias, o lembrete deverá ser enviado no dia 25 de março de 2025.

**Crie um programa** que, a partir de uma data de vencimento e um período de antecedência em dias, calcule e exiba a data que o lembrete para pagamento deve ser disparado.

**Saída esperada:**

Se a data de vencimento for 30 de março de 2025 e o período de antecedência for 5 dias, a saída deve ser:

```bash
Data do lembrete: 25-03-2025
```





## **Fuso horário**

Você trabalha em uma empresa de viagens internacionais e precisa de um sistema que exiba o horário atual em diferentes países. Como a empresa tem clientes no Japão, **o sistema deve ser capaz de mostrar o horário atual na cidade de Tóquio**, independente do fuso horário do computador onde o programa está rodando.

Crie um programa que exiba o horário atual no fuso horário de Tóquio (Asia/Tokyo). Utilize a classe `ZonedDateTime` para realizar a tarefa. Lembre-se de formatar a saída para exibir apenas horas, minutos e segundos.

**Saída esperada:**

```bash
Horário atual em Tóquio: 21:04:09
```

*Obs: A hora e data atual dependerá do horário que você está realizando esta atividade.*





## **Convertendo horário para outro fuso**

Você trabalha em uma empresa global e precisa agendar reuniões com colegas da Austrália. Como os horários variam de acordo com o fuso horário, você precisa de um sistema que **converta automaticamente o horário local para o horário de Sydney**.

**Crie um programa** que converta o horário atual do sistema (fuso horário padrão) para o fuso horário de Sydney (Australia/Sydney) e exiba apenas as horas e os minutos. **Dica:** Utilize o método `withZoneSameInstant()` para realizar a conversão.

**Saída esperada:**

```bash
Horário atual no sistema: 12:00
Horário atual em Sydney: 22:00
```



## **Controle de expediente**

Você trabalha no setor administrativo de uma empresa e precisa de um sistema para **acompanhar os horários de entrada e saída dos funcionários.** O sistema deve calcular o horário de saída com base na hora de entrada e na carga horária diária.

Além disso, para controle de banco de horas, o sistema deve calcular quantas horas um funcionário trabalhou a mais ou a menos, caso o expediente tenha durado mais ou menos que o previsto.

**O programa deve:**

- Capturar o **horário de entrada**.
- Adicionar a **carga horária diária** para calcular o **horário de saída previsto**.
- Capturar o **horário real de saída**
- Calcular a **diferença** entre o tempo trabalhado e a carga horária.
- Exibir as informações formatadas corretamente.

**Dica:**

Para tornar o sistema mais interativo, utilize a classe `Scanner` para capturar a entrada do usuário, permitindo que ele informe os horários diretamente. Neste caso, primeiro, crie um objeto `Scanner` para ler os dados digitados. Depois, defina um `DateTimeFormatter` para garantir que os horários sejam inseridos no formato correto, ou seja, com **duas casas para horas e minutos, separados por dois pontos (`HH:mm`)**, como `"08:05"`. Isso evita erros ao converter o valor digitado em um objeto `LocalTime`. Em seguida, solicite a entrada do usuário com `System.out.print()` e utilize `LocalTime.parse()` para interpretar a string informada e transformá-la em um horário válido.

```java
Scanner scanner = new Scanner(System.in);
DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
System.out.print("Digite o horário de entrada (HH:mm): ");
LocalTime entrada = LocalTime.parse(scanner.next(), formatter);
```

**Exemplo de entrada**

```less
Digite o horário de entrada (HH:mm): 08:00  
Digite a carga horária diária (em horas): 8  
Digite o horário real de saída (HH:mm): 17:00  
```

**Saída esperada:**

```bash
Horário de entrada: 08:00
Horário de saída previsto: 16:00
Horário real de saída: 17:00
Saldo de horas: +1h 0min
```

Se o funcionário **sair no horário correto**, a saída será:

```lua
Saldo de horas: 0h 0min
```

Se ele **sair 30 minutos antes**, o sistema exibirá:

```lua
Saldo de horas: -0h 30min
```
