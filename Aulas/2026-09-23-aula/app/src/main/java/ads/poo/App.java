package ads.poo;

public class App {
    public static void main(String[] args) {
        Motor v8 = new Motor(1, 1);
        Carro fusca = new Carro("VW", v8);

        fusca.getMarca();

        Aluno a_001 = new Aluno(
                "Jorge",
                1,
                "jorge@email.com",
                new Endereco("Afonso Pena", "100", "Centro", "Campo Grande", "MS", "79041060"));

        String cidade = a_001.getEndereco().getCidade();
        IO.println(cidade);
    }
}
