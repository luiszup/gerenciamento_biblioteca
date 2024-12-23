import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Scanner input = new Scanner(System.in);
        int opcao;

        System.out.println("---------Bem-vindo ao sistema de gerenciamento da biblioteca!--------");
        System.out.println("Escolha uma opção:");
        System.out.println("1. Cadastrar livro");
        System.out.println("2. Cadastrar usuário");
        System.out.println("3. Realizar empréstimo");
        System.out.println("4. Realizar devolução");
        System.out.println("5. Exibir livros disponíveis");
        System.out.println("6. Sair");
        opcao = input.nextInt();
        input.nextLine();

        switch (opcao) {
            case 1:
                System.out.println("Digite o título do livro: ");
                String titulo = input.nextLine();
                System.out.println("Digite o autor do livro: ");
                String autor = input.nextLine();
                System.out.println("Digite o ISBN do livro: ");
                String isbn = input.nextLine();
                Livro livro = new Livro();
                livro.titulo = titulo;
                livro.autor = autor;
                livro.isbn = isbn;
                livro.disponivel = true;
                biblioteca.cadastrarLivro(livro);
                break;

            case 2:
                System.out.println("Digite o nome do usuário");
                String nome = input.nextLine();
                System.out.println("Digite o ID do usuário: ");
                int id = input.nextInt();
                Usuario usuario = new Usuario();
                usuario.nome = nome;
                usuario.id = id;
                biblioteca.cadastrarUsuario(usuario);
                break;

            case 3:
                System.out.println("Digite o ISBN do livro: ");
                String isbnEmprestimo = input.nextLine();
                System.out.println("Digite o ID do usuário: ");
                int idUsuarioEmprestimo = input.nextInt();
                biblioteca.realizarEmprestimo(isbnEmprestimo, idUsuarioEmprestimo);
                break;

            case 4:
                System.out.println("Digite o ISBN do livro: ");
                String isbnDevolucao = input.nextLine();
                System.out.println("Digite o ID do usuário: ");
                int idUsuarioDevolucao = input.nextInt();
                biblioteca.realizarEmprestimo(isbnDevolucao, idUsuarioDevolucao);
                break;

            case 5:
                biblioteca.exibirLivrosDisponiveis();
                break;

            case 6:
                System.out.println("Até mais!");
                break;

            default:
                System.out.println("Opção inválida. Digite uma das opções acima");
        }

        input.close();
    }
}
