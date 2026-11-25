package ads.poo;

import java.util.Date;

public class Emprestimo {
    Usuario usuario;
    Livro livro;
    Date dataEmp;

    public Emprestimo(Usuario usuario, Livro livro) {
        this.usuario = usuario;
        this.livro = livro;
        this.dataEmp = new Date();
    }

}
