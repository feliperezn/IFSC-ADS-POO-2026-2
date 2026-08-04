public class Media {

    public static void main(String[] args) {

        String nome = IO.readln("Entre com seu nome: ");

        String buffer = IO.readln("Entre com a nota da Prova 1: ");
        double nota1 = Double.parseDouble(buffer);

        buffer = IO.readln("Entre com a nota da Prova 2: ");
        double nota2 = Double.parseDouble(buffer);

        double media = Math.round((nota1 + nota2) / 2);

        IO.println("---");
        IO.println(nome + ", sua média é: " + media);
        IO.println(media >= 6.0 ? "Você foi aprovado!" : "Você foi reprovado!");

    }

}