package ads.poo;

public class App {

    public static void main(String[] args) {
        String buffer = IO.readln("Entre com o dia: ");
        int dia = Integer.parseInt(buffer);

        String mes = IO.readln("Entre com o mês (sem acentos): ");

        String estacao = switch (mes.toLowerCase()) {
            case "janeiro", "fevereiro" -> "Verão";
            case "marco" -> {
                estacao = (dia > 19) ? "Outono" : "Verão";
                yield estacao;
            }
            case "abril", "maio" -> "Outono";
            case "junho" -> {
                estacao = (dia > 21) ? "Inverno" : "Outono";
                yield estacao;
            }
            case "julho", "agosto" -> "Inverno";
            case "setembro" -> {
                estacao = (dia > 22) ? "Privamera" : "Inverno";
                yield estacao;
            }
            case "outubro", "novembro" -> "Primavera";
            case "dezembro" -> {
                estacao = (dia > 21) ? "Verão" : "Primavera";
                yield estacao;
            }
            default -> "Valores inválidos!";
        };

        IO.println(estacao);

    }
}

// Entre com o dia: 21
// Entre com o mês: março
// # Saída:
// Outono

// Outono - 20/03 a 21/06
// Inverno - 22/06 a 22/09
// Primavera - 23/09 a 21/12
// Verão - 22/12 a 19/03