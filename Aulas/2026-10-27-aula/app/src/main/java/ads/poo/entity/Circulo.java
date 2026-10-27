package ads.poo.entity;

public class Circulo extends Forma2D {

    double raio;

    public Circulo(String corLinha, int[] coordInicial, double raio) {
        super(corLinha, coordInicial);
        this.raio = raio;
    }

    @Override
    public String desenhar() {
        return "Desenhando circulo. Coord Central: " + coordInicial + ", Raio: " + raio;
    }

    @Override
    public double calcularArea() {
        double area = Math.PI * Math.pow(raio, 2);
        return area;
    }

    @Override
    public double calcularPerimetro() {
        double perimetro = 2 * Math.PI * raio;
        return perimetro;
    }

}
