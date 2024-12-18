import java.util.ArrayList;

public class Biblioteca {
   ArrayList<Livro> livros = new ArrayList<>();
   ArrayList<Usuario> usuarios = new ArrayList<>();


   public void cadastrarLivro(Livro livro) {
      if(livros.contains(livro) == false) {
         livros.add(livro);
         System.out.println("O livro " + livro.titulo + " foi cadastrado com sucesso!");
      } else {
         System.out.println("Este livro já está cadastrado");
      }
   }

   public void cadastrarUsuario(Usuario usuario) {
      if (usuarios.contains(usuario) == false) {
         usuarios.add(usuario);
         System.out.println("Usuário " + usuario.nome + " cadastrado com sucesso!");
      } else {
         System.out.println("Este usuário já está cadastrado");
      }
   }

   public void realizarEmprestimo(String isbn, int idUsuario) {
      Livro livro = buscarLivroPorIsbn(isbn);
      Usuario usuario = buscarUsuarioPorId(idUsuario);

      if (livro.disponivel == false) {
         System.out.println("O livro " + livro.titulo + " não está disponível para empréstimos");
         return;
      }

      if (usuario == null) {
         System.out.println("Usuário com ID " + idUsuario + " não foi encontrado");
         return;
      }

      if (livro == null) {
         System.out.println("Livro com ISBN " + isbn + " não foi encontrado");
         return;
      }

      livro.disponivel = false;
      usuario.adicionarLivro(livro);
      System.out.println("O empréstimo do livro " + livro.titulo + " realizado com sucesso para o usuário " + usuario.nome);
   }

   public void realizarDevolucao(String isbn, int idUsuario) {
      Livro livro = buscarLivroPorIsbn(isbn);
      Usuario usuario = buscarUsuarioPorId(idUsuario);

      if (usuario.livrosEmprestados.contains(livro) == false) {
         System.out.println("O livro " + livro.titulo + " não está emprestado para o usuário " + usuario.nome);
         return;
      }

      if (usuario == null) {
         System.out.println("Usuário com ID " + idUsuario + " não foi encontrado");
         return;
      }

      if (livro == null) {
         System.out.println("Livro com ISBN " + isbn + " não foi encontrado");
         return;
      }

      livro.disponivel = true;
      usuario.removerLivro(livro);
      System.out.println("A devolução do livro " + livro.titulo + " foi realizada com sucesso pelo usuário " + usuario.nome);
   }

   public void exibirLivrosDisponiveis() {
      System.out.println("Livros disponíveis para empréstimos:");
      for (Livro livro : livros) {
         if (livro.disponivel) {
            System.out.println("-" + livro.titulo + " ISBN: " + livro.isbn);
         }
      }
   }

   private Livro buscarLivroPorIsbn(String isbn) {
      for (Livro livro: livros) {
         if (livro.isbn.equals(isbn)) {
            return livro;
         }
      }
      return null;
   }

   private Usuario buscarUsuarioPorId(int id) {
      for (Usuario usuario: usuarios) {
         if (usuario.id == id) {
            return usuario;
         }
      }
      return null;
   }
}