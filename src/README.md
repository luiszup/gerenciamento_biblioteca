# Sistema de Gerenciamento de Biblioteca

Este é um sistema simples de gerenciamento de biblioteca desenvolvido em Java. Ele permite realizar operações como cadastro de livros e usuários, empréstimos, devoluções e exibição de livros disponíveis.

## Funcionalidades

1. **Cadastrar Livro**: Adiciona um novo livro ao sistema.
2. **Cadastrar Usuário**: Adiciona um novo usuário ao sistema.
3. **Realizar Empréstimo**: Permite que um usuário realize o empréstimo de um livro.
4. **Realizar Devolução**: Permite que um usuário devolva um livro emprestado.
5. **Exibir Livros Disponíveis**: Lista todos os livros disponíveis para empréstimo.
6. **Sair**: Encerra o sistema.

## Pré-requisitos

- Java Development Kit (JDK) instalado (versão 8 ou superior).
- Um editor de texto ou IDE para executar o código (ex.: IntelliJ IDEA, Eclipse, VS Code).

## Estrutura do Projeto

O projeto é composto pelas seguintes classes:

- **Main**: Classe principal que contém o menu e a lógica de interação com o usuário.
- **Biblioteca**: Classe responsável por gerenciar as operações de cadastro, empréstimo e devolução.
- **Livro**: Classe que representa um livro com atributos como título, autor, ISBN e disponibilidade.
- **Usuario**: Classe que representa um usuário com atributos como nome e ID.

## Como Executar

1. **Clone ou baixe o repositório**:
   ```bash
   git clone git@github.com:luiszup/gerenciamento_biblioteca.git
   cd gerenciamento_biblioteca