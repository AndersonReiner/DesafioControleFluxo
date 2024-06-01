# Desafio: Controle de Fluxo

Este desafio consiste na implementação de um programa em Java que recebe dois números inteiros como entrada e realiza uma contagem entre esses números. Caso o primeiro número seja maior que o segundo, o programa lança uma exceção personalizada.

## Funcionamento do Programa

1. **Leitura dos Parâmetros**:
   - O programa utiliza a classe `Scanner` para ler os dois números inteiros fornecidos pelo usuário via terminal.

2. **Tratamento de Exceção de Entrada Inválida**:
   - Foi implementado um método `lerNumero(Scanner scanner)` para lidar com a entrada de números inteiros de forma segura.
   - Este método usa um loop para solicitar entrada até que o usuário forneça um número inteiro válido.
   - Se o usuário fornecer uma entrada inválida, o programa imprime uma mensagem de erro e solicita uma nova entrada.

3. **Validação dos Parâmetros**:
   - O método `contar(int parametroUm, int parametroDois)` valida se o primeiro número é maior que o segundo. Se for, lança uma exceção `ParametrosInvalidosException`.

4. **Contagem e Impressão dos Números**:
   - Se a validação for bem-sucedida, o programa calcula a diferença entre os dois números e realiza um loop para imprimir os números de 1 até o valor da diferença.

## Estrutura do Código

- A classe principal `Contador` contém o método `main` que controla o fluxo do programa.
- Foi criado um método `lerNumero(Scanner scanner)` para lidar com a entrada de números inteiros de forma segura.
- A exceção personalizada `ParametrosInvalidosException` é lançada se a validação dos parâmetros falhar.
- O método `contar` realiza a contagem e impressão dos números conforme especificado.

Esta solução garante que o programa seja robusto, lidando adequadamente com entradas inválidas e fornecendo feedback claro ao usuário. Além disso, a exceção personalizada adiciona uma camada adicional de segurança e expressividade ao código.
