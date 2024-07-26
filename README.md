# MochilaDoPedro

## Descrição

O programa **MochilaDoPedro** é uma aplicação Java que simula uma mochila com capacidade limitada de peso e espaço para armazenar itens. O usuário pode inserir itens com seus respectivos pesos, visualizar o conteúdo da mochila, encontrar o item mais pesado, ordenar os itens da mochila e excluir itens específicos. A interface é baseada em um menu de opções que o usuário pode selecionar.

## Funcionalidades

1. **Inserir Item**: Adiciona um item à mochila, garantindo que o peso total não exceda a capacidade máxima.
2. **Imprimir Mochila**: Exibe todos os itens e seus pesos.
3. **Valor Item Mais Pesado**: Exibe o peso do item mais pesado na mochila.
4. **Ordenar Mochila**: Ordena os itens na mochila por peso, do mais leve ao mais pesado.
5. **Excluir Item Mochila**: Remove um item específico da mochila.
6. **Sair**: Encerra o programa.

## Estrutura do Código

### Classe `MochilaDoPedro`

- **Atributos**:
  - `limitePeso`: Capacidade máxima de peso da mochila.
  - `somaPeso`: Peso total atual dos itens na mochila.
  - `peso`: Array que armazena os pesos dos itens.
  - `tamanho`: Array que armazena os nomes dos itens.

- **Construtor**:
  - `MochilaDoPedro()`: Inicializa a mochila, solicitando ao usuário a capacidade máxima de peso e o número de espaços disponíveis. Em seguida, chama o método `Escolha` para exibir o menu e processar as opções do usuário.

- **Métodos**:
  - `MostrarMenu()`: Exibe o menu de opções.
  - `Escolha()`: Lê a escolha do usuário e chama os métodos apropriados com base na opção selecionada.
  - `OrdenarMochila()`: Ordena os itens na mochila por peso usando o algoritmo de ordenação Bubble Sort.
  - `ExcluirItemMochila(Scanner s)`: Exclui um item da mochila com base no índice fornecido pelo usuário.
  - `ValorMaisPesado()`: Encontra e exibe o item mais pesado na mochila.
  - `ImprimirMochila()`: Imprime todos os itens e seus pesos.
  - `PerguntarPeso(Scanner s)`: Solicita ao usuário os pesos dos itens, garantindo que o peso total não exceda a capacidade máxima.
  - `PerguntarObjeto(Scanner s, int i)`: Solicita ao usuário o nome do item correspondente ao peso fornecido.
  - `RespostaPeso()`: Exibe todos os pesos dos itens na mochila.
  - `RespostaObjeto()`: Exibe todos os nomes dos itens na mochila.

### Método `main`

O método `main` cria uma nova instância da classe `MochilaDoPedro`, iniciando a aplicação.

## Como Executar

1. Certifique-se de ter o JDK instalado em sua máquina.
2. Compile o programa com o comando:
   ```sh
   javac MochilaDoPedro.java
   ```
3. Execute o programa com o comando:
   ```sh
   java MochilaDoPedro
   ```

## Exemplo de Uso

Ao executar o programa, o usuário será solicitado a informar a capacidade máxima de peso da mochila e o número de espaços disponíveis. Em seguida, o menu será exibido, permitindo ao usuário inserir itens, visualizar a mochila, encontrar o item mais pesado, ordenar a mochila, excluir itens ou sair do programa.

---

Este programa é uma excelente ferramenta para aprender conceitos de manipulação de arrays, controle de fluxo e interação com o usuário em Java.
