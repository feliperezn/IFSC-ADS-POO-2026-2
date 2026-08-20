package ads.poo;

public class Batedeira {
    // Propriedades
    private int potenciaAtual = 0;
    private int capacidadeAtual = 0;
    private boolean limpeza;

    // Métodos
    public void aumentarPotencia(int valor) {
        potenciaAtual = Math.min(potenciaAtual + valor, 5);
    }

    public void diminuirPotencia(int valor) {
        potenciaAtual = Math.max(potenciaAtual - valor, 0);
    }

    public void adicionarIngrediente(int valor) {
        capacidadeAtual = Math.min(capacidadeAtual + valor, 100);
        limpeza = false;
    }

    public void removerIngrediente(int valor) {
        capacidadeAtual = Math.max(capacidadeAtual - valor, 0);

        if (capacidadeAtual == 0) {
            limpeza = true;
        }
    }

    public boolean checarSeEstaLimpa() {
        return limpeza;
    }

    public int checarPotenciaAtual() {
        return potenciaAtual;
    }

    public int checarCapacidadeAtual() {
        return capacidadeAtual;
    }

}
