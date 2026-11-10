package ads.poo.entity;

public class Aldeao extends Personagem implements Guerreiro, Coletor {

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

    @Override
    public String coletarMadeira() {
        return "Aldeao coletando madeira";
    }

    @Override
    public String coletarOuro() {
        return "Aldeao coletando ouro";
    }

}
