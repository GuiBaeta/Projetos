# Sistema de Jogo de Xadrez em Java

Este é um projeto de um **jogo de xadrez** desenvolvido em **Java**, que funciona diretamente no **CMD** (Prompt de Comando) ou em qualquer terminal semelhante, como o terminal do Git no desktop. Este sistema foi desenvolvido como parte do curso do **Nélio Alves** na **Udemy**.

## Funcionalidades

- **Movimentação realista das peças**:
  - Todas as peças possuem os movimentos tradicionais do xadrez.
  - Implementação de jogadas especiais:
    - **Special Move: Castling Kingside Rook** (roque pelo lado do rei).
    - **Special Move: Castling Queenside Rook** (roque pelo lado da rainha).

- **Sistema de turnos**:
  - Alternância automática entre os times (brancas e pretas).

- **Verificação de regras do jogo**:
  - Detecção de **movimentos inválidos** com tratamento de exceções.
  - Verificações de **check**:
    - O jogador em check é obrigado a realizar uma jogada válida que o tire dessa situação.
  - Detecção de **checkmate**, encerrando o jogo quando uma das equipes não possui mais movimentos legais para sair do check.

## Estrutura do Projeto

O projeto foi desenvolvido seguindo boas práticas de programação, utilizando conceitos como:

- Orientação a Objetos (OO):
  - Classes bem definidas para representar o tabuleiro, peças, movimentos e regras do jogo.
- Tratamento de Exceções:
  - Garantindo robustez e notificações claras ao usuário em caso de erros ou jogadas inválidas.

## Como Executar o Projeto

1. Certifique-se de ter o **Java JDK** instalado em sua máquina.
2. Clone este repositório para sua máquina:
   ```bash
   git clone https://github.com/GuiBaeta/Projetos.git
   ```
3. Navegue até o diretório do projeto:
   ```bash
   cd Projetos/Udemy_NelioAlves/SistemaJogoDeXadrez
   ```
4. Compile o código fonte:
   ```bash
   javac *.java
   ```
5. Execute o jogo:
   ```bash
   java Main
   ```

## Tecnologias Utilizadas

- Linguagem: **Java**
- Ambiente de execução: **CMD** ou qualquer terminal compatível

## Sobre o Autor

Este projeto foi desenvolvido como parte do aprendizado no curso **"Java Completo 2023"**, ministrado por **Nélio Alves** na plataforma **Udemy**. O código foi implementado por Guilherme Baeta com foco em práticas reais de desenvolvimento de software.

## Contribuições

Contribuições são bem-vindas! Sinta-se à vontade para abrir issues ou enviar pull requests para melhorias ou correções.
