package ads.poo;

import java.time.LocalDate;
import java.util.ArrayList;

import ads.poo.exception.BibliotecaException;
import ads.poo.exception.LimiteEmprestimosException;
import ads.poo.exception.LivroJaEmprestadoException;
import ads.poo.exception.LivroNaoEmprestadoException;
import ads.poo.exception.LivroNaoEncontradoException;

public class Biblioteca {
    ArrayList<Livro> livros = new ArrayList<>();
    ArrayList<Usuario> usuarios = new ArrayList<>();
    ArrayList<Emprestimo> emprestimos = new ArrayList<>();

    public void emprestar(Usuario usuario, int idLivro) throws BibliotecaException {
        Livro livroEncontrado = null;
        Boolean livroJaEmprestado = null;
        int totalEmprestimos = 0;

        for (Livro livro : livros) {
            if (livro.getId() == idLivro) {
                livroEncontrado = livro;
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

        // Criar emprestimo
        if ((livroEncontrado != null) && !livroJaEmprestado && (totalEmprestimos < 3)) {
            emprestimos.add(new Emprestimo(usuario, livroEncontrado, LocalDate.now()));
        }
    }

    public void devolver(Usuario usuario, int idLivro) throws BibliotecaException {
        Boolean livroEmprestado = null;

        // Verificar se está emprestado
        for (Emprestimo emprestimo : emprestimos) {
            if (emprestimo.getLivro().getId() == idLivro) {
                livroEmprestado = true;
                // TODO se a data de devolucao esta vazia
                emprestimo.devolver(LocalDate.now());
            }
        }

        if (livroEmprestado == null) {
            throw new LivroNaoEmprestadoException("O livro id " + idLivro + " não está emprestado");
        }
    }

}