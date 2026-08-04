void main() {

    // Faça um programa que o usuário deve informar:
    // - Sigla da disciplina
    // - TOdos os dias da semana que tem aula dessa disciplina
    //
    // Por fim, imprima:
    // Na disciplina *** você tem aulas nos seguintes dias:
    // - seg
    // - qua
    // - sex

    String sigla = IO.readln("Informe a sigla da disciplina: ");
    String[] aulas = new String[5];
    String buffer = "";

    int i = 0;

    do {
        buffer = IO.readln("Informe o dia da semana ou nao para encerrar: ");

        if (buffer.equals("nao")) {
            if (i > 0) {
                IO.println("Na disciplina " + sigla + " você tem aulas nos seguintes dias:");

                IO.println("Na disciplina " + sigla + " você tem aulas nos seguintes dias:");
                for (int j = 0; j < aulas.length; j++) {
                    if (aulas[j] != null) {
                        IO.println("- " + aulas[j]);
                    }
                }
            } else {
                break;
            }
        } else {
            switch (buffer) {
                case "seg" -> {
                    aulas[0] = "seg";
                    i++;
                }
                case "ter" -> {
                    aulas[1] = "ter";
                    i++;
                }
                case "qua" -> {
                    aulas[2] = "qua";
                    i++;
                }
                case "qui" -> {
                    aulas[3] = "qui";
                    i++;
                }
                case "sex" -> {
                    aulas[4] = "sex";
                    i++;
                }
                default -> IO.println("Valor inválido. Entre com: seg, ter, qua, qui ou sex");
            }
        }

    } while (!buffer.equals("nao"));

}