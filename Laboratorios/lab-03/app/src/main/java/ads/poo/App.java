package ads.poo;

import ads.poo.exception.BibliotecaException;

public class App {
    public static void main(String[] args) throws BibliotecaException {

        // Dump
        Biblioteca biblioteca = new Biblioteca();
        Usuario usuario00 = new Usuario("Usuário 00");
        Usuario usuario01 = new Usuario("Usuário 01");
        Livro livro00 = new Livro(0, "Livro 00");
        Livro livro01 = new Livro(1, "Livro 01");
        Livro livro02 = new Livro(2, "Livro 02");
        Livro livro03 = new Livro(3, "Livro 03");

        biblioteca.usuarios.add(usuario00);
        biblioteca.usuarios.add(usuario01);

        biblioteca.livros.add(livro00);
        biblioteca.livros.add(livro01);
        biblioteca.livros.add(livro02);
        biblioteca.livros.add(livro03);

        // Emprestimo e devolucao

        try {
            biblioteca.emprestar(usuario00, 0);
        } catch (BibliotecaException e) {
            IO.println("Erro: " + e.getMessage());
        }

        biblioteca.emprestar(usuario00, 1);
        biblioteca.emprestar(usuario00, 2);

        // Limite de 3 livros
        biblioteca.emprestar(usuario00, 3);

        // Livro já emprestado
        biblioteca.emprestar(usuario01, 0);

        // Devolver livro sem empréstimo
        biblioteca.devolver(usuario01, 3);

        // TODO: Tratar cada situação de erro com try/catch e exibir uma mensagem.
        // TODO: Confirmar que devolver um livro permite fazer outro empréstimo.

    }

}
