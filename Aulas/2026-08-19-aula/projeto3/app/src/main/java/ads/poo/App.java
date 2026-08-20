package ads.poo;

public class App {
    public static void main(String[] args) {
        Batedeira walitta = new Batedeira();

        walitta.adicionarIngrediente(50);
        walitta.adicionarIngrediente(60);
        IO.println("-- Adicionado 110 ingredientes");

        IO.println("Capacidade atual: " + walitta.checarCapacidadeAtual());

        IO.println(walitta.checarSeEstaLimpa() ? "Está limpa!" : "Está suja!");

        IO.println("-- Removido 200 ingredientes");
        walitta.removerIngrediente(200);

        IO.println(walitta.checarSeEstaLimpa() ? "Está limpa!" : "Está suja!");

        IO.println("-- Aumentar potencia em 6");
        walitta.aumentarPotencia(6);
        IO.println("Potencia atual: " + walitta.checarPotenciaAtual());

        IO.println("-- Diminuir potencia em 3");
        walitta.diminuirPotencia(3);
        IO.println("Potencia atual: " + walitta.checarPotenciaAtual());

    }
}
