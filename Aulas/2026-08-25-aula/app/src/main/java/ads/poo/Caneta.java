package ads.poo;

public class Caneta {

    private double nivelTinta;
    private String cor;
    private final double CONSUMO = 0.01;

    public Caneta(double nivelTinta, String cor) {
        this.nivelTinta = nivelTinta;
        this.cor = cor;
    }

    public Caneta(double nivelTinta) {
        this(nivelTinta, "Azul");
    }

    public Caneta() {
        this(100);
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getNivelTinta() {
        return nivelTinta;
    }

    public double desenhar(int xInicio, int yInicio, int xFim, int yFim) {

        double distancia = Math.sqrt(Math.pow((xFim - xInicio), 2) + Math.pow((yFim - yInicio), 2));
        double consumo = distancia * CONSUMO;

        if (nivelTinta >= consumo) {
            nivelTinta -= consumo;
        } else {
            return -1;
        }

        return consumo;

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Caneta [nivelTinta=" + nivelTinta + ", cor=" + cor + "]");
        return sb.toString();
    }

    // public String toString() {
    // return "Cor: " + cor + "\nTinta: " + nivelTinta;
    // }

}

// TODO
// metodo desenhar
// origem e fim de seguimento da reta
// debitar consumo
// retornoar consumo
