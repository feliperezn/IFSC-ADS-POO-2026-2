import java.util.Scanner;

public class Leitor {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        while (leitor.hasNext()) {
            String[] alunoNotas = leitor.nextLine().split(",");

            String nome = alunoNotas[0];

            double soma = 0;

            for (int i = 1; i < alunoNotas.length; i++) {
                soma += Double.parseDouble(alunoNotas[i]);
            }

            double media = Math.round(soma / (alunoNotas.length - 1));

            IO.print("Nome: " + nome + " - ");
            IO.print("Média: " + media + " - ");
            IO.println(media >= 6.0 ? " Aprovado(a)!" : " Reprovado(a) :(");

        }

        leitor.close();
    }
}

// nome - media - aprovado
