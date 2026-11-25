package ads.poo;

import java.util.ArrayList;

import ads.poo.exception.BibliotecaException;

public class Biblioteca {
    ArrayList<Livro> livros = new ArrayList<>();
    ArrayList<Usuario> usuarios = new ArrayList<>();
    ArrayList<Emprestimo> emprestimos = new ArrayList<>();

    public void emprestar(Usuario usuario, int idLivro) throws BibliotecaException {
        // TODO: Localizar o livro no acervo pelo idLivro.
        // TODO: Se o livro tiver empréstimo ativo, lançar LivroJaEmprestadoException.
        // TODO: Contar os empréstimos ativos do usuário.
        // TODO: Se o usuário já tiver 3 empréstimos, lançar LimiteEmprestimosException.
        // TODO: Criar um Emprestimo com usuário, livro e data atual.
        // TODO: Adicionar o empréstimo à lista de empréstimos ativos.
    }

    public void devolver(Usuario usuario, int idLivro) throws BibliotecaException {
        // TODO: Localizar o empréstimo ativo correspondente ao usuário e ao livro.
        // TODO: Se não existir, lançar LivroNaoEmprestadoException.
        // TODO: Remover o empréstimo encontrado da lista.
    }

}
