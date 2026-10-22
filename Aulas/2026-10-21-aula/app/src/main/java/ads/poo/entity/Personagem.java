package ads.poo.entity;

public class Personagem {
    protected int vida;
    protected int ataque;
    protected Double velocidade;

    public Personagem(int vida, int ataque, Double velocidade) {
        this.vida = vida;
        this.ataque = ataque;
        this.velocidade = velocidade;
    }

    public String mover() {
        return "";
    }

    public String atacar() {
        return "";
    }

}
