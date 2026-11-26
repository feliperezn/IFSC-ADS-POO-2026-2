package ads.poo;

import java.util.ArrayList;

import ads.poo.exception.BibliotecaException;
import ads.poo.exception.LimiteEmprestimosException;
import ads.poo.exception.LivroJaEmprestadoException;
import ads.poo.exception.LivroNaoEncontradoException;

public class Biblioteca {
    ArrayList<Livro> livros = new ArrayList<>();
    ArrayList<Usuario> usuarios = new ArrayList<>();
    ArrayList<Emprestimo> emprestimos = new ArrayList<>();

    public void emprestar(Usuario usuario, int idLivro) throws BibliotecaException {
        Boolean livroEncontrado = null;
        Boolean livroJaEmprestado = null;
        int totalEmprestimos = 0;

        for (Livro livro : livros) {
            if (livro.getId() == idLivro) {
                livroEncontrado = true;
                break;
            }
        }

        // Livro não encontrado
        if (livroEncontrado == null) {
            throw new LivroNaoEncontradoException("Livro com id " + idLivro + " não encontrado!");
        }

        // Livro já emprestado
        for (Emprestimo emprestimo : emprestimos) {
            if (emprestimo.getLivro().getId() == idLivro) {
                livroJaEmprestado = true;
                throw new LivroJaEmprestadoException(
                        "Livro com id " + idLivro + " já emprestado para " + emprestimo.getUsuario());
            } else {
                livroJaEmprestado = false;
            }
        }

        // Limite de empréstimos excedido
        for (Emprestimo emprestimo : emprestimos) {
            if (emprestimo.getUsuario() == usuario) {
                totalEmprestimos += 1;
            }

            if (totalEmprestimos == 3) {
                throw new LimiteEmprestimosException(
                        "Usuário " + usuario.getNome() + " já possui 3 livros emprestados");
            }
        }

        // TODO: Criar um Emprestimo com usuário, livro e data atual.

        if (livroEncontrado && !livroJaEmprestado) {

        }
        // TODO: Adicionar o empréstimo à lista de empréstimos ativos.
    }

    public void devolver(Usuario usuario, int idLivro) throws BibliotecaException {
        // TODO: Localizar o empréstimo ativo correspondente ao usuário e ao livro.
        // TODO: Se não existir, lançar LivroNaoEmprestadoException.
        // TODO: Remover o empréstimo encontrado da lista.
    }

}
