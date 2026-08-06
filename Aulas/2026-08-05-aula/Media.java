// Para utilizar basta executar o arquivo no CMD junto com as notas desejadas

public class Media {
    public static void main(String[] args) {
        if (args.length > 0) {
            double soma = 0;

            for (int i = 0; i < args.length; i++) {
                soma += Double.parseDouble(args[i]);
            }

            double media = Math.round(soma / (args.length));

            IO.println("A média das notas é: " + media);
            IO.println(media >= 6.0 ? "Aprovado :)" : "Reprovado :(");
        } else {
            IO.println("Sem notas para calcular");
        }
    }
}