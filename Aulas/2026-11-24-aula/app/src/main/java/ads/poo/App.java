package ads.poo;

import ads.poo.exception.SaldoInsuficienteException;

public class App {
    public static void main(String[] args) {
        Conta conta = new Conta(100);

        try {
            conta.saque(200);
        } catch (SaldoInsuficienteException e) {
            IO.println("Erro: " + e.getMessage());
        }
    }
}
