package ads.poo.entity;

public class Retangulo extends Forma2D {

    int[] coordFinal;

    public Retangulo(String corLinha, int[] coordInicial, int[] coordFinal) {
        super(corLinha, coordInicial);
        this.coordFinal = coordFinal;
    }

    @Override
    public String desenhar() {
        return "Desenhando Retangulo. Inicio: " + coordInicial + ", Fim: " + coordFinal;
    }

    @Override
    public double calcularArea() {
        double area = largura() * altura();
        return area;
    }

    @Override
    public double calcularPerimetro() {
        double perimetro = 2 * (largura() + altura());
        return perimetro;
    }

    private double largura() {
        return coordFinal[1] - coordFinal[1];
    }

    private double altura() {
        return coordInicial[0] - coordFinal[0];
    }

    public int[] getCoordFinal() {
        return coordFinal;
    }

}
