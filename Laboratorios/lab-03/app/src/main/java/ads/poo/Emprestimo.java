package ads.poo;

import java.time.LocalDate;
import java.util.Date;

public class Emprestimo {
    private Usuario usuario;
    private Livro livro;
    private LocalDate dataEmp;
    private LocalDate dataDevolucao;

    public Emprestimo(Usuario usuario, Livro livro, LocalDate data) {
        this.usuario = usuario;
        this.livro = livro;
        this.dataEmp = data;
    }

    public Livro getLivro() {
        return livro;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void devolver(LocalDate data) {
        this.dataDevolucao = data;
    }
}
