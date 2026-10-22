package ads.poo.entity;

public class Arqueiro extends Personagem {

    public Arqueiro() {
        super(35, 2, 1.0);
    }

    @Override
    public String mover() {
        return "Arqueiro se movendo na velocidade: " + this.velocidade;
    }

    @Override
    public String atacar() {
        return "Arqueiro atacando com força: " + this.ataque;
    }

}
