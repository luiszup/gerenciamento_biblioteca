import java.util.ArrayList;

public class Usuario {
    public String nome;
    public int id;
    ArrayList<Livro> livrosEmprestados = new ArrayList<>();

    public void exibirDetalhes() {
        System.out.println("Nome do usuário: " + nome);
        System.out.println("ID: " + id);
        for (Livro livro : livrosEmprestados) {
            System.out.println("-" + livro.titulo);
        }
    }

    public void adicionarLivro(Livro livro) {
        if (livrosEmprestados.contains(livro) == false) {
            livrosEmprestados.add(livro);
            System.out.println("O livro " + livro.titulo + " foi adicionado a lista de emprestados!");
        } else {
            System.out.println("Este livro já está na lista de emprestados");
        }
    }

    public void removerLivro(Livro livro) {
        if (livrosEmprestados.contains(livro)) {
            livrosEmprestados.remove(livro);
            System.out.println("O livro " + livro.titulo + " foi removido da lista de emprestados!");
        } else {
            System.out.println("Este livro ainda não está na lista de emprestados");
        }
    }
}
