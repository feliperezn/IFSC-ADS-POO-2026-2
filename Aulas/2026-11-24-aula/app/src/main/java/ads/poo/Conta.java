package ads.poo;

import ads.poo.exception.SaldoInsuficienteException;

public class Conta {
    double saldo;

    public void saque(double valor) throws SaldoInsuficienteException {
        if (this.saldo < valor) {
            throw new SaldoInsuficienteException("Saldo insuficiente. Saldo atual: " + this.saldo);
        }

        this.saldo -= valor;
    }

    public Conta(double saldo) {
        this.saldo = saldo;
    }

}
