public class Livro {
    public String titulo;
    public String autor;
    public String isbn;
    public Boolean disponivel;

    public void exibirDetalhes() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("ISBN: " + isbn);
        System.out.println("Disbonível: " + disponivel);
    }

    public void emprestar() {
        if (disponivel == true) {
            disponivel = false;
            System.out.println("Livro emprestado com sucesso!");
        } else {
            System.out.println("O livro está indisponível para emprestar");
        }
    }

    public void devolver() {
        if(disponivel == false) {
            disponivel = true;
            System.out.println("Livro devolvido com sucesso!");
        } else {
            System.out.println("O livro já está disponível");
        }
    }
}
