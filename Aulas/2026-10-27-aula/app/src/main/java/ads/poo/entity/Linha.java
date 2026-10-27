package ads.poo.entity;

public class Linha extends Forma {
    int[] coordFinal;

    public Linha(String corLinha, int[] coordInicial, int[] coordFinal) {
        super(corLinha, coordInicial);
        this.coordFinal = coordFinal;
    }

    @Override
    public String desenhar() {
        return "Desenhando linha. Inicio: " + coordInicial + ", Fim: " + coordFinal;
    }

    public int[] getCoordFinal() {
        return coordFinal;
    }
}
