package ads.poo.entity;

public class Aldeao extends Personagem {

    public Aldeao() {
        super(25, 1, 0.8);
    }

    @Override
    public String mover() {
        return "Aldeão se movendo na velocidade: " + this.velocidade;
    }

    @Override
    public String atacar() {
        return "Aldeao atacando com força: " + this.ataque;
    }

}
