public class MediaMatriz {
    // 2 notas 3 pessoas
    // A1 A2 Media
    // 7 7 7
    // 10 10 10
    // 5 10 8
    // media geral
    // x x x

    public static void main(String[] args) {
        double[][] notas = new double[4][3];

        // Informar notas das provas
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                String buffer = IO.readln("Digite a nota " + (j + 1) + " do aluno " + (i + 1) + ": ");
                notas[i][j] = Double.parseDouble(buffer);
            }
        }

        // Calcular media de cada aluno
        for (int i = 0; i < 3; i++) {
            double soma = 0;

            for (int j = 0; j < 2; j++) {
                soma += notas[i][j];
            }

            notas[i][2] = Math.round(soma / 2);
        }

        // Calcular media da turma

        for (int j = 0; j < 3; j++) {
            double soma = 0;
            for (int i = 0; i < 3; i++) {
                soma += notas[i][j];
            }

            notas[3][j] = Math.round(soma / 3);
        }

        // Imprimir notas

        IO.println(" --- ");

        IO.println("\t\tA1\t\tA2\t\tMedia");

        for (int i = 0; i < 4; i++) {
            String linha = (i < 3 ? ("Aluno " + (i + 1) + ": ") : ("Média turma: "));
            IO.print(String.format("%-15s", linha));

            for (int j = 0; j < 3; j++) {
                IO.print(String.format("%12.1f", notas[i][j]));
            }

            IO.println();
        }

    }

}