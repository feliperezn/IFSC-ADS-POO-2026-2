package ads.poo;

public class Robo {
    private int[] mapa;
    private Bateria bateria;
    private Coordenada posicaoAtual;

    public Robo(int[] mapa, Bateria bateria, Coordenada posicaoAtual) {
        this.mapa = mapa;
        this.bateria = bateria;
        this.posicaoAtual = posicaoAtual;
    }

    public boolean Mover() {
        return false;
    }

}
