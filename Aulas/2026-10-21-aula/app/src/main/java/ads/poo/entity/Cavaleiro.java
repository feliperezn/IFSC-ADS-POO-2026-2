package ads.poo.entity;

public class Cavaleiro extends Personagem {

    public Cavaleiro() {
        super(50, 3, 2.0);
    }

    @Override
    public String mover() {
        return "Cavaleiro se movendo na velocidade: " + this.velocidade;
    }

    @Override
    public String atacar() {
        return "Cavaleiro atacando com força: " + this.ataque;
    }

}
