package ads.poo;

import ads.poo.entity.Aldeao;
import ads.poo.entity.Arqueiro;
import ads.poo.entity.Cavaleiro;
import ads.poo.entity.Personagem;

public class App {
    public static void main(String[] args) {
        Personagem a = new Aldeao();
        Personagem b = new Arqueiro();
        Personagem c = new Cavaleiro();

        IO.println(a.atacar());
        IO.println(b.mover());
        IO.println(c.atacar());
    }
}
