package ads.poo;

public class Livro {
    private final int ISBN;
    private String titulo;
    private String autor;
    private int ano;

    public Livro(int iSBN, String titulo, String autor, int ano) {
        ISBN = iSBN;
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }

    public int getISBN() {
        return ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

}
